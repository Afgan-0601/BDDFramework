$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchCars.feature");
formatter.feature({
  "name": "Acceptance testing to validate Search cars page is working properly.",
  "description": "\tIn order to validate that\n the search cars page wir working fine\n we will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search_cars"
    }
  ]
});
formatter.scenario({
  "name": "Validate search cars page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search_cars"
    },
    {
      "name": "@Search_cars-Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide website",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchCarsSteps.i_am_on_the_Home_Page_of_CarsGuide_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to the  menu",
  "rows": [
    {
      "cells": [
        "menu"
      ]
    },
    {
      "cells": [
        "buy and sell"
      ]
    },
    {
      "cells": [
        "reviews"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select car brand as \"BMW\" from AnyMake Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_car_brand_as_from_AnyMake_Dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select car model as \"1 Series\" from SelectModel Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_car_model_as_from_SelectModel_Dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select car location as \"ACT - All\" from SelectLocation Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_car_location_as_from_SelectLocation_Dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select car price as \"$1,000\" from price Dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.select_car_price_as_from_price_Dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Find_My_Next_car button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.click_on_Find_My_Next_car_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});