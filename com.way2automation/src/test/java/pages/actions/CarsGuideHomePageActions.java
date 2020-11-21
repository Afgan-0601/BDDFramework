package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators homePage = null;

	public CarsGuideHomePageActions() {
		this.homePage = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePage);
	}

	public void moveToBuyAndSell() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePage.carsBuyAndSell).perform();
	}

	
	public void clickOnSearchCarsMenu() {
		homePage.searcCarhWebsite.click();;
	}
	
	
	public void clickOnUsedCarsMenu() {
		homePage.usedCarSearchlink.click();
	}
	
	
	public  void moveToSellMyCar() {
		homePage.SellMyCar.click();
		
	}

}
