Feature: Smart Survey Validation

    
	Scenario: Validation by not entering any information in Smart Survey
		Given that I am accessing the application
		When we inform user "GM-MARCIA"
		And the password "greenmile"
		And I select the login button
		When Mensage GM-Marcia
		When the Maintenance menu is lit
		And Smart Survey option
		And new button
		And save button
		Then message Description is mandatory

	