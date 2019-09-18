package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Website {
	public static void main(String[] args) throws InterruptedException {
		

	{
		System.setProperty("webdriver.gecko.driver","E:\\chrome driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("abhi");
		driver.findElement(By.xpath("(//input[@id='u_0_u'])")).sendKeys("lash");
        driver.findElement(By.id("u_0_x")).sendKeys("7306249204");
        
		
		//Actions actionobj = new Actions(driver);
		//actionobj.moveToElement(driver.findElement(By.className("a-section a-spacing-none a-spacing-top-micro"))).build().perform();
				
		
	
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	
 
}
	}
	}


