public class MainCalc {
    public static void main(String[] args) {
        System.out.println("Введите два числа от одного до десяти и арифмитическое действие между ними.");
        System.out.println("Используйте арабскую, либо римскую систему исчесления");
        ReadString read = new ReadString();
        read.checkString();
    }
}
