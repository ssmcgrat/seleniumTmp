package drivers;

import org.testng.annotations.Test;

import pages.GoogleHome;

public class TestRunner1 extends TestRunner {
	private String dataFile = "testData_1.xlsx";
	
	GoogleHome googleHome;
	
	@Test(priority=0)
	public void launchURL() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("title: " + title);
	}
	
	@Test(priority=1)
	public void performGoogleSearch() {
		googleHome = new GoogleHome(driver, data);
		googleHome.performSearch();
	}
	
}
