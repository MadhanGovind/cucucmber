package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojoLogin extends BaseClass{
	public AdactinPojoLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuser;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void loginCredential(String user,String pass) {
		fillTextBox(getTxtuser(), user);
		fillTextBox(getTxtpass(), pass);
	}
	public void clickLoginBtn() {
		btnClick(btnLogin);

	}
	

}
