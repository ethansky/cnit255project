/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole Hutchcraft
 */
import java.util.ArrayList;

public class Credentials {
    private String employeeUID; 
    private String password; 
    ArrayList<Employee> employeeData = new ArrayList<>();

    private String[][] loginDatabase ={
        {"C001", "E002","J003","K004","J005"},
        {"Chutchcraft","E","JKlezinsky","KLee","JPetersen"}
    };
    
    public static void main(String[] args) {
    ArrayList<Employee> employeeData = new ArrayList<>();
         
        employeeData.add(new HR("Cole", "Hutchcraft", "8121233456", 001, "400 Northwestern Ave", "CHutchcraft", 34, 50000, 25));
        employeeData.add(new Manager("Ethan", "Evans", "3456885998", 002, "1234 Easy Way", "EEvans", 5, 15000, 60000));
        employeeData.add(new Sales("James", "Klezinsky", "9874732216", 003, "1564 Big Road Ln", "JKlezinsky", 4, 45000, 500, 45, 45000, "Marketing"));
        employeeData.add(new Sales("Justin", "Petersen", "2437879008", 004, "600 Stadium Ave", "JPetersen", 5,  60000, 345, 30, 30000, "Hardware"));
        employeeData.add(new Employee("Jerry", "Lee", "8674937464", 005, "1100 Grant St", "JLee"));
    }
    
   
    
    
    public int getDatabase(String user, String pass){
      for (int i = 0; i < loginDatabase[i].length; i++){
          if (user.equals(loginDatabase[i][0])){
              return 1; //successful login
          }
      }  
        return -1;
    }
    
    public void addEmployee(String firstName, String lastName, String phoneNumber, int employeeUID, String address, String password) {

        employeeData.add(new Employee(firstName, lastName, phoneNumber, employeeUID, address, password));
    }
    
    public void deleteUser(String firstName, String lastName, int employeeUID){ 
        
        for (int i = 0; i < employeeData.size(); i++){
            if (firstName.equals(employeeData.get(i).getFirstName()) && lastName.equals(employeeData.get(i).getLastName()) && (employeeUID == employeeData.get(i).getEmployeeUID())){
                employeeData.remove(i);
                break;
            }
        }
    }

    public Employee searchEmployee(String firstName, String lastName, int employeeUID){
        for (int i = 0; i < employeeData.size(); i++){
            if (firstName.equals(employeeData.get(i).getFirstName()) && lastName.equals(employeeData.get(i).getLastName()) && (employeeUID == employeeData.get(i).getEmployeeUID())){
                return (Employee) employeeData.get(i);
            }
        }
    }
}
