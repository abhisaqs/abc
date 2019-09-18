package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	Readconfig readconfig= new Readconfig();
	public String baseUrl = readconfig.getApplicationURL();
			public String username = readconfig.getusername();
			public String password = readconfig.getpassword();
			public String chromepath = readconfig.getchromepath();
			public static WebDriver driver;


@BeforeClass
public void setup(String br)
{
	System.setProperty("webriver.chrome.driver",pro.getchromepath());
	driver = new ChromeDriver();
}
public void teardown()
{
	driver.quit();
}
}