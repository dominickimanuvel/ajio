package AjioTesting;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import com.locators.FacebookLocators;

import Basefunctions.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook {
//	public static Webdriver driver ;
//	public static List<WebElement> options;
//	public static Select select;
	public static BaseClass base =BaseClass.getInstance();
	public static FacebookLocators locators =new FacebookLocators();
	
//	public static String Firstname;
	@Given("Launch the Fb {string}")
	public void launch_the_fb(String face) {
		base.gotoUrl(face);

	}

	@Given("Click create account")
	public void click_create_account() throws InterruptedException {
         base.driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
//	  base.singleTouch(ele);
//		Thread.sleep(3000);
		base.Touch(locators.getEle());
	
	}
	@When("Enter the firstname values {string}")
	public void enter_the_firstname_values(String Firstname) {
//	WebElement firstname = base.driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
////	       firstname.sendKeys(Firstname);
//		base.sendText(firstname, Firstname);
		base.sendText(locators.getFirstname(), Firstname);
	}

	@When("Enter the secondname values {string}")
	public void enter_the_secondname_values(String Lastname) {
//		WebElement lastname =base.driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
//       base.sendText(lastname, Lastname);
		base.sendText(locators.getLastname(), Lastname);
	}

	@When("Enter the mobilenumber values {string}")
	public void enter_the_mobilenumber_values(String Mobilenumber) {
//		WebElement mobilenumber=base.driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]"));
//    base.sendText(mobilenumber, Mobilenumber);
		base.sendText(locators.getMobilenumber(), Mobilenumber);
	}
		
	
	  @When("Enter the password values {string}")
	public void enter_the_password_values(String Password)
	  {
//	  WebElement password=base.driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
////    password.sendKeys(Password);
//	  base.sendText(password, Password);
		  base.sendText(locators.getPassword(), Password);
	}
		
	@When("Enter the date values {string}")
	public void enter_the_date_values(String Day) {
//		WebElement day =base.driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
//        base.sendText(day, Day);
		base.selectByText(locators.getDay(), Day);
	}

	@When("Enter the month values {string}")
	public void enter_the_month_values(String Month) {
//		WebElement month=base.driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));       
//		base.sendText(month, Month);
		base.sendText(locators.getMonth(), Month);
	}
	    
	@When("Enter the year values {string}")
	public void enter_the_year_values(String year) {
//      WebElement yr=base.driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
//     base.sendText(yr, year);
		base.sendText(locators.getYr(), year);
        
	}
	    
	@When("Click the gender button and take screenshot {string}")
	public void click_the_gender_button_and_take_screenshot(String firstname) throws Throwable {
//		WebElement gender =base.driver.findElement(By.xpath("//label[text()='Male']"));
//		base.singleTouch(gender);
		base.singleTouch(locators.getGender());
        Thread.sleep(3000);

        base.screenShot(firstname);
        Thread.sleep(3000);
	}

	@Then("Click Signup button")
	public void click_signup_button() throws InterruptedException {
//		WebElement singleclick=base.driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
//		base.singleTouch(singleclick);
		base.Touch(locators.getSingleclick());
		Thread.sleep(3000);
	}
		
		@Then("Work on Brokenlinks {string}")
		public void work_on_Brokenlinks(String bl) throws MalformedURLException, IOException {
			base.brokenLinkks(bl);
			
		 
		}
		
			
		   
		}

        
      
	    
	



	



