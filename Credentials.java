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
    

    private String[][] loginDatabase ={
        {"C001", "E002","J003","K004","J005"},
        {"Chutchcraft","E","JKlezinsky","KLee","JPetersen"}
    };
    

    
   
    
    
    public int getDatabase(String user, String pass){
      for (int i = 0; i < loginDatabase[i].length; i++){
          if (user.equals(loginDatabase[i][0])){
              return 1; //successful login
          }
      }  
        return -1;
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

    public Employee searchEmployee(String firstName, String lastName, int employeeUID)
}
