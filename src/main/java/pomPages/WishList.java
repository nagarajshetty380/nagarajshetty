package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	@FindBy (xpath="//a[text()='X']")
	private WebElement close;
	
	@FindBy (xpath="//div[@class='play-icon']")
    private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
    private WebElement pause;
	
	public  WishList(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
	public void closebutton() {
		//close.click();
	}
	public void playbutton() {
		play.click();
	}
	public void pausebutton() {
		pause.click();
	}
	
}