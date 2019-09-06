package withdrawal_pkg;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.Exceldataconfig;
import library.Utility;
public class Update_Quantity_deduction {

	public String part2;
	public String part4;
	public String part3;
	public String part5;
	public Exceldataconfig config;
	private static WebDriver driver;
	private Utility utility;
	
	private final static Logger logger = LoggerFactory.getLogger(Update_Quantity_deduction.class);
@BeforeMethod
	
	public void Befour() throws InterruptedException 
	{
		System.out.println("Withdrawal Test Case Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		Thread.sleep(2000);
		driver = new ChromeDriver();
		//driver.get("https://interrepotest.erepository.in/");
		driver.get("https://nerltest.erepository.in/");
		logger.info("Web application launched");
       driver.manage().window().maximize();	
       utility=new Utility(driver);
}

	 //++++++++++++++++++++++++Test case -1 DOW Initiation/Submit by RP Maker++++++++++++++++++++++++++++++++++++++++++++++++++

@Test (priority=3,description ="To verify initation/submit of DOW Transaction by RP MAKER",dataProvider="Withdrawal")
    public void Withdrawal_creation(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
	System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");
	
		System.out.println("Test Case-1 RP-Maker Add Withdrawal");
	
		utility.Login1(RP_Maker, RP1_PW);
		logger.info("Click action performed on login key RP Maker");
       //Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
        logger.info("Implicit wait applied on the driver for 20 seconds");
      // driver.findElement(By.xpath(Withdrawal_Cons.Menu_List_icon)).click(); //Click on menu list icon
      utility.clickOnWebElement(Withdrawal_Cons.Menu_List_icon, driver);
      
      //driver.findElement(By.xpath()).click();   
      utility.clickOnWebElement(Withdrawal_Cons.Quantity_Deduction_menu, driver);//Click on Quantity Deduction menu
    
      
       //driver.findElement(By.xpath()).click();
       utility.clickOnWebElement(Withdrawal_Cons.Quantity_Deduction_Submenu, driver); //Click on submenu (Quantity Deduction)
       Thread.sleep(2000);
    
       // Click on left arrow key 
      driver.findElement(By.xpath(Withdrawal_Cons.Left_arrow_key1)).click();
      
      Thread.sleep(4000);
       
      // Click on Warehouse toggle
      driver.findElement(By.xpath(Withdrawal_Cons.Click_Warehouse_Toggle)).click();
      Thread.sleep(2000);
      
      //Enter warehouse code from list
      driver.findElement(By.xpath(Withdrawal_Cons.Enter_Warehouse_code)).sendKeys(WHCode);
      
      //Select check box
      driver.findElement(By.xpath(Withdrawal_Cons.Select_Checkbox1)).click();
      
      Thread.sleep(2000);
      
     // Select commodity toggle
      driver.findElement(By.xpath(Withdrawal_Cons.Click_Commodity_toggle)).click();
      
      Thread.sleep(2000);
      
      //Enter commodity id
      driver.findElement(By.xpath(Withdrawal_Cons.Enter_Commodity_id)).sendKeys(Comm_ID);
      
      //Select checkbox
      driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox2)).click();
     
      Thread.sleep(2000);
      
      //Click toggle of Beneficiary Id
      driver.findElement(By.xpath(Withdrawal_Cons.Toggle_Beneficiaryid)).click();
      //Enter Beneficiary id
      driver.findElement(By.xpath(Withdrawal_Cons.Enter_Beneficiary_ID)).sendKeys(Benf_Code);
	  // Select checkbox
      driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox3)).click();
      Thread.sleep(3000);
     
      //click on fetch button 
      driver.findElement(By.xpath(Withdrawal_Cons.Fetch_button)).click();
      logger.info("Click on Fetch button");
      
      Thread.sleep(2000);
    //Enter EWR NO
      driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR_NO)).sendKeys(EWR_No);
  
      Thread.sleep(2000);
      
      //Select checkbox4
      driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox4)).click();
      
      Thread.sleep(2000);
      
    //To scroll down web page by 500 pixels In x(vertical) 'direction.
      
      utility.scrolldown1();
 
      //Click on select button
      driver.findElement(By.xpath(Withdrawal_Cons.Select_button)).click();
      logger.info("Clicked on select button");
      Thread.sleep(2000);
		String Actual_Validation = driver.findElement(By.xpath(Withdrawal_Cons.EWR_Add_Validation_Message)).getText();
		Assert.assertEquals(Actual_Validation,"Selected EWR has been added susccessfully...","Please Select Valid EWR");
		
       utility.scrolldown1();
        Thread.sleep(3000);
     
     //No of Begs
     String No_of_Begs=driver.findElement(By.xpath(Withdrawal_Cons.No_of_Begs)).getText();
  
    //System.out.println(No_of_Begs);
    Thread.sleep(2000);
     driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).clear();
   
    //Enter input no of begs
    driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).sendKeys(Input_no_of_begs1);
    Thread.sleep(2000);
   //Storage cherge till date 
    driver.findElement(By.xpath(Withdrawal_Cons.Storage_cherge_till_date)).sendKeys("09/10/2017");
    Thread.sleep(2000);
	//Click on save button 
    Thread.sleep(2000);
    driver.findElement(By.xpath(Withdrawal_Cons.Save_button)).click();
    logger.info("Clicked on save button");
    Thread.sleep(3000);
  //Validation message for save button 
    String actual_result=driver.findElement(By.xpath(Withdrawal_Cons.Validation_Message1)).getText();
   
	System.out.println("Actual validation message is " +actual_result);
       
     Assert.assertEquals(actual_result,"Qty Deduction Transaction has been saved successfully.");
     
     Thread.sleep(3000);
    
     //Now click on Submit button 
	    driver.findElement(By.xpath(Withdrawal_Cons.Submit_Button)).click();
	    
	    logger.info("Click on Submit button");
	    Thread.sleep(2000);
	    String DOW_no=driver.findElement(By.xpath(Withdrawal_Cons.DOW_No_Capture2)).getText();
		// System.out.println(DOW_no); 		
	       String string = DOW_no; 		
	      String[] parts = string.split(":-      ");
	     
	     this.part2 = parts[1]; 		
	     
	      System.out.println("DOW NO IS : " +part2);
	    Thread.sleep(3000);
