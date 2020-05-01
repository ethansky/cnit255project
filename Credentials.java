/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole Hutchcraft
 */
public class Credentials {
    private String uID; 
    private String password; 
    
    private Employee[] employeeDatabase = new Employee[10];
    
    private String[][] loginDatabase ={
        {"C001", "E002","J003","K004","J005"},
        {"Chutchcraft","E","JKlezinsky","KLee","JPeterson"}
    };
    
    public void registerEmployee(String firstName,String lastName, String phoneNumber, int uID, String password, double salary, String address){
        int i = 0; 
        employeeDatabase[i] = new Employee(firstName, lastName, phoneNumber, uID, password, salary, address);
    }
    
   
    
    
    public int getDatabase(String user, String pass){
      for (int i = 0; i < loginDatabase[i].length; i++){
          if (user.equals(loginDatabase[i][0])){
              return 1; //successful login
          }
      }  
        return -1;
    }
    
    public void addUser(String){
        
    }
    
    public void deleteUser(){
        
    }
}
