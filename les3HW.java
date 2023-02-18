package HW;

import java.util.ArrayList;
import java.util.List;

public class les3HW {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(58);
        list.add(20);
        list.add(65);
        list.add(53);
        list.add(74);
        list.add(23);
        list.add(47);
        System.out.println(list);

        removeEvenValue(list);
        getMin(list);
        getMax(list);
        getAverage(list);
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }

        }
        System.out.println(list);
        return (list);
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        int minNum = list.get(0);
        for (int i : list) {
            if (i < minNum) {
                minNum = i;
            }
        }
        System.out.println("Минимальное значение - " + minNum);
        return minNum;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        int maxNum = list.get(0);
        for (int i : list) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println("Максимальное значение - " + maxNum);
        return maxNum;
    }

    // Найти среднее значение
    public static Float getAverage(List<Integer> list) {
        float count = 0;
        float sum = 0;
        float aver = 0;
        for (int item : list) {
            sum = sum + item;
            count++;
        }
        aver = sum / count;
        System.out.println("Среднее значение - " + aver);
        return aver;
    }
}
