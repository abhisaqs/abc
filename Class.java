package amazon;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement link_Flights = driver.findElement(By.linkText("Flights"));
		
		Actions builder= new Actions(driver);
		builder.moveToElement(link_Home).click().build().perform();
		builder.moveToElement(link_Flights).click().build().perform();
		
		
		


	}

}
