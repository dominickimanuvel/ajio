package Basefunctions;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{ 
	public static BaseClass base =null;
	
	private BaseClass() {}
	public static BaseClass getInstance() {
		if(base==(null)) {
			base= new BaseClass();
			
		}
		return base;
	}
public static WebDriver driver;
public static List<WebElement> options;
public static Actions actions;
public static Select select;
public static JavascriptExecutor js;

    
     public void browserLaunch() throws InterruptedException {
    	 WebDriverManager.edgedriver().setup();
  	   EdgeOptions options=new EdgeOptions();
  	   options.addArguments("start-maximized");
  	   driver=new EdgeDriver(options);
  	 actions = new Actions(driver);
  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
  	 
//  	WebDriverWait w = new WebDriver();
// 	 WebElement ele = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
//	w.until(ExpectedConditions.visibilityOf(ele));
  	 
  	 
//  	 driver.get(face)
    	 
     }
     public void gotoUrl(String url) {
    	 driver.get(url);
     }
     
      public void closeTab() {
    	 driver.close();
     }
      public  void quitallTab() {
    	  driver.quit();
      }
      public String takeTittle() {
    	  String title =driver.getTitle();
    	  return title;
      }
      public String takeCurrenturl() {
    	  String takeurl = driver.getCurrentUrl();
    	  return takeurl;
      }
      public boolean displayed(WebElement element) {
    	  boolean display = element.isDisplayed();
    	  return display;
      }
      public boolean selectedIs(WebElement element) {
    	  boolean selected = element.isSelected();
    	  return selected;
      }
      public boolean enabledIs(WebElement element) {
    	  boolean enabled = element.isEnabled();
    	  return enabled;
    	  }
      public void gotoReferesh() {
    	  driver.navigate().refresh();
    	   }
      public void gotoForward() {
    	  driver.navigate().forward();
      }
      public void gotoBackword() {
    	  driver.navigate().back();
      }
      public void sendText(WebElement element,String name) {
    	  element.sendKeys(name);
    	  
    	  
      }
      public void Touch(WebElement element) {
    	  element.click();
      }
      
     public String giveText(WebElement element) {
    	 String takeText =element.getText();
    	 return takeText;
     }
    	 
     
      public void gotoElement(WebElement element) {
    	  actions.moveToElement(element).build().perform();
      }
      public void singleTouch(WebElement ele)  {
    	 actions.click(ele).build().perform();
    	 
      }
      
      public void doubleTouch(WebElement element) {
    	  actions.doubleClick(element).build().perform();
      }
    
      public void rightTouch(WebElement element) {
    	  actions.contextClick(element).build().perform();
      }
      public void pickandDrop(WebElement source,WebElement target) {
    	  actions.dragAndDrop(source, target).build().perform();
      }
      public void screenShot(String filename) {
    	  try { TakesScreenshot scren = (TakesScreenshot)driver;
          File fl =scren.getScreenshotAs(OutputType.FILE);
       
          File tar =new File("C:\\Users\\lenovo\\eclipse-workspace\\Ajio\\target\\dom1-"+filename+".png");
          
			FileUtils.copyFile(fl, tar);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	  
      }
      public void  scrollDown(WebElement jselement) {
    	  js.executeScript("arguments[0]. scrollIntoView(true)",jselement);
    	  
      }
      public void scrollUp(WebElement jselement) {
    	  js.executeScript("arguments[0]. scrollIntoView(false)",jselement);
      }
      public void insertText(WebElement element,String jsvalue) {
    	  js.executeScript("arguments[0].setAttribute('value','"+jsvalue+"')",element);
    	 
    	 }
      public void button(WebElement element) {
    	  js.executeScript("arguments[0].click", element);
    	  
      }
      public void popupinstertText(String value) {
  		Alert alert = driver.switchTo().alert();
  		alert.sendKeys(value);
  	}
  	public Alert switchtoAlert() {
  		Alert alert = driver.switchTo().alert();
  		return alert;
  	}
  	public void alertAccept(Alert alert) {
  		alert.accept();
  	}
  	public void alertdismiss(Alert dismiss) {
  		dismiss.dismiss();
  	}  
  	public void selectByText(WebElement dropdown, String visibletext) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibletext); 
	}
	
	public void selectByindex(WebElement dropdown, int i)	{
		Select s = new Select(dropdown);
		s.selectByIndex(i);
	}
	
	public void selectBy(WebElement dropdown, String value) {
		Select s = new Select(dropdown);
		s.selectByValue(value);
	}
	
	public List<WebElement> giveOptions(WebElement dropdown) {
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		return options;
	}

	
	public void brokenLinkks(String bl) throws MalformedURLException, IOException {
	driver.get(bl);
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.tagName("link"));
	Iterator<WebElement> iterator = elements.iterator();
	while(iterator.hasNext()) {
		WebElement link = iterator.next();
		String href = link.getAttribute("href");
		
		if((href==null)|| href.isEmpty()){
			System.out.println("Link unavailable");
		}
		else if(!href.startsWith("www.facebook.com")) {
			System.out.println("Links not related to FB: "+href);
		}
		else {
			HttpURLConnection http = (HttpURLConnection)(new URL(href).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			int responsecode = http.getResponseCode();
			if(responsecode==200) {
				System.out.println("Link not broken: "+href);
			}
		}
	}
		
	}
	}	  
    	  
		  
    	  
    	  
      





