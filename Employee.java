
public class Employee extends Person {
    private final int employeeUID;
    private String address;
    private String password; // YES I KNOW THIS SHOULDN'T BE IN PLAINTEXT BUT CRYPTO IN JAVA IS ANNOYING AND
    // I'M CURRENTLY ON A MONSTER FUELED CODING RAMPAGE LEAVE ME ALONE DAD

    public Employee(String firstName, String lastName, String phoneNumber, int employeeUID, String address, String password) {
        super(firstName, lastName, phoneNumber);
        this.employeeUID = employeeUID;
        this.address = address;
        this.password = password;
    }

    public int getEmployeeUID() {
        return employeeUID;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}