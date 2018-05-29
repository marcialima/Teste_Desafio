package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmartSurveyDownloadStep{
	
	private WebDriver driver;
	
	@When("^you access the Maintenance menu$")
	public void youAccessTheMaintenanceMenu() throws Throwable {
		driver.findElement(By.linkText("Maintenance")).click();
	}

	@When("^Smart Survey option$")
	public void smartSurveyOption() throws Throwable {
		driver.findElement(By.linkText("Smart Survey")).click();
	}

	@When("^Select $")
	public void select() throws Throwable {
	   driver.findElement(By.xpath("//div[@class='slick-cell l2 r2 cell-row active']")).click();
	}

	@Then("^download button$")
	public void downloadButton() throws Throwable {
	    driver.findElement(By.id("popupExportFormatsGridBtn")).click();
	}
}
