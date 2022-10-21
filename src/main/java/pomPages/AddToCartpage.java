package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartpage {
@FindBy(id="add")
private WebElement addbtn;

@FindBy (xpath="//button[text()=' Add to Cart']")
private WebElement addtocartbtn;
public  AddToCartpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getAddbtn() {
	return addbtn;
}
public void  addToCartButton() {
	addtocartbtn.click();
}

}
