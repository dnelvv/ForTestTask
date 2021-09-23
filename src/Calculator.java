public class Calculator {

    public int result (int value1, int value2, String calculator) {
        switch (calculator) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
        }
        return 0;
    }

    public String searchCalculator (String string) {
        if (string.indexOf("+") > 0)
            return "+";
        if (string.indexOf("-") > 0)
            return "-";
        if (string.indexOf("*") > 0)
            return "*";
        if (string.indexOf("/") > 0)
            return "/";
        return "";
    }
}