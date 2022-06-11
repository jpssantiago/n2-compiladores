import java.util.ArrayList;

public class Tradutor extends GramaticaBaseListener {
    // HashMap<String, String> map = new HashMap<String, String>();
    ArrayList<Variable> variables = new ArrayList<Variable>();

    @Override
    public void enterInit(GramaticaParser.InitContext ctx) {
        System.out.println("public class Code {");
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
    public void enterFloat_(GramaticaParser.Float_Context ctx) {
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
        System.out.print(ctx.DECIMAL().getText());
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

    @Override
    public void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        String text = ctx.getText()
                .replace(".", "")
                .replace("int", "")
                .replace("float", "")
                .replace("string", "");

        String[] vars = text.split(",");

        for (String str : vars) {
            variables.add(new Variable("string", str, "valor"));
        }
    }

    @Override
    public void enterInicializacao(GramaticaParser.InicializacaoContext ctx) {
        System.out.print('\n');
    }

    @Override
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        System.out.print("\n\t\t");
    }

    @Override
    public void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        String text = ctx.getText().replace(".", "").replace(" ", "");
        String[] data = text.split("=");

        System.out.println("\n\n\n");
        for (Variable variable : variables) {
            System.out.println(variable.name);
        }
    }
}