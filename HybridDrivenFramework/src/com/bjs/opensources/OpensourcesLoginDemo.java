package com.bjs.opensources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpensourcesLoginDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\HybridDrivenFramework\\src\\com\\bjs\\utilities\\hybriddriven.properties");

       Properties p = new Properties()	;
       p.load(fis);

       String  urldata=p.getProperty("url");
       String  usernamedata=p.getProperty("username1");
       String  passworddata=p.getProperty("password1");
       
       String  loginkey=p.getProperty("login");
       String  usernamekey=p.getProperty("username");
       String  passwordkey=p.getProperty("password");
       String  submitkey=p.getProperty("submit");
       String  commentkey=p.getProperty("comment");

       System.out.println(urldata);
       System.out.println(usernamedata);
       System.out.println(passworddata);
       System.out.println(loginkey);
       System.out.println(usernamekey);
       System.out.println(passwordkey);
       System.out.println(submitkey);
       System.out.println(commentkey);
       
//       WebDriver driver = new ChromeDriver();
       FirefoxOptions options = new FirefoxOptions();
       FirefoxDriver driver = new FirefoxDriver(options);
       driver.manage().window().maximize();
       driver.get(urldata);
       
       driver.findElement(By.linkText(loginkey)).click();
       driver.findElement(By.id(usernamekey)).sendKeys(usernamedata);
       driver.findElement(By.id(passwordkey)).sendKeys(passworddata);
       driver.findElement(By.id(submitkey)).click();
       
       driver.findElement(By.xpath(commentkey)).click();
       driver.close();
       
       
       
	}

}
