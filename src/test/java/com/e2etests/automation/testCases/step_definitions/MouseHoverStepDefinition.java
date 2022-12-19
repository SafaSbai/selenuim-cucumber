package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.MouseHoverPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseHoverStepDefinition {
	public MouseHoverPage mouseHoverPage;

	public MouseHoverStepDefinition() {
		mouseHoverPage = new MouseHoverPage();
	}
	@Given("Je faire un implicit wait vers {int} sceonds")
	public void jeFaireUnImplicitWaitVersSceonds(Integer int1) {
		mouseHoverPage.implicitlyWait();
	}
	@Given("Je me connecte a l application {string}")
	public void jeMeConnecteALApplication(String url) {
		mouseHoverPage.openUrl(url);
	}
	@When("Je agrandis le navigateur utilsee")
	public void jeAgrandisLeNavigateurUtilsee() {
		mouseHoverPage.maximizeBrowser();
	}
	@When("Je touche le main item de mouse hover")
	public void jeToucheLeMainItemDeMouseHover() {
		mouseHoverPage.perform();
	}
	//@Then("Je verifie que le mouse hover est appliquee")
	//public void jeVerifieQueLeMouseHoverEstAppliquee() {
		//mouseHoverPage.verify();
	//}




}
