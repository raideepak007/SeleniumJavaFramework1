package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
	
	public static void googleSearchTest() throws InterruptedException
	{
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    GoogleSearchPageObjects serachPageObj = new GoogleSearchPageObjects(driver);
	    
	    driver.get("https://google.com");
	    
	    serachPageObj.setTextInSearchBox("A B C D");
	    
	    Thread.sleep(3000);
	    
	    serachPageObj.clickSearchButton();
	    
	    driver.close();
	    
	}

}
