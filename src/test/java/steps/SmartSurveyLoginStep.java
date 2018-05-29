package steps;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SmartSurveyLoginStep {
	
	private WebDriver driver;

	@Given("^I am accessing the application$")
	public void iMAccessingTheApplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NOTE-02\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.greenmile.com/");
		
		
	}

	@When("^I inform the user \"([^\"]*)\"$")
	public void iInformTheUser(String arg1) throws Throwable {
		try {
			//driver.findElement(By.xpath("//imput[@class='usernameEmpty']")).sendKeys(arg1);
			driver.findElement(By.id("j_username")).sendKeys(arg1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@When("^the password \"([^\"]*)\"$")
	public void thePassword(String password) throws Throwable {
	    driver.findElement(By.id("j_password")).sendKeys(password);
	}


	@When("^I select the login button$")
	public void iSelectTheLoginButton() throws Throwable {
	   driver.findElement(By.tagName("button")).click();
	}

	@When("^Mensage \"([^\"]*)\"$")
	public void mensage() throws Throwable {
	   String texto =  driver.findElement(By.id(("GreenmileUserProfileUsername"))).getText();
	   Assert.assertEquals("GM-MARCIA",texto);
	}

}
