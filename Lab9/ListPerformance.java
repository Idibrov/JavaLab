import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ListPerformance {

    public static void fillLists(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int size) {
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    public static void selectRandomElements(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int numOfSelections) {
        Random random = ThreadLocalRandom.current();
        long arrayListStartTime = System.currentTimeMillis();
        for (int i = 0; i < numOfSelections; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.get(index);
        }
        long arrayListEndTime = System.currentTimeMillis();
        long arrayListTimeElapsed = arrayListEndTime - arrayListStartTime;
        System.out.println("Время для ArrayList: " + arrayListTimeElapsed + " миллисекунд");

        long linkedListStartTime = System.currentTimeMillis();
        for (int i = 0; i < numOfSelections; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.get(index);
        }
        long linkedListEndTime = System.currentTimeMillis();
        long linkedListTimeElapsed = linkedListEndTime - linkedListStartTime;
        System.out.println("Время для LinkedList: " + linkedListTimeElapsed + " миллисекунд");
    }


}
