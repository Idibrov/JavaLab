class JavaProgram {
    public static void main(String[] args) {
        Car car1 = new Car("Red");
        Car car2 = new Car("Blue", "Toyota", 1500.0);

        car1.printDetails();
        car2.printDetails();
    }
}
