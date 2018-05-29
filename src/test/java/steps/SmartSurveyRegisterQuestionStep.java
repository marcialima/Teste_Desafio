package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmartSurveyRegisterQuestionStep {
	private WebDriver driver;
	
	@When("^informs description \"([^\"]*)\"$")
	public void informsDescription(String arg1) throws Throwable {
		
		driver.findElement(By.id("SurveyDescriptionFilter")).sendKeys(arg1);
	}

	@When("^add application rules button$")
	public void addApplicationRulesButton() throws Throwable {
		driver.findElement(By.id("SurveyApplyRulesOpenModal")).click();
	}

	@When("^let Trigger Events, start roule same save button$")
	public void letTriggerEventsStartRouleSameSaveButton() throws Throwable {
		driver.findElement(By.id("LinkFormSaveButton")).click();
	}

	@When("^report a title from the section \"([^\"]*)\"$")
	public void reportATitleFromTheSection(String arg1) throws Throwable {
		driver.findElement(By.id("HeaderQuestionTitle")).sendKeys(arg1);
	}

	@Then("^add question button$")
	public void addQuestionButton() throws Throwable {
		driver.findElement(By.name("btn_question")).click();
	}

	@Then("^selects Single Selection$")
	public void selectsSingleSelection() throws Throwable {
		driver.findElement(By.xpath("\\class[@li='Single Selection']")).click();
	}

	@Then("^type a question \"([^\"]*)\"$")
	public void typeAQuestion(String arg1) throws Throwable {
		driver.findElement(By.id("QuestionDescription")).sendKeys(arg1);
	}

	@Then("^an answer \"([^\"]*)\"$")
	public void anAnswer(String arg1) throws Throwable {
		driver.findElement(By.id("SelectOneAnswer")).sendKeys(arg1);		
	}

	@Then("^Save button$")
	public void saveButton() throws Throwable {
		driver.findElement(By.name("LinkFormSaveButton")).click();
	}

	@Then("^Save button again$")
	public void saveButtonAgain() throws Throwable {
		driver.findElement(By.name("Survey_btn_new_save")).click();
	}

}
