package withdrawal_pkg;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*import org.slf4j.///////logger;
import org.slf4j./////////loggerFactory;
*/
import library.Exceldataconfig;
import library.Utility;
public class Pledgee_invocation_main {
	
	public String part2;
	public String part4;
	public String part3;
	public String part5;
	private static WebDriver driver;
	private Utility utility;
	public Exceldataconfig config;
	
	//private final static //logger //logger = //loggerFactory.get//logger(Pledgee_invocation_main.class);
	
@BeforeMethod
	
	public void Befour() throws InterruptedException 
	{
		System.out.println("Withdrawal Test Case Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        Thread.sleep(2000);

		driver = new ChromeDriver();
		//logger.info("New Driver Initiated");
		
		//driver.get("https://interrepotest.erepository.in/");
		
		driver.get("https://nerltest.erepository.in/");
		
        driver.manage().window().maximize();
        //logger.info("Browser open Succesfully and Url is open");
        utility=new Utility(driver);

	}
	//###################################### TESTCASE 1 Submit by Maker ########################
     
     @Test 
   	(priority=1,description ="To verify initation/submit for pledgee invoke transaction by Pledgee Maker",dataProvider="Withdrawal")
   	
   	public void Pledgee_creation(String Loan_account_no,String EPG_NO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
    	  
         System.out.println("Step 1 -> Tes case -1 Initation/submit by maker");   
        
    	 utility.Login1(pledgee_M, pledgee_pw); // Login by Pledgee maker(pledgee1001, Mumbai@123)
    	 //logger.info("Login by Pledgee maker");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
             		      
         utility.clickOnWebElement(Withdrawal_Cons.Menu_Link, driver); 
             		   		
         utility.clickOnWebElement(Withdrawal_Cons.Navigation_Pledge,driver); // Navigation Pledge list
         
         utility.clickOnWebElement(Withdrawal_Cons.Pledge_invoke_link,driver); // Click on Pledge invoke link
         
         utility.clickOnWebElement(Withdrawal_Cons.Menu_trigger,driver); //Menu trigger
            		   	
         utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle   		   		
           		
         driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);   	
         
         driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
         //logger.info("Select loan account no");		
         utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
        
         Thread.sleep(2000);
            		   		
         driver.findElement(By.xpath(Withdrawal_Cons.To_Beneficiary_Id)).sendKeys(Beneficiary_Id);
            		   		
         utility.clickOnWebElement(Withdrawal_Cons.Fetch_button1,driver);  	
         //logger.info("Click on Fetch button ");
         Thread.sleep(2000);   		   		
         utility.scrolldown1();   		   		
           
         Thread.sleep(2000);
         driver.findElement(By.xpath(Withdrawal_Cons.enter_ewr)).sendKeys(EWR_NO);   //Enter EWR NO 		        
            		    	
         utility.clickOnWebElement(Withdrawal_Cons.select_checkbox_ewr,driver);   //Select checkbox4
         Thread.sleep(2000);    		        
         utility.scrolldown1();
         
         utility.clickOnWebElement(Withdrawal_Cons.select_button_pledgee,driver);   
         //logger.info("Click on Seletc button");		
         Thread.sleep(2000);
         //****************** Validation message **********************
         
         String Actual_Validation_1 = driver.findElement(By.cssSelector(Withdrawal_Cons.after_select_validation_msg)).getText();
         
         Assert.assertEquals(Actual_Validation_1,"Addition of EWR Successfully.");
         
         Thread.sleep(2000);
         
         utility.scrolldown1();
         
        //************************************************************
         
         utility.clickOnWebElement(Withdrawal_Cons.ewr_checkbox,driver); //Select check box for EWR NO
         Thread.sleep(2000);
         
         driver.findElement(By.xpath(Withdrawal_Cons.enter_invoke_unit)).clear(); // Clear invoke unit 
         
        //^^^^^^^^^^^^^^^^^^^^Action 1^^^^^^^^^^^^^^^^^^^ 
         Thread.sleep(2000);
         
         Actions action = new Actions(driver);
         
         action.moveToElement(driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input"))).doubleClick().build().perform();
         
         Thread.sleep(2000); 
         driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(String.valueOf(Invoke_unit_no));
         				  
         utility.clickOnWebElement(Withdrawal_Cons.loan_amount_to_relese,driver); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_save_button,driver); // Click on save button 
         //logger.info("Click on save button");		
         utility.CaptureScreenshot(driver, "Save EWR NO", R_No);
         //logger.info("Select loan account no");		
         
         //*************************Validation Message***********************
         
         
         String Actual_Validation_2 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Approval)).getText();
         Assert.assertEquals(Actual_Validation_2,"EWR saved Successfully.");
         
       //********************************************************************
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_submit_button_pledgee,driver);
          
         utility.CaptureScreenshot(driver, "Pledgee invoke", R_No);
      //##############################################################
          				
          		String Invoke_Number =driver.findElement(By.xpath(Withdrawal_Cons.Invoke_no_capture)).getText();
          						
          	    String string = Invoke_Number; 	
          	    
          	    String[] parts = string.split(":-      ");
          			     
          	    this.part2 = parts[1]; 		
          			     
          		System.out.println("EPC NO is : " +part2);
          		
          		Thread.sleep(3000);
       
       //*****************************Validation Massage**********************
          		
         String Actual_Validation_3 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee2)).getText();
        
       	 Assert.assertEquals(Actual_Validation_3,"Pledge Invoke submitted Successfully.");
       	 utility.CaptureScreenshot(driver, "EPC SUBMIT", R_No);
       	 utility.logout1();
       	 
     //################### APPROVED BY PLEDGEE CHECKER - PLEDGEE1002 ##################
       	 
         System.out.println("Step 2 -> Approved by Pledgee checker");
			
	     utility.Login1(Pledgee_checker,Pledgee1_pw);
	     //logger.info("Login by Pledgee checker");		
	      
		 Thread.sleep(5000);
		 
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); //Click on toggle for select pending transaction
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); //Click on Pending transaction
         Thread.sleep(2000); 
       
 	     driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); //Enter Transaction ref no.
  	      
 	     utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver);   //click on DOW No from grid table 
 	    ////logger.info("Click on DOW txn no");
 	     utility.clickOnWebElement(Withdrawal_Cons.Approve_button_pledgee,driver); //Click on Approve button'
 	    //logger.info("Click on Approve button");
 	    utility.CaptureScreenshot(driver, "Approve Pledgee", R_No);
 	     
    //**********************Validation Message************************************ 	     
 	     
 	     String actual_Validation_4=driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee)).getText();
 	     
	     System.out.println("Actual validation message is " +actual_Validation_4);
	     
	             
	      Assert.assertEquals(actual_Validation_4,"Pledge Invoke approved Successfully."); 
 	     
 	//*****************************************************************************     
	      utility.logout1();
  	      Thread.sleep(3000);
  	      driver.close();
  	      Thread.sleep(3000);
      }	
      
    //############################## Test Case 2 SUbmit and discard by Maker #################
      
  	     
          @Test(priority=2,description ="To verify if Pledgee Maker is able to Discard pledgee invoke",dataProvider="Withdrawal")
  		
  		  public void Discard_Pledgee(String Loan_account_no,String EPG_NO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException {
  	       
          System.out.println("Step 3 -> Test case- 2 Discard by Maker ");
           
          utility.Login1(pledgee_M, pledgee_pw);
          //logger.info("Login by Pledgee maker- For discard");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  utility.clickOnWebElement(Withdrawal_Cons.Menu_Link,driver); //Menu Button
		  
		  utility.clickOnWebElement(Withdrawal_Cons.Navigation_Pledge,driver); //Navigation Pledge list
  		     	
		  utility.clickOnWebElement(Withdrawal_Cons.Pledge_invoke_link,driver); //Click on Pledge invoke link
  		 
		  utility.clickOnWebElement(Withdrawal_Cons.Menu_trigger,driver);  //Menu trigger
		  
		  utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle 
 		   		
 		  driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);
 		 //logger.info("Print Loan account no");
 		  driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
 		 //logger.info("Enter EPG NO");
 		  utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
 		  Thread.sleep(2000);	
 	   	  driver.findElement(By.xpath(Withdrawal_Cons.To_Beneficiary_Id)).sendKeys(Beneficiary_Id);
 	    //logger.info("Print Beneficiary_Id");
 	   	  utility.clickOnWebElement(Withdrawal_Cons.Fetch_button1,driver);
 	    //logger.info("Click on Fetch button");
 	   	 utility.CaptureScreenshot(driver, "Fetch Pledgee invoke", R_No);
 		   		
 		  Thread.sleep(2000);
 		  
 		  utility.scrolldown1();
 		  Thread.sleep(2000);
 		  driver.findElement(By.xpath(Withdrawal_Cons.enter_ewr)).sendKeys(EWR_NO); //Enter EWR NO
 	
 		  utility.clickOnWebElement(Withdrawal_Cons.select_checkbox_ewr,driver);  
 		  
 		  Thread.sleep(2000);
 		  
 		  utility.scrolldown1();
 		  
 		  utility.clickOnWebElement(Withdrawal_Cons.select_button_pledgee,driver);  
 		  
 		  utility.CaptureScreenshot(driver, "Addition Pledgee invoke", R_No);
 		 
 		  Thread.sleep(2000);
 		 
 		  //******************Validation meassge********************
 		  
 				
 		  String Actual_Validation_5 = driver.findElement(By.cssSelector(Withdrawal_Cons.after_select_validation_msg)).getText();
 		  
 		  Assert.assertEquals(Actual_Validation_5,"Addition of EWR Successfully.");
 		  
 		  Thread.sleep(3000);
 		  
 		  utility.scrolldown1();
 		  
 		  utility.clickOnWebElement(Withdrawal_Cons.ewr_checkbox,driver);  //Select check box for EWR NO  
 		       
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath(Withdrawal_Cons.enter_invoke_unit)).clear();
		  
		  //^^^^^^^^^^^^^^^^^^^^^^^^ Action 2 ^^^^^^^^    
		  
		  Thread.sleep(2000); 
		  Actions action1 = new Actions(driver);
		  Thread.sleep(2000); 	  
		  action1.moveToElement(driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input"))).doubleClick().build().perform();
				  
		  Thread.sleep(2000); 
				  
		  driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(String.valueOf(Invoke_unit_no));
		  
		  utility.clickOnWebElement(Withdrawal_Cons.loan_amount_to_relese,driver); 
		  
		  utility.clickOnWebElement(Withdrawal_Cons.Click_save_button,driver); 
		  
		  //logger.info("Click on save button");
		          
		  Thread.sleep(2000);
		  
// ****************************Validation Message ****************
		  
		 String Actual_Validation1 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Approval)).getText();
		 
		 Assert.assertEquals(Actual_Validation1,"EWR saved Successfully.");
		 
