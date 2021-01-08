package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenerDemo {
 
	@Test
	public void test1()
	{
		System.out.println("I am in Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am in Test 2");
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("abc")).sendKeys("abcd");
		
		driver.close();
	}
	@Test
	public void test3()
	{
		System.out.println("I am in Test 3");
		throw new SkipException("This test is skipped");
	}
}
