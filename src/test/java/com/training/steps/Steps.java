package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	WebDriver driver;
	
	@Given("user launch the salesforce application")
	public void user_launch_the_salesforce_application() {
	    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		
		
		
	}

	@When("User enters the username")
	public void user_enters_the_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("shaheer@tektek.com");

		
	}

	@When("user enters the pasword")
	public void user_enters_the_pasword() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("4Javascript415");
	   
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	}

	@Then("verify user succesfully logged in")
	public void verify_user_succesfully_logged_in() {
	    System.out.println("username is ");
	   
	}
}
