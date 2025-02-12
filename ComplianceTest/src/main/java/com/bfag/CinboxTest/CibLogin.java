package com.bfag.CinboxTest;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.interactions.Actions;
public class CibLogin {
	
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"reminder-sidebar\"]/div/div/button")
	WebElement reminder;
	@FindBy(id = "email")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-btn")
	WebElement LoginBtn;
	

	
	
 
    public CibLogin(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }
//   	 public void LoginToCib() {
//   		username.click();
//   		username.sendKeys("admin@cibuat.com");
//   		password.click();
//   		password.sendKeys("Revamp@2024$");
//   		LoginBtn.click();
   		
   	 public void typeusername() {
   		username.sendKeys("admin@cibuat.com");
    	 }


    	 public void typepasswor() {
    		 password.sendKeys("Revamp@2024$");
    	 }

    	 public void Clickonlogin() {
    		 LoginBtn.click(); 
    	 }
    	 
    	 public void CancelReminder() {
    		 Actions actions = new Actions(driver);
    		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
    	        WebElement viewOption = wait.until(ExpectedConditions.elementToBeClickable(
    	        		reminder));
    	        actions.moveToElement(viewOption).perform();
    	 }
    	 

    	 

}
