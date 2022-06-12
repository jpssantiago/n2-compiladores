public class Tradutor extends GramaticaBaseListener {
    Controller controller = new Controller();

    /*
    * Início
    */
    @Override
    public void enterInit(GramaticaParser.InitContext ctx) {
        System.out.println("import java.util.Scanner;");
        System.out.println("\npublic class Code {");
        System.out.print("\tpublic static void main(String[] args) {");
    }

    @Override
    public void exitInit(GramaticaParser.InitContext ctx) {
        System.out.println("\n\t}\n}");
    }

    /*
    * Identação/ponto e vírgula
    */
    @Override public void enterComando(GramaticaParser.ComandoContext ctx) {
        System.out.print("\n\t\t");
    }

    @Override public void enterFim_linha(GramaticaParser.Fim_linhaContext ctx) {
        System.out.print(';');
    }

    /*
    * Declaração, Inicialização e Atribuição
    */
    @Override
    public void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        String text = ctx.getText().replace(".", "");
        String type = controller.getTypeFromText(text);

        var ids = ctx.ID();
        for (var id : ids) {
            controller.addVariable(type, id.toString(), null);
        }

        System.out.print(text);
    }

    @Override
    public void enterInicializacao(GramaticaParser.InicializacaoContext ctx) {
        String text = ctx.getText().replace(".", "");
        String type = controller.getTypeFromText(text);

        var id = ctx.ID();
        String value = text.split("=")[1].trim();
        if (controller.canSaveValue(type, value)) {
            controller.addVariable(type, id.toString(), value);

            System.out.print(text.replace("string", "String"));
            // System.out.println("\n[" + id + ": " + value + "]\n");
        } else {
            throw new IllegalArgumentException("[wrong-type] Variable '" + id + "' is a " + type + ".");
        }
    }

    @Override
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        String text = ctx.getText().replace(".", "");
        
        String[] data = text.split("=");

        Variable variable = controller.getVariableByName(data[0].replace(" ", ""));
        if (variable != null) {
            String value = data[1];
            if (variable.value != null) {
                value = value.replace(variable.name, variable.value);
            }
            
            if (controller.canSaveValue(variable.type, value)) {
                variable.value = data[1];

                System.out.print(text);
                // System.out.println("\n[" + variable.name + ": " + variable.value + "]\n");
            }
        } else {
            throw new IllegalArgumentException("[var-not-found] Variable '" + data[0].replace(" ", "") + "' does not exist.");
        }
    }

    /*
    * Comando show() e get()
    */
    @Override
    public void enterComando_show(GramaticaParser.Comando_showContext ctx) {
        String text = ctx.getText();

        String content = text.substring(text.indexOf("(") + 1, text.indexOf(")"));

        System.out.print("System.out.println(" + content + ")");
    }

    @Override
    public void enterComando_get(GramaticaParser.Comando_getContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = controller.getVariableByName(id);

        if (variable != null) {
            System.out.println("Scanner scanner" + id + " = new Scanner(System.in);");

            String command = "";
            if (variable.type.equals("string")) {
                command = "nextLine()";
            } else if (variable.type.equals("int")) {
                command = "nextInt()";
            } else if (variable.type.equals("double")) {
                command = "nextDouble()";
            } else {
                throw new IllegalArgumentException("[invalid-type] Variables must be string, int or double.");
            }

            System.out.print("\t\t" + id + " = scanner" + id + "." + command);
        } else {    
            throw new IllegalArgumentException("[var-not-found] Variable '" + id + "' does not exist.");
        }
    }

    /*
    * If, else if e else
    */
    @Override
    public void enterComando_if(GramaticaParser.Comando_ifContext ctx) {
        String text = ctx.getText();
        text = text.substring(0, text.indexOf(":"))
            .replace("if ", "if (")
            .replace(":", ") {");

        System.out.print(text);
    }

    @Override
    public void exitExpressao_if(GramaticaParser.Expressao_ifContext ctx) {
        System.out.print(") {");
    }

    @Override public void enterComando_else_if(GramaticaParser.Comando_else_ifContext ctx) {
        System.out.print("} else if (");
    }

    @Override
    public void enterComando_else(GramaticaParser.Comando_elseContext ctx) {
        System.out.print("\n\t\t} else {");
    }

    @Override public void exitFim_comando_if(GramaticaParser.Fim_comando_ifContext ctx) {
        System.out.print("\n\t\t}");
    }
}