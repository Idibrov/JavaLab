class JavaProgram {
    public static void main(String[] args) {
        Tree tree1 = new Tree(10, "Дуб");
        Tree tree2 = new Tree(5, true, "Сосна");
        Tree tree3 = new Tree();

        tree1.printDetails();
        tree2.printDetails();
        tree3.printDetails();
    }


}