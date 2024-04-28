import java.util.Scanner;

public class PartTwo {
    Scanner scanner = new Scanner(System.in);

    // 1
    public void task1() {
        System.out.println("1) Проверка отсортированности массива:");
        int[] arr = readArrayFromInput();
        boolean sorted = isSorted(arr);
        System.out.println(sorted ? "OK" : "Please, try again");
        System.out.println();
    }

    // 2
    public void task2() {
        System.out.println("2) Чтение массива из ввода пользователя:");
        int[] arr = readArrayFromInput();
        System.out.println("Результат: " + java.util.Arrays.toString(arr));
        System.out.println();
    }

    // 3
    public void task3() {
        System.out.println("3) Замена первого и последнего элементов массива:");
        int[] arr = readArrayFromInput();
        int[] swappedArr = swapFirstAndLast(arr);
        System.out.println("Массив после замены: " + java.util.Arrays.toString(swappedArr));
        System.out.println();
    }

    // 4
    public void task4() {
        System.out.println("4) Поиск первого уникального элемента в массиве:");
        int[] arr = readArrayFromInput();
        int unique = findFirstUniqueElement(arr);
        System.out.println("Первое уникальное число: " + unique);
        System.out.println();
    }

    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] readArrayFromInput() {
        System.out.println("Введите длину массива:");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public int[] swapFirstAndLast(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public int findFirstUniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1;
    }
}
