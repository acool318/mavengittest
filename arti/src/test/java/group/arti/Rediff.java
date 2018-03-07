package group.arti;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediff {
	WebDriver driver;
Rediff(WebDriver d)
	{
		this.driver = d;
		
	}
	@FindBy(xpath = "/html/body/div[1]/div[5]/table")
	WebElement table;
	@FindBy(xpath = "/html/body/div[1]/div[5]/table/thead/tr")
	List<WebElement> li_rows;
public void printall()
{
	PageFactory.initElements(driver, this);
	System.out.println(li_rows.size());
}
}
