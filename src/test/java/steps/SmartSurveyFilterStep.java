package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;

public class SmartSurveyFilterStep {
	
	private WebDriver driver;
	
	@When("^the description \"([^\"]*)\"$")
	public void theDescription(String arg1) throws Throwable {
	    driver.findElement(By.name("description")).sendKeys(arg1);
	}

	@When("^filter button$")
	public void filterButton() throws Throwable {
	    driver.findElement(By.className("MonetUIFilterBuilderFilterButton")).click();
	}

}
