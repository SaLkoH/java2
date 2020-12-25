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
            System.out.println("������� ������ ����� �����: ");
            int num1 = sc.nextInt();
            System.out.println("������� ������ ����� �����: ");
            int num2 = sc.nextInt();
            System.out.println("������� ��������: '+', '-', '*', '/'.");
            String operation = sc.next();
            switch (operation) {
                case ("+") -> {
                    Sum operation1 = new Sum();
                    System.out.println("����������� �������� ��������� �����: " + operation1.sum(num1, num2));
                }
                case ("-") -> {
                    Sub operation2 = new Sub();
                    System.out.println("����������� �������� ��������� �����: " + operation2.subtraction(num1, num2));
                }
                case ("*") -> {
                    Multi operation3 = new Multi();
                    System.out.println("����������� ��������� ��������� �����: " + operation3.multiplication(num1, num2));
                }
                case ("/") -> {
                    Div operation4 = new Div();
                    System.out.println("����������� ������� ��������� �����: " + operation4.division(num1, num2));
                }
                default -> System.out.println("�������!");
            }
            sc.close();
        } catch (ArithmeticException e) {
            System.out.println("������ �� ���� ������!");
        } catch (InputMismatchException e) {
            System.out.println("������ �������� ������ �����!");
        }
    }
}
