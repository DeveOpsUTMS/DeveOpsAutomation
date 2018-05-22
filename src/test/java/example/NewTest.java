package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
WebDriver driver;
  @Test
  public void testTitle() {
	  	driver.get("https://www.valuelabs.com/");
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Global software,Product development and IT services company - ValueLabs")); 
		
		/*if(driver.getTitle().equals(title)){
			System.out.println("Title verification successful");
		}else{
			System.out.println("title verification fail");
		}*/
  }
  
  @Test
  public void testUrl(){
	  driver.get("https://www.valuelabs.com/");
	  String url = driver.getCurrentUrl();
	  AssertJUnit.assertEquals(url, "https://www.valuelabs.com/");
  }
  
 
  @BeforeTest
  public void beforeTest() {
	  
	  
	  //src/test/resources/org/automation/driver/chromedriver.exe
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
