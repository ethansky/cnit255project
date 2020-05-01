
public class Sales extends Employee {
    private int storeNumber;
    private int numberOfSales;
    private int commissionPercent;
    private double totalCommission;
    private String salesDepartment;

    public Sales(String firstName, String lastName, String phoneNumber, double salary, String address, String password, int storeNumber, int numberOfSales, int commissionPercent, double totalCommission, String salesDepartment) {
        super(firstName, lastName, phoneNumber, salary, address, password);
        this.storeNumber = storeNumber;
        this.numberOfSales = numberOfSales;
        this.commissionPercent = commissionPercent;
        this.totalCommission = totalCommission;
        this.salesDepartment = salesDepartment;
    }

    public void addSale(double price) {
        this.numberOfSales++;
        this.totalCommission += price * (commissionPercent / 100.0);
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public int getCommissionPercent() {
        return commissionPercent;
    }

    public double getTotalCommission() {
        return totalCommission;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getTotalCommission();
    }

    public String getSalesDepartment() {
        return salesDepartment;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public void setSalesDepartment(String salesDepartment) {
        this.salesDepartment = salesDepartment;
    }

}