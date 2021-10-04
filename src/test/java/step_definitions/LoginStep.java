package step_definitions;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import pageObject.locator;



@SuppressWarnings("deprecation")
public class LoginStep{
    public static WebDriver driver;
    
    public LoginStep()
    {
    	driver = Hooks.driver;
    }
        
    @Given("User on Kozii login page")
	public static void visitLoginPage() throws Throwable {
		locator Locator = new locator(driver);
		locator.waitLoginAppear();
		Assert.assertTrue(locator.isLoginPageAppear());
	}
    
	@When("User input authorization using \"(.*)\" as email & \"(.*)\" as password")
	public static void inputCredential(String email, String password) throws Throwable {
		locator Locator = new locator(driver);
		locator.setUsername(email);
		locator.setPassword(password);
		
	}
	
	@When("User click Submit button")
	public static void ClickSubmitButton() throws Throwable {
		locator Locator = new locator(driver);
		locator.clickSubmitButton();
		Thread.sleep(10000);

	}

	@Then("User succesfully log in and navigate to dashboard of kozii")
	public static void homePage() throws Throwable {
		locator Locator = new locator(driver);
		String currentURL = driver.getCurrentUrl();
	       if (currentURL.equalsIgnoreCase("https://tststaging.kozii.id/")) {
	           System.out.println("Matches" + currentURL);
	       } else {
	           System.out.println("Does not match" + currentURL);
	       }
	
		
    }
	
	
	
}