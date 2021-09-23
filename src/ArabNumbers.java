public class ArabNumbers {
    public boolean isArab (String value) {
        try {
            int result = Integer.parseInt(value);
            if (result > 0 && result <= 10)
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}

