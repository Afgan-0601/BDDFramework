package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

public class UsedCarsSeacrhSteps {
	
	UsedCarsSearchPageActions usedCarsPage = new UsedCarsSearchPageActions();
	CarsGuideHomePageActions homePage = new CarsGuideHomePageActions();
	
	
	@And("click on {string} link on Used Search Car Page")
	public void click_on_link_on_Used_Search_Car_Page(String string) throws InterruptedException {
		homePage.clickOnUsedCarsMenu();
		Thread.sleep(1000);
	}

	@And("select car brand as {string} from AnyMake Dropdown on Used Search Car Page")
	public void select_car_brand_as_from_AnyMake_Dropdown_on_Used_Search_Car_Page(String carBrand) {
		usedCarsPage.selectCarMake(carBrand);
	}

	@And("select car model as on Used Search Car Page")
	public void select_car_model_as_on_Used_Search_Car_Page(List<String> list) throws InterruptedException {
		String model = list.get(1);
		usedCarsPage.selectCarModel(list.get(1));
		
		System.out.println("Car Model is  {" + model + " }");
		Thread.sleep(1000);
	}

	@And("select car location as {string} from SelectLocation Dropdown on Used Search Car Page")
	public void select_car_location_as_from_SelectLocation_Dropdown_on_Used_Search_Car_Page(String carLocation) throws InterruptedException {
		usedCarsPage.selectCarLocation(carLocation);
		Thread.sleep(1000);
	}

	@And("select car price as {string} from price Dropdown on Used Search Car Page")
	public void select_car_price_as_from_price_Dropdown_on_Used_Search_Car_Page(String carPrice) throws InterruptedException {
		usedCarsPage.selectCarPrice(carPrice);
		Thread.sleep(1000);
	}

	@And("click on Find_My_Next_car button on Used Search Car Page")
	public void click_on_Find_My_Next_car_button_on_Used_Search_Car_Page() throws InterruptedException {
		usedCarsPage.FindMyNextCar();
		Thread.sleep(1000);
	}

	@Then("I should see list of searched cars on Used Search Car Page")
	public void i_should_see_list_of_searched_cars_on_Used_Search_Car_Page() throws InterruptedException {
	 System.out.println("Listed All car models ");
	 Thread.sleep(1000);
	}

}
