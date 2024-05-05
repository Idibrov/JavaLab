public class Airplane {
    public static class Wing {
        private double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }
}