//Validation message for submit button
String actual_result1=driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_Message2)).getText();

System.out.println("Actual validation message is " +actual_result1);

Assert.assertEquals(actual_result1,"Qty Deduction Transaction has been submitted successfully.");
Thread.sleep(2000);
	utility.logout1();
	logger.info("Click on logout button");
	Thread.sleep(3000);
	driver.close();
}
//.............Test case-2 DOW Approve by Checker....

@Test (priority=4,description ="To verify DOW Approve by Checker.Login with RP Checker",dataProvider="Withdrawal")
public void Approved_by_checker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

 System.out.println("Test Case-2 Approverd by RP-checker");

 utility.Login1(RP_Checker,RP2_PW);

 logger.info("Click action performed on login key RP Checker");

  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  
  logger.info("Implicit wait applied on the driver for 20 seconds");
  
  //Click on toggle for select pending transaction
  driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
  Thread.sleep(2000);
  //Click on Pending transaction
  driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
  Thread.sleep(2000);
  //Enter Transaction ref no.
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(part2);
  Thread.sleep(3000);
  //click on DOW No from grid table 
  driver.findElement(By.xpath(Withdrawal_Cons.DOW_NOS)).click();
  Thread.sleep(2000);
  //Click on Approve button
  driver.findElement(By.xpath(Withdrawal_Cons.Click_Approve_button)).click();
  logger.info("Click on Approve button");
  
  Thread.sleep(3000);
  //String actual_result4=driver.findElement(By.xpath(Withdrawal_Cons.Validation_message4)).getText();
  String actual_result4=driver.findElement(By.cssSelector(Withdrawal_Cons.VAlidation_CSS_msg)).getText();
   
  System.out.println("Actual validation message is " +actual_result4);
		       
  Assert.assertEquals(actual_result4,"Quantity Deduction Transaction has been Approved successfully.");
  Thread.sleep(3000);
  utility.logout1();
  Thread.sleep(3000);
  driver.close();

}
//.............Test case-3....................................

@Test (priority=5,description ="WOW Initiation/Submit by WSP Maker",dataProvider="Withdrawal")
public void WOW_Initiat_by_wsp_maker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

System.out.println("Test Case-3 Approverd by RP-checker");

