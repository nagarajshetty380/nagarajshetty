package scripts;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import gernericLibreries.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillRaryDemologin;
import pomPages.SkillraryLoginPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoApp();
		
		SkillRaryDemologin sd= new SkillRaryDemologin(driver);
		driverutilities.switchTabs(driver);
	     driverutilities.dropDown(sd.getCoursedd(), pdata.getData("coursedd"));
	     
	     CoursePage cp= new CoursePage(driver);
	     driverutilities.dragandDrop(driver,cp.getSelenium() , cp.getCartarea());
	     WebElement loc = cp.getLinkdn();
	     Point l = loc.getLocation();
	     int x = l.getX();
	    int y = l.getY();
	     driverutilities.scrollBar(driver, x, y);
	     cp.linkdnicon();
		
	}
	

}
