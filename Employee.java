
public class Employee extends Person {
    private static int currUID = 0;
    private int employeeUID;
    private double salary;
    private Address address;
    private String password; // YES I KNOW THIS SHOULDN'T BE IN PLAINTEXT BUT CRYPTO IN JAVA IS ANNOYING AND
                             // I'M CURRENTLY ON A MONSTER FUELED CODING RAMPAGE LEAVE ME ALONE DAD
    private String workPhoneNumber;

    public Employee(double salary, int homeNumber, String street, String city, String state, String country,
            int zipCode, String firstName, String lastName, int birthYear, int birthMonth, int birthDay, int ssn,
            String password, String phoneNumber, String workPhoneNumber) {
        super(firstName, lastName, birthYear, birthMonth, birthDay, ssn, phoneNumber);
        this.address = new Address(homeNumber, street, city, state, country, zipCode);
        this.employeeUID = getUID();
        this.salary = salary;
        this.password = password;
        this.workPhoneNumber = workPhoneNumber;
    }

    private int getUID() {
        int fubar = currUID;
        currUID++;
        return fubar;
    }

    public Address getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}