utility.Login1(WSP_Maker,WSP1_PW);
logger.info("Click action performed on login key WSP Maker");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
logger.info("Implicit wait applied on the driver for 20 seconds");
Thread.sleep(3000); 
  //Click on Menu_Toggle 
    driver.findElement(By.xpath(Withdrawal_Cons.Menu_Toggle)).click();
    Thread.sleep(2000); 
    //Click on Quantity_deduction_menu
    driver.findElement(By.xpath(Withdrawal_Cons.Quantity_deduction_menu_wsp)).click();
    Thread.sleep(2000); 
  //Click on Quantity_deduction_submenu_wsp
    driver.findElement(By.xpath(Withdrawal_Cons.Quantity_deduction_submenu_wsp)).click();
    Thread.sleep(3000); 
   // Click on arrow key for hide menu list
    driver.findElement(By.xpath(Withdrawal_Cons.Hidemenulist_arrow_key)).click();
    Thread.sleep(2000);
   //click on toggle for new window list
    driver.findElement(By.xpath(Withdrawal_Cons.DOW_Toggle_newwindow)).click();
    Thread.sleep(3000);
    //Enter transaction ref no_dow details
    driver.findElement(By.xpath(Withdrawal_Cons.transaction_ref_no_wsp)).sendKeys(part2);
    Thread.sleep(2000);
    //Select check box from grid table
    driver.findElement(By.xpath(Withdrawal_Cons.select_checkbox_wsp)).click();
    Thread.sleep(2000);
    //Enter EWR NO_WSP
    driver.findElement(By.xpath(Withdrawal_Cons.select_EWR_NO_WSP)).sendKeys(EWR_No);
    Thread.sleep(2000);
    //Select check box from grid table EWR_NO_WSP
    driver.findElement(By.xpath(Withdrawal_Cons.EWR_N0_WSP_CHECKBOX)).click();
    
    utility.scrolldown1();
    Thread.sleep(2000);
    
  //click on select button 
    driver.findElement(By.xpath(Withdrawal_Cons.select_button_wsp)).click();
    logger.info("Clicked on select button");
    Thread.sleep(2000);
 //Now click on check box from available ewr list
    driver.findElement(By.xpath(Withdrawal_Cons.checkbox_EWR)).click();
    Thread.sleep(2000);
    
   //Clear input no of begs 
    driver.findElement(By.xpath(Withdrawal_Cons.Clear_input_no_of_begs1)).clear();
    Thread.sleep(2000);
  //enter input no of begs
    driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs1)).sendKeys(Input_no_of_begs1);
    //Click on input physical quantity 
   driver.findElement(By.xpath(Withdrawal_Cons.input_physical_quantity_gridtable)).click();
    Thread.sleep(2000);
    //Click on save button 
   driver.findElement(By.xpath(Withdrawal_Cons.save_button1)).click(); 
   logger.info("Clicked on Save button");
 //validation message -WOW Transaction has been saved successfully
   Thread.sleep(3000); 
	    String actual_result8=driver.findElement(By.xpath(Withdrawal_Cons.validation_message5)).getText();
	      System.out.println("Actual validation message is " +actual_result8);
		         
		  Assert.assertEquals(actual_result8,"WOW Transaction has been saved successfully.");
		  Thread.sleep(2000);
  
	//Now click on submit button  
	driver.findElement(By.xpath(Withdrawal_Cons.Click_submit_button2)).click();   
	 logger.info("Clicked on Submit button");
	Thread.sleep(3000);
//-------------------------------------------------------------------------------------------------
	
	String WOW_no=driver.findElement(By.xpath(Withdrawal_Cons.WOW_No_Capture)).getText();
	 System.out.println(WOW_no); 		
     String string1 = WOW_no; 		
    String[] parts1 = string1.split(":-      ");
   String part3 = parts1[0];
   this.part4 = parts1[1]; 		
    System.out.println(part3); 		
    System.out.println("WOW NO IS : " +part4);
  Thread.sleep(3000);
//------------------------------------------------------------------------------------------------------------	    
	//validation message - WOW Transaction has been submitted successfully. 
	
	String actual_result5=driver.findElement(By.xpath(Withdrawal_Cons.validation_message6)).getText();
  Thread.sleep(2000); 
	   System.out.println("Actual validation message is " +actual_result5);
		       
	  Assert.assertEquals(actual_result5,"WOW Transaction has been submitted successfully.");
	  Thread.sleep(3000); 
	  utility.logout1();
	  logger.info("Clicked on logout button");
	 driver.close();
}
	  //..........................Test case 4  ....Approved by WSP checker-- WSP2002

@Test (priority=6,description ="WOW approved by WSP checker",dataProvider="Withdrawal")
public void WOW_Approved_by_wsp_Checker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");
System.out.println("Tes Case - 4 Approverd by WSP2002 checker");

utility.Login(WSP_Checker,WSP2_PW);
logger.info("Click action performed on login key WSP Checker");
//Thread.sleep(4000);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
logger.info("Implicit wait applied on the driver for 20 seconds");
//Click on toggle for select pending transaction
driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
Thread.sleep(2000);
//Click on Pending transaction
driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
Thread.sleep(2000);
//Enter Transaction ref no.
driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(this.part4);
Thread.sleep(3000);
//click on DOW No from grid table 
driver.findElement(By.xpath(Withdrawal_Cons.Pending_txn_Click)).click();
Thread.sleep(2000);
//Click on Approve button
driver.findElement(By.xpath(Withdrawal_Cons.Click_Approve_button1)).click();
logger.info("Click on Approve button");

//Validation message "WOW Transaction has been Approved successfully.
Thread.sleep(3000);
String actual_result6=driver.findElement(By.cssSelector(Withdrawal_Cons.VAlidation_CSS_msg)).getText();

System.out.println("Actual validation message is " +actual_result6);
	       
Assert.assertEquals(actual_result6,"WOW Transaction has been Approved successfully.");
Thread.sleep(2000);
driver.findElement(By.xpath(Withdrawal_Cons.Download_Receipt)).click();
logger.info("Click on Download link");
Thread.sleep(3000);
utility.logout1();
logger.info("Click on Logout button");
Thread.sleep(3000);
driver.close();

}

