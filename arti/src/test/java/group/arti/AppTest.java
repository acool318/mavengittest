package group.arti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	Rediff r;
	@Test
	public void t()
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		r = new Rediff(driver);
	}
}
