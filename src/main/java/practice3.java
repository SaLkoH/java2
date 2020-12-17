import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Кирильчик
 * @version 1.0
 *Программа, выполняющая задания на выбор. 1 - Базовый калькулятор, 2 - поиск самого длинного слова в массиве
 */

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию 1 или 2: где 1 - калькулятор, 2 - поиск самого длинного слова в массиве.");
        int oper = sc.nextInt();
        if (oper == 1) {
            System.out.println("Запущен калькулятор.");
            System.out.println("Введите первое дробное число: ");
            float number1 = sc.nextFloat();
            System.out.println("Введите второе дробное число: ");
            float number2 = sc.nextFloat();
            System.out.println("Введите операцию для чисел: сложение, вычитание, умножение, деление.");
            String operation = sc.next();
            switch (operation) {
                case ("сложение") -> {
                    float sum = number1 + number2;
                    String str1 = String.format("Сложение дробных чисел = %.4f", sum);
                    System.out.println(str1);
                }
                case ("вычитание") -> {
                    float min = number1 - number2;
                    String str2 = String.format("Вычитание дробных чисел = %.4f", min);
                    System.out.println(str2);
                }
                case ("умножение") -> {
                    float multi = number1 * number2;
                    String str3 = String.format("Умножение дробных чисел = %.4f", multi);
                    System.out.println(str3);
                }
                case ("деление") -> {
                    float div = number1 / number2;
                    String str4 = String.format("Деление дробных чисел = %.4f", div);
                    System.out.println(str4);
                }
                default -> System.out.println("Введена неверная операция");
            }
        } else if (oper == 2) {
            System.out.println("Запущена программа по поиску максимального слова в массиве");
            System.out.println("Введите размер массива:");
            int size = sc.nextInt();
            String[] array = new String[size];
            System.out.println("Введите каждое слово через Enter. Количество слов равно " + size);
            for (int i = 0; i < size; i++) {
                array[i] = sc.next();
            }
            System.out.println("Введенный массив слов - " + Arrays.toString(array));
            int maxlength = 0;
            for (String s : array) {
                if (s.length() > maxlength) {
                    maxlength = s.length();
                }
            }
            System.out.println("Значение самого длинного слова равно " + maxlength);
        }
        sc.close();
    }
}
