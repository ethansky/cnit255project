
public class Manager extends Employee {
    private int storeNumber;
    private double bonus;

    public Manager(String firstName, String middleName, String lastName, String gender, int dateOfBirth, int SSN, String phoneNumber, int employeeUID, double salary, Address address, String password, String workPhoneNumber, int storeNumber, double bonus) {
        super(firstName, middleName, lastName, gender, dateOfBirth, SSN, phoneNumber, employeeUID, salary, address, password, workPhoneNumber);
        this.storeNumber = storeNumber;
        this.bonus = bonus;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getBonus();
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}