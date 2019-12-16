package org.text.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojoClass extends BaseClass{
public SearchHotelPojoClass() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="location")
private WebElement ddnLocation;
@FindBy(id="room_nos")
private WebElement ddnNoOfRooms;
@FindBy(id="datepick_in")
private WebElement txtCheckInDate;
@FindBy(id="datepick_out")
private WebElement txtCheckOutDate;
@FindBy(id="adult_room")
private WebElement ddnAdultsPerRoom;
@FindBy(id="Submit")
private WebElement btnSearch;
public WebElement getDdnLocation() {
	return ddnLocation;
}
public WebElement getDdnNoOfRooms() {
	return ddnNoOfRooms;
}
public WebElement getTxtCheckInDate() {
	return txtCheckInDate;
}
public WebElement getTxtCheckOutDate() {
	return txtCheckOutDate;
}
public WebElement getDdnAdultsPerRoom() {
	return ddnAdultsPerRoom;
}
public WebElement getBtnSearch() {
	return btnSearch;
}
@FindBy(id="radiobutton_1")
private WebElement btnradio1;
@FindBy(id="continue")
private WebElement btnContinue;
public WebElement getBtnradio1() {
	return btnradio1;
}
public WebElement getBtnContinue() {
	return btnContinue;
}
@FindBy(id="first_name")
private WebElement txtFirstName;

@FindBy(id="last_name")
private WebElement txtLastName;
@FindBy(id="address")
private WebElement txtAddress; 
public WebElement getTxtFirstName() {
	return txtFirstName;
}
public WebElement getTxtLastName() {
	return txtLastName;
}
public WebElement getTxtAddress() {
	return txtAddress;
}
public WebElement getTxtCreditNum() {
	return txtCreditNum;
}
public WebElement getDdnCreditType() {
	return ddnCreditType;
}
public WebElement getDdnExpairyMonth() {
	return ddnExpairyMonth;
}
public WebElement getDdnExpairyYear() {
	return ddnExpairyYear;
}
public WebElement getTxtCvvNo() {
	return txtCvvNo;
}
public WebElement getBtnBookNow() {
	return btnBookNow;
}
@FindBy(id="cc_num")
private WebElement txtCreditNum;
@FindBy(id="cc_type")
private WebElement ddnCreditType;
@FindBy(id="cc_exp_month")
private WebElement ddnExpairyMonth;
@FindBy(id="cc_exp_year")
private WebElement ddnExpairyYear;
@FindBy(id="cc_cvv")
private WebElement txtCvvNo;
@FindBy(id="book_now")
private WebElement btnBookNow;
public void setTxtCheckInDate(WebElement txtCheckInDate) {
	this.txtCheckInDate = txtCheckInDate;
}
public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
	this.txtCheckOutDate = txtCheckOutDate;
}
public void setTxtFirstName(WebElement txtFirstName) {
	this.txtFirstName = txtFirstName;
}
public void setTxtLastName(WebElement txtLastName) {
	this.txtLastName = txtLastName;
}
public void setTxtAddress(WebElement txtAddress) {
	this.txtAddress = txtAddress;
}
public void setTxtCreditNum(WebElement txtCreditNum) {
	this.txtCreditNum = txtCreditNum;
}
public void setTxtCvvNo(WebElement txtCvvNo) {
	this.txtCvvNo = txtCvvNo;
}
@FindBy(id="order_no")
private WebElement txtOrderNum;
public WebElement getTxtOrderNum() {
	return txtOrderNum;
}



}