//**************************************************************************		 
		 Thread.sleep(2000);
		 
		 utility.clickOnWebElement(Withdrawal_Cons.Click_discard,driver); 
				 
		 Thread.sleep(2000);
		 	 
//*******************************Validation Messsage*************
		 
		 String actual_result_remark= driver.findElement(By.xpath(Withdrawal_Cons.Remark_message)).getText();
		 
		 Thread.sleep(2000);  
		 
		 System.out.println("Actual validation message is " +actual_result_remark);
			      
		 Assert.assertEquals(actual_result_remark,"Please enter remark first");
		
		 driver.findElement(By.xpath(Withdrawal_Cons.Enter_remark_discard)).sendKeys("enter remark"); //Enter remark
			
		 driver.findElement(By.xpath(Withdrawal_Cons.Discard_button_pledgee)).click(); //Now again  click on discard button 
		 //logger.info("Click on discard button");
		 utility.CaptureScreenshot(driver, "Discard Pledgee invoke", R_No);
		 
		 utility.logout1();
		  	      
		 Thread.sleep(3000);
		  	      
		 driver.close();
		
  	    }
  	    
	 //############################## TESTCASE 3 Resubmit and Reject  #########################################################################
		  	    
         @Test(priority=3,description ="To verify if Pledgee checker is able to Reject Pledgee invoke",dataProvider="Withdrawal")
		  		
		 public void Rejected(String Loan_account_no,String EPG_NO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException {		
		  	    	
         System.out.println("Step 4 -> Tes case 3 Initation/submit by maker ");
         
		 utility.Login1(pledgee_M, pledgee_pw);
		 //logger.info("Login by Pldgee maker- for ReSubmit");
         Thread.sleep(5000);
         
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Menu Button
         
         utility.clickOnWebElement(Withdrawal_Cons.Menu_Link,driver); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Navigation_Pledge,driver); //Navigation Pledge list
	     
         utility.clickOnWebElement(Withdrawal_Cons.Pledge_invoke_link,driver); //Click on Pledge invoke link
	   		
         utility.clickOnWebElement(Withdrawal_Cons.Menu_trigger,driver);	//Menu trigger
         
         utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle 
	   	
         utility.clickOnWebElement(Withdrawal_Cons.Loan_account_details_list,driver);
	   	
	   	 driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
	   	 //logger.info(" Print EPG NO");
	   	 utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
	   	 Thread.sleep(2000);
	   	 driver.findElement(By.xpath(Withdrawal_Cons.To_Beneficiary_Id)).sendKeys(Beneficiary_Id);
	   	 //logger.info("Enter Ben_id");
	   	 utility.clickOnWebElement(Withdrawal_Cons.Fetch_button1,driver);	
	   	 //logger.info("Click on Fetch button");
	   	 Thread.sleep(2000);
	   	 
	     utility.scrolldown1();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath(Withdrawal_Cons.enter_ewr)).sendKeys(EWR_NO); //Enter EWR NO
	    
	     utility.clickOnWebElement(Withdrawal_Cons.select_checkbox_ewr,driver);	
	        
	     utility.scrolldown1();
	     
	     utility.clickOnWebElement(Withdrawal_Cons.select_button_pledgee,driver);	
	     //logger.info("Click on select button");
	     //********************* Validation Message **********************
	     Thread.sleep(2000);
	     
	     String Actual_Validation_6 = driver.findElement(By.cssSelector(Withdrawal_Cons.after_select_validation_msg)).getText();
	     
		 Assert.assertEquals(Actual_Validation_6,"Addition of EWR Successfully.");
			
		 Thread.sleep(3000);
		 
	     utility.scrolldown1();
	     
	     Thread.sleep(2000);
	       
	     utility.clickOnWebElement(Withdrawal_Cons.ewr_checkbox,driver);	 //Select check box for EWR NO
	     Thread.sleep(2000); 
         driver.findElement(By.xpath(Withdrawal_Cons.enter_invoke_unit)).clear();
            
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
         Thread.sleep(2000);
         
         Actions action2 = new Actions(driver);
		
		 action2.moveToElement(driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input"))).doubleClick().build().perform();
		  
		 Thread.sleep(2000); 
		 
		 driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(String.valueOf(Invoke_unit_no));
		  
	     Thread.sleep(2000);
	     
	     utility.clickOnWebElement(Withdrawal_Cons.loan_amount_to_relese,driver);
         
	     utility.clickOnWebElement(Withdrawal_Cons.Click_save_button,driver);
	     //logger.info("Click on save button");
	     //******************* Validation Message***************************
	     
		String Actual_Validation_7 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Approval)).getText();
		
		Assert.assertEquals(Actual_Validation_7,"EWR saved Successfully.");
		
		utility.clickOnWebElement(Withdrawal_Cons.Click_submit_button_pledgee,driver);
		
		 utility.CaptureScreenshot(driver, "Submit for Reject Pledgee invoke", R_No);
	
		//##############################################################
		
		           String Invoke_Number1 =driver.findElement(By.xpath(Withdrawal_Cons.Invoke_no_capture)).getText();
				
	               String string1 = Invoke_Number1; 	
	     
	               String[] parts1 = string1.split(":-      ");
	     
	               this.part2 = parts1[1]; 		
	     
	               System.out.println("EPC no is : " +part2);
	     
       // ************************** Validation Message**************
	     
	     String Actual_Validation_8 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee2)).getText(); 
	     
		 Assert.assertEquals(Actual_Validation_8,"Pledge Invoke submitted Successfully.");
		 
		 utility.logout1();
		 
		 Thread.sleep(3000);	
		
	 // Done Resubmit:   Rejected by Checker 
	//######################################################################################
		 
		 System.out.println("Step 5 -> Rejected by Pledgee checker ");
			
	     utility.Login1(Pledgee_checker,Pledgee1_pw);
	     //logger.info("Login by Pledgee checker- Reject");
		 Thread.sleep(5000);
		 
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); //Click on toggle for select pending transaction
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); //Click on Pending transaction
	      
	     driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); //Enter Transaction ref no.
	     //logger.info("Display Txn No ");
	     utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver); //click on txn no
	     //logger.info("Click on Txn no ");
	     utility.clickOnWebElement(Withdrawal_Cons.Reject_button_pledgee,driver);
	     
	  //*****************Validation Message******************
	     
	  	 String actual_result_remark_11= driver.findElement(By.xpath(Withdrawal_Cons.Remark_message)).getText();
	  	 
	  	 System.out.println("Actual validation message is " +actual_result_remark_11);
		      
	     Assert.assertEquals(actual_result_remark_11,"Please enter remark first");
	     
	     driver.findElement(By.xpath(Withdrawal_Cons.Enter_remark_reject)).sendKeys("please enter remark");
			
	     utility.clickOnWebElement(Withdrawal_Cons.Reject_button_pledgee1,driver);	 // Click on Reject button 
	     //logger.info("Click on Rejectbutton");
	     utility.CaptureScreenshot(driver, "Reject Pledgee invoke", R_No);
			
	//************ Validation Message*********
	     
		 String Actual_Validation_10 = driver.findElement(By.cssSelector(Withdrawal_Cons.Reject_validation_plrdgee)).getText();
		 
	     Assert.assertEquals(Actual_Validation_10,"Rejection of Pledge Invoke Successfully.");
	     
	     Thread.sleep(3000);
	     
		 utility.logout1();
		 
	     Thread.sleep(2000);	
	     
		 driver.close();
		 
	     }
         
	//###################################### TESTCASE 4 Approval Process by Checker########################
         
	     @Test(priority=4,description ="To verify if  ... Transaction by Pledgee Maker",dataProvider="Withdrawal")
		  		
		 public void Approval(String Loan_account_no,String EPG_NO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException {	 
					
	     System.out.println("Step 6 -> Test case - 4 Submite by Pledgee Maker" );
					
         utility.Login1(pledgee_M, pledgee_pw); //Enter User id
         //logger.info("Login by Pledgee Maker- Resubmit");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); //Click on toggle for select pending transaction	
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver);//Click on Pending transaction
         
         Thread.sleep(2000);
         
         driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); //  EPC NO 
 
         Thread.sleep(3000);
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver); //click on txn no
         //logger.info("Click on Txn no");      
         utility.clickOnWebElement(Withdrawal_Cons.Click_submit_button_pledgee1,driver);	
         //logger.info("Click on Submit button");
      //*********************** Validation Message *****************
          	
         String Actual_Validation_9 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee2)).getText();
         
         Assert.assertEquals(Actual_Validation_9,"Pledge Invoke submitted Successfully.");
          
         utility.logout1();
         
      //########################## 
         
         System.out.println("Step 7 -> Approved by Pledgee checker");
         
         utility.Login1(Pledgee_checker,Pledgee1_pw);
         //logger.info("Login by Pledgee checker- Approvel ");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); //Click on toggle for select pending transaction
       	 Thread.sleep(2000);
         utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); //Click on Pending transaction
       	 
       	 driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); // EPC no
       	 
       	 utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver); //click on txn no
       	  
         utility.clickOnWebElement(Withdrawal_Cons.Click_Approve_button2,driver);
         //logger.info("Click on approve button");
         utility.CaptureScreenshot(driver, "Approve by checker Pledgee invoke", R_No);
         
       //**************** Validation Message***************  
       	   
       	String actual_Validation_A=driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Approval)).getText();
 	   
	    System.out.println("Actual validation message is " +actual_Validation_A);
	    
	    Assert.assertEquals(actual_Validation_A,"Pledge Invoke approved Successfully.");
	    
	    utility.logout1();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
        
	     }
	     
	// ###################################   TEST CASE NO 5
	     
	   @Test(priority = 5, description = "To verify initation/submit ... Transaction by Pledgee Maker", dataProvider = "Withdrawal")

	   public void Final_Approvel(String Loan_account_no, String EPG_NO, String Beneficiary_Id, String EWR_NO,String Invoke_unit_no, String pledgee_M, String pledgee_pw, String Pledgee_checker, String Pledgee1_pw,int R_No) throws InterruptedException {
					
	   System.out.println("Step 8 -> Tes case -5 Initation/submit by maker");
					
	   utility.Login1(pledgee_M, pledgee_pw);
	   //logger.info("Login by Pledgee maker");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   utility.clickOnWebElement(Withdrawal_Cons.Menu_Link,driver);
	   
	   utility.clickOnWebElement(Withdrawal_Cons.Navigation_Pledge,driver); // Navigation Pledge list
		
	   utility.clickOnWebElement(Withdrawal_Cons.Pledge_invoke_link,driver); // Click on Pledge invoke link
		
	   utility.clickOnWebElement(Withdrawal_Cons.Menu_trigger,driver); // Menu trigger
	   
	   utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle
				
	   driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);
	   
	   driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
	   //logger.info("Enter EPG NO");
	   utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);	
	   
	   Thread.sleep(2000);
	    
	   driver.findElement(By.xpath(Withdrawal_Cons.To_Beneficiary_Id)).sendKeys(Beneficiary_Id);
	   
	   utility.clickOnWebElement(Withdrawal_Cons.Fetch_button1,driver);	
	   //logger.info("Click on Fetch button");		
	   Thread.sleep(2000);
	    
	   utility.scrolldown1();
	   
	   driver.findElement(By.xpath(Withdrawal_Cons.enter_ewr)).sendKeys(EWR_NO); // Enter EWR NO
	   //logger.info("Enter EWR NO");
	   utility.clickOnWebElement(Withdrawal_Cons.select_checkbox_ewr,driver);	// Select checkbox4	
	   
	   Thread.sleep(2000);

	   utility.scrolldown1();
	   
	   utility.clickOnWebElement(Withdrawal_Cons.select_button_pledgee,driver);	
	   //logger.info("Click on SELECT button");
	 //**************** Validation Message *********************
					
		String Actual_Validation_1 = driver.findElement(By.cssSelector(Withdrawal_Cons.after_select_validation_msg)).getText();
		
		Assert.assertEquals(Actual_Validation_1, "Addition of EWR Successfully.");
		
		Thread.sleep(3000);
		
		utility.scrolldown1();
		
		utility.clickOnWebElement(Withdrawal_Cons.ewr_checkbox,driver);	// Select check box for EWR NO
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Withdrawal_Cons.enter_invoke_unit)).clear();
		
		 //logger.info("Enter Invoke unit");
	//********************* 		
        
		Actions action = new Actions(driver);
					
		action.moveToElement(driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input"))).doubleClick().build().perform();
					
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(String.valueOf(Invoke_unit_no));

		utility.clickOnWebElement(Withdrawal_Cons.Click_save_button,driver);
					
// *************** Validation Message 
				
        String Actual_Validation_2 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Savebuttom)).getText();
		
        Assert.assertEquals(Actual_Validation_2, "EWR saved Successfully.");
					
        utility.clickOnWebElement(Withdrawal_Cons.Click_submit_button_pledgee,driver);
        //logger.info("Click on submit button");			
		utility.CaptureScreenshot(driver, "Pledgee invoke", R_No);
	
