package amazon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Guru99 {
	
	public static WebDriver driver;
	String path ="E:\\chrome driver\\chromedriver.exe";
	String url ="https://www.demo.guru99.com/V4/";
	



@BeforeTest

public String getApplicationurl()
{
	
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	return url;
	}
/*@Test
public String Login()
{
	
	driver.findElement(By.name("uid")).sendKeys("abhilash");
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.name("btnLogin")).click();
	Alert alertobj=driver.switchTo().alert();
	String value=alertobj.getText();
	alertobj.accept();
	return url;*/
	
	
@Test
public void verifyHomepageTitle()
{
	String expectedTitle ="Guru 99 Home Page";
	String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle);
	
}
@AfterTest
public void endsession()
{
	driver.close();
}

}