//....................................TESTCASE 5 Discard by RP Maker..............................

@Test (priority=7,description ="WOW discard by RP Maker",dataProvider="Withdrawal")
public void Discard_by_RM_Maker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

System.out.println("Discard withdrawal_test case 5");	

utility.Login1(RP_Maker, RP1_PW);
logger.info("Click action performed on login key RP Maker");
  //Thread.sleep(4000);
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  logger.info("Implicit wait applied on the driver for 20 seconds");
  //Click on menu list icon
  driver.findElement(By.xpath(Withdrawal_Cons.Menu_List_icon)).click();
  
  Thread.sleep(3000);
  
   //Click on Quantity Deduction menu
   driver.findElement(By.xpath(Withdrawal_Cons.Quantity_Deduction_menu)).click();

 Thread.sleep(4000);
  //Click on submenu (Quantity Deduction)
 driver.findElement(By.xpath(Withdrawal_Cons.Quantity_Deduction_Submenu)).click();
 
 Thread.sleep(2000);

  
  // Click on left arrow key 
  driver.findElement(By.xpath(Withdrawal_Cons.Left_arrow_key1)).click();
  
  Thread.sleep(4000);
   
  // Click on Warehouse toggle
  driver.findElement(By.xpath(Withdrawal_Cons.Click_Warehouse_Toggle)).click();
  Thread.sleep(2000);
  
  //Enter warehouse code from list
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_Warehouse_code)).sendKeys(WHCode);
  
  //Select check box
  driver.findElement(By.xpath(Withdrawal_Cons.Select_Checkbox1)).click();
  
  Thread.sleep(2000);
  
 // Select commodity toggle
  driver.findElement(By.xpath(Withdrawal_Cons.Click_Commodity_toggle)).click();
  
  Thread.sleep(2000);
  
  //Enter commodity id
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_Commodity_id)).sendKeys(Comm_ID);
  
  //Select checkbox
  driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox2)).click();
 
  Thread.sleep(2000);
  
  //Click toggle of Beneficiary Id
  driver.findElement(By.xpath(Withdrawal_Cons.Toggle_Beneficiaryid)).click();
  //Enter Beneficiary id
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_Beneficiary_ID)).sendKeys(Benf_Code);
  // Select checkbox
  driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox3)).click();
  Thread.sleep(3000);
  //click on fetch button 
  driver.findElement(By.xpath(Withdrawal_Cons.Fetch_button)).click();
  Thread.sleep(2000);
//Enter EWR NO
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR_NO)).sendKeys(EWR_No);
  
  Thread.sleep(2000);
  
  //Select checkbox4
  driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox4)).click();
  
  Thread.sleep(2000);
  
//To scroll down web page by 500 pixels In x(vertical) direction.
  
  utility.scrolldown1();

  //Click on select button
  driver.findElement(By.xpath(Withdrawal_Cons.Select_button)).click();
  logger.info("Click on select button");
  //No of Begs
// String Input_No_of_Begs2=driver.findElement(By.xpath(Withdrawal_Cons.No_of_Begs)).getText();

// System.out.println(Input_No_of_Begs2);

 driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).clear();

//Enter input no of begs
driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).sendKeys(Input_no_of_begs1);
//Storage cherge till date 
driver.findElement(By.xpath(Withdrawal_Cons.Storage_cherge_till_date)).sendKeys("09/10/2017");
//Click on save button 
driver.findElement(By.xpath(Withdrawal_Cons.Save_button)).click();
logger.info("Click on save button");
Thread.sleep(2000);
//click on discard
driver.findElement(By.xpath(Withdrawal_Cons.discard_button)).click();

//validation message -Please enter remarks
Thread.sleep(2000);
String actual_result1=driver.findElement(By.xpath(Withdrawal_Cons.Validation_message_remark)).getText();
   
   System.out.println("Actual validation message is " +actual_result1);
	       
  Assert.assertEquals(actual_result1,"Please enter remarks");
  
//Enter remark
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_remark)).sendKeys("enter remark");
//Now again  click on discard button 
  
  driver.findElement(By.xpath(Withdrawal_Cons.Agian_click_discard_button)).click();
  logger.info("Click on Discard button");
  //validation message -Quantity Deduction Transaction has been discarded successfully.
  Thread.sleep(2000);
   
	  utility.logout1();
	  Thread.sleep(2000);
	  driver.close();
}

//..........................Test case 6 .... Txn Submit by rp Maker .................

@Test (priority=8,description ="To verify if On post Discard txn by RP maker, RP maker resubmit txn",dataProvider="Withdrawal")
public void Resubmit_by_RM_Maker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

System.out.println("Test Case -6 RP-Maker Add Withdrawal");

utility.Login1(RP_Maker, RP1_PW);
logger.info("Click action performed on login key RP Maker");
//Thread.sleep(4000);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
//Click on menu list icon
driver.findElement(By.xpath(Withdrawal_Cons.Menu_List_icon)).click();

