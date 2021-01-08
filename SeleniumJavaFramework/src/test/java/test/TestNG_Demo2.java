package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@Test
	public void GoogleSearch2() throws InterruptedException
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
	
	@Test
	public void GoogleSearch3() throws InterruptedException
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
				driver.quit();
				System.out.println("completed successfully");
				
	}

}
