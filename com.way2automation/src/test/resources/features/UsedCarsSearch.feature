@UsedSearch_cars 
Feature:  
	Acceptance testing to validate Used Search cars page is working properly. 
	In order to validate that
 the used search cars page working fine
 we will do the acceptance testing

@UsedSearch_cars-Positive 
Scenario: Validate Used search cars page 
	Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website 
	When I move to the  menu 
		|menu		 |
		|buy and sell|
		|reviews	 |
	And click on "Used" link on Used Search Car Page
	And select car model as on Used Search Car Page
	And select car brand as "Audi" from AnyMake Dropdown on Used Search Car Page
		|Model|
		|A4   |
		|A3   |
	And select car location as "NSW - Sydney" from SelectLocation Dropdown on Used Search Car Page
	And select car price as "$3,000" from price Dropdown on Used Search Car Page
	And click on Find_My_Next_car button on Used Search Car Page
	Then I should see list of searched cars on Used Search Car Page
	And the page title should be "Used Audi A4 Under 3000 for Sale Sydney NSW | carsguide"
	
