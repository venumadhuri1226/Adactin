package org.text.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterForm extends BaseClass{
public static void main(String[] args) throws AWTException {
	launchBroser();
	loadUrl("https://www.adactin.com/HotelApp/");
	RegisterPojoClass rpc=new RegisterPojoClass();
	WebElement clickRegisterHere = rpc.getClickRegisterHere();
	btnclick(clickRegisterHere);
	WebElement txtUserName = rpc.getTxtUserName();
	sendText(txtUserName,"venumadhuri");
	WebElement txtPassword = rpc.getTxtPassword();
	sendText(txtPassword, "madhu1227");
	Actions doubleClick = ac.doubleClick(txtUserName);
/*	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);*/
	WebElement txtRePassword = rpc.getTxtRePassword();
	sendText(txtRePassword, "madhu1227");
/*	//doubleClick(txtRePassword);
	r.keyPress(KeyEvent.VK_CONTROL);
	
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);*/
	WebElement txtFullName = rpc.getTxtFullName();
	sendText(txtFullName, "venumadhuri");
	WebElement txtEmailId = rpc.getTxtEmailId();
	sendText(txtEmailId, "k.venumadhuri1227@gmail.com");
	WebElement checkIAgree = rpc.getCheckIAgree();
	btnclick(checkIAgree);
	
	WebElement btnRgister = rpc.getBtnRgister();
	btnclick(btnRgister);
	
	
/*	WebElement btnReset = rpc.getBtnReset();
	btnclick(btnReset);*/
	
	
	
	
	
	
}
}
