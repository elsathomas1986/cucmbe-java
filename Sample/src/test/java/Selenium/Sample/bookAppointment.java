package Selenium.Sample;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookAppointment {

	public static void main(String[] args) {
		String finalMonth = "March";
		int finalDate = 14;
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch Website
		driver.get("https://trivandrum.kimsglobal.com/book-appointment/");
		driver.manage().window().maximize();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@name='input_4'])[2]")).click();// old reg
		driver.findElement(By.xpath("(//input[@name='input_10'])")).sendKeys("2926014");// mrn
		driver.findElement(By.xpath("(//input[@name='input_5'])")).sendKeys("elsa thomas");// name
		driver.findElement(By.xpath("(//input[@name='input_8'])")).sendKeys("9995220017");// no
		driver.findElement(By.xpath("(//input[@name='input_9'])")).sendKeys("elsathomas1986@gmail.com");// no

		driver.findElement(By.xpath("(//input[@name='input_11'])[1]")).click();// phone/email

		Select s = new Select(driver.findElement(By.name("input_13")));
		s.selectByValue("Consultation");

		Select s1 = new Select(driver.findElement(By.name("input_2")));
		s1.selectByVisibleText("Obstetrics and Gynaecology");

		Select s2 = new Select(driver.findElement(By.name("input_43")));
		s2.selectByIndex(1);

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
		
		
		//timeslot
		
		Select s3 = new Select(driver.findElement(By.name("input_15")));
		s3.selectByIndex(1);
		// driver.close();
		System.out.println("done");
		
		//submit
		
		//driver.findElement(By.xpath("//input[@class='gform_button button']")).click();
	}

}
