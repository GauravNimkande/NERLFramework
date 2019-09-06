package library;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import Com.Wordpress.pages.PayINpageElement;
import NERL.Benf_To_Benf_Main;
import NERL.NERLConstants;
import NERL.TestFFonGrid;
import withdrawal_pkg.Withdrawal_Cons;

public class Utility {

	public Exceldataconfig config;
	
	
	
	private WebDriver webDriver;
//Utility utility=new Utility(webDriver);
//	private final static Logger logger = LoggerFactory.getLogger(Benf_To_Benf_Main.class);	

	public Utility(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void CaptureScreenshot(WebDriver driver, String Screenshotname,int No) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./Screenshots/"
					+ Screenshotname + No + ".png"));
			System.out.println("Screenshot Capture");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pageScrollDown(String xpath) throws InterruptedException {
		// Create instance of Javascript executor
		JavascriptExecutor jScriptExecutorForScrolling = (JavascriptExecutor) webDriver;
		// Scroll List Until ADD Button not found
		WebElement element = webDriver.findElement(By.xpath(xpath));
		// now execute query which actually will scroll until that element is
		// not appeared on page.
		jScriptExecutorForScrolling.executeScript(
				"arguments[0].scrollIntoView(true);", element);
		// +++++++++
		Thread.sleep(2000);
	}
	
	public void pageScrollDown1(String xpath,WebDriver webDriver) throws InterruptedException {
		// Create instance of Javascript executor
		JavascriptExecutor jScriptExecutorForScrolling = (JavascriptExecutor) webDriver;
		// Scroll List Until ADD Button not found
		WebElement element = webDriver.findElement(By.xpath(xpath));
		// now execute query which actually will scroll until that element is
		// not appeared on page.
		jScriptExecutorForScrolling.executeScript(
				"arguments[0].scrollIntoView(true);", element);
		// +++++++++
		Thread.sleep(2000);
	}

	
	public void SelectAvailEnWR(String ENWR,WebDriver driver){
		driver.findElement(By.xpath("/html/body/section/section/div/data/div[2]/div/div[2]/div/div[2]/div[1]/div"
				+ "/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(ENWR);
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/section/section/div/data/div[2]/div/div[2]/div/div[2]/"
				+ "div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div")).click();
		
		driver.findElement(By.xpath("/html/body/section/section/div/data/div[2]/div/div[2]"
				+ "/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).clear();
	}
	
	

	
	
	public void XY_PageScrollDown() {
		JavascriptExecutor jse1 = (JavascriptExecutor) webDriver;
		jse1.executeScript("window.scrollBy(0,700)", "");
	}

	public void XY_PageScrollDown1(WebDriver driver) {
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,700)", "");
	}
	
	public WebElement getElementByXPath(String xpath) {
		return webDriver.findElement(By.xpath(xpath));
	}

	public void XY_PageScrollUp() {
		JavascriptExecutor jse2 = (JavascriptExecutor) webDriver;
		jse2.executeScript("window.scrollBy(0,-600)", "");
	}
	
	public void XY_PageScrollUp1(WebDriver driver) {
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,-600)", "");
	}
	
