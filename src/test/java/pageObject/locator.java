package pageObject;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.lexer.Id;
import utilities.BaseClass;

public class locator extends BaseClass {

	private static final CharSequence Enter = null;

	public locator(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

	@FindBy(id = "exampleInputEmail1")
	private static WebElement inputUsername;

	@FindBy(id = "exampleInputPassword1")
	private static WebElement inputPassword;

	@FindBy(xpath = "//button[@class='btn mt-2 float-left btn-success']")
	private static WebElement btnSubmit;

	@FindBy(className = "col text-center linkedpro mb-3")
	private static WebElement dashboard;

	public static void waitLoginAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail1")));
	}
		
	public static boolean isLoginPageAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail1"))).isDisplayed();
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputPassword1"))).isDisplayed();
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn mt-2 float-left btn-success']"))).isDisplayed();
		return true;
	}
	
	

	public static void urlDashboard() {
		String url = "tststaging.kozii.id/";
		
	}

	public static void setUsername(String username) {
		inputUsername.sendKeys(username);

	}

	public static void setPassword(String password) {
		inputPassword.sendKeys(password);
	}


	public static void clickSubmitButton() {
		btnSubmit.click();
	}
	
		

}