package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactPersonal extends BaseClass{
public AdactPersonal() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement  fName;
@FindBy(id="last_name")
private WebElement lName;
@FindBy(id="address")
private WebElement addrs;
@FindBy(id="cc_num")
private WebElement cNumber;
@FindBy(id="cc_type")
private WebElement cType;
@FindBy(id="cc_exp_month")
private WebElement month;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy(id="cc_cvv")
private WebElement cvvv;
@FindBy(id="book_now")
private WebElement booook;
public WebElement getfName() {
	return fName;
}
public WebElement getlName() {
	return lName;
}
public WebElement getAddrs() {
	return addrs;
}
public WebElement getcNumber() {
	return cNumber;
}
public WebElement getcType() {
	return cType;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvvv() {
	return cvvv;
}
public WebElement getBooook() {
	return booook;
}

public void firsstName(String name1) {
	fillTextBox(getfName(), name1);

}

public void lasstName(String name2) {
	fillTextBox(getlName(), name2);

}
public void adddrs(String ad) {
	fillTextBox(getAddrs(), ad);

}
public void creditno(String cNo) {
	fillTextBox(getcNumber(), cNo);

}
public void cardType() {
	btnClick(getcType());
	dropDownSelect(getcType()); 
	selectIndex(3);

}
public void mnth() {
	btnClick(getMonth());
	dropDownSelect(getMonth());
	selectIndex(3);
}
public void yeaar() {
	btnClick(getYear());
	dropDownSelect(getYear());
	selectValue("2022");

}
public void cvvvv(String cnoo) {
	fillTextBox(getCvvv(), cnoo);
}
public void bokNow() {
	btnClick(getBooook());
}

}