Thread.sleep(3000);

 //Click on Quantity Deduction menu
 driver.findElement(By.xpath(Withdrawal_Cons.Quantity_Deduction_menu)).click();

Thread.sleep(4000);
//Click on submenu (Quantity Deduction)
driver.findElement(By.xpath(Withdrawal_Cons.Quantity_Deduction_Submenu)).click();

Thread.sleep(2000);

// Click on left arrow key 
driver.findElement(By.xpath(Withdrawal_Cons.Left_arrow_key1)).click();

Thread.sleep(4000);
 
// Click on Warehouse toggle
driver.findElement(By.xpath(Withdrawal_Cons.Click_Warehouse_Toggle)).click();
Thread.sleep(2000);

//Enter warehouse code from list
driver.findElement(By.xpath(Withdrawal_Cons.Enter_Warehouse_code)).sendKeys(WHCode);

//Select check box
driver.findElement(By.xpath(Withdrawal_Cons.Select_Checkbox1)).click();

Thread.sleep(2000);

// Select commodity toggle
driver.findElement(By.xpath(Withdrawal_Cons.Click_Commodity_toggle)).click();

Thread.sleep(2000);

//Enter commodity id
driver.findElement(By.xpath(Withdrawal_Cons.Enter_Commodity_id)).sendKeys(Comm_ID);

//Select checkbox
driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox2)).click();

Thread.sleep(2000);

//Click toggle of Beneficiary Id
driver.findElement(By.xpath(Withdrawal_Cons.Toggle_Beneficiaryid)).click();
//Enter Beneficiary id
driver.findElement(By.xpath(Withdrawal_Cons.Enter_Beneficiary_ID)).sendKeys(Benf_Code);
// Select checkbox
driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox3)).click();
Thread.sleep(3000);

//click on fetch button 
driver.findElement(By.xpath(Withdrawal_Cons.Fetch_button)).click();
logger.info("Click on fetch button");
Thread.sleep(2000);
//Enter EWR NO
driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR_NO)).sendKeys(EWR_No);

Thread.sleep(2000);

//Select checkbox4
driver.findElement(By.xpath(Withdrawal_Cons.Select_checkbox4)).click();

Thread.sleep(2000);

//To scroll down web page by 500 pixels In x(vertical) 'direction.

utility.scrolldown1();

//Click on select button
driver.findElement(By.xpath(Withdrawal_Cons.Select_button)).click();

Thread.sleep(2000);
	String Actual_Validation = driver.findElement(By.xpath(Withdrawal_Cons.EWR_Add_Validation_Message)).getText();
	Assert.assertEquals(Actual_Validation,
			"Selected EWR has been added susccessfully...",
			"Please Select Valid EWR");
	utility.scrolldown1();
Thread.sleep(3000);

//No of Begs
String No_of_Begs=driver.findElement(By.xpath(Withdrawal_Cons.No_of_Begs)).getText();

//System.out.println(No_of_Begs);
Thread.sleep(3000);
driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).clear();

//Enter input no of begs
driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs)).sendKeys(Input_no_of_begs1);
Thread.sleep(2000);
//Storage cherge till date 
driver.findElement(By.xpath(Withdrawal_Cons.Storage_cherge_till_date)).sendKeys("09/10/2018");
Thread.sleep(2000);
//Click on save button 
Thread.sleep(2000);
driver.findElement(By.xpath(Withdrawal_Cons.Save_button)).click();
logger.info("Click on save button");
Thread.sleep(3000);
//Validation message for save button 
String actual_result=driver.findElement(By.xpath(Withdrawal_Cons.Validation_Message1)).getText();

System.out.println("Actual validation message is " +actual_result);
 
Assert.assertEquals(actual_result,"Qty Deduction Transaction has been saved successfully.");

Thread.sleep(3000);

//Now click on Submit button 
  driver.findElement(By.xpath(Withdrawal_Cons.Submit_Button)).click();
  logger.info("Click on submit button");
  Thread.sleep(2000);
 String DOW_NO2=driver.findElement(By.xpath(Withdrawal_Cons.DOW_No_Capture2)).getText();
	System.out.println(DOW_NO2); 		
     String string = DOW_NO2; 		
    String[] parts = string.split(":-      ");
   String part1 = parts[0];
   this.part2 = parts[1]; 		
    //System.out.println(part1); 		
    System.out.println("DOW NO IS : " +part2);
  //Thread.sleep(3000);
//Validation message for submit button
String actual_result1=driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_Message2)).getText();

System.out.println("Actual validation message is " +actual_result1);

 Thread.sleep(2000);    
