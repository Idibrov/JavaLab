public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        Airplane.Wing wing1 = new Airplane.Wing(500);
        Airplane.Wing wing2 = new Airplane.Wing(600);

        System.out.println("Информация о первом крыле:");
        wing1.showWeight();
        System.out.println();

        System.out.println("Информация о втором крыле:");
        wing2.showWeight();
    }
}
