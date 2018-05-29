Feature: Smart Survey Register

 Scenario: Register a question successfully
    Given I am accessing the application
 		When I inform the user "GM-MARCIA"
 		And the password "greenmile"
 		And I select the login button
 		When Mensage "GM-Marcia"
		When you access the Maintenance menu
		And Smart Survey option
		And new button
		And informs description "Test Description"
		And add application rules button
		And let Trigger Events, start roule same save button
		And report a title from the section "Test Title"
		Then add question button
		And selects Single Selection
		And type a question "Test question"
		And an answer "test response"
		Then Save button
		And Save button again