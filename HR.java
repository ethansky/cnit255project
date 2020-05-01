
public class HR extends Employee {
    private int cubicle;
    private int workplaceIncidentResponses;

    public HR(String firstName, String lastName, String phoneNumber, int uID, double salary, String address, String password, int cubicle, int workplaceIncidentResponses) {
        super(firstName, lastName, phoneNumber, uID, salary, address, password);
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