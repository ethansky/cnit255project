# **Requirements**

- Min 5 Java classes
- Min 2 inheritance relationships
- Min 3 association relationships
- Min 1 interface
- Must have GUI

# Employee Management Software
- ## Classes
	- Employee Class
		- First Name Attribute
		- Last Name Attribute
		- uID Attribute
		- Password Attribute
		- Address Attribute
		- Phone # Attribute 
		- Salary Attribute
			- Manager Class
				- Login Interface
				- Register/Delete Employee Interface
				- Search Employee Interface
				- Create Report Interface
			- HR Class
				- Login Interface 
				- Search Employee Interface
				- Create Report Interface 
			- Sales Class 
				- Login Interface
				- Create Report Interface
 
- ## GUI
	- Login GUI
		- uID Attribute
		- Password Attribute 
		- Login Button
	- Register/Delete Employee GUI
		- uID Attribute
		- First Name Attribute 
		- Last Name Attribute
		- Register Button 
		- Delete Button
	- Search Employee GUI
		- uID Attribute
		- First Name Attribute
		- Last Name Attribute 
		- Search Button
	- Create Report GUI
		- uID Attribute
		- First Name Attribute
		- Last Name Attribute
		- Report Textbox 
		- Create Report Button
 
 - ## Buttons
	- Login Button
		- Logic: On button click, search array for inputted uID 
		and Password. If true, login to UI specific to job title
	- Register Button
		- Logic: On button click, add new entries into the different
		Employee attribute arrays for the inputted values
	- Delete Button
		- Logic: On button click, delete selected profile data that 
		matches the inputted uID, First Name, and Last Name
	- Search Button
		- Logic: On button click, search through uID, First Name, 
		and Last Name arrays that match the inputted data & display
		all Employee attributes 
	- Create Report Button
		- Logic: On button click, create a .txt file and save it 
		locally to a user specified file location
	