Assert.assertEquals(actual_result1,"Qty Deduction Transaction has been submitted successfully.");
Thread.sleep(3000);
//Capture DOW NO

  Thread.sleep(3000);
  utility.logout1();
  driver.close();
}
//..........................Test case 7 .... Txn approved by RP Checker .................

  @Test (priority=9,description ="To Verify if RP Checker having provision to Approve DOW txn",dataProvider="Withdrawal")
  public void Resubmit_Txn_Approved_by_RM_Checker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
  System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

  System.out.println("Test Case-7 Approverd by RP-checker");
	
	utility.Login1(RP_Checker,RP2_PW);
	logger.info("RP Checker login");
//Thread.sleep(4000);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
    //Click on toggle for select pending transaction
    driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
    Thread.sleep(2000);
    //Click on Pending transaction
    driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
    logger.info("Clicked on pending Txn");
    Thread.sleep(2000);
    //Enter Transaction ref no.
    driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(part2);
    Thread.sleep(3000);
    //click on DOW No from grid table 
    driver.findElement(By.xpath(Withdrawal_Cons.DOW_NOS)).click();
    Thread.sleep(2000);
    //Click on Approve button
    driver.findElement(By.xpath(Withdrawal_Cons.Click_Approve_button)).click();
    logger.info("Clicked on Approved button");
    
    //validation message -"Quantity Deduction Transaction has been Approved successfully.
    Thread.sleep(3000);
	  //String actual_result4=driver.findElement(By.xpath(Withdrawal_Cons.Validation_message4)).getText();
	  String actual_result4=driver.findElement(By.cssSelector(Withdrawal_Cons.VAlidation_CSS_msg)).getText();
	   
    System.out.println("Actual validation message is " +actual_result4);
			       
    Assert.assertEquals(actual_result4,"Quantity Deduction Transaction has been Approved successfully.");
    Thread.sleep(3000);
    utility.logout1();
    driver.close();
  }
  
//..........................Test case 8 .... Txn approved by RP Checker .................

  @Test (priority=10,description ="To Verify if WSP maker having provision to Initiate WOW txn.",dataProvider="Withdrawal")
  public void Resubmit_Txn_Approved_by_RM_Checker1(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
  System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");

  System.out.println("Test Case-8 WSP maker submitted withdrawal");
  utility.Login1(WSP_Maker,WSP1_PW);
  logger.info("WSP Maker login");
  
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  Thread.sleep(3000); 
//Click on Menu_Toggle 
  driver.findElement(By.xpath(Withdrawal_Cons.Menu_Toggle)).click();
  Thread.sleep(2000); 
  //Click on Quantity_deduction_menu
  driver.findElement(By.xpath(Withdrawal_Cons.Quantity_deduction_menu_wsp)).click();
  Thread.sleep(2000); 
//Click on Quantity_deduction_submenu_wsp
  driver.findElement(By.xpath(Withdrawal_Cons.Quantity_deduction_submenu_wsp)).click();
  Thread.sleep(3000); 
 // Click on arrow key for hide menu list
  driver.findElement(By.xpath(Withdrawal_Cons.Hidemenulist_arrow_key)).click();
  Thread.sleep(2000);
 //click on toggle for new window list
  driver.findElement(By.xpath(Withdrawal_Cons.DOW_Toggle_newwindow)).click();
  Thread.sleep(2000);
  //-------------Change dow no ----
  //Enter transaction ref no_dow details
  
  driver.findElement(By.xpath(Withdrawal_Cons.transaction_ref_no_wsp)).sendKeys(part2);
  Thread.sleep(2000);
  //Select check box from grid table
  driver.findElement(By.xpath(Withdrawal_Cons.select_checkbox_wsp)).click();
  Thread.sleep(2000);
  //Enter EWR NO_WSP
  driver.findElement(By.xpath(Withdrawal_Cons.select_EWR_NO_WSP)).sendKeys(EWR_No);
  Thread.sleep(2000);
  //Select check box from grid table EWR_NO_WSP
  driver.findElement(By.xpath(Withdrawal_Cons.EWR_N0_WSP_CHECKBOX)).click();
  
  utility.scrolldown1();
  Thread.sleep(2000);
  
//click on select button 
  driver.findElement(By.xpath(Withdrawal_Cons.select_button_wsp)).click();
  logger.info("Click on Selecte button ");
  Thread.sleep(2000);
//Now click on check box from available ewr list
  driver.findElement(By.xpath(Withdrawal_Cons.checkbox_EWR)).click();
  Thread.sleep(2000);
  
 //Clear input no of begs 
  driver.findElement(By.xpath(Withdrawal_Cons.Clear_input_no_of_begs1)).clear();
  Thread.sleep(2000);
//enter input no of begs
  driver.findElement(By.xpath(Withdrawal_Cons.Input_no_of_begs1)).sendKeys(Input_no_of_begs1);
  //Click on input physical quantity 
 driver.findElement(By.xpath(Withdrawal_Cons.input_physical_quantity_gridtable)).click();
  Thread.sleep(3000);
  //Click on save button 
 driver.findElement(By.xpath(Withdrawal_Cons.save_button1)).click(); 
 logger.info("Click on Save button ");
 Thread.sleep(3000);
//Click on Submit button 
 driver.findElement(By.xpath(Withdrawal_Cons.wow_Submit_Button_ )).click();
 logger.info("Click on again Save button ");
 Thread.sleep(2000);
String wow_no=driver.findElement(By.xpath(Withdrawal_Cons.wow_capture2)).getText();
System.out.println(wow_no); 		
String string1 = wow_no; 		
String[] parts1 = string1.split(":-      ");

this.part3 = parts1[1]; 		

System.out.println("wow NO IS : " +part3);
Thread.sleep(3000);
//Validation message for submit button
String actual_result_M=driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message7)).getText();

