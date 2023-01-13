Feature: Login

Scenario: Valid Credential 	
		When navigate to login page saucedemo
		And enter input "standard_user" as username and "secret_sauce" as password 
		And click button login

		
Scenario: Valid Credentian with ignore letter case
		When navigate to login page saucedemo
		And enter input "STandARD_User" as username and "secret_sauce" as password 
		And click button login
		Then Appear popup greating "Epic sadface" 
		
Scenario: Invalid username 
		When navigate to login page saucedemo
		And enter input "tomsstimh" as username and "secret_sauce" as password 
		And click button login
		Then Appear popup greating "Epic sadface" 

Scenario: Invalid Password
		When navigate to login page saucedemo
		And enter input "standard_user" as username and "Secret" as password
		And click button login 
		Then Appear popup greating "Epic sadface"  

Scenario: Null username
		When navigate to login page saucedemo
		And enter input "" as username and "secret_sauce" as password 
		And click button login
		Then Appear popup greating "Epic sadface" 
		
Scenario: Null password
		When navigate to login page saucedemo
		And enter input "standard_user" as username and "" as password 
		And click button login
		Then Appear popup greating "Epic sadface" 
	