import java.util.Arrays;

public class Main {

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Задание 1
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2
        int maxExpense = -1;
        int minExpense = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense){
                minExpense = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");

        //Задание 3

        double mediumSum = (double) sum/30;
        System.out.println("Средняя сумма трат за месяц составила "+mediumSum + " рублей.");

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i != -1; i--) {

            System.out.print(reverseFullName[i]);
        }

    }
}