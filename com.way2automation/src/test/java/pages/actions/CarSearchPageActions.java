package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {

	SearchCarsPageLocators carSearchPageLocators = null;
	
	public CarSearchPageActions() {
		this.carSearchPageLocators = new SearchCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(carSearchPageLocators.makes);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(carSearchPageLocators.models);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String carLocation) {
		Select selectCarMaker = new Select(carSearchPageLocators.locations);
		selectCarMaker.selectByVisibleText(carLocation);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(carSearchPageLocators.price);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void FindMyNextCar() {
		carSearchPageLocators.FindMyNextCarBtn.click();
	}
	
	
}
