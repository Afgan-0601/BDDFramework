package steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CustomExtentReporter;
import utils.SeleniumDriver;

public class HooksClass {

	private static SeleniumDriver seleniumDriver;
	private static CustomExtentReporter customExtentReporter;
	private static boolean isReportRunning;

	@Before
	public void setUp() {
		SeleniumDriver.setUpDriver();

	}

	@After
	public void tearDown(Scenario scenario) {
		//customExtentReporter.writeToReport();
		SeleniumDriver.tearDown();
	}

	public static void beforeScenarioForReport(Scenario scenario) {
		if (!isReportRunning) {
			customExtentReporter = new CustomExtentReporter(
					System.getProperty("uder.dir") + "/test-output/myReport.html");
			isReportRunning = true;
		}
	}

	public static void afterScenarioForReport(Scenario scenario) throws IOException {
		String screenHotFileName = System.getProperty("uder.dir") + "/screenShotFolder"
				+ scenario.getName().replaceAll(" ", "") + ".jpeg";
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			// Driver.closeDriver();
		}

	}
}
