package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class SliderPage {
	/* @FindBy */
	@FindBy(how = How.ID, using = "sliderContainer")
	public static WebElement sliderContainer;

	public SliderPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}
	
	public void slide(){
		Setup.getDriver().findElement(By.id("sliderContainer"));
		//actions.moveToElement(slider, 50, 0).perform();
		
		
	}
	public void clickOnButton() {
	sliderContainer.click();
}
}