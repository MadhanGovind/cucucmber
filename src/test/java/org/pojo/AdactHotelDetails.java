package org.pojo;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactHotelDetails extends BaseClass {
	public AdactHotelDetails() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(id = "location")
	private WebElement locat;
	@FindBy(id = "hotels")
	private WebElement hotl;
	@FindBy(id = "room_type")
	private WebElement rmtype;
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	@FindBy(id = "datepick_in")
	private WebElement dateIn;
	@FindBy(id = "datepick_out")
	private WebElement dateOut;
	@FindBy(id = "adult_room")
	private WebElement adlt;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocat() {
		return locat;
	}

	public WebElement getHotl() {
		return hotl;
	}

	public WebElement getRmtype() {
		return rmtype;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdlt() {
		return adlt;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void locationDetails() {
		btnClick(getLocat());
		dropDownSelect(getLocat());
		selectValue("Brisbane");
	}

	public void hotelDetail() {
		btnClick(getHotl());
		dropDownSelect(getHotl());
		selectIndex(2);

	}

	public void roomType() {
		btnClick(getRmtype());
		dropDownSelect(getRmtype());
		selectIndex(1);

	}

	public void roomNooo() {
		btnClick(getRoomNo());
		dropDownSelect(getRoomNo());
		selectIndex(2);
	}

	public void dateEnter(String datein) {
		clearBrowser(getDateIn());
		fillTextBox(getDateIn(), datein);
	}

	public void dateOut(String dateot) {
		clearBrowser(getDateOut());
		fillTextBox(getDateOut(), dateot);
	}

	public void adultNoo() {
		btnClick(getAdlt());
		dropDownSelect(getAdlt());
		selectValue("2");

	}

	public void submitBtnn() {
		btnClick(getSubmit());
	}

}
