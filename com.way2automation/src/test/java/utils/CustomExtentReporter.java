package utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.Scenario;


public class CustomExtentReporter {

	public static ExtentHtmlReporter extentHtmlReporter;
	public static ExtentReports extentReports;
	public static ExtentTest Test;

	public CustomExtentReporter(String reportLocation) {
		extentHtmlReporter = new ExtentHtmlReporter(new File(reportLocation));
		extentReports = new ExtentReports();
		extentHtmlReporter.config().setDocumentTitle("Automation Report");//title of report
		extentHtmlReporter.config().setReportName("Functional Report");//name of report
		extentHtmlReporter.config().setTheme(Theme.DARK);

		extentReports.attachReporter(extentHtmlReporter);
		extentReports.setSystemInfo("HostName", "Global Host");
		extentReports.setSystemInfo("OS", "MAC");
		extentReports.setSystemInfo("Name Tester", "Afgan Shahguliyev");
		extentReports.setSystemInfo("Browser", "Chrome");
	}

	public void createTest(Scenario scenario, String screenShotFile) throws IOException {
		if (scenario != null) {
			String testName = getScenarioTitle(scenario);
			switch (scenario.getStatus()) {
			case PASSED:
				extentReports.createTest(testName).pass("Passed");
				break;

			case FAILED:
				extentReports.createTest(testName).pass("Failed")
						.addScreenCaptureFromPath(getScreenShotLocation(screenShotFile));
				break;

			default:
				extentReports.createTest(testName).skip("Skipped");

			}
		}
	}

	private String getScenarioTitle(Scenario scenario) {

		return scenario.getName().replace(" ", "");
	}

	private String getScreenShotLocation(String aLocation) {

		return "file:///" + aLocation.replaceAll("\\", "//");
	}

	public void writeToReport() {
		if (extentReports != null) {
			extentReports.flush();
		}
	}

}