//******************** Capture Invoke No ***************		
					
                     String Invoke_Number = driver.findElement(By.xpath(Withdrawal_Cons.Invoke_no_capture)).getText();

					 String string = Invoke_Number;
					 String[] parts = string.split(":-      ");

					 this.part2 = parts[1];

					 System.out.println("EPC NO is : " + part2);
					
					
// *****************Validation message *****************
		
					 String Actual_Validation_3 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee2)).getText();
		
		Assert.assertEquals(Actual_Validation_3, "Pledge Invoke submitted Successfully.");
		
		utility.logout1();
		
		Thread.sleep(2000);
		
 //############################ Discard By Pledgee Checker ##############
		
		System.out.println("Step 9 -> Discard by Pledgee checker");
		
		utility.Login1(Pledgee_checker, Pledgee1_pw);
		 //logger.info("Login by Pledgee Checker- Discard");
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); // Click on toggle for select pending transaction
		
		utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); // Click on Pending transaction
					
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); // Enter EPC NO
		 
		utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver);
		//logger.info("Print EPC NO");
		utility.clickOnWebElement(Withdrawal_Cons.Discard_button_pledgee3,driver);			
				
	//*********** Validation Message ******************
		
		String actual_result_remark= driver.findElement(By.xpath(Withdrawal_Cons.Remark_message)).getText();
		
        System.out.println("Actual validation message is " +actual_result_remark);
				      
		Assert.assertEquals(actual_result_remark,"Please enter remark first");
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath(Withdrawal_Cons.Enter_remark_discard)).sendKeys("enter remark"); //Enter remark
	   
	    utility.clickOnWebElement(Withdrawal_Cons.discardbutton_final,driver); //Now again  click on discard button 
	    //logger.info("Click on discard button");	
	    utility.CaptureScreenshot(driver, "Final Discard by Pledgee checker", R_No);
	    
	//******************** Validation Message**********************
        String Actual_Validation_discard = driver.findElement(By.cssSelector(Withdrawal_Cons.Discard_validation)).getText();
		
		Assert.assertEquals(Actual_Validation_discard, "Pledge invoke is Discarded Successfully.");
	   
	    utility.logout1();
	   
	    Thread.sleep(3000);
	   
	    driver.close();
	     
				}
				 
	   @DataProvider(name="Withdrawal")
		public Object[][] passdata1() throws IOException{
		 

		  config=new Exceldataconfig();
		  Object[][] data= config.Excel_Data_Reader(4);  
	 
		  return data;
		 
		 
		}
	}

      /* @DataProvider(name="Withdrawal")
       
       public Object[][] passdata1() throws IOException{
    	   
	   System.out.println("Inside passdata()");
	   
	   config=new Exceldataconfig();
	
	   config.setExcelPath("D:/TestData.xlsx");
	  // config.setExcelPath("C:/Users/gauravn/workspace/Test/TestData/TestData.xlsx");
	
	   config.setSheetId(4);
		
	   int rows=config.getrowcount(4);
	   
	   Object[][] data=new Object[rows-1][10];
	   
	   for(int i=1; i< rows;i++){
		  
			data[i-1][0]=config.getdata(4, i, 0);    //Loan Account Number
			data[i-1][1]=config.getdata(4, i, 1); 
			data[i-1][2]=config.getdata(4, i, 2 );   //To Beneficiary Id
			data[i-1][3]=config.getdata(4, i, 3 );   //EWR NO
			data[i-1][4]=config.getdata(4, i, 4 );   //Invoke unit no
			data[i-1][5]=config.getdata(4, i, 5 );	  //Loan Amount
			data[i-1][6]=config.getdata(4, i, 6 );    //rpledgee_maker
			data[i-1][7]=config.getdata(4, i, 7 );    //pledgee_pw
			data[i-1][8]=config.getdata(4, i, 8 );    //pledgee_ch
			data[i-1][9]=i;                           //Record no
			
      System.out.println(data[i-1][0]+" - " +data[i-1][1]+" - "+data[i-1][2]+" - " +data[i-1][3]+" - " +data[i-1][4]+" - " +data[i-1][5]+" - " +data[i-1][6]+" - " +data[i-1][7]+" - " +data[i-1][8]+" -  "+data[i-1][9]);
			
	}
		
	  System.out.println("data length:- "+data.length);
	
 return data;                        
}

}
    */                                               
                              
	   



