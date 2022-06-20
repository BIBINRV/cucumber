package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClasscucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClasscucumber {

	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {

	}
	@When("user enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String,String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String string = map.get("user");
		WebElement txt = locatebyid("username");
		inputText(txt, string);
		System.out.println(driver);
		String string2 = asMaps.get(0).get("pass");
		WebElement PASSWORD = driver.findElement(By.id	("password"));
		PASSWORD.sendKeys(string2);
//		WebElement P = locatebyid("password");
//		inputText(P, string2);


	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement btnlogin = locatebyid("login");
		click(btnlogin);
	}

	@Then("login page is opened")
	public void login_page_is_opened() {
		System.out.println("login page is opened");
	}

	//	@When("user enters username and password")
	//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {

	//		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
	//		String user = (String) asMap.get("username");

	//		WebElement USER = driver.findElement(By.id("username"));
	//		USER.sendKeys(user);

	//		String PASS = (String) asMap.get("password");
	//		
	//		WebElement pass = driver.findElement(By.id("password"));
	//		pass.sendKeys(PASS);	
	//		
	//		
	//	}
	//	@When("user enters username and password")
	//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	//		
	//		
	//		List<List<String>> asLists = dataTable.asLists();
	//		List<String> list = asLists.get(3);
	//		String string = list.get(0);
	//		
	//		WebElement user = driver.findElement(By.id("username"));
	//		user.sendKeys(string);

	//		String string2 = asLists.get(2).get(1);

	//		WebElement pass = driver.findElement(By.id("password"));
	//		pass.sendKeys(string2);	
	//		
	//	}
//	//	@When("user enters username and password")
//	//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
//	//		
//	//		List<String> asList = dataTable.asList();
//	//		String string = asList.get(0);
//
//	//		WebElement user = driver.findElement(By.id("username"));
//	//		user.sendKeys(string);
//
//	//		String string2 = asList.get(1);
//
//	//		WebElement pass = driver.findElement(By.id("password"));
//	//		pass.sendKeys(string2);
	//		
	//	}

	//	@When("user enters valid username and valid password")
	//	public void user_enters_valid_username_and_valid_password() {
	//	    
	//		WebElement user = driver.findElement(By.id("username"));
	//		user.sendKeys("BIBINRV02");
	//		WebElement pass = driver.findElement(By.id("password"));
	//	    pass.sendKeys("JCJ01J");
	//	
	//	}
	//	@When("user clicks login button")
	//	public void user_clicks_login_button() {
	//	  
	//		WebElement login = driver.findElement(By.id("login"));
	//		login.click();
	//	}
	//
	//	@Then("login page is opened")
	//	public void login_page_is_opened() {
	//	   System.out.println("login page is opened");
	//	}




}
