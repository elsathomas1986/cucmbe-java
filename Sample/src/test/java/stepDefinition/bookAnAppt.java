package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import cucumber.api.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class bookAnAppt {
	String finalMonth = "March";
	int finalDate = 10;
	WebDriver driver;

	@Given("^User is on Book an appointmnet page$")
	public void user_is_on_book_an_appointmnet_page() throws Throwable {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch Website
		driver.get("https://trivandrum.kimsglobal.com/book-appointment/");
		driver.manage().window().maximize();

	}

	@When("^User fills the mandatory details$")
	public void user_fills_the_mandatory_details() throws Throwable {
		
	}
	
	@When("^User fills the following details$")
	public void user_fills_the_following_details(DataTable data) throws Throwable {
	    List<List<String>> obj= data.raw();
	    driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@name='input_4'])[2]")).click();// old reg
		driver.findElement(By.xpath("(//input[@name='input_10'])")).sendKeys(obj.get(0).get(0));// mrn
		driver.findElement(By.xpath("(//input[@name='input_5'])")).sendKeys(obj.get(0).get(1));// name
		driver.findElement(By.xpath("(//input[@name='input_8'])")).sendKeys(obj.get(0).get(2));// no
		driver.findElement(By.xpath("(//input[@name='input_9'])")).sendKeys(obj.get(0).get(3));// no

		driver.findElement(By.xpath("(//input[@name='input_11'])[1]")).click();// phone/email

	}


	
	@When("^select the appointment details as \"([^\"]*)\"$")
	public void select_the_appointment_details_as(String dept) throws Throwable {
		

	}

	@When("^select the dept as \"([^\"]*)\"$")
	public void select_the_dept_as(String dept) throws Throwable {
		Select s = new Select(driver.findElement(By.name("input_13")));
		s.selectByValue("Consultation");

		Select s1 = new Select(driver.findElement(By.name("input_2")));
		s1.selectByVisibleText(dept);
	}
	
	@When("^select the docter as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void select_the_docter_as_and(String doc, String xpathval) throws Throwable {

		Select s2 = new Select(driver.findElement(By.name(xpathval)));
		s2.selectByVisibleText(doc);
	    
	}


	@When("^select the docter as \"([^\"]*)\"$")
	public void select_the_docter_as(String doc) throws Throwable {

	}

	@When("^select the appropriate dates$")
	public void select_the_appropriate_dates() throws Throwable {

		// calender
		driver.findElement(By.xpath("//input[@name='input_14']")).click();
		String month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])")).getText();
		int dates = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		System.out.println(dates);
		if (month.equals(finalMonth)) {
			for (int i = 0; i < dates; i++) {
				String datevalue = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();

				int date = Integer.parseInt(datevalue);

				if (date == finalDate) {
					driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
					break;
				}
			}
		} else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			int dates1 = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
			for (int i = 0; i < dates1; i++) {

				String datevalue = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();

				int date = Integer.parseInt(datevalue);

				if (date == finalDate) {
					driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
					break;
				}
			}
		}

		// timeslot

		Select s3 = new Select(driver.findElement(By.name("input_15")));
		s3.selectByIndex(1);
		// driver.close();

	}

	@And("^click on submit$")
	public void click_on_submit() throws Throwable {
	//	 driver.findElement(By.xpath("//input[@class='gform_button button']")).click();

	}

	@Then("^appointment should be sucessfully created for the user$")
	public void appointment_should_be_sucessfully_created_for_the_user() throws Throwable {
		System.out.println("done");
	}

}