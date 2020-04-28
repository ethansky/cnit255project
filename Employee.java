
public class Employee {
    private static int employeeUID = 0;
    private double salary;
    private Address address;
    private String firstName;
    private String lastName;
    private String password; //YES I KNOW THIS SHOULDN'T BE IN PLAINTEXT BUT CRYPTO IN JAVA IS ANNOYING AND I'M CURRENTLY ON A MONSTER FUELED CODING RAMPAGE LEAVE ME ALONE DAD
    private String phoneNumber;

    public Employee(double salary, int homeNumber, String street, String city, String state, String country, int zipCode, String firstName, String lastName, String password,
            String phoneNumber) {
        this.employeeUID = getUID();
        this.salary = salary;
        this.address = new Address(homeNumber, street, city, state, country, zipCode);
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    private int getUID(){
        int fubar = employeeUID;
        employeeUID++;
        return fubar;
    }

    public Address getAddress(){
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}