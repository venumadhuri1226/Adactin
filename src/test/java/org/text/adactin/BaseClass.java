package org.text.adactin;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	static Actions ac;
	
	
public static void launchBroser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhusagar\\Desktop\\Clonning\\GitSecondDay\\driver\\chromedriver.exe");
driver=new ChromeDriver();
ac=new Actions(driver);
}


public static void loadUrl(String url) {
	driver.get(url);
	
}
public static void sendText(WebElement element,String text) {
	element.sendKeys(text);
}
public static void btnclick(WebElement element) {
	element.click();

}
public static void btnSubmit(WebElement element) {
	element.submit();
}
public static void btnclear(WebElement element) {
	element.clear();
}
public static void acceptAlert(WebElement element) {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
public static void dissmissAlert(WebElement element) {
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
}
public static void moveToElement(WebElement element) {
	
	ac.moveToElement(element).perform();;
}
public static void doubleClick(WebElement element) {
	ac.doubleClick(element).perform();
}
public static void contextClick(WebElement element) {
	ac.doubleClick(element).perform();
}
public static WebElement findElementId(String id) {
	 return driver.findElement(By.id(id));
}
public static void selectByIndex(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}

}
