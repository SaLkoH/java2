package practice5;

import practice5.operations.DivisionOperation;
import practice5.operations.MultiplicationOperation;
import practice5.operations.SubtractionOperation;
import practice5.operations.SumOperation;

import java.util.Scanner;

/**
 * @author Кирильчик
 * @version 1.0
 * Простейший калькулятор, операции выведены в отдельные классы.
 */

public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();
        System.out.println("Введите операцию: '+', '-', '*', '/'.");
        String operation = sc.next();
        switch (operation) {
            case ("+") -> {
                SumOperation operation1 = new SumOperation();
                System.out.println("Произведено сложение введенных чисел: " + operation1.sum(num1, num2));
            }
            case ("-") -> {
                SubtractionOperation operation2 = new SubtractionOperation();
                System.out.println("Произведена разность введенных чисел: " + operation2.subtraction(num1, num2));
            }
            case ("*") -> {
                MultiplicationOperation operation3 = new MultiplicationOperation();
                System.out.println("Произведено умножение введенных чисел: " + operation3.multiplication(num1, num2));
            }
            case ("/") -> {
                DivisionOperation operation4 = new DivisionOperation();
                System.out.println("Произведено деление введенных чисел: " + operation4.division(num1, num2));
            }
            default -> System.out.println("Неверно!");
        }
        sc.close();
    }
}
