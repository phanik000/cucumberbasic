package com.cucumber.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_Smvapage {
	WebDriver driver;

	@Given("^Open required browser$")
	public void open_required_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing Softwares\\geckodriver.exe");

		driver = new FirefoxDriver();

	}

	@Given("^Start application with valid URL$")
	public void start_application_with_valid_URL() throws Throwable {
		// driver.get("https://school.sackalerts.world/");
		driver.get("https://www.sackalerts.world/");

	}

	@Given("^click signin button$")
	public void click_signin_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='liSignIn']/a")).click();
		System.out.println("login here button clicked");

	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='MainContent_Email']")).sendKeys("manikanta.n@maktronglobal.com");

		driver.findElement(By.xpath("//input[@id='MainContent_Password']")).sendKeys("Maktron@123");

		

		System.out.println("entered valid user name and password");
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='Button1']")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("click on submit button");
	}

	@Then("^user should able to login sucessfully$")
	public void user_should_able_to_login_sucessfully() throws Throwable {
		String sackalertpagetitle = driver.getTitle();
		System.out.println("login sucessfull and title is :" + sackalertpagetitle);
System.out.println("hi");
	}

}
