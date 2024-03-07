package AjioTesting;

import Basefunctions.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	public static BaseClass base = BaseClass.getInstance();
	@Before
	public void browserLaunch() throws InterruptedException  {
		base.browserLaunch();
		System.out.println("Bfore annotation completed");
	}
	
	@After
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("After annotation completed");
		Thread.sleep(2000);
//		base.quitallTab();
		
		
	}

}
