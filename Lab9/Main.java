import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // тест для 1
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 1, 2, 4);
        System.out.println("Исходная коллекция: " + listWithDuplicates);
        Collection<Integer> withoutDuplicates = CollectionUtils.removeDuplicates(listWithDuplicates);
        System.out.println("Коллекция без дубликатов: " + withoutDuplicates);

        // тест для 2
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = 1000000;

        ListPerformance.fillLists(arrayList, linkedList, size);

        int numOfSelections = 1000;
        ListPerformance.selectRandomElements(arrayList, linkedList, numOfSelections);

        // тест для 3
        User user = new User("John");
        System.out.println("Имя пользователя: " + user.getName());
        user.setName("Alice");
        System.out.println("Измененное имя пользователя: " + user.getName());

        // тест для 4
        UserScoreManager scoreManager = new UserScoreManager();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        scoreManager.addUser(user1, 100);
        scoreManager.addUser(user2, 150);

        System.out.println("Очки пользователя Alice: " + scoreManager.getScore(user1));
    }
}
