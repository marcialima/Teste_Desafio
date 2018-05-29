package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmartSurveyValidationStep {
	
	private WebDriver driver;
	
	@When("^new button$")
	public void newButton() throws Throwable {
	    driver.findElement(By.id("Survey_btn_novo")).click();
	}

	@When("^save button$")
	public void saveButton() throws Throwable {
	  driver.findElement(By.id("Survey_btn_new_save")).click();
	}

	@Then("^message Description is mandatory$")
	public void messageDescriptionIsMandatory() throws Throwable {
		 String texto =  driver.findElement(By.className(("monet-message alert alert-error"))).getText();
		   Assert.assertEquals("Description is mandatory",texto);
	}

}
