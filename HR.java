
public class HR extends Employee {
    private int cubicle;
    private int workplaceIncidentResponses;

    public HR(String firstName, String middleName, String lastName, String gender, int dateOfBirth, int SSN, String phoneNumber, int employeeUID, double salary, Address address, String password, String workPhoneNumber, int cubicle, int workplaceIncidentResponses) {
        super(firstName, middleName, lastName, gender, dateOfBirth, SSN, phoneNumber, employeeUID, salary, address, password, workPhoneNumber);
        this.cubicle = cubicle;
        this.workplaceIncidentResponses = workplaceIncidentResponses;
    }

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