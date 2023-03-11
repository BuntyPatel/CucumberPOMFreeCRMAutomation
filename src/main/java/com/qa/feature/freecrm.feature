Feature: Free CRM Application Test

Scenario: Validate Free CRM Home Page Test

		Given user opens browser
		When user is on login Page
		Then user logs into app
		Then validate home page title
		Then validate logged in username
		Then close the browser
		