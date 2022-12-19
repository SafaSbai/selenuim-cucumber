package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DoubleClickPage {
	/* @FindBy */
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement doubleClickBtn;

	public DoubleClickPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}
	
	public void clickOnButton(){
		doubleClickBtn.click();
	}
	
	//public void verifyButton() {
		
	//}

}


