import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Кирильчик
 * @version 1.0
 * Программа по сборке подарка на Новый Год!
 */

public class practice4_2 {
    public static void main(String[] args) {
        ArrayList<staff> gift = new ArrayList<>();
        boolean stopAction = false;
        int totalPrice = 0;
        int totalWeight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Начинаем собирать подарок на новый год!");
        System.out.println("Введите цифру для выбора действия: ");
        System.out.println("1 - Добавить в подарок набор конфет \"Мишка косолапый\".");
        System.out.println("2 - Добавить в подарок набор леденцов \"Барбарис\".");
        System.out.println("3 - Добавить в подарок набор мармеладок \"Чупа чупс\".");
        System.out.println("4 - Закончить сбор подарка.");
        while (!stopAction) {
            int choiceAction = sc.nextInt();
            switch (choiceAction) {
                case 1 -> {
                    candy bear = new candy("Мишка косолапый", 250, 400,"Вкус из детства");
                    gift.add(bear);
                    totalPrice += bear.getPrice();
                    totalWeight += bear.getWeight();
                    System.out.println("Вы добавили Мишку");
                }
                case 2 -> {
                    lollipop barbaris = new lollipop("Барбарис", 200, 500, "Съедаются самыми последними");
                    gift.add(barbaris);
                    totalPrice += barbaris.getPrice();
                    totalWeight += barbaris.getWeight();
                    System.out.println("Вы добавили Барбарис");
                }
                case 3 -> {
                    jellybean chupa = new jellybean("Чупа-чупс", 300, 400, "Съедаются самыми первыми");
                    gift.add(chupa);
                    totalPrice += chupa.getPrice();
                    totalWeight += chupa.getWeight();
                    System.out.println("Вы добавили Чупа чупс");
                }
                case 4 -> stopAction = true;
                default -> System.out.println("Вы ввели неверное число! Повторите ввод.");
            }
        }
        System.out.println("Поздравляем, подарок собран.");
        System.out.println("Подарок состоит из: ");
        int quantity = 0;
        for (staff sweet: gift) {
            quantity++;
            System.out.println(quantity + ". " + sweet.getName() + " - " + sweet.getUnigueFeature());
        }
        System.out.println("Общий вес - " + totalWeight + " гр. , общая стоимость - " + totalPrice + " руб.");
        sc.close();
    }
}
