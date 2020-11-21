@Search_cars 
Feature: Acceptance testing to validate Search cars page is working properly. 
	In order to validate that
 the search cars page wir working fine
 we will do the acceptance testing

@Search_cars-Positive 
Scenario: Validate search cars page 
	Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website 
	When I move to the  menu 
		|menu		 |
		|buy and sell|
		|reviews	 |
	And click on "Search Cars" link 
	And select car brand as "BMW" from AnyMake Dropdown 
	And select car model as "1 Series" from SelectModel Dropdown 
	And select car location as "ACT - All" from SelectLocation Dropdown 
	And select car price as "$1,000" from price Dropdown 
	And click on Find_My_Next_car button 
	Then I should see list of searched cars 
	And the page title should be "Bmw 1 Series Under 1000 for Sale ACT | carsguide"