System.out.println("Actual validation message is " +actual_result_M);
Thread.sleep(2000);    
Assert.assertEquals(actual_result_M,"WOW Transaction has been submitted successfully.");

 Thread.sleep(3000);
 utility.logout1();
 // Thread.sleep(3000);
  driver.close();
}
//..........................Test case 9 .... Txn Rejected by WSP2002 Checker ...............
  @Test (priority=11,description ="To verify if On post reject WOW txn by WSP checker, Txn will be canceled and qty will be released_",dataProvider="Withdrawal")
  public void Txn_Rejected_by_WSP_Checker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
  System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");
  System.out.println("Rejected by checker- Withdrawal test case 9");
	
	 utility.Login(WSP_Checker,WSP2_PW);
	 logger.info("WSP CHECKER LOGIN ");
//Thread.sleep(4000);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
//Click on toggle for select pending transaction
driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
Thread.sleep(2000);
//Click on Pending transaction
driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
logger.info("Click on Pending txn");
Thread.sleep(2000);
//-----------------------------------------------
//Enter Transaction ref no.
driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(part3);
Thread.sleep(3000);
//click on  No from grid table 
driver.findElement(By.xpath(Withdrawal_Cons.Pending_txn_Click)).click();
Thread.sleep(2000);
//Click on Reject button
driver.findElement(By.xpath(Withdrawal_Cons.Reject_button)).click();

//validation message -Please enter remarks
 Thread.sleep(2000);
 String actual_result7=driver.findElement(By.xpath(Withdrawal_Cons.Validation_message_remark)).getText();
	   
	   System.out.println("Actual validation message is " +actual_result7);
		       
	  Assert.assertEquals(actual_result7,"Please enter remarks");
	  
	//Enter remark
	  driver.findElement(By.xpath(Withdrawal_Cons.Remark_field)).sendKeys("Please enter remark");
	  Thread.sleep(2000);
	//Again Click on Reject button
   driver.findElement(By.xpath(Withdrawal_Cons.Reject_button)).click();
   logger.info("Click on reject button ");
	  
Thread.sleep(3000);
utility.logout1();
Thread.sleep(3000);
driver.close();

  }
  
//..........................Test case 10 .... Resubmit by WSP Maker 2001 ..................
  @Test (priority=12,description ="To verify if On post reject WOW txn by WSP checker, WSP maker resubmit txn.",dataProvider="Withdrawal")
  public void PendingTxn_resubmit_by_WSP_Maker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
  
   System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");
  
   System.out.println("To Verify if WSP maker is able to Submit WOWTransaction");
  
   utility.Login1(WSP_Maker,WSP1_PW);
   logger.info("WSP Maker login ");
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  Thread.sleep(3000); 
//Click on toggle for select pending transaction
  driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
  Thread.sleep(2000);
  //Click on Pending transaction
  driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
  Thread.sleep(2000);
  //-----------------------------------------------
  //Enter Transaction ref no.
  driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(part3);
  Thread.sleep(3000);
  //click on  No from grid table 
  driver.findElement(By.xpath(Withdrawal_Cons.Pending_txn_Click)).click();
  logger.info("Click on Pending txn button ");
  Thread.sleep(2000);
  //Click on submit button 
  driver.findElement(By.xpath(Withdrawal_Cons.Resubmit_button_wsp_M )).click();
  logger.info("Click on submit button ");
     Thread.sleep(2000);
String wow_no=driver.findElement(By.xpath(Withdrawal_Cons.wow_capture2)).getText();
System.out.println(wow_no); 		
String string = wow_no; 		
String[] parts1 = string.split(":-      ");

this.part3 = parts1[1]; 		

System.out.println("wow NO IS : " +part3);
Thread.sleep(3000);
//Validation message for submit button
String actual_result1=driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_Message2)).getText();

