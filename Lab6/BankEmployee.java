public class BankEmployee extends AbstractPerson {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя банковского работника: " + firstName + " " + lastName);
        System.out.println("Название банка: " + bankName);
    }
}
