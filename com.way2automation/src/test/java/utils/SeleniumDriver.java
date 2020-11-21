package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;


	// initialize Webdriver
	private static WebDriver driver;

	// This is for report
	private static WebDriverWait waitDriver;

	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

//	public static void setExtent() {
//		htmlReporter = new ExtentHtmlReporter(System.getProperty("uder.dir")+"/test-output/myReport.html");
//		htmlReporter.config().setDocumentTitle("Automation Report");//title of report
//		htmlReporter.config().setReportName("Functional Report");//name of report
//		htmlReporter.config().setTheme(Theme.DARK);
//		
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		extent.setSystemInfo("HostName", "Global Host");
//		extent.setSystemInfo("OS", "MAC");
//		extent.setSystemInfo("Name Tester", "Afgan Shahguliyev");
//		extent.setSystemInfo("Browser", "Chrome");
//	}

//	public static void endReport() {
//		extent.flush();
//	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setUpDriver() {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
