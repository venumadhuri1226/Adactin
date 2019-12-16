package org.text.adactin;

import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass{
public static void main(String[] args) {
	launchBroser();
	loadUrl("https://adactin.com/HotelApp/index.php");
	LoginPojoClass lpc=new LoginPojoClass();
	WebElement txtUser = lpc.getTxtUser();
	sendText(txtUser, "venumadhuri");
	WebElement txtPass = lpc.getTxtPass();
	sendText(txtPass, "madhu1227");
	WebElement btnLogin = lpc.getBtnLogin();
	btnclick(btnLogin);
}
}
