package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactRadio extends BaseClass{
public AdactRadio() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement radio;
@FindBy(id="continue")
private WebElement clickCntinue;
public WebElement getRadio() {
	return radio;
}
public WebElement getClickCntinue() {
	return clickCntinue;
}
public void selectttradio() {
	btnClick(getRadio());

}
public void clkContinueee() {
	btnClick(getClickCntinue());

}
}
