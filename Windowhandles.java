package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String baseUrl = "http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		String mainwindowId=driver.getWindowHandle();
		System.out.println("mainwindowId: "+mainwindowId);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2500);
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gaurav.3n@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String var = driver.getWindowHandles().toArray()[0].toString();
		driver.switchTo().window(mainwindowId);
		
		driver.close();

	}

}
