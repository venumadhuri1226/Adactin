package org.text.adactin;

import org.openqa.selenium.WebElement;

public class SearchHotel extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBroser();
	loadUrl("https://adactin.com/HotelApp/SearchHotel.php");
	loadUrl("https://adactin.com/HotelApp/index.php");
	LoginPojoClass lpc=new LoginPojoClass();
	WebElement txtUser = lpc.getTxtUser();
	sendText(txtUser, "venumadhuri");
	WebElement txtPass = lpc.getTxtPass();
	sendText(txtPass, "madhu1227");
	WebElement btnLogin = lpc.getBtnLogin();
	btnclick(btnLogin);
	SearchHotelPojoClass spc=new SearchHotelPojoClass();
	WebElement ddnLocation = spc.getDdnLocation();
	btnclick(ddnLocation);
	selectByIndex(ddnLocation, 2);
	btnclick(ddnLocation);
	WebElement ddnNoOfRooms = spc.getDdnNoOfRooms();
	btnclick(ddnNoOfRooms);
	selectByIndex(ddnNoOfRooms, 3);
	btnclick(ddnNoOfRooms);
	WebElement txtCheckInDate = spc.getTxtCheckInDate();
	sendText(txtCheckInDate, "14/12/2019");
	WebElement txtCheckOutDate = spc.getTxtCheckOutDate();
	sendText(txtCheckOutDate, "15/12/2019");
	WebElement ddnAdultsPerRoom = spc.getDdnAdultsPerRoom();
	selectByIndex(ddnAdultsPerRoom, 1);
	btnclick(ddnAdultsPerRoom);
	WebElement btnSearch = spc.getBtnSearch();
	btnclick(btnSearch);
	WebElement btnradio1 = spc.getBtnradio1();
	btnclick(btnradio1);
	WebElement btnContinue = spc.getBtnContinue();
	btnclick(btnContinue);
	WebElement txtFirstName = spc.getTxtFirstName();
	sendText(txtFirstName, "dgfhg");
	WebElement txtLastName = spc.getTxtLastName();
	sendText(txtLastName, "ddrth");
	WebElement txtAddress = spc.getTxtAddress();
	sendText(txtAddress, "dfhdsdg");
	WebElement txtCreditNum = spc.getTxtCreditNum();
	sendText(txtCreditNum, "1234567890123456");
	WebElement ddnCreditType = spc.getDdnCreditType();
	btnclick(ddnCreditType);
	selectByIndex(ddnCreditType, 2);
	btnclick(ddnCreditType);
	WebElement ddnExpairyMonth = spc.getDdnExpairyMonth();
	selectByIndex(ddnExpairyMonth, 7);
	WebElement ddnExpairyYear = spc.getDdnExpairyYear();
	btnclick(ddnExpairyYear);
	selectByIndex(ddnExpairyYear, 5);
	WebElement txtCvvNo = spc.getTxtCvvNo();
	sendText(txtCvvNo, "4324");
	Thread.sleep(2000);
	WebElement btnBookNow = spc.getBtnBookNow();
btnclick(btnBookNow);
WebElement txtOrderNum = spc.getTxtOrderNum();
/*String text = txtOrderNum.getText();
	
	System.out.println(text);*/
	String attribute = txtOrderNum.getAttribute("value");
	
	System.out.println(attribute);
	
	
}
}