System.out.println("Actual validation message is " +actual_result1);
Thread.sleep(2000);    
Assert.assertEquals(actual_result1,"WOW Transaction has been submitted successfully.");
  Thread.sleep(3000);
  utility.logout1();
  driver.close();

}
 //..........................Test case 11 .... Resubmit by WSP Maker 2001 ..................
  @Test (priority=13,description ="To Verify if WSP checker is able to Discard WOW txn",dataProvider="Withdrawal")
  public void Discard_by_wsp_checker(String WHCode,String Comm_ID,String Benf_Code,String EWR_No,String Input_no_of_begs1,String RP_Maker,String RP1_PW,String RP_Checker,String RP2_PW,String WSP_Maker,String WSP1_PW,String WSP_Checker,String WSP2_PW) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
  
   System.out.println(WHCode+"  "+Comm_ID+" "+Benf_Code+" "+EWR_No+" "+RP_Maker+" "+RP1_PW+" "+RP_Checker+" "+RP2_PW+" "+WSP_Maker+" ");
  
   System.out.println("To Verify if wsp Checker is able to discard  WOW txn");
   utility.Login(WSP_Checker,WSP2_PW);
   logger.info("WSP Checker login");
   
   //Thread.sleep(4000);
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
   //Click on toggle for select pending transaction
   driver.findElement(By.xpath(Withdrawal_Cons.Click_toggle)).click();
   Thread.sleep(2000);
   //Click on Pending transaction
   driver.findElement(By.xpath(Withdrawal_Cons.Click_Pending_transaction)).click();
   Thread.sleep(2000);
   //-----------------------------------------------
   //Enter Transaction ref no.
   driver.findElement(By.xpath(Withdrawal_Cons.Enter_Transaction_ref_no)).sendKeys(part3);
   Thread.sleep(3000);
   //click on  No from grid table 
   driver.findElement(By.xpath(Withdrawal_Cons.Pending_txn_Click)).click();
   Thread.sleep(2000);
  //Click on discard button 
   driver.findElement(By.xpath(Withdrawal_Cons.Discard_button_cheker)).click();
  
   //validation message -Please enter remarks
	    Thread.sleep(2000);
	    String actual_result7=driver.findElement(By.xpath(Withdrawal_Cons.Validation_message_remark)).getText();
		   
		   System.out.println("Actual validation message is " +actual_result7);
			       
		  Assert.assertEquals(actual_result7,"Please enter remarks");
		  
		//Enter remark
		  driver.findElement(By.xpath(Withdrawal_Cons.Remark_field)).sendKeys("Please enter remark");
		  Thread.sleep(2000);
		//Again Click on discard button
	      driver.findElement(By.xpath(Withdrawal_Cons.Discard_button_cheker)).click();
	      logger.info("Clicked on discard button");
		  
   Thread.sleep(3000);
   utility.logout1();
   Thread.sleep(3000);
	  driver.close();
  }
  @DataProvider(name="Withdrawal")
	public Object[][] passdata1() throws IOException{
	 

	  config=new Exceldataconfig();
	  Object[][] data= config.Excel_Data_Reader(3);  

	  return data;
	 
	 
	}
}
/*@DataProvider(name="Withdrawal")
	public Object[][] passdata1() throws IOException{
		System.out.println("Inside passdata()");
		config=new Exceldataconfig();
		
		config.setExcelPath("D:/TestData.xlsx");
		//config.setExcelPath("D:/D DRIVE/New folder/Workspace/Withdrawal/TestData/TestData.xlsx");
	config.setSheetId(3);
		
		int rows=config.getrowcount(3);
		Object[][] data=new Object[rows-1][13];
		for(int i=1; i< rows;i++){
			
			data[i-1][0]=config.getdata(3, i, 0);    //Warehouse Code
			data[i-1][1]=config.getdata(3, i, 1 );   //Commodity ID
			data[i-1][2]=config.getdata(3, i, 2 );   //Beneficiary Account Code
			data[i-1][3]=config.getdata(3, i, 3 );   //EWR NO
			data[i-1][4]=config.getdata(3, i, 4 );	  //I/P NO of begs
			data[i-1][5]=config.getdata(3, i, 5 );    //rm_maker
			data[i-1][6]=config.getdata(3, i, 6 );    //rm_pw
			data[i-1][7]=config.getdata(3, i, 7 );    //rp_ch
			data[i-1][8]=config.getdata(3, i, 8 );     //rp_pw
			data[i-1][9]=config.getdata(3, i, 9 );     // wsp_m
			data[i-1][10]=config.getdata(3, i, 10 );    //wsp_pw
			data[i-1][11]=config.getdata(3, i, 11 );    //wsp_c
			data[i-1][12]=config.getdata(3, i, 12 );    //wsppw
			
			System.out.println(data[i-1][0]+" - " +data[i-1][1]+" - "+data[i-1][2]+" - " +data[i-1][3]+" - " +data[i-1][4]+" - " +data[i-1][5]+" - " +data[i-1][6]+" - " +data[i-1][7]+" - " +data[i-1][8]+" - " +data[i-1][9]+" - " +data[i-1][10]+" - " +data[i-1][11]+" - " +data[i-1][12]);
			
	}
		
	System.out.println("data length:- "+data.length);
	
 return data;


}
}*/






