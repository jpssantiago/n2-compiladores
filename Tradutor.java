import java.util.ArrayList;

public class Tradutor extends GramaticaBaseListener {
    ArrayList<Variable> variables = new ArrayList<Variable>();

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

    @Override
    public void enterInt_(GramaticaParser.Int_Context ctx) {
        System.out.print("\t\tint ");
    }

    @Override
    public void enterDouble_(GramaticaParser.Double_Context ctx) {
        System.out.print("\t\tdouble ");
    }

    @Override
    public void enterString_(GramaticaParser.String_Context ctx) {
        System.out.print("\t\tString ");
    }

    @Override
    public void enterId(GramaticaParser.IdContext ctx) {
        System.out.print(ctx.ID().getText());
    }

    @Override
    public void enterNum(GramaticaParser.NumContext ctx) {
        System.out.print(ctx.NUM().getText());
    }

    @Override
    public void enterDecimal(GramaticaParser.DecimalContext ctx) {
        System.out.print(ctx.DECIMAL().getText().replace(",", "."));
    }

    @Override
    public void enterStr(GramaticaParser.StrContext ctx) {
        System.out.print("" + ctx.STR().getText() + "");
    }

    @Override
    public void enterOperador_atribuicao(GramaticaParser.Operador_atribuicaoContext ctx) {
        System.out.print(" = ");
    }

    @Override
    public void enterSeparador_variavel(GramaticaParser.Separador_variavelContext ctx) {
        System.out.print(", ");
    }

    @Override
    public void enterFim_linha(GramaticaParser.Fim_linhaContext ctx) {
        System.out.print(";");
    }

    @Override
    public void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        System.out.print('\n');
    }

    public String getTypeFromString(String str) {
        if (str.contains("string")) {
            return "string";
        } else if (str.contains("int")) {
            return "int";
        } else if (str.contains("double")) {
            return "double";
        }

        return null;
    }

    public boolean variableAlreadyExists(String name) {
        for (Variable variable : variables) {
            if (variable.name.equals(name)) {
                return true;
            }
        }

        return false;
    }

    public Variable getVariableByName(String name) {
        for (Variable variable : variables) {
            if (variable.name.equals(name)) {
                return variable;
            }
        }

        return null;
    }

    @Override
    public void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        String text = ctx.getText().replace(".", "");
        String type = getTypeFromString(text);

        String[] vars = text
        .replace("int", "")
        .replace("double", "")
        .replace("string", "")
        .split(",");

        for (String str : vars) {
            if (variableAlreadyExists(str)) {
                throw new IllegalArgumentException("[duplicated-var] Variable already exists.");
            } else {
                variables.add(new Variable(type, str));
            }
        }
    }

    @Override
    public void enterInicializacao(GramaticaParser.InicializacaoContext ctx) {
        System.out.print('\n');
    }

    @Override
    public void exitInicializacao(GramaticaParser.InicializacaoContext ctx) {
        String text = ctx.getText().replace(".", "");
        String type = getTypeFromString(text);

        String[] data = text
            .replace("int", "")
            .replace("double", "")
            .replace("string", "")
            .replace(" ", "")
            .split("=");
        
        if (variableAlreadyExists(data[0])) {
            throw new IllegalArgumentException("[duplicated-var] Variable already exists.");
        } else {
            variables.add(new Variable(type, data[0], data[1]));
        }
    }

    @Override
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        System.out.print("\n\t\t");
    }

    @Override
    public void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        String text = ctx.getText()
            .replace(".", "")
            .replace(" ", "")
            .replace(",", ".");
        String[] data = text.split("=");

        if (variableAlreadyExists(data[0])) {
            for (Variable variable : variables) {
                if (variable.name.equals(data[0])) {
                    variable.setValue(data[1]);
                }
            }
        } else {
            throw new IllegalArgumentException("[var-not-found] Variable '" + data[0] + "' does not exist.");
        }

    }

    @Override
    public void enterComando_show(GramaticaParser.Comando_showContext ctx) {
        System.out.print('\n');

        String text = ctx.getText();
        String value = text.substring(text.indexOf("(") + 1, text.indexOf(")"));

        if (value.contains("\"") || variableAlreadyExists(value)) {
            System.out.print("\t\tSystem.out.println(" + value + ")");
        } else {
            throw new IllegalArgumentException("[var-not-found] Invalid string or variable not found.");
        }
    }

    @Override
    public void enterComando_get(GramaticaParser.Comando_getContext ctx) {
        System.out.print('\n');

        String id = ctx.ID().getText();
        Variable variable = getVariableByName(id);
        if (variable != null) {
            System.out.println("\t\tScanner scanner" + id + " = new Scanner(System.in);");

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
            throw new IllegalArgumentException("[var-not-found] Invalid string or variable not found.");
        }
    }

    @Override
    public void enterComando_if(GramaticaParser.Comando_ifContext ctx) {
        System.out.print('\n');

        System.out.print("\t\tif (");
        System.out.print("");
    }

    @Override
    public void exitComando_if(GramaticaParser.Comando_ifContext ctx) {
        // System.out.print(") {}");
    }

    public String getRelationalOperator(String text) {
        if (text.contains("==")) {
            return "==";
        } else if (text.contains("!=")) {
            return "!=";
        } else if (text.contains("<=")) {
            return "<=";
        } else if (text.contains(">=")) {
            return ">=";
        } else if (text.contains("<")) {
            return "<";
        } else if (text.contains(">")) {
            return ">";
        }

        return null;
    }

    public boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void showIfExpression(String str) {
        if (str.contains("\"") || isNumber(str)) {
            System.out.print(str);
        } else {
            Variable from = getVariableByName(str);
            if (from == null) {
                throw new IllegalArgumentException("[var-not-found] Invalid string or variable not found.");
            }

            System.out.print(from.name);
        }
    }

    @Override
    public void enterExpressao_if(GramaticaParser.Expressao_ifContext ctx) {        
        String text = ctx.getText();
        String operator = getRelationalOperator(text);
        String[] data = text.split(operator);

        showIfExpression(data[0]);
        System.out.print(" " + operator + " ");
        showIfExpression(data[1]);
    }

    @Override
    public void exitExpressao_if(GramaticaParser.Expressao_ifContext ctx) {
        System.out.print(") {");
    }

    @Override public void enterComando_else_if(GramaticaParser.Comando_else_ifContext ctx) {
        System.out.print("\n\t\t} else if (");
    }

    @Override
    public void enterComando_else(GramaticaParser.Comando_elseContext ctx) {
        System.out.print("\n\t\t} else {");
    }

    @Override public void exitFim_comando_if(GramaticaParser.Fim_comando_ifContext ctx) {
        System.out.print("\n\t\t}");
    }
}