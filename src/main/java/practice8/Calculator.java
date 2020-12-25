package practice8;

import practice8.operations.Div;
import practice8.operations.Multi;
import practice8.operations.Sub;
import practice8.operations.Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public void startCalculator () {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            int num1 = sc.nextInt();
            System.out.println("Введите второе целое число: ");
            int num2 = sc.nextInt();
            System.out.println("Введите операцию: '+', '-', '*', '/'.");
            String operation = sc.next();
            switch (operation) {
                case ("+") -> {
                    Sum operation1 = new Sum();
                    System.out.println("Произведено сложение введенных чисел: " + operation1.sum(num1, num2));
                }
                case ("-") -> {
                    Sub operation2 = new Sub();
                    System.out.println("Произведена разность введенных чисел: " + operation2.subtraction(num1, num2));
                }
                case ("*") -> {
                    Multi operation3 = new Multi();
                    System.out.println("Произведено умножение введенных чисел: " + operation3.multiplication(num1, num2));
                }
                case ("/") -> {
                    Div operation4 = new Div();
                    System.out.println("Произведено деление введенных чисел: " + operation4.division(num1, num2));
                }
                default -> System.out.println("Неверно!");
            }
            sc.close();
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        } catch (InputMismatchException e) {
            System.out.println("Введен неверный формат числа!");
        }
    }
}
