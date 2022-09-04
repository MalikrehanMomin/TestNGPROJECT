package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommanUtilities {

	public static void dropdownHandles(WebElement dropdownXpath,int dropdownValue) {
		
		Select s=new Select(dropdownXpath);
        s.selectByIndex(dropdownValue);

		
	}
	
	public static void handleAssertions(String actual,String expected) {
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, expected);
		
        assertion.assertAll();


	}
	
	
}
