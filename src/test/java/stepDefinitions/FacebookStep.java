package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookStep {

	WebDriver driver;

	@Before("@parameter")
	public void openFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After("@parameter")
	public void closeAplpication() {
		driver.quit();
	}

	@Then("^Verify email textbox is displayed$")
	public void verifyEmailTextboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());

	}

	@And("^Verify password textbox is displayed$")
	public void verifyPasswordTextboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());

	}

	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("anhtran@gmail.com");
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton() {
		driver.findElement(By.name("login")).click();
	}

	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("email");
	}

	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys("password");
	}

	@When("^Input to Username textbox with ([^\"]*)$")
	public void inputToUsernameTextbox(String email) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("email");
	}

	@When("^Input to Password textbox with ([^\"]*)$")
	public void inputToPasswordTextbox(String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys("password");
	}

	@When("^Input to Username with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String email, String password) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("password");
	}

	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table) {
//	   List<Map<String, String>> customer = table.asMaps(String.class, String.class);

//	   driver.findElement(By.id("email")).clear();
//	   driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
//	   driver.findElement(By.id("pass")).clear();
//	   driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));

		for (Map<String, String> loginInfor : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(loginInfor.get("Username"));
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(loginInfor.get("Password"));
		}
	}

}
