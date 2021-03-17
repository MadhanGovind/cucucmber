package org.pojo;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactOrderNo extends BaseClass {
	public AdactOrderNo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement order;
	public WebElement getOrder() {
		return order;
	}
	public void orderr() {
		String val = getOrder().getAttribute("value");
		Assert.assertTrue(val.length()==10);
		System.out.println(val);

	}

}
