@Login
Feature: Activity Login 

		@positiveLogin 
	Scenario: User successfully log in 
		Given User on Kozii login page
		When User input authorization using "email123@mailnesia.com" as email & "12345678" as password 
		And User click Submit button
		Then User succesfully log in and navigate to dashboard of kozii
