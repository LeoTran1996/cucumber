@datatable
Feature: Datatable feature 
		@datatable_step
  	Scenario Outline: Create new customer with Email <Username> and Password <Password>
		#Given Open Facebook Application
		When Input to Username and Password
			| Username   | Password  |
      | anhtran@gmail.com | 199696   | 
      | anhtran1@gmail.com | 199696  | 
      | anhtran2@gmail.com | 199696  | 
		And Click to Submit button
	 	#And Close application
		
		Examples:
			| Username          | Password |
      | anhtran@gmail.com | 199696   | 
 
     @datatable_scenario @data_driven_testing
  	Scenario Outline: Data Table in Scenario
  	#Given Open Facebook Application
		When Input to Username textbox with "<Username>"
		And Input to Password textbox with "<Password>"
  	And Click to Submit button
		#And Close application
  	
  	Examples:
			| Username          | Password |
      | anhtran1@gmail.com | 199696   |
      | anhtran2@gmail.com | 199696   |
      | anhtran3@gmail.com | 199696   |
		
 