import java.util.ArrayList;

public class Controller {
    ArrayList<Variable> variables = new ArrayList<Variable>();
    String[] operators = {"+", "-", "*", "/"};

    public Variable getVariableByName(String name) {
        for (Variable variable : variables) {
            if (variable.name.equals(name)) {
                return variable;
            }
        }

        return null;
    }

    public boolean canSaveValue(String name, String type, String value) {
        for (Variable variable : variables) {
            value = value.replace(variable.name, "");
        }

        for (String operator : operators) {
            value = value.replace(operator, "");
        }

        value = value
            .replace(" ", "")
            .replace(",", ".")
            .replace("(", "")
            .replace(")", "");

        if (value.equals("")) {
            value = "0";
        }

        switch (type) {
            case "string":
                return value.contains("\"");
            case "int":
                try {
                    int _value = Integer.parseInt(value);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException("[wrong-type] Variable '" + name + "' is an integer.");
                }
            case "double":
                try {
                    value = value.replace(".", "");
                    double _value = Double.parseDouble(value);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException("[wrong-type] Variable '" + name + "' is a double.");
                }
            default:
                return false;
        }
    }

    public void addVariable(String type, String name, String value) {
        if (getVariableByName(name) == null) {
            variables.add(new Variable(type, name, value));
        } else {
            throw new RuntimeException("[duplicated-var] Variable '" + name + "' already exists.");
        }
    }

    public boolean isComplexExpression(String str) {
        for (String operator : operators) {
            if (str.contains(operator)) {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Variable> getVariablesFromExpression(String str) {
        ArrayList<Variable> list = new ArrayList<>();

        for (Variable variable : variables) {
            if (str.contains(variable.name)) {
                list.add(variable);
            }
        }

        return list;
    }

    public String getTypeFromText(String text) {
        if (text.contains("int")) {
            return "int";
        } else if (text.contains("double")) {
            return "double";
        } else if (text.contains("string")) {
            return "string";
        } else {
            throw new RuntimeException("[invalid-type] Variables must be int, double or string.");
        }
    }
}