public void Login(String UserName,String Password) throws InterruptedException{
	//User ID Text box
	
	webDriver.findElement(By.xpath(".//*[@id='l-login']/form/div[2]/div/div[1]/div/input")).sendKeys(UserName);
	 //Password Text box
	webDriver.findElement(By.xpath(".//*[@id='l-login']/form/div[2]/div/div[2]/div/input")).sendKeys(Password);
		
	webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Click On Login Button
	webDriver.findElement(By.xpath(".//*[@id='l-login']/form/a")).click();
	
	                               
	Thread.sleep(2000);
	
	String CurrentUrl="https://nerltest.erepository.in/views/index.html#/home";
	                   
	String CurrentUrl2="https://nerltest.erepository.in/eREPOWeb/views/index.html#/home";
	

	/*String CurrentUrl="https://mock.erepository.in/views/index.html#/home";
    
	String CurrentUrl2="https://mock.erepository.in/eREPOWeb/views/index.html#/home";*/
	
    /*String ErepoURL1="https://awsuat.erepository.in/views/index.html#/home";
	
	String ErepoURL2="https://awsuat.erepository.in/eREPOWeb/views/index.html#/home";*/
	
	
	
	String ErepoURL1="https://interrepotest.erepository.in/views/index.html#/home";
	
	String ErepoURL2="https://interrepotest.erepository.in/eREPOWeb/views/index.html#/home";
	
	
   /* String ErepoURL1="https://mock.erepository.in/views/index.html#/home";
	
	String ErepoURL2="https://mock.erepository.in/eREPOWeb/views/index.html#/home";*/
	
	webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	if(CurrentUrl.equals(webDriver.getCurrentUrl())||CurrentUrl2.equals(webDriver.getCurrentUrl())||ErepoURL1.equals(webDriver.getCurrentUrl())||ErepoURL2.equals(webDriver.getCurrentUrl())){
		System.out.println("Login Successfully");
		
	}else{
		
		System.out.println("Login Failled");
     
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath(".//*[@id='l-login']/form/div[2]/div/div[2]/div/input")).sendKeys(Password);
		
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click On Login Button
		//webDriver.findElement(By.xpath(".//*[@id='l-login']/form/a")).click();
		
		//webDriver.findElement(By.xpath("//*[@id='loginForm']/div[2]/a")).click();
		//---------------------  Enable for nerltest webDriver.findElement(By.xpath("//*[@id='loginForm']/a")).click();
	
		webDriver.findElement(By.xpath("//*[@id='l-login']/form/a")).click();
		                               
		
	}
	webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
	
	   }
	
	public void logout() throws InterruptedException {
		//Thread.sleep(2000);
		// -----------Logout WSP Checker----------------------
		webDriver.findElement(By.xpath("//*[@id='menu-trigger']/div/div[2]"))
				.click();
		Thread.sleep(2000);
		webDriver
				.findElement(By.xpath("//*[@id='mCSB_1_container']/div/a/div"))
				.click();
		Thread.sleep(2000);
		// Logout Button
		webDriver.findElement(
				By.xpath("//*[@id='mCSB_1_container']/div/ul/li[1]/a")).click();
		
		// -------------------------------------------------------
		Thread.sleep(5000);
		
		System.out.println("User Logout Successfuly");
	}
	
	public void PendingTxn_Approval(String Transaction_Number,String Approvexpath) throws InterruptedException{
		Thread.sleep(1000);
		
		// Click on pending txn button
		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i")).click();
   		
		Thread.sleep(2000);
   		
   		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a")).click();
   		
   		System.out.println(Transaction_Number);
   		Thread.sleep(2000);
   		//Put EDP number into search box
   		
   		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(Transaction_Number);    
   		                                                                                              	
   		//logger.info("Print Txn no");
   		Thread.sleep(2000);
   		//Click On EDP No
   		//webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a/input")).click();
   		  webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input")).click();
   		  //webDriver.findElement(By.xpath("//button[data-ng-click='approvePledge()']")).click();                              
   		                                         
   		//logger.info("Transection Approve Successfully");
   		
   		Thread.sleep(2000);
   		
   	   //pageScrollDown("//*[@id='content']/div/data/div/div[3]/div/div[10]/div[7]/textarea");
       pageScrollDown("//textarea[@placeholder='Remarks']");
   	   //pageScrollDown(Approvexpath);
       //XY_PageScrollDown1(webDriver);
       webDriver.findElement(By.xpath(Approvexpath)).click();
       Thread.sleep(2000);
	}
	public void PendingTxn_ApprovalWSP(String Transaction_Number,String Approvexpath) throws InterruptedException{
		Thread.sleep(1000);
		
		// Click on pending txn button
		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i")).click();
   		
		Thread.sleep(2000);
   		
   		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a")).click();
   		
   		System.out.println(Transaction_Number);
   		Thread.sleep(2000);
   		//Put EDP number into search box
   		
   		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(Transaction_Number);    
   		                                                                                              	
   		//logger.info("Print Txn no");
   		Thread.sleep(2000);
   		//Click On EDP No
   		//webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a/input")).click();
   		  webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input")).click();
   		  //webDriver.findElement(By.xpath("//button[data-ng-click='approvePledge()']")).click();                              
   		                                         
   		//logger.info("Transection Approve Successfully");
   		
   		Thread.sleep(2000);
   		
   	   //pageScrollDown("//*[@id='content']/div/data/div/div[3]/div/div[10]/div[7]/textarea");
       //pageScrollDown("//textarea[@placeholder='Remarks']");
   	   pageScrollDown(Approvexpath);
       //XY_PageScrollDown1(webDriver);
       webDriver.findElement(By.xpath(Approvexpath)).click();
       Thread.sleep(2000);
	}
	
	public void PendingTxn_Rejection(String Transaction_Number,String RejectButtonXpath) throws InterruptedException{
		// Click on pending txn button
       Thread.sleep(1000);
		
		// Click on pending txn button
		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i")).click();
   		
		Thread.sleep(2000);
   		
   		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a")).click();
   		
   		System.out.println(Transaction_Number);
   		Thread.sleep(2000);
   		//Put EDP number into search box
   		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(Transaction_Number);
  		                              		
  		Thread.sleep(3000);
  		//Click On EDP No
  		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input")).click();
  		Thread.sleep(2000);
      //Send Key Into Remark Box
      webDriver.findElement(By.xpath("//*[@id='content']/div/data/div[1]/div[3]/div/div[7]/div[5]/textarea")).sendKeys("Abc");
                                         
      webDriver.findElement(By.xpath(RejectButtonXpath)).click();
      //logger.info("Rejected Successfully");     
	}
	
	
	public void Rejected_Submit(String Transaction_Number,String REsubmitButton) throws InterruptedException{
		 // Click on pending txn button
		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i")).click();
  		Thread.sleep(3000);
  		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a")).click();
  		System.out.println(Transaction_Number);
  		Thread.sleep(3000);
  		//Put EDP number into search box
  		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(Transaction_Number);
  		Thread.sleep(3000);
  		//Click On EDP No
  		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a/input")).click();
   		Thread.sleep(3000);
      webDriver.findElement(By.xpath(REsubmitButton)).click();
      //logger.info("Rejected_Submit");
	}
	
	public void Checker_Discard(String Transaction_Number) throws InterruptedException{
		 // Click on pending txn button
		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i")).click();
 		Thread.sleep(2000);
 		webDriver.findElement(By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a")).click();
 		System.out.println(Transaction_Number);
 		Thread.sleep(2000);
 		//Put EDP number into search box
 		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input")).sendKeys(Transaction_Number);
 		Thread.sleep(2000);
 		//Click On EDP No
 		webDriver.findElement(By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a/input")).click();
  		Thread.sleep(2000);
  		webDriver.findElement(By.xpath("//textarea[@placeholder='Remarks']")).sendKeys("Discard Txn");
 	  
     webDriver.findElement(By.xpath("//button[@class='btn btn-primary waves-effect'][@data-ng-show='pledge.dataNGHideShow.ngDiscard']")).click();
     //logger.info("Pledge discarded successfully - Checker");
               XY_PageScrollUp();
	}
	

	public void DoubleClick(String Xpath) {
		Actions action = new Actions(webDriver);
		action.moveToElement(webDriver.findElement(By.xpath(Xpath)))
				.doubleClick().build().perform();
	}
	
	public void DoubleClick1(String Xpath,WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(Xpath)))
				.doubleClick().build().perform();
	}
	
	
	  public boolean clickOnWebElement(String xPath, WebDriver webDriver) {
    	 boolean isClicked=false;
    	  
    	 WebElement webElement =  webDriver.findElement(By.xpath(xPath));
    	 try{
    	 WebDriverWait webDriverWait = new WebDriverWait(webDriver, 20);
    	 webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    	 webElement.click();
    	 isClicked=true;
    	 }catch(Exception e){
    		 isClicked=false;
    	 }
        	return isClicked;	
      }
	  
	  public boolean clickOnWebElement1(By xPath, WebDriver webDriver) {
    	  boolean isClicked=false;
    	  
    	 WebElement webElement =  webDriver.findElement(xPath);
    	 try{
    	 WebDriverWait webDriverWait = new WebDriverWait(webDriver, 20);
    	 webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    	 webElement.click();
    	 isClicked=true;
    	 }catch(Exception e){
    		 isClicked=false;
    	 }
        	return isClicked;	
      }
	  
	  //++++++++++++++++++++++++++++++++ Deepika Library +++++++++++++++++++++++++++++++++++
	  
	  
	  public void Login1(String Username,String Password) throws InterruptedException
		 {
			 System.out.println(Username);
			 System.out.println(Password);
			 Thread.sleep(2000);
			//Enter User id
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_UserID)).sendKeys(Username);   
		      
		      //Enter Password
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_User_Password)).sendKeys(Password);
		      
		      Thread.sleep(1000);
		      //Click on Login arrow key 
		      webDriver.findElement(By.xpath(Withdrawal_Cons.Login_Arrow_Key)).click();
		//      logger.info("Login Successfully");
		      webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		 }
	  
	  
	  public void scrolldown1() throws InterruptedException  
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)webDriver;
	      jse.executeScript("window.scrollBy(0,500)", "");
		  
		  
	  }
	  
	  public void logout1() throws InterruptedException
		{
		//Thread.sleep(2000);
				// -----------Logout WSP Checker----------------------
			webDriver.findElement(By.xpath("//*[@id='menu-trigger']/div/div[2]")).click();
				Thread.sleep(2000);
				webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/div/a/div")).click();
				// Logout Button
				webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/div/ul/li[1]/a")).click();
			//	logger.info("Logout Successfully");
				// -------------------------------------------------------
				Thread.sleep(2000);
			}
	  
	  public void RP_Maker(String Username,String Password) throws InterruptedException
		 {
		  
		    Login(Username,Password);
			/* System.out.println(Username);
			 System.out.println(Password);
			 Thread.sleep(2000);
			//Enter User id
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_UserID)).sendKeys(Username);   
		      
		      //Enter Password
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_User_Password)).sendKeys(Password);
		      
		    webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		    Thread.sleep(2000);
		      //Click on Login arrow key 
		      webDriver.findElement(By.xpath(Withdrawal_Cons.Login_Arrow_Key)).click();*/
		    
		      webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		      
		     clickOnWebElement(Withdrawal_Cons.Menu_Link, webDriver); 
		     
			 clickOnWebElement(Withdrawal_Cons.Pledgee_Submenu, webDriver);     
			 
			 clickOnWebElement(Withdrawal_Cons.Pledgee_redem,webDriver); // Click on Pledge invoke link
			 
			 clickOnWebElement(Withdrawal_Cons.Left_arrow_key1,webDriver); // Click on left arrow key

        }
	  
	  public void Pledgee_Maker(String Username,String Password) throws InterruptedException
		 {
		  
		  Login(Username,Password);
		  
			/* System.out.println(Username);
			 System.out.println(Password);
			 Thread.sleep(2000);
			//Enter User id
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_UserID)).sendKeys(Username);   
		      
		      //Enter Password
			 webDriver.findElement(By.xpath(Withdrawal_Cons.Login_User_Password)).sendKeys(Password);
		      
		      Thread.sleep(1000);
		      //Click on Login arrow key 
		      webDriver.findElement(By.xpath(Withdrawal_Cons.Login_Arrow_Key)).click();*/
		  
		      webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		      
		      clickOnWebElement(Withdrawal_Cons.Menu_Link, webDriver); 
		      
		   	  clickOnWebElement(Withdrawal_Cons.Navigation_Pledge,webDriver); // Navigation Pledge list
		   	  
		      clickOnWebElement(Withdrawal_Cons.Pledge_Redeem_link1,webDriver); // Click on Pledge invoke link
		      
		      clickOnWebElement(Withdrawal_Cons.Menu_trigger,webDriver); //Menu trigger
         }
	  
	 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
	
	  
	  public void Write_EWR_No(String Exlpath,String EWR_No,int SheetID,int Record_Number,int Cell_Number) throws IOException{
		  config=new Exceldataconfig();		  
		    config.setExcelPath(Exlpath);
		    //config.setExcelPath(Exlpath);
			config.setSheetId(SheetID);
         	config.WriteExcel(EWR_No, Record_Number,Cell_Number);
	  }	  
}
