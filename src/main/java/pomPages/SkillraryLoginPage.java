package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearbtn;

@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement demoApp;

@FindBy(name="q")
private WebElement searchtb;

@FindBy(xpath="//input[@value='go']")
private WebElement searchbtn;


public SkillraryLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void gearsButton()
{
	gearbtn.click();
}
public void skillrarydemoApp()
{
	demoApp.click();
}
public void  searchtextbox(String name) {
	searchtb.sendKeys(name);
}
public void searchbutton() {
	searchbtn.click();
}

}
