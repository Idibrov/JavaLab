import java.util.*;

public class UserScoreManager {
    private Map<User, Integer> userScores;

    public UserScoreManager() {
        userScores = new HashMap<>();
    }

    public void addUser(User user, int score) {
        userScores.put(user, score);
    }

    public int getScore(User user) {
        return userScores.getOrDefault(user, 0);
    }

    public static void main(String[] args) {
        UserScoreManager scoreManager = new UserScoreManager();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        scoreManager.addUser(user1, 100);
        scoreManager.addUser(user2, 150);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String inputName = scanner.nextLine();
        User userInput = new User(inputName);

        int userScore = scoreManager.getScore(userInput);
        System.out.println("Очки пользователя " + inputName + ": " + userScore);
    }
}
