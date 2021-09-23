import java.util.Scanner;

public class ReadString {

    public void checkString () {
        Scanner scan = new Scanner(System.in);
        RomanNumbers roman = new RomanNumbers();
        ArabNumbers arabian = new ArabNumbers();
        Calculator calc = new Calculator();
        String readString;
        String value1 = "";
        String value2 = "";
        String valueCalculate;

        readString = scan.nextLine().replaceAll(" ", "");
        valueCalculate = calc.searchCalculator(readString);

        if (readString.indexOf(valueCalculate) > 0) {
            value1 = readString.substring(0, readString.indexOf(valueCalculate));
            value2 = readString.substring(readString.indexOf(valueCalculate) + 1);
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ошибка, введите данные заново!");
                System.exit(0);
            }
        }

        if (roman.isRoman(value1) && roman.isRoman(value2)) {
            System.out.println(roman.intToRomanNumbers(calc.result(roman.romanToInt(value1), roman.romanToInt(value2), valueCalculate)));
        } else if (arabian.isArab(value1) && arabian.isArab(value2)) {
            System.out.println(calc.result(Integer.parseInt(value1), Integer.parseInt(value2), valueCalculate));
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ошибка, введите данные заново!");
                System.exit(0);
            }
        }
    }
}
