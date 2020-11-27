import java.util.Scanner;

/**
 * @author Кирильчик
 * @version 1.1
 * Калькулятор с возможностью выбора операций с введенными с консоли дробными числами (сложение, вычитание, умножение и деление).
 * Форматирование строки и вывод результата в консоль в зависимости от выбранной операции.
 */

public class practice2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ввод двух дробных чисел с консоли
        System.out.println("Введите первое дробное число: ");
        float number1 = sc.nextFloat();
        System.out.println("Введите второе дробное число: ");
        float number2 = sc.nextFloat();
        //Выбор операции с введенными числами
        System.out.println("Выбор операции с дробными числами. \nВведите целое число от 1 до 4 где: \n1 - Сложение; \n2 - Вычитание; \n3 - Умножение; \n4 - Деление.");
        int operation = sc.nextInt();
        //Условие 1 - Сложение
        if (operation == 1)  {
            float sum = number1 + number2;
            String str1 = String.format("Сложение дробных чисел = %.4f", sum);
            System.out.println(str1);
            //Условие 2 - Вычитание
        } else if (operation == 2) {
            float min = number1 - number2;
            String str2 = String.format("Вычитание дробных чисел = %.4f", min);
            System.out.println(str2);
            //Условие 3 - Умножение
        } else if (operation == 3) {
            float multi = number1 * number2;
            String str3 = String.format("Умножение дробных чисел = %.4f", multi);
            System.out.println(str3);
            //Условие 4 - Деление
        } else if (operation == 4) {
            float div = number1 / number2;
            String str4 = String.format("Деление дробных чисел = %.4f", div);
            System.out.println(str4);
            //Условие 5 - Неверно введенное число
        } else
            System.out.println("Вы ввели неверное число");


        sc.close();
    }
}
