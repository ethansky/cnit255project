
public class Manager extends Employee implements Salaried {
    private int storeNumber;
    private double bonus;
    private double salary;

    public Manager(String firstName, String lastName, String phoneNumber, int employeeUID, String address, String password, int storeNumber, double bonus, double salary) {
        super(firstName, lastName, phoneNumber, employeeUID, address, password);
        this.storeNumber = storeNumber;
        this.bonus = bonus;
        this.salary = salary;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary + getBonus();
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}