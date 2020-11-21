package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class UsedCarSearchPageLocator {

	WebDriver driver;

	public UsedCarSearchPageLocator() {
		driver = SeleniumDriver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='makes']")
	public WebElement makes;
	
	@FindBy(xpath = "//*[@id='models']")
	public WebElement models;
	
	@FindBy(xpath = "//*[@id='locations']")
	public WebElement locations;
	
	@FindBy(xpath = "//*[@id='priceTo']")
	public WebElement price;
	
	@FindBy(xpath = "//*[@id='search-submit']")
	public WebElement FindMyNextCarBtn;
	
}
