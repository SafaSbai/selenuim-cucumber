package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DragAndDropPage {
	/* @FindBy */
	@FindBy(how = How.ID, using = "draggable")
	public static WebElement btnDrag;
	@FindBy(how = How.ID, using = "droppable")
	public static WebElement btnDrop;

	public DragAndDropPage() {
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
		btnDrag.click();
	}
	
	public void Drop() {
		
	}
}



