package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getPropertis();
		
        if(browserName.equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
    	    driver = new ChromeDriver();
        }
        else  if(browserName.equalsIgnoreCase("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver",projectPath+"\\driver\\geckodriver\\geckodriver.exe");
    	    driver = new FirefoxDriver();
        }
        
		
	}
	
	@Test
	public void GoogleSearch() throws InterruptedException
	{
		// goto google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		      Thread.sleep(3000);
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
	}
	
	
	@AfterTest
	public void tearDownTest()
	{
		//close browser
				driver.close();
				//driver.quit();
				System.out.println("completed successfully");
				PropertiesFile.setProperties();
				
	}

}
