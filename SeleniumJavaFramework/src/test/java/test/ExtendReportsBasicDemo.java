package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
	    
	    // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
        
        String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    test1.log(Status.INFO, "Starting Test Case");
	    driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered text in searchbox");
		
		 Thread.sleep(3000);
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "this is a test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    test2.log(Status.INFO, "Starting Test Case");
	    driver.get("https://google.com");
		test2.pass("Navigated to google.com");
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered text in searchbox");
		
		 Thread.sleep(3000);
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test2.pass("Closed the browser");
		
		test2.info("Test Completed");
		
		 // calling flush writes everything to the log file
        extent.flush();

	}

}
