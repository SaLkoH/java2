package practice6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class practice6 {
    public static void main(String[] args) {
        fileCount("C:\\Users\\Кирильчик\\IdeaProjects\\java2\\src\\main\\java\\practice6\\practice6.txt");
    }

    public static void fileCount(String filepath) {
        Map<String, Integer> wordsList = new TreeMap<>();
        String text = readTextFile(filepath);
        String[] words = text.split(" ");
        sort(words);
        System.out.print("Текст отсортирован в алфавитном порядке: ");
        for (String word : words) {
            System.out.print(" " + word);
            if (!wordsList.containsKey(word)) wordsList.put(word, 1);
            else wordsList.put(word, wordsList.get(word) + 1);
        }
        System.out.println("\n----------Статистика по словам----------");
        String key;
        int value;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) maxCount = value;
            System.out.printf("Слово - '%s' встречается %d раз(а).%n", key, value);
        }

        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.printf("\nСлово с максимальным количеством повторений (%d раз(а)) является '%s'.%n", value, key);
        }
    }

    public static String readTextFile(String filepath) {
        File file = new File(filepath);
        String text = null;
        try (FileReader reader = new FileReader(file)) {

            char[] arr = new char[256];
            int X;
            while ((X = reader.read(arr)) > 0) {
                if (X < 256) {
                    arr = Arrays.copyOf(arr, X);
                }
            }
            text = String.valueOf(arr);
            System.out.println("Введенный текст в файле: " + text);

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    public static void sort(String[] words) {
        Arrays.sort(words);
    }
}

