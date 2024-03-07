package AjioTesting1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MensClothing {
	public static WebDriver driver;
	public static Actions actions;
	@Given("Launch Ajio website")
	public void launch_ajio_website() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options =new EdgeOptions();
		options.addArguments("start-maximized");
		driver=new EdgeDriver(options);
		actions =new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		
		
	  
	}

	@And("Navigate to men element and click on clothing")
	public void navigate_to_men_element_and_click_on_clothing() {
		WebElement men=driver.findElement(By.xpath("//span[text()=\"MEN\"]"));
		actions.moveToElement(men).perform();
		driver.findElement(By.xpath("//strong[text()=\"CLOTHING\"]")).click();
	
	}

	@When("Click on Sortlize button and select the lowest prize")
	public void click_on_sortlize_button_and_select_the_lowest_prize() {
	   WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"sortBy\"]"));
	   Select s = new Select(dropdown);
	   s.selectByVisibleText("Price (lowest first)");
	}

	@Then("Validate the price sorter band on lowest prize")
	public void validate_the_price_sorter_band_on_lowest_prize() throws InterruptedException {
	   List<WebElement> lowprice= driver.findElements(By.xpath("//span[@class=\"price  \"] "));
	   Thread.sleep(3000);
	   for(int i =0;i<lowprice.size()-1;i++) {
		   String lowestprice1 = lowprice.get(i).getText().replace(",", "").replace("₹","");
		   String lowestprice2 = lowprice.get(i+1).getText().replace(",","").replace("₹","");
		   int value1 = Integer.parseInt(lowestprice1);
		   int value2 = Integer.parseInt(lowestprice2);
		   
		   if (value2>=value1) {
			   System.out.println(+value1+"<"+value2);
			   
		   }
		   else {
			   System.out.println("Failed");
		   }
	   }
	}




}
