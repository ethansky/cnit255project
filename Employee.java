
public class Employee extends Person {
    private static int currUID = 0;
    private int employeeUID;
    private double salary;
    private Address address;
    private String password; // YES I KNOW THIS SHOULDN'T BE IN PLAINTEXT BUT CRYPTO IN JAVA IS ANNOYING AND
    // I'M CURRENTLY ON A MONSTER FUELED CODING RAMPAGE LEAVE ME ALONE DAD
    private String workPhoneNumber;

    public Employee(String firstName, String middleName, String lastName, String gender, int dateOfBirth, int SSN,
                    String phoneNumber, int employeeUID, double salary, Address address, String password,
                    String workPhoneNumber) {
        super(firstName, middleName, lastName, gender, dateOfBirth, SSN, phoneNumber);
        this.employeeUID = getUID();
        this.salary = salary;
        this.address = address;
        this.password = password;
        this.workPhoneNumber = workPhoneNumber;
    }

    private static int getUID() {
        int fubar = currUID;
        currUID++;
        return fubar;
    }

    public int getEmployeeUID() {
        return employeeUID;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }
}