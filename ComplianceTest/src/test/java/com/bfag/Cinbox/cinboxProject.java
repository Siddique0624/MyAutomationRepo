package com.bfag.Cinbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.bfag.CinboxTest.CibLogin;
import com.bfag.CinboxTest.Dataroom;
import com.bfag.CinboxTest.SideMenu;

public class cinboxProject {

	
	@Test
	public void ViewFile() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://revamp.ciblogin.in/");
		
//		Home h=new Home(driver);
//		h.typeusername();
//		h.typepasswor();
//		h.Clickonllogin();
		
		CibLogin l=new CibLogin(driver);
		l.typeusername();
		l.typepasswor();
		l.Clickonlogin();
//		Thread.sleep(50000);
		l.CancelReminder();
		driver.get("https://revamp.ciblogin.in/Dataroom/details/7/2024-25/4/48/181");

//		SideMenu sm=new SideMenu(driver);
//		sm.DocManDropDown();
//		sm.dataroom();
//
		Dataroom dr=new Dataroom(driver);
//        dr.searchCompany();
//        Thread.sleep(2000);
//        dr.selectComp();
//        dr.selDiv();
//        dr.selSer();
//        dr.selsubSer();
//        Thread.sleep(2000);
		
        dr.selFolder();
        
        dr.selFile();
//        Thread.sleep(2000);
        dr.Viewfile123();
//        Thread.sleep(50000);
		driver.quit();
		
	 
		
//		Welcome w=new  Welcome(driver);
//		w.clickonrequest();
}
	
	@Test
	public void DownloadFiles() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://revamp.ciblogin.in/");
		CibLogin l=new CibLogin(driver);
		l.typeusername();
		l.typepasswor();
		l.Clickonlogin();
		l.CancelReminder();
		driver.get("https://revamp.ciblogin.in/Dataroom/details/7/2024-25/4/48/181");
		Dataroom dr=new Dataroom(driver);
//		 dr.selFolder();
//		 Thread.sleep(5000);
//	     dr.selFile();
		 dr.selIndepenFile();
	     Thread.sleep(5000);
	     dr.Downloadfile();
	     Thread.sleep(10000);
	     dr.FileDownlaodedTest();
//	     Thread.sleep(10000);
	     driver.quit();
		
	}
	

	@Test
	public void ViewProp() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://revamp.ciblogin.in/");
		CibLogin l=new CibLogin(driver);
		l.typeusername();
		l.typepasswor();
		l.Clickonlogin();
		l.CancelReminder();
		driver.get("https://revamp.ciblogin.in/Dataroom/details/7/2024-25/4/48/181");
		Dataroom dr=new Dataroom(driver);
//		 dr.selFolder();
//		 Thread.sleep(5000);
	     dr.selIndepenFile();
	     Thread.sleep(5000); 
	     dr.ViewProp();
	     Thread.sleep(5000);
//	     dr.GetFilename();
//	     dr.FileDownlaodedTest();
//	     Thread.sleep(10000);
	     driver.quit();
		
	}
	
	@Test
	public void Viewfile1() {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://revamp.ciblogin.in/");
		CibLogin l=new CibLogin(driver);
		l.typeusername();
		l.typepasswor();
		l.Clickonlogin();
		l.CancelReminder();
		driver.get("https://revamp.ciblogin.in/Dataroom/details/7/2024-25/4/48/181");
		Dataroom dr=new Dataroom(driver);
         dr.ViewFile(); 
         
	     driver.quit();
		
	}
} 
