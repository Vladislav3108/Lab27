import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        // Считывание одно натуральное число n из консоли
        int number = in.nextInt();

        // Определяем является ли n 4-х значным числом
        if (number >= 1000 && number <= 9999) {
            // Если х 4-х значное число, то разбиваем его на цифры и сравниваем их
            // Если х не 4-х  значное число, выводим NO

            int digit1 = number / 1000;
            // Находим первую цифру числа n. Так-как число 4-х значное,
            // первая цифра находится делением на 1000

            int digit2 = (number / 100) % 10;
            // Находим вторую цифру числа n

            int digit3 = (number / 10) % 10;
            // Находим вторую цифру числа n

            int digit4 = number % 10;
            // Находим вторую цифру числа n

            // Проверяем все-ли цифры числа n различны.
            // Если да, то выводим YES, иначе NO.
            if (digit1 != digit2 && digit1 != digit3 && digit1 != digit4 &&
                    digit2 != digit3 && digit2 != digit4 &&
                    digit3 != digit4) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        } else
            out.println("NO");
    }
}