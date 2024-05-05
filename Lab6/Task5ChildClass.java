public class Task5ChildClass extends Task5MainClass {
    int age;

    public Task5ChildClass(int age) {
        this.age = age;
    }

    void getUserName() {
        System.out.println("Возраст пользователя: " + age);
    }
}
