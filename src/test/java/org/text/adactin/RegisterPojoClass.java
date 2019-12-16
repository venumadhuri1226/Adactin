package org.text.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPojoClass extends BaseClass{
public RegisterPojoClass() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="username")
private WebElement txtUserName;
@FindBy(id="password")
private WebElement txtPassword;
@FindBy(id="re_password")
private WebElement txtRePassword;
@FindBy(id="full_name")
private WebElement txtFullName;
@FindBy(id="email_add")
private WebElement txtEmailId;
@FindBy(id="tnc_box")
private WebElement checkIAgree;
@FindBy(xpath="//td[@class='login_register']")
private WebElement clickRegisterHere;



public WebElement getClickRegisterHere() {
	return clickRegisterHere;
}
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getTxtRePassword() {
	return txtRePassword;
}
public WebElement getTxtFullName() {
	return txtFullName;
}
public WebElement getTxtEmailId() {
	return txtEmailId;
}
public WebElement getCheckIAgree() {
	return checkIAgree;
}
public WebElement getBtnRgister() {
	return btnRgister;
}
public WebElement getBtnReset() {
	return btnReset;
}
@FindBy(id="Submit")
private WebElement btnRgister;
@FindBy(id="Reset")
private WebElement btnReset;

}
