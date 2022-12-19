package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ToolTipPage {
	/* @FindBy */
	@FindBy(how = How.ID, using = "toolTipButton")
	public static WebElement toolTipButton;

	public ToolTipPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}
	
	public void touchOnInfoBulle(){
		Setup.getDriver().findElement(By.id("toolTipButton"));
	}
	
	public void checkInfoBulle(String toolTipText) {
		
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass: tooltip matching expected value");

		} else {
			System.out.println("Fail: tooltip not matched expected value");

		}

		
	}

}

