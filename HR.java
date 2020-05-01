
public class HR extends Employee implements Payable{
    private int cubicle;
    private double salary;

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public HR(String firstName, String lastName, String phoneNumber, int employeeUID, String address, String password, int cubicle, double salary, int workplaceIncidentResponses) {
        super(firstName, lastName, phoneNumber, employeeUID, address, password);
        this.cubicle = cubicle;
        this.salary = salary;
        this.workplaceIncidentResponses = workplaceIncidentResponses;
    }

    private int workplaceIncidentResponses;



    public int getCubicle() {
        return cubicle;
    }

    public int getWorkplaceIncidentResponses() {
        return workplaceIncidentResponses;
    }

    public void setCubicle(int cubicle) {
        this.cubicle = cubicle;
    }

    public void addWorkplaceIncidentResponse() {
        workplaceIncidentResponses++;
    }
}