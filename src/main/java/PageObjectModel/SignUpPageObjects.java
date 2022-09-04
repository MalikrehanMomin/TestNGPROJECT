package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;    //this driver dont have scope
private	By firstname=By.xpath("//input[@name='UserFirstName']");
private	By JobTital=By.xpath("//select[@name='UserTitle']");
private By CompanyEmployees=By.xpath("//select[@name='CompanyEmployees']");
	
public SignUpPageObjects(WebDriver driver2) {
	this.driver=driver2;
}

public WebElement Enterfirstname() {
	return driver.findElement(firstname);
}	

public WebElement SelectJobTital() {
	return driver.findElement(JobTital);
}	
public WebElement SelectCompanyEmployees() {
	return driver.findElement(CompanyEmployees);
}	

	
}
