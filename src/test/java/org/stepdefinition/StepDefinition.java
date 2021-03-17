package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.AdactHotelDetails;
import org.pojo.AdactOrderNo;
import org.pojo.AdactPersonal;
import org.pojo.AdactRadio;
import org.pojo.AdactinPojoLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass{
	public AdactinPojoLogin a;
	public AdactHotelDetails b;
	@Given("User in Adactin Hotel login page")
	public void user_in_Adactin_Hotel_login_page() {
	  
	   driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String name, String code) {
		a=new AdactinPojoLogin();
		a.loginCredential(name, code);
	   
	}

	@When("User click login button")
	public void user_click_login_button() {
		a.clickLoginBtn();
	    
	}

	@When("user select location,Hotel,roomtype,No of Rooms and {string} and {string} and adult")
	public void user_select_location_Hotel_roomtype_No_of_Rooms_and_and_and_adult(String in, String out) {
	    b=new AdactHotelDetails();
	    b.locationDetails();
	    b.hotelDetail();
	    b.roomType();
	    b.roomNooo();
	    b.dateEnter(in);
	    b.dateOut(out);
	    b.adultNoo();
	}

	@When("user click search button")
	public void user_click_search_button() {
		b.submitBtnn();
	  
	}

	@When("User select RadioButton and click Continue")
	public void user_select_RadioButton_and_click_Continue() {
		AdactRadio c=new AdactRadio();
		c.selectttradio();
		c.clkContinueee();
	   
	}

	@When("User enter {string} and {string} and {string}and {string} and credittype and expmonth and expyear {string} and click booknow")
	public void user_enter_and_and_and_and_credittype_and_expmonth_and_expyear_and_click_booknow(String fn, String ln, String add, String creditN, String cv) throws InterruptedException {
	   AdactPersonal d=new AdactPersonal();
	   d.firsstName(fn);
	   d.lasstName(ln);
	   d.adddrs(add);
	   d.creditno(creditN);
	   d.cardType();
	   d.mnth();
	   d.yeaar();
	   d.cvvvv(cv);
	   d.bokNow();
	   Thread.sleep(5000);
	}

	@Then("user check orderno lungthb is ten")
	public void user_check_orderno_lungthb_is_ten() {
		AdactOrderNo e=new AdactOrderNo();
		e.orderr();
	  
	}


	

	

}
