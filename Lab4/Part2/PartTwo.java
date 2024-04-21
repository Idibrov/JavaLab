import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("1) Введите длину массива:");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean sorted = true;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "OK" : "Please, try again");
        System.out.println();

        // 2
        System.out.println("2) Введите длину массива:");
        int len = scanner.nextInt();
        int[] nums = new int[len];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Результат: " + java.util.Arrays.toString(nums));
        System.out.println();

        // 3
        System.out.println("3) Массив до замены: " + java.util.Arrays.toString(nums));
        if (nums.length >= 2) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        System.out.println("Массив после замены: " + java.util.Arrays.toString(nums));
        System.out.println();

        // 4
        System.out.println("4) Введите длину массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int unique = -1;
        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < size; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique = array[i];
                break;
            }
        }
        System.out.println("Первое уникальное число: " + unique);
        System.out.println();
    }
}
