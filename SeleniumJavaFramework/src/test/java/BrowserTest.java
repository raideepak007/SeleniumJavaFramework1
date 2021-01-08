

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		//for firefox browser
		
		//System.setProperty("webdriver.gecko.driver",projectPath+"\\driver\\geckodriver\\geckodriver.exe");
		
		// when we are giving adject location of gecko driver than we use is, if we want to run this project in other system than it will create problem regarding location so for that we use above one.
	 //	System.setProperty("webdriver.gecko.driver","C:\Users\amit002\eclipse-workspace\SeleniumJavaFramework\driver\geckodriver\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// for Chrome browser
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// for internet explo
		
		//System.setProperty("webdriver.ie.driver", projectPath+"\\driver\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Hanuman Ji");
		
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Automation Testing");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		int count = listOfInputElements.size();
		
		System.out.println("list of input elements: "+count);
		
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
