import java.util.Scanner;

/**
 * @author Кирильчик
 * @version 1.0
 * Описание
 * Калькулятор - производится сложение двух дробных чисел, введенных с консоли.
 * Производится форматирование и вывод суммы дробей до 4 знаков после запятой
 */


public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод двух дробных чисел с консоли
        System.out.println("Введите первое дробное число: ");
        float number1 = sc.nextFloat();
        System.out.println("Введите второе дробное число: ");
        float number2 = sc.nextFloat();
        //Сложение двух дробных чисел
        float sum = number1 + number2;
        //Форматирование дробных чисел
        String str = String.format("Сложение дробных чисел = %.4f", sum);
        //Вывод результата в консоль
        System.out.println(str);

        sc.close();
    }
}

