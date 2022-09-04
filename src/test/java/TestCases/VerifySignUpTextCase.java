package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommanUtilities;
import Resources.TestCaseData;

        public class VerifySignUpTextCase extends BaseClass {
        @Test
	     public void SignUp() throws IOException, InterruptedException {
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
          lpo.ClickOnTryforfree().click();
		
          
          Thread.sleep(5000);
  		SignUpPageObjects spo=new SignUpPageObjects(driver);
         spo.Enterfirstname().sendKeys(TestCaseData.firstName);
        
        
        
        CommanUtilities.dropdownHandles(spo.SelectJobTital(),1);
        CommanUtilities.dropdownHandles(spo.SelectCompanyEmployees(),2);


        
        
        
	}
	
	
	
	
	
}
