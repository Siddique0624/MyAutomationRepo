package com.bfag.CinboxTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenu {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"main-menu-navigation\"]/li[4]/a/span")
	WebElement DocManage;
	@FindBy(xpath="//*[@id=\"nav_data_room\"]/a/span")
	WebElement Dataroom;
	

    public SideMenu(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }

    public void DocManDropDown() {
    	DocManage.click();
   	 }
    public void dataroom() {
    	Dataroom.click();
   	 }

    
}
