package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.SliderPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SliderStepDefinition {
	public SliderPage sliderPage;

	public SliderStepDefinition() {
		sliderPage = new SliderPage();
		
	}

	@Given("Je connecte a l application {string}")
	public void jeConnecteALApplication(String url) {
		sliderPage.openUrl(url);
	}
	@When("Je m agrandis le navigateur utilsee")
	public void jeMAgrandisLeNavigateurUtilsee() {
		sliderPage.maximizeBrowser();
	}
	@Then("Je glisse la page")
	public void jeGlisseLaPage() {
		sliderPage.slide();
	}

    @And("je clique sur le boutton")
    public void jeCliqueSurLeBoutton()
    {    sliderPage.clickOnButton();
}
   



}