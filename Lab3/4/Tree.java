class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void printDetails() {
        System.out.println("Age: " + age);
        System.out.println("Alive: " + alive);
        System.out.println("Name: " + name);
    }

}
