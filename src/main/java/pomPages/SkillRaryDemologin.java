package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemologin {
	@FindBy (id="course")
	private WebElement courseTap;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	public SkillRaryDemologin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCourseTap() {
		return courseTap;
	}
	public void selenium() {
		seleniumtraining.click();
	}
}
