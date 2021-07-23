@parameter
Feature: Parameter feature 
  @no_param
  Scenario: Scenario Have no param
		#Given Open Facebook Application
		When Input to Username textbox
		And Input to Password textbox
		And Click to Submit button
		#And Close application
		
		@param_mark
  	Scenario: Scenario Having param
		#Given Open Facebook Application
		When Input to Username textbox with "anhtran@gmail.com"
		And Input to Password textbox with "123456"
		And Click to Submit button
		#And Close application
		
		@param_no_mark
  	Scenario: Scenario Having param
		#Given Open Facebook Application
		When Input to Username textbox with anhtran@gmail.com
		And Input to Password textbox with 123456
		And Click to Submit button
		#And Close application
	
		@multiple_param
  	Scenario: Scenario Having param
	#	Given Open Facebook Application
		When Input to Username with "anhtran@gmail.com" and Password with "123456"
		And Click to Submit button
		#And Close application
	