package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static List<WebElement> options;
	public static TakesScreenshot ts;
	public static List<WebElement> tables;
	public static WebElement tableee;
	public static List<WebElement> trows;

	public static void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selinium\\sel\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void fireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selinium\\sel\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void currntUrl() {
		String prsntUrl = driver.getCurrentUrl();
		System.out.println(prsntUrl);

	}

	public static void fillTextBox(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void btnClick(WebElement ref) {
		ref.click();
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void clearBrowser(WebElement ref) {
		ref.clear();
	}

	public static void closeCrrntTab() {
		driver.close();

	}

	public static void textGet(WebElement ref) {
		String txt = ref.getText();
		System.out.println(txt);

	}

	public static void attributeGet(WebElement refrnce, String value) {
		String valuee = refrnce.getAttribute(value);
		System.out.println(valuee);

	}

	public static void staticWaitt(int i) throws InterruptedException {
		Thread.sleep(i);

	}

	public static void moveElement(WebElement ref) {
		a = new Actions(driver);
		a.moveToElement(ref).perform();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();

	}

	public static void clickTheContxt(WebElement ref) {
		a.contextClick(ref).perform();

	}

	public static void clickDouble(WebElement ref) {
		a.doubleClick(ref).perform();

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void robott() throws AWTException {
		r = new Robot();
	}

	public static void alertSwitch() {
		al = driver.switchTo().alert();
	}

	public static void alertAccept() {
		al.accept();
	}

	public static void alertDismiss() {
		al.dismiss();
	}

	public static void alertTextMsg() {
		String textAlrt = al.getText();
		System.out.println(textAlrt);
	}

	public static void prmptAlert(String txt) {
		al.sendKeys(txt);
		al.accept();
	}

	public static void javaScrptExcuter() {
		js = (JavascriptExecutor) driver;
	}

	public static void insertByJavaScript(String val, WebElement ref) {
		js.executeScript("arguments[0].setAttribute('value','+ val +')", ref);

	}

	public static void getValue(WebElement ref) {
		Object objTxt = js.executeScript("return arguments[0].getAttribute('value')", ref);
		String txtValue = (String) objTxt;
		System.out.println(txtValue);
	}

	public static void clickByJscript(WebElement ref) {
		js.executeScript("arguments[0].click()", ref);
	}

	public static void scrolDown(WebElement ref) {
		js.executeScript("arguments[0].scrollIntoView('true')", ref);

	}

	public static void scrollUp(WebElement ref) {
		js.executeScript("arguments[0].scrollIntoView('false')", ref);
	}

	public static void dropDownSelect(WebElement ref) {
		s = new Select(ref);
	}

	public static void selectIndex(int index) {
		s.selectByIndex(index);
	}

	public static void selectValue(String valuee) {
		s.selectByValue(valuee);

	}

	public static void selectText(String txt) {
		s.selectByVisibleText(txt);

	}

	public static void printAllOption() {
		options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement eachOptn = options.get(i);
			String text = eachOptn.getText();
			System.out.println(text);

		}
	}

	public static void sizeOfOPtion() {
		int size = options.size();
		System.out.println(size);
	}

	public static void chechMultipleSelect() {
		boolean check = s.isMultiple();
		System.out.println(check);
	}

	public static void selectedAllOPtions() {
		List<WebElement> allSelectdOptions = s.getAllSelectedOptions();
		for (WebElement eachOne : allSelectdOptions) {
			String selectedText = eachOne.getText();
			System.out.println(selectedText);
		}

	}

	public static void firstSelectOne() {
		WebElement fistSelect = s.getFirstSelectedOption();
		String frstPrint = fistSelect.getText();
		System.out.println(frstPrint);
	}

	public static void deselectIndx(int index) {
		s.deselectByIndex(index);
	}

	public static void deselectValue(String value) {
		s.deselectByValue(value);

	}

	public static void deselectTxt(String txt) {
		s.deselectByVisibleText(txt);
	}

	public static void deselectAlOptn() {
		s.deselectAll();
	}

	public static void selectAllByIndex() {
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}

	}

	public static void selectAllByValue() {
		for (int i = 0; i < options.size(); i++) {
			WebElement each = options.get(i);
			String val = each.getAttribute("value");
			s.selectByValue(val);
		}
	}

	public static void selectAllByText() {
		for (WebElement eachOnee : options) {
			String text = eachOnee.getText();
			s.selectByVisibleText(text);
		}
	}

	public static void frameCount(String tagName) {
		List<WebElement> frameCounts = driver.findElements(By.tagName(tagName));
		int size = frameCounts.size();
		System.out.println(size);
	}

	public static void switchFrameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchFrameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void switchFrameWebelement(WebElement ref) {
		driver.switchTo().frame(ref);

	}

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}

	public static void comeOutFrame() {
		driver.switchTo().defaultContent();
	}

	public static void screenShot() {
		ts = (TakesScreenshot) driver;

	}

	public static void screenShotGet(String name) throws IOException {
		File tmpFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tmpFile);
		File destFile = new File("C:\\Users\\ELCOT\\Downloads\\screen\\" + name + ".png");
		FileUtils.copyFile(tmpFile, destFile);
		System.out.println(destFile);
	}

	public static void navigateCmmdTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void frwd() {
		driver.navigate().forward();

	}

	public static void rfrsh() {
		driver.navigate().refresh();
	}

	public static void getCrntWindowId() {
		String crntId = driver.getWindowHandle();
		System.out.println(crntId);
	}

	public static void switchWindow(int i) {
		Set<String> allId = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(allId);
		String switchWindw = l.get(i);
		driver.switchTo().window(switchWindw);
	}

	public static void tableSize() {
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		System.out.println(tables.size());
	}

	public static void getParticularTable(int index) {
		tableee = tables.get(index);
	}

	public static void onlyRows() {
		List<WebElement> trows = tableee.findElements(By.tagName("tr"));
		for (WebElement eachRow : trows) {
			String text = eachRow.getText();
			System.out.println(text);
		}
	}

}
