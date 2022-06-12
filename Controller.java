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

    public boolean canSaveValue(String type, String value) {
        for (String operator : operators) {
            value = value.replace(operator, "");
        }

        for (Variable variable : variables) {
            // System.out.println("\n[" + variable.value + "]\n");
            if (variable.value != null) {
                value = value.replace(variable.name, variable.value);
            }
        }

        switch (type) {
            case "string":
                return value.contains("\"");
            case "int":
                // try {
                //     // System.out.println("\n\n%%" + value.replace(" ", ""));
                //     int _value = Integer.parseInt(value.replace(" ", ""));
                //     return true;
                // } catch (Exception e) {
                //     return false;
                // } 
                return true;
            case "double":
                // try {
                //     double _value = Double.parseDouble(value.replace(" ", ""));
                //     return true;
                // } catch (Exception e) {
                //     return false;
                // }
                return true; 
            default:
                return false;
        }
    }

    public void addVariable(String type, String name, String value) {
        if (getVariableByName(name) == null) {
            variables.add(new Variable(type, name, value));
        } else {
            throw new IllegalArgumentException("[duplicated-var] Variable '" + name + "' already exists.");
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
            throw new IllegalArgumentException("[invalid-type] Variables must be int, double or string.");
        }
    }
}
