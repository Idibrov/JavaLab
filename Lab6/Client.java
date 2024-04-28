public class Client extends AbstractPerson {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя клиента: " + firstName + " " + lastName);
        System.out.println("Название банка: " + bankName);
    }
}
