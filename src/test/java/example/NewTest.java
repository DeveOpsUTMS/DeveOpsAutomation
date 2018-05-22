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
		System.out.println("Titele verification started");
		String title = driver.getTitle();
		//Global software,Product development and IT services company - ValueLabs
		AssertJUnit.assertEquals("Global software,Product development and IT services company - ValueLabs", title);

		/*
		 * if(driver.getTitle().equals(title)){ System.out.println(
		 * "Title verification successful"); }else{ System.out.println(
		 * "title verification fail"); }
		 */
	}

	@Test
	public void testUrl() {
		driver.get("https://www.valuelabs.com/");
		System.out.println("Url verification started");
		String url = driver.getCurrentUrl();
		AssertJUnit.assertEquals(url, "https://www.valuelabs.com/");
	}

	@BeforeTest
	public void beforeTest() {

		// src/test/resources/org/automation/driver/chromedriver.exe
		///usr/bin/chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/org/automation/driver/chromedriver.exe");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		driver = new ChromeDriver(chromeOptions);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
