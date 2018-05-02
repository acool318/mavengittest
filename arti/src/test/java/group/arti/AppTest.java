package group.arti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.Testutil;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	WebDriver driver;
	Rediff r;
	Object[][] data;
	/*@DataProvider
	public Object[][] dp()
	{
		Testutil tu = new Testutil();
		data = tu.getData("C:\\Users\\Administrator\\Desktop\\haww.xlsx","Sheet1");
		return data;
	}
	
	*
	*/@BeforeTest
	public void setUp()
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akubhuta\\Downloads\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
	}
	/*@Test(dataProvider = "dp")
	public void t(String u, String p)
	{
		System.out.println("u : "+u+"p : "+p);
	}
	*/
}
