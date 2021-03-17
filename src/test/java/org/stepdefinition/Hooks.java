package org.stepdefinition;


import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScen() {
		Date d=new Date();
		System.out.println(d);
		fireFoxBrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void afterScen(Scenario s) throws IOException  {
		
		Date d=new Date();
		System.out.println(d);
		if (s.isFailed()) {
			screenShot();
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
			String name = s.getName();
			String replce = name.replace(" ", "_");
			System.out.println("scenario failed"+replce);
		}
		else {
			screenShot();
			screenShotGet("madhanpass");
		}
		
	}

}
