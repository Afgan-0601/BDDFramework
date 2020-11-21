package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarsPageLocators;
import pages.locators.UsedCarSearchPageLocator;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {


	public UsedCarSearchPageLocator usedCarsPage= null;
	
	public UsedCarsSearchPageActions() {
		this.usedCarsPage = new UsedCarSearchPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsPage);
	}
	
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(usedCarsPage.makes);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(usedCarsPage.models);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String carLocation) {
		Select selectCarMaker = new Select(usedCarsPage.locations);
		selectCarMaker.selectByVisibleText(carLocation);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(usedCarsPage.price);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void FindMyNextCar() {
		usedCarsPage.FindMyNextCarBtn.click();
	}
	
	
	
}
