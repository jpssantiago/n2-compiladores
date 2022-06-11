public class Variable {
    String type;
    String name;
    Object value;

    public Variable(String type, String name) {
        this.type = type;
        this.name = name;
        this.value = null;
    }

    public Variable(String type, String name, Object value) {
        this.type = type;
        this.name = name;
        setValue(value);
    }

    public void setValue(Object obj) {
        if (type.equals("string")) {
            String str = obj.toString();

            if (str.contains("\"")) {
                this.value = obj;
            } else {
                throw new IllegalArgumentException("[wrong-type] Variable '" + name + "' is a string.");
            }
        } else if (type.equals("int")) {
            try {
                int val = Integer.parseInt(obj.toString());
                this.value = val;
            } catch (Exception e) {
                throw new IllegalArgumentException("[wrong-type] Variable '" + name + "' is an integer.");
            }
        } else if (type.equals("double")) {
            try {
                double val = Double.parseDouble(obj.toString().replace(",", "."));
                this.value = val;
            } catch (Exception e) {
                throw new IllegalArgumentException("[wrong-type] Variable '" + name + "' is a double.");
            }
        } else {
            throw new IllegalArgumentException("[invalid-type] Variables must be string, int or double.");
        }
    }
}