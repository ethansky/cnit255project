
public class Employee extends Person {
    private static int currUID = 0;
    private int employeeUID;
    private double salary;
    private Address address;
    private String password; // YES I KNOW THIS SHOULDN'T BE IN PLAINTEXT BUT CRYPTO IN JAVA IS ANNOYING AND
                             // I'M CURRENTLY ON A MONSTER FUELED CODING RAMPAGE LEAVE ME ALONE DAD
    private String workPhoneNumber;

    private static int getUID() {
        int fubar = currUID;
        currUID++;
        return fubar;
    }

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

    public int getEmployeeUID() {
        return employeeUID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }
}