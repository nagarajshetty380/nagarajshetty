package scripts;

import org.testng.annotations.Test;

import gernericLibreries.BaseClass;
import pomPages.AddToCartpage;
import pomPages.SkillRaryDemologin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
@Test
public void tc1() {
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoApp();
	
	SkillRaryDemologin sd= new SkillRaryDemologin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.mouseHover(driver, sd.getCourseTap());
	sd.selenium();
	
	AddToCartpage ad= new AddToCartpage(driver);
	driverutilities.doubleClick(driver, ad.getAddbtn());
	ad.addToCartButton();
	driverutilities.alertPopup(driver);
}
}
