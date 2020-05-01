
public class Manager extends Employee {
    private int storeNumber;
    private double bonus;

    public Manager(String firstName, String lastName, String phoneNumber, int uID, double salary, String address, String password, int storeNumber, double bonus) {
        super(firstName, lastName, phoneNumber, salary, address, password);
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