package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	ChromeOptions chromeOptions = new ChromeOptions();

	@Test
	public void testTitle() {
		driver.get("https://www.valuelabs.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = driver.getTitle();
		AssertJUnit
				.assertTrue(title.contains("Global software,Product development and IT services company - ValueLabs"));

		/*
		 * if(driver.getTitle().equals(title)){ System.out.println(
		 * "Title verification successful"); }else{ System.out.println(
		 * "title verification fail"); }
		 */
	}

	@Test
	public void testUrl() {
		driver.get("https://www.valuelabs.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = driver.getCurrentUrl();
		AssertJUnit.assertEquals(url, "https://www.valuelabs.com/");
	}

	@BeforeTest
	public void beforeTest() {

		// src/test/resources/org/automation/driver/chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		driver = new ChromeDriver(chromeOptions);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
