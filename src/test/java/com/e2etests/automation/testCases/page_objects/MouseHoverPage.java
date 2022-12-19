package com.e2etests.automation.testCases.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class MouseHoverPage {
	/* @FindBy */
	@FindBy(how = How.ID, using ="//*[@id=\"nav\"]/li[2]/a")
	public static WebElement mouseHover;

	public MouseHoverPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void implicitlyWait() {
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}
	
	public void perform() {
		Setup.getDriver().findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	}
	public void verify() {
		//
}


}