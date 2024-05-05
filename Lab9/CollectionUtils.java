import java.util.*;

public class CollectionUtils {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> set = new HashSet<>(collection);
        return new ArrayList<>(set);
    }
}
