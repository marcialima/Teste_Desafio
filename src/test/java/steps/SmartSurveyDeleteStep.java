package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

public class SmartSurveyDeleteStep {
	
	private WebDriver driver;
	
	@Then("^delete button$")
	public void deleteButton() throws Throwable {
	    driver.findElement(By.id("buttonEventCheckBox")).click();
	}
}
