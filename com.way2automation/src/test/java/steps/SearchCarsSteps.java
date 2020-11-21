package steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideHomePageActions homePage = new CarsGuideHomePageActions();
	CarSearchPageActions searchPage = new CarSearchPageActions();

	
	@Given("I am on the Home Page {string} of CarsGuide website")
	public void i_am_on_the_Home_Page_of_CarsGuide_website(String url) throws InterruptedException {
		SeleniumDriver.openPage(url);
		Thread.sleep(1000);
	}

	@When("I move to the  menu")
	public void i_move_to_the_menu(List<String> list) throws InterruptedException {
		homePage.moveToBuyAndSell();
		String menu = list.get(1);
		System.out.println("Menu Selected {" + menu + " }");
		Thread.sleep(1000);

	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) throws InterruptedException {
		homePage.clickOnSearchCarsMenu();
		Thread.sleep(1000);
	}

	@And("select car brand as {string} from AnyMake Dropdown")
	public void select_car_brand_as_from_AnyMake_Dropdown(String CarMake) throws InterruptedException {
		searchPage.selectCarMake(CarMake);
		Thread.sleep(1000);
	}

	@And("select car model as {string} from SelectModel Dropdown")
	public void select_car_model_as_from_SelectModel_Dropdown(String CarModel) throws InterruptedException {
		searchPage.selectCarModel(CarModel);
		Thread.sleep(1000);
	}

	@And("select car location as {string} from SelectLocation Dropdown")
	public void select_car_location_as_from_SelectLocation_Dropdown(String carLocation) throws InterruptedException {
		searchPage.selectCarLocation(carLocation);
		Thread.sleep(1000);
	}

	@And("select car price as {string} from price Dropdown")
	public void select_car_price_as_from_price_Dropdown(String price) throws InterruptedException {
		searchPage.selectCarPrice(price);
		Thread.sleep(1000);
	}

	@And("click on Find_My_Next_car button")
	public void click_on_Find_My_Next_car_button() throws InterruptedException {
		searchPage.FindMyNextCar();
		Thread.sleep(1000);
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
		System.out.println("Car list found");
	}
	

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String acuatlTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(expectedTitle, acuatlTitle);
	}
	
//	@When("select car model as")
//	public void select_car_model_as(io.cucumber.datatable.DataTable dataTable) {
//	   System.out.println();
//	}

}
