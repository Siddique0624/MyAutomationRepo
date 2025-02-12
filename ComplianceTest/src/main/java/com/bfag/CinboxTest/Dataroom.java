package com.bfag.CinboxTest;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dataroom {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"flt_company\"]/div/div/div/div[2]/h6/a")
	WebElement company;
	@FindBy(xpath="//*[@id=\"div_group\"]/div[1]/div[2]/ul/li[2]")
	WebElement SelDiv;
	@FindBy(xpath="//ul[@class='dataroom_ul division_ul flt_service']/li[text()='Statutory Audit']")
	WebElement SelServ;
	@FindBy(xpath="//ul[@class='fetchfiles division_ul flt_subservice']/li[text()='Bank and Cash Reconciliation']")
	WebElement SelsubServ;
	@FindBy(xpath="//*[@id=\"ZEJhZEdQeEx2cG9NNmZPUTU1V0k5dz09\"]/td[2]/span/span")
	WebElement SelFolder;
	@FindBy(xpath="//*[@id=\"OUZyZ2FScm1mWGl0c2RnYnRQQ0pKQT09\"]/span")
	WebElement Selfile;
	@FindBy(xpath="//*[@id=\"S0M2dUFIN29rL3pFL25Bc1o1cVdiUT09\"]/span")
	WebElement SelIndepfile;
//	@FindBy(id = "doc_preview")
//	WebElement viewDoc;
	@FindBy(id = "search_cmpynme")
	WebElement sercComp;
	@FindBy(xpath="/html/body/ul[4]/li[1]/ul/li[1]/span")
	WebElement ViewCtab;
	@FindBy(xpath="/html/body/ul[4]/li[1]/span/span")
	WebElement viewDoc;
	@FindBy(xpath="//li[contains(@class, 'context-menu-item') and contains(., 'View')]")
	WebElement viewoption;
	@FindBy(xpath="//li[contains(@class, 'context-menu-item') and contains(., 'Open in current tab')]")
	WebElement InCurrenttab;
	@FindBy(xpath="/html/body/ul[4]/li[4]")
	WebElement DownloadBtn;
	@FindBy(xpath="/html/body/ul[4]/li[15]")
	WebElement ViewPropBtn;
	@FindBy(xpath="//*[@id=\"filePropertiesInfo\"]/div/div/div[2]/div/table/tbody/tr[1]")
	WebElement Filename;
//	@FindBy(id = "password")
//	WebElement password;
//	@FindBy(id = "login-btn")
//	WebElement LoginBtn;
	

	
	
 
    public Dataroom(WebDriver driver) {
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }

    public void searchCompany() {
    	sercComp.sendKeys("ad.Net");
    	 }
    public void selectComp() {
    	company.click();
    	 }
    public void selDiv() {
    	SelDiv.click();
    	 }
    public void selSer() {
    	SelServ.click();
    	 }
    public void selsubSer() {
    	SelsubServ.click();
    	 }
   
    public void selFolder() { 	
    	 Actions actions = new Actions(driver);
        actions.doubleClick(SelFolder).perform();
        actions.contextClick(Selfile).perform();
    	 }
    public void OpenFile() {
   	 Actions actions = new Actions(driver);
       
   	actions.doubleClick(Selfile).perform();    	 }
    
    public void selFile() {
      	 Actions actions = new Actions(driver);
          
      	 actions.contextClick(Selfile).perform();
      	 }

    public void ViewFile() {
      	 Actions actions = new Actions(driver);
          
      	 actions.doubleClick(SelIndepfile).perform();
      	 }
    
    public void selIndepenFile() {
     	 Actions actions = new Actions(driver);
         
     	actions.click(SelIndepfile).perform();
     	actions.contextClick(SelIndepfile).perform();
    	 
     	 
     	 }
       
    
    public void Viewfile123() throws InterruptedException {  
//    	Actions actions = new Actions(driver);
//        actions.contextClick(Selfile).perform();
//        viewDoc.click();
//        Thread.sleep(2000);
//        ViewCtab.click();
//        Thread.sleep(2000);
        
        Actions actions = new Actions(driver);
     

        // Wait for the first-level context menu to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement viewOption = wait.until(ExpectedConditions.elementToBeClickable(
        		viewoption)
        );

        // Hover over the "View" option to reveal the second-level menu
        actions.moveToElement(viewOption).perform();

        // Wait for the second-level menu and click "Open in current tab"
        WebElement openInCurrentTab = wait.until(ExpectedConditions.elementToBeClickable(InCurrenttab));
        if (openInCurrentTab.isDisplayed() && openInCurrentTab.isEnabled()) {
            openInCurrentTab.click();
        } else {
            System.out.println("Element is not interactable");
        }

     }
    public void Downloadfile() {
    	Actions actions = new Actions(driver);
        
     	actions.contextClick(DownloadBtn).perform(); 
    	 }

    public void ViewProp() {
    	Actions actions = new Actions(driver);
        
     	actions.contextClick(ViewPropBtn).perform(); 
     	 // Store the original window handle
        String mainWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
 
     // Switch to the new window
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

     // Fetch text from the popup
       
        String popupText = Filename.getText();
        System.out.println("Text in popup: " + popupText);

     	
    	 }
    
    public void GetFilename() {

    	Actions actions = new Actions(driver);
    	actions.moveToElement(Filename).perform();

    	
    	
    	
    	
        // Retrieve the text of the element (or tooltip if applicable)
        String elementText = Filename.getText();
        System.out.println("Text of the element: " + elementText);
//    	System.out.println("The given file name is "+ Filename.getText());
    	 }
   
    public void FileDownlaodedTest() {
    	 // Set the download directory path
        String downloadPath = "C:\\Users\\admin\\Downloads"; // Replace with your download folder path
        String expectedFileName = "file_example_XLS_5000"; // Replace with your expected file name

        // Verify if the file exists in the download directory
        File downloadedFile = new File(downloadPath, expectedFileName);
        if (downloadedFile.exists()) 
        {

            System.out.println("in if st");
       
            System.out.println("File downloaded successfully: " + downloadedFile.getAbsolutePath());
        } 
        else
        {
            System.out.println("File download failed or file not found."+  downloadedFile.getAbsolutePath());
        }
    }
 }
        
   
