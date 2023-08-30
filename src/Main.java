import java.util.Random;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        int[] arr = new int[30];
        java.util.Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 100;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int a : arr) sum += a;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = 0;
        for (int a : arr) {
            if (a < min) min = a;
            if (a > max) max = a;
        }
        System.out.println("Минимальная сумма трат за день составила " + min
                + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int a : arr) sum += a;
        double average = round(sum / (double) arr.length * 100) / 100.0;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}