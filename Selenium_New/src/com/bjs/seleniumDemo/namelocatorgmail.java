package com.bjs.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocatorgmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("Siddique");
		
		
		
	}

}









 