package org.stepdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepData {

	WebDriver driver;
	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();


	}

	@When("user enters username and password")
	public void user_enters_usename_and_password() {

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("BIBINRV02");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("JCJ01J");

	}
	@When("user clicks login button")
	public void user_clicks_login_button() {

		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Then("login page is opened")
	public void login_page_is_opened() {
		System.out.println("login page is displayed");
	}





}
