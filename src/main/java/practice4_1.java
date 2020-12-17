import java.util.Arrays;

/**
 * @author Кирильчик
 * @version 1.0
 * Программа по созданию массива размерностью 20, заполненное случайными целыми числами в диапозоне от -10 до 10.
 * Поиск максимально отрицательного и минимально положительного элементов в массиве и замена их местами.
 */

public class practice4_1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
        }
        System.out.println("Создан массив: " + Arrays.toString(array));
        int elemMax = -11, elemMin = 11;
        int indexMax = 0, indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > elemMax) {
                elemMax = array[i];
                indexMax = i;
            }
            if (array[i] > 0 && array[i] < elemMin) {
                elemMin = array[i];
                indexMin = i;
            }
        }
        System.out.println("Максимально отрицательное число: " + elemMax + " с индексом " + indexMax);
        System.out.println("Минимально положительное число: " + elemMin + " с индексом " + indexMin);
        array[indexMax] = elemMin;
        array[indexMin] = elemMax;
        System.out.println("Массив после замены местами минимально положительного и максимально отрицательного элемента: " + Arrays.toString(array));
    }
}