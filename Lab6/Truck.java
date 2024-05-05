public class Truck extends Car {
    private int numberOfWheels;
    protected float maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, float maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheels) {
        numberOfWheels = wheels;
        System.out.println("Кол-во колес: " + numberOfWheels);
    }
}
