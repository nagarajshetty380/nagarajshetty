package gernericLibreries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFileData pdata= new PropertyFileData();
	public WebDriverUtilities driverutilities = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
@AfterMethod
public void closeApp()
{
	driver.quit();
}
}
