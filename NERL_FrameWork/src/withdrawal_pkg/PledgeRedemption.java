package withdrawal_pkg;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*import org.slf4j.//logger;
import org.slf4j.//loggerFactory;
*/import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import NERL.Benf_To_Benf;
import NERL.NERLConstants;
import library.Exceldataconfig;
import library.Utility;

public class PledgeRedemption {
	public String part2;
	public String part4;
	public String part3;
	public String part5;
	private static WebDriver driver;
	private Utility utility;
	public Exceldataconfig config;
	//private final static //logger //logger = //loggerFactory.get//logger(Benf_To_Benf.class);
		@BeforeMethod

	public void Befour() throws InterruptedException 
	{
		System.out.println("Withdrawal Test Case Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    Thread.sleep(2000);

		driver = new ChromeDriver();
		
		driver.get("https://nerltest.erepository.in/");
		 //logger.info("New Driver Initiated- PledgeeRedemption");
	    driver.manage().window().maximize();
	    
	    utility=new Utility(driver);
	}
	  //################ Test case 1####################################
	  @Test 
		(priority=1,description ="To verify initation/submit for pledgee Redeem transaction by Pledgee Maker",dataProvider="Withdrawal")
	 
		public void Pledgee_creation1(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
		  utility = new Utility(driver);	
	     System.out.println("Step 1 Submit by RP maker");   
	     System.out.println(User_role);
	     
	     if (User_role.equalsIgnoreCase("RP"))
	    {
	    	System.out.println("User Role is RP");
	       utility.RP_Maker(RP_maker, RP_PW);
	       //logger.info("RP Maker login");
	    	
	    }	
	    else
	    {
	    	System.out.println("User Role is Pledgee");
	    	utility.Pledgee_Maker(pledgee_M, pledgee_pw);
	    	//logger.info("Pledgee Maker login");
	    }
	    	 
	     System.out.println("Initiation by Maker");

	     
	   utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle   		   		
	   		
       driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);   	
       
       driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
       
       utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
       Thread.sleep(2000);
       utility.clickOnWebElement(Withdrawal_Cons.Fetch_redem,driver);  
       //logger.info("Click on Fetch button");
       
       Thread.sleep(2000);   		   		
       utility.scrolldown1(); 
        
       Thread.sleep(2000);
       driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR)).sendKeys(EWR_NO);   //Enter EWR NO 	
       
       utility.clickOnWebElement(Withdrawal_Cons.Select_EWR,driver);   //Select checkbox4
       
       utility.clickOnWebElement(Withdrawal_Cons.Click_select_button,driver);
       //logger.info("Click on select button");
       
       Thread.sleep(2000);
       
       //Select ENWR--> Double Click on Redeem qnt
       utility.DoubleClick("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
       
       //Send Values in Redeem qnt
       //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys("200");
       driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Redeem_qty);
       //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(Keys.TAB);
       driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Keys.TAB);
       
 		utility.scrolldown1(); 
      
 		 Thread.sleep(2000);     
        
        utility.clickOnWebElement(Withdrawal_Cons.Click_save,driver); 
        //logger.info("Click on save button");
        utility.XY_PageScrollUp();
        
         Thread.sleep(2000);
 //****************** Validation message **********************
          
        String validation_message_save = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_save)).getText();       
          
         System.out.println("Actual validation message is " +validation_message_save);
         
         Assert.assertEquals(validation_message_save,"Saved Successfully.");
         
         /*utility.scrolldown1();*/
         utility.clickOnWebElement(Withdrawal_Cons.Submit_Redeem,driver);
         //logger.info("Click on submit button");
         Thread.sleep(3000);
    //##############################################################
             
    		String Redeem_Number =driver.findElement(By.xpath(Withdrawal_Cons.Redeem_no_capture)).getText();
    						
    	    String string = Redeem_Number; 	
    	    
    	    String[] parts = string.split(":-      ");
    			     
    	    this.part2 = parts[1]; 		
    	    System.out.println("2");	     
    		System.out.println("EPR NO is : " +part2);
    		
    		Thread.sleep(3000);
    		
   //****************** Validation message **********************
            
         String validation_message_Submit = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_Submit)).getText();
           
           System.out.println("Actual validation message is " +validation_message_Submit);
           
           Assert.assertEquals(validation_message_Submit,"Pledge Redeem submitted Successfully"); 
           
           utility.logout1();
	  }
           @Test 
			(priority=2,description ="To verify initation/submit for pledgee Redeem transaction by Pledgee Maker",dataProvider="Withdrawal")
		 
			public void Pledgee_Approved(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
   		System.out.println("Step 2 Approved by checker");
   		
   		utility.Login1(Pledgee_checker, Pledgee1_pw);
   		//logger.info("Pledgee checker login");
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); // Click on toggle for select pending transaction
		
		utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); // Click on Pending transaction
		//logger.info("Click on pending Txn");			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(Withdrawal_Cons.Redeem_Txn_no)).sendKeys(part2); // Enter EPR NO
		
		utility.clickOnWebElement(Withdrawal_Cons.Redeem_Txn,driver);
		
		utility.clickOnWebElement(Withdrawal_Cons.Approve_redeem,driver);	  
		//logger.info("Click on Approve button");
		
		 //**********************Validation Message************************************ 	     
	     
	     String Approve_2=driver.findElement(By.cssSelector(Withdrawal_Cons.Approve_validation)).getText();
	     
	     System.out.println("Actual validation message is " +Approve_2);
	     
	             
	      Assert.assertEquals(Approve_2,"Pledge Redeem approved Successfully."); 
	     
	//*****************************************************************************     
	      utility.logout1();
 	      Thread.sleep(3000);
 	      driver.close();
 	      Thread.sleep(3000);
 	      
        }
   
            //############################## Test Case 3 Save and discard by Maker  #################   
    	  @Test 
     			(priority=3,description ="To verify if Pledgee Maker is able to Discard pledgee redeem transaction by Pledgee Maker",dataProvider="Withdrawal")
     			
     			public void Pledgee_Discard_maker(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
     		    	
     		     System.out.println("Step 3 Save than Discard by RP Maker");   
     		    // System.out.println(User_role);
     		     
     		     if (User_role.equalsIgnoreCase("RP"))
     		    {
     		    	System.out.println("User Role is RP");
     		       utility.RP_Maker(RP_maker, RP_PW);
     		      //logger.info("RP MAKER login- Discard");
     		    	
     		    }
     		    else
     		    {
     		    	System.out.println("User Role is Pledgee");
     		    	utility.Pledgee_Maker(pledgee_M, pledgee_pw);
     		       //logger.info("Pledgee checker login- Discard");
     		    }
     		    	 
     		     //System.out.println("Initiation by Maker-2");
     		     
     		    utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle   		   		
    	   		
     	         driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);   	
     	         
     	         driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
     	         
     	         utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
     	         Thread.sleep(2000);
     	         utility.clickOnWebElement(Withdrawal_Cons.Fetch_redem,driver);  
     	        //logger.info("Click on Fetch button");
     	         
     	         Thread.sleep(2000);   		   		
     	         utility.scrolldown1(); 
     	          
     	         Thread.sleep(2000);
     	         driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR)).sendKeys(EWR_NO);   //Enter EWR NO 	
     	         
     	         utility.clickOnWebElement(Withdrawal_Cons.Select_EWR,driver);   //Select checkbox4
     	         
     	        utility.clickOnWebElement(Withdrawal_Cons.Click_select_button,driver);
     	       //logger.info("Click on select button");
     	       
     	       Thread.sleep(2000);
     	       
     	       //Select ENWR--> Double Click on Redeem qnt
     	       utility.DoubleClick("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
     	       
     	       //Send Values in Redeem qnt
     	       //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys("200");
     	       driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Redeem_qty);
     	       //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(Keys.TAB);
     	       driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Keys.TAB);
     	       
     	 		utility.scrolldown1(); 
     	      
     	 		 Thread.sleep(2000);     
     	 //**************************************************************************	  
     	        utility.clickOnWebElement(Withdrawal_Cons.Click_save,driver); 
     	       //logger.info("Click on save button- Discard");
     	        utility.XY_PageScrollUp();
     	        
     	         Thread.sleep(2000);
     	     // ****************************Validation Message ****************
     			  
     			 String Save_Validation1 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_Approval)).getText();
     			 
     			 Assert.assertEquals(Save_Validation1,"Saved Successfully.");
     			 
     			 Thread.sleep(2000);
     			 
     			 utility.clickOnWebElement(Withdrawal_Cons.Discard_redeem,driver); 
     					 
     			 Thread.sleep(2000);
     			 	 
     	//*******************************Validation Messsage*************
     			 String actual_result_remark= driver.findElement(By.xpath(Withdrawal_Cons.Remark_message)).getText();
     			 
     			 Thread.sleep(2000);  
     			 
     			 System.out.println("Actual validation message is " +actual_result_remark);
     				      
     			 Assert.assertEquals(actual_result_remark,"Please enter remark");
     			//Thread.sleep(2000);  
     			 driver.findElement(By.xpath(Withdrawal_Cons.Remark_textfield1)).sendKeys("enter remark"); //Enter remark
     				
     			 driver.findElement(By.xpath(Withdrawal_Cons.Discard_redeem)).click(); //Now again  click on discard button 
     		     //logger.info("Click on Discard button- Discard");
     			 utility.CaptureScreenshot(driver, "Discard by maker", R_No);
     			 
     			 utility.logout1();
     			  	      
     			 Thread.sleep(2000);
     			  	      
     			 driver.close();
     			 Thread.sleep(2000);
     		  }
     			 
     			//############################## Test Case 3 Resubmit and Reject by Checker  #################   
     		 @Test 
     		(priority=3,description ="To verify if Pledgee checker is able to Reject Pledgee redeem",dataProvider="Withdrawal")
     		
     		public void Redeem_resubmit_by_checker(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
     	    	
     	     System.out.println("Step 4 Resubmit by RP Maker");   
     	     System.out.println(User_role);
     	     
     	     if (User_role.equalsIgnoreCase("RP"))
     	    {
     	    	System.out.println("User Role is RP");
     	       utility.RP_Maker(RP_maker, RP_PW);
     	      //logger.info("RP Maker login -Reject");
     	    	
     	    }	
     	    else
     	    {
     	    	System.out.println("User Role is Pledgee");
     	    	utility.Pledgee_Maker(pledgee_M, pledgee_pw);
     	    	  //logger.info("Pledgee maker login -Reject");
     	    }
     	    	 
     	     System.out.println("Initiation by Maker");

     	     
     	     utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle   		   		
     	   		
            driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);   	
            
            driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
            
            utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
            Thread.sleep(2000);
            utility.clickOnWebElement(Withdrawal_Cons.Fetch_redem,driver);  
            //logger.info("Fetch button-Resubmit Reject");
            
            Thread.sleep(2000);   		   		
            utility.scrolldown1(); 
             
            Thread.sleep(2000);
            driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR)).sendKeys(EWR_NO);   //Enter EWR NO 	
            
            utility.clickOnWebElement(Withdrawal_Cons.Select_EWR,driver);   //Select checkbox4
            
            utility.clickOnWebElement(Withdrawal_Cons.Click_select_button,driver);
            //logger.info("Select button -Resubmit Reject");
            
            Thread.sleep(2000);
            
            //Select ENWR--> Double Click on Redeem qnt
            utility.DoubleClick("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
            
            //Send Values in Redeem qnt
            //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys("200");
            driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Redeem_qty);
            
            driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Keys.TAB);
            
      		utility.scrolldown1(); 
           
      		 Thread.sleep(2000);     
             
             utility.clickOnWebElement(Withdrawal_Cons.Click_save,driver); 
             //logger.info("Save button -Resubmit Reject");
             utility.XY_PageScrollUp();
             
              Thread.sleep(2000);
      //****************** Validation message **********************
               
             String validation_message_save = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_save)).getText();       
               
              System.out.println("Actual validation message is " +validation_message_save);
              
              Assert.assertEquals(validation_message_save,"Saved Successfully.");
              
              utility.scrolldown1();
              utility.clickOnWebElement(Withdrawal_Cons.Submit_Redeem,driver);
              //logger.info("Submit button-Resubmit Reject");
              Thread.sleep(2000);
              
             //----------------------------
              
          	String Redeem_Number =driver.findElement(By.xpath(Withdrawal_Cons.Redeem_no_capture)).getText();
			
    	    String string = Redeem_Number; 	
    	    
    	    String[] parts = string.split(":-      ");
    			     
    	    this.part2 = parts[1]; 		
    	    System.out.println("2");	     
    		System.out.println("EPR NO is : " +part2);
    		
    		Thread.sleep(3000);
    		
            //****************** Validation message **********************
              
              String validation_message_Submit = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_Submit)).getText();
                
                System.out.println("Actual validation message is " +validation_message_Submit);
                
                Assert.assertEquals(validation_message_Submit,"Pledge Redeem submitted Successfully"); 
                
                utility.logout1();
       	      Thread.sleep(3000);
       	      driver.close();
       	      Thread.sleep(3000);
     		 }
       	 //############################ Rejected By Pledgee Checker ##############
              @Test 
      		(priority=4,description ="To verify initation/submit for pledgee invoke transaction by Pledgee Maker",dataProvider="Withdrawal")
      		
      		public void Redeem_Rejecte_by_checker(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{	
      		System.out.println("Step 5 Rejeced by Pledgee checker");
      		
      		utility.Login1(Pledgee_checker, Pledgee1_pw);
      		//logger.info("Pledgee Checker login -Reject");
      		Thread.sleep(5000);
      		
      		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      		
      		utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); // Click on toggle for select pending transaction
      		
      		utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); // Click on Pending transaction
      		//logger.info("Click on Pending Txn -Reject");		
      		Thread.sleep(2000);
      		
      		driver.findElement(By.xpath(Withdrawal_Cons.Redeem_Txn_no)).sendKeys(part2); // Enter EPR NO
      		
      		utility.clickOnWebElement(Withdrawal_Cons.Redeem_Txn,driver);
      		 
      		utility.clickOnWebElement(Withdrawal_Cons.Redeem_Reject_button,driver);
      		//logger.info("-Reject");
      	  //*****************Validation Message******************
      
			 String actual_result_remark= driver.findElement(By.xpath(Withdrawal_Cons.Remark_message)).getText();
			 
			 Thread.sleep(2000);  
			 
			 System.out.println("Actual validation message is " +actual_result_remark);
				      
			 Assert.assertEquals(actual_result_remark,"Please enter remark");
			Thread.sleep(2000);  
			 driver.findElement(By.xpath(Withdrawal_Cons.Remark_textfield1)).sendKeys("enter remark"); //Enter remark
				
			 driver.findElement(By.xpath(Withdrawal_Cons.Redeem_Reject_button1)).click(); //Now again  click on discard button 
			 //logger.info("Click on Reject Button-Reject");
      	     utility.CaptureScreenshot(driver, "Rejection of EWR Successfully.", R_No);
      			
      	//************ Validation Message*********
      	     
      		 String Actual_Validation_10 = driver.findElement(By.cssSelector(Withdrawal_Cons.Reject_validation_plrdgee)).getText();
      		 
      	     Assert.assertEquals(Actual_Validation_10,"Rejection of EWR Successfully.");
      	     
      	     Thread.sleep(3000);
      	     
      		 utility.logout1();
      		 
      	     Thread.sleep(2000);	
      	     
      		 driver.close();
     		 }
      		//###################################### TESTCASE 4 Submit from pending txn and by Checker########################
         
		 @Test 
 		(priority=5,description ="To verify initation/submit for pledgee invoke transaction by Pledgee Maker",dataProvider="Withdrawal")
 		
 	   public void Pledgee_submit(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{	
 		
	   System.out.println("Step 6 Submit from pending txn by RP maker");
 		
 		
 		 utility.Login1(RP_maker, RP_PW);
 		//logger.info("RP Maker Login- Go to pending Txn and submit");
            // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
             
             utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); //Click on toggle for select pending transaction	
             
             utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver);//Click on Pending transaction
             //logger.info("Click on pendinG tXN -Submit");
             Thread.sleep(2000);
             driver.findElement(By.xpath(Withdrawal_Cons.Txn_no)).sendKeys(part2); // 
             Thread.sleep(3000);
             utility.clickOnWebElement(Withdrawal_Cons.Click_Txn_no,driver); //click on txn no
              	      
             utility.clickOnWebElement(Withdrawal_Cons.Click_submit_button_pledgee2,driver);	
             //logger.info("Click on Submit button -Submit by RP MAKER");
          //*********************** Validation Message *****************
              	
             String Actual_Validation_9 = driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_message_pledgee2)).getText();
             
             Assert.assertEquals(Actual_Validation_9,"Pledge Redeem submitted Successfully");
             
             utility.logout1();
             Thread.sleep(2000);
             driver.close();
             
      		 }
		 //############################ Discard By Pledgee Checker ##############
         @Test 
 		(priority=6,description ="To verify initation/submit for pledgee redeem transaction by Pledgee discard",dataProvider="Withdrawal")
 		
 		public void Pledgee_discard_checker(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{	
 		System.out.println("Step 7 Discard by Pledgee checker");
 		
 		utility.Login1(Pledgee_checker, Pledgee1_pw);
 		//logger.info("Pledgee Checker login -Discard process");
 		Thread.sleep(5000);
 		
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		
 		utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); // Click on toggle for select pending transaction
 		
 		utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); // Click on Pending transaction
 		//logger.info("Click on Pending Txn- Pledgee checker");		
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath(Withdrawal_Cons.Redeem_Txn_no)).sendKeys(part2); // Enter EPR NO
 		
 		utility.clickOnWebElement(Withdrawal_Cons.Redeem_Txn,driver);
 		
 		utility.clickOnWebElement(Withdrawal_Cons.pledgee_discard_checker,driver);
 		
 		     
 		//*******************************Validation Messsage*************
		 
		 String actual_result_remark1=  driver.findElement(By.cssSelector(Withdrawal_Cons.Validation_discard)).getText();
		 
		 Thread.sleep(2000);  
		 
		 System.out.println("Actual validation message is " +actual_result_remark1);
			      
		 Assert.assertEquals(actual_result_remark1,"Please enter remark");
		Thread.sleep(2000);  
		 driver.findElement(By.xpath(Withdrawal_Cons.Remark_textfield1)).sendKeys("enter remark"); //Enter remark
			
		 driver.findElement(By.xpath(Withdrawal_Cons.pledgee_discard_checker1)).click(); //Now again  click on discard button 
		 //logger.info("Click on Discard button - Discard by pledgee checker");	
   
		//************ Validation Message*********
  	     
  		 String Actual_Validation_10 = driver.findElement(By.cssSelector(Withdrawal_Cons.Reject_validation_plrdgee)).getText();
  		 
  	     Assert.assertEquals(Actual_Validation_10,"Discard of EWR Successfully.");
  	   utility.CaptureScreenshot(driver, "Discard by checker", R_No);
	     
	     utility.logout1();
  	      Thread.sleep(3000);
  	      driver.close();
  	      Thread.sleep(3000);
         }
         //==========================Final Approve ===============================
         @Test 
 		(priority=7,description ="To verify initation/submit for pledgee Redeem transaction by Pledgee Maker",dataProvider="Withdrawal")
 		
 		public void Pledgee_final_submit(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
 	    	
 	     System.out.println(" Step 8 Submit by RP maker_Final Submit");   
 	     System.out.println(User_role);
 	     
 	     if (User_role.equalsIgnoreCase("RP"))
 	    {
 	    	System.out.println("User Role is RP");
 	       utility.RP_Maker(RP_maker, RP_PW);
 	      //logger.info(" RP maker Login - Resubmit process");	
 	    	
 	    }	
 	    else
 	    {
 	    	System.out.println("User Role is Pledgee");
 	    	utility.Pledgee_Maker(pledgee_M, pledgee_pw);
 	    	//logger.info(" Pledgee Maker login- ");	
 	    }
 	    	 
 	     System.out.println("Initiation by Maker");

 	     
 	     utility.clickOnWebElement(Withdrawal_Cons.Loan_account_no_toggle,driver); // Loan account no toggle   		   		
 	   		
        driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list)).sendKeys(Loan_account_no);   	
        
        driver.findElement(By.xpath(Withdrawal_Cons.Loan_account_details_list1)).sendKeys(EPG_NO);
        
        utility.clickOnWebElement(Withdrawal_Cons.Checkbox_loan_account,driver);
        Thread.sleep(2000);
        utility.clickOnWebElement(Withdrawal_Cons.Fetch_redem,driver);  
        //logger.info("Click on Fetch Button");	
        Thread.sleep(2000);   		   		
        utility.scrolldown1(); 
         
        Thread.sleep(2000);
        driver.findElement(By.xpath(Withdrawal_Cons.Enter_EWR)).sendKeys(EWR_NO);   //Enter EWR NO 	
        
        utility.clickOnWebElement(Withdrawal_Cons.Select_EWR,driver);   //Select checkbox4
        
        utility.clickOnWebElement(Withdrawal_Cons.Click_select_button,driver);
        //logger.info("Click on select button");	
        Thread.sleep(2000);
        
        //Select ENWR--> Double Click on Redeem qnt
        utility.DoubleClick("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
        
        //Send Values in Redeem qnt
        //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys("200");
        driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Redeem_qty);
        //driver.findElement(By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(Withdrawal_Cons.sendkey1)).sendKeys(Keys.TAB);
        
  		utility.scrolldown1(); 
       
  		 Thread.sleep(2000);     
         
         utility.clickOnWebElement(Withdrawal_Cons.Click_save,driver); 
         //logger.info("Click on save button");	
         utility.XY_PageScrollUp();
         
          Thread.sleep(2000);
  //****************** Validation message **********************
           
         String validation_message_save = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_save)).getText();       
           
          System.out.println("Actual validation message is " +validation_message_save);
          
          Assert.assertEquals(validation_message_save,"Saved Successfully.");
          
          utility.scrolldown1();
          utility.clickOnWebElement(Withdrawal_Cons.Submit_Redeem,driver);
          //logger.info("Click on Submit button");	
          Thread.sleep(3000);
     //##############################################################
              
     		String Redeem_Number =driver.findElement(By.xpath(Withdrawal_Cons.Redeem_no_capture)).getText();
     						
     	    String string = Redeem_Number; 	
     	    
     	    String[] parts = string.split(":-      ");
     			     
     	    this.part2 = parts[1]; 		
     	    System.out.println("2");	     
     		System.out.println("EPR NO is : " +part2);
     		
     		Thread.sleep(3000);
     		
    //****************** Validation message **********************
             
          String validation_message_Submit = driver.findElement(By.cssSelector(Withdrawal_Cons.validation_message_Submit)).getText();
            
            System.out.println("Actual validation message is " +validation_message_Submit);
            
            Assert.assertEquals(validation_message_Submit,"Pledge Redeem submitted Successfully"); 
            
            utility.logout1();
   	      Thread.sleep(3000);
   	      driver.close();
   	      Thread.sleep(3000);
 	  }
      //############################ AApprove By Pledgee Checker ##############
             @Test 
     		(priority=8,description ="To verify Approved for pledgee redeem transaction by Pledgee checker",dataProvider="Withdrawal")
     		
     		public void Pledgee_final_Approvel(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{	
     		System.out.println(" Step 9 Final Approvel by checker");
     		
     		utility.Login1(Pledgee_checker, Pledgee1_pw);
     		 //logger.info("Pledgee Checker login- Approved ");	
     		Thread.sleep(5000);
     		
     		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     		
     		utility.clickOnWebElement(Withdrawal_Cons.Click_toggle,driver); // Click on toggle for select pending transaction
     		
     		utility.clickOnWebElement(Withdrawal_Cons.Click_Pending_transaction,driver); // Click on Pending transaction
     		//logger.info("Click on Pending Txn ");				
     		Thread.sleep(2000);
     		
     		driver.findElement(By.xpath(Withdrawal_Cons.Redeem_Txn_no)).sendKeys(part2); // Enter EPR NO
     		
     		utility.clickOnWebElement(Withdrawal_Cons.Redeem_Txn,driver);
     		
     		utility.clickOnWebElement(Withdrawal_Cons.Approve_redeem,driver);	
     		//logger.info("Click on Approvel Button-> Approved ");	
     		
     		 //**********************Validation Message************************************ 	     
     	     
     	     String Approve_2=driver.findElement(By.cssSelector(Withdrawal_Cons.Approve_validation)).getText();
     	     
    	     System.out.println("Actual validation message is " +Approve_2);
    	     
    	             
    	      Assert.assertEquals(Approve_2,"Pledge Redeem approved Successfully."); 
     	     
     	//*****************************************************************************     
    	      utility.logout1();
      	      Thread.sleep(3000);
      	      driver.close();
      	      Thread.sleep(3000);
      	      
             }   
             @DataProvider(name="Withdrawal")
     		public Object[][] passdata1() throws IOException{
     		 

     		  config=new Exceldataconfig();
     		  Object[][] data= config.Excel_Data_Reader(5);  
     	 
     		  return data;
     		 
     		 
     		}
     	}
	
	    /*@DataProvider(name="Withdrawal")
	   public Object[][] passdata1() throws IOException{
		   
	    System.out.println("Inside passdata()");
	  
	    config=new Exceldataconfig();

	    config.setExcelPath("D:/TestData.xlsx");
	    //config.setExcelPath("D:/D DRIVE/New folder/Workspace/Withdrawal/TestData/TestData.xlsx");

	    config.setSheetId(5);
		
	    int rows=config.getrowcount(5);
	  
	    Object[][] data=new Object[rows-1][12];
	  
	    for(int i=1; i< rows;i++){
			
			data[i-1][0]=config.getdata(5, i, 0);    //Loan Account Number
			data[i-1][1]=config.getdata(5, i, 1);     //epg no
			data[i-1][2]=config.getdata(5, i, 2 );   //EWR NO
			data[i-1][3]=config.getdata(5, i, 3 );   //Invoke unit no
			data[i-1][4]=config.getdata(5, i, 4 );	  //Maker login
			data[i-1][5]=config.getdata(5, i, 5 );    //maker pw
			data[i-1][6]=config.getdata(5, i, 6 );    //user role
			data[i-1][7]=config.getdata(5, i, 7 );    //pledgee_maker
			data[i-1][8]=config.getdata(5, i, 8 );    // pledgee pw
			data[i-1][9]=config.getdata(5, i,9 );    //pledgee checker
			data[i-1][10]=config.getdata(5, i,10 );    // pledgee pw
			data[i-1][11]=i;                           //Record no
			
	 System.out.println(data[i-1][0]+" - " +data[i-1][1]+" - "+data[i-1][2]+" - " +data[i-1][3]+" - " +data[i-1][4]+" - " +data[i-1][5]+" - " +data[i-1][6]+" - " +data[i-1][7]+" - " +data[i-1][8]+" -  "+data[i-1][9]+" -  "+data[i-1][10]+" -  "+data[i-1][11]);
			
	}
		
	 System.out.println("data length:- "+data.length);

	return data;                        
	}

}
*/