package scripts;

import org.testng.annotations.Test;

import gernericLibreries.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishList;

public class TestCase3 extends BaseClass{

	@Test
	public void tc3() throws Throwable {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchtextbox(pdata.getData("search"));
		s.searchbutton();
		
		CoreJavaPage c= new CoreJavaPage(driver);
		c.corejavacourse();
		 WishList w= new WishList(driver);
		 driverutilities.switchTabs(driver);
		 w.closebutton();
		 w.playbutton();
		 w.pausebutton();
		
		
				
		
	}
}
