public class Main {
    public static void main(String[] args) {
        Entity entity1 = new Entity();
        Entity entity2 = new Entity(1, "Richard");

        System.out.println("1: " + entity1);
        System.out.println("2: " + entity2);


        double aDouble = 10.5;
        double bDouble = 5.0;

        double sumResultDouble = Calculator.sum(aDouble, bDouble);
        System.out.println("Сумма для double: " + sumResultDouble);

        long aLong = 10000000000L;
        long bLong = 5000000000L;

        long sumResultLong = Calculator.sum(aLong, bLong);
        System.out.println("Сумма для long: " + sumResultLong);

        int aInt = 10;
        int bInt = 5;

        int sumResultInt = Calculator.sum(aInt, bInt);
        System.out.println("Сумма для int: " + sumResultInt);



    }
}
