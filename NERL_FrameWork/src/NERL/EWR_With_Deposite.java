package NERL;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Wordpress.pages.Deposit;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import library.Exceldataconfig;
import library.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.slf4j.//logger;
//import org.slf4j.//loggerFactory;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class EWR_With_Deposite {
	
	public Utility utility;
	public static WebDriver driver;
	public Exceldataconfig config;
	//private final static //logger //logger = //loggerFactory.get//logger(EWR_With_Deposite.class);
	public Deposit ENWR;
	public String ENWR_Number;
	public String EDP_No;
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
					 System.out.println("Test Case Execution Started");
					 
					 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
					 
					 Thread.sleep(2000);
					
					 /*TestFFonGrid Remote=new TestFFonGrid();
						driver=Remote.Grid();
					   */ 
					 
					 driver = new ChromeDriver();
					 
					// driver.get("https://interrepotest.erepository.in/");
					   
					 //driver.get("https://nerltest.erepository.in/"); 
					 
					 driver.get("https://test.erepository.in");
					 
					 driver.manage().window().maximize();
					 
					 ENWR=new Deposit(driver);		
					 
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 
					 utility = new Utility(driver);
		  }
	
	
/*	@Test(priority=1,description="To verify Creation Of ENWR With Valid details",dataProvider="wordpressdata",groups="Sanity")
	public void EWR_creation(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String Para_5,String Para_6,int Record_Number) throws InterruptedException, IOException
{
		
		
		
		utility.Login(WSP_maker, WSP_Password1);       
		
		//logger.info("WSP maker Login Successfully");
		
		ENWR.Navigate_To_DepositPage();
		
		ENWR.EWR_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
	   
		//logger.info("EWR Details Saved Successfully");
		
		EDP_No=ENWR.Transaction_Number();
		
		ENWR.Deposit_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		
		//logger.info("Deposit Details Saved Successfully");
		
		utility.pageScrollDown(NERLConstants.ADD_Vehicle_Details);
		
		ENWR.Vehicle_Deposit_Details(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		   
		//logger.info("Vehicle Details Saved Successfully");
		
		ENWR.Assaying_Details_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		       
		//logger.info("Assaying Details Saved Successfully");
		
		utility.clickOnWebElement(NERLConstants.SUBMIT_EWR_BUTTON, driver);
		
		driver.switchTo().alert().accept();
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Details Submitted Successfully.");
		
		ENWR_Number=ENWR.EWR_Number();
		
		//logger.info(ENWR_Number+" EWR Submited Successfully");
		
		//-------Write ENWR Into Benf to Benf Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 1, Record_Number, 6);
		
		//-------Write ENWR Into Pledge Initiation Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 2, Record_Number, 6);
		
		//-------Write ENWR Into Quantity Deduction Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 3, Record_Number, 3);
		
		//-------Write ENWR Into Pledgee Invoke Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 4, Record_Number, 3);
		
	    //-------Write ENWR Into Pledgee Redeem Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 5, Record_Number, 2);
		
	
       	utility.logout();
       	
      
     }

	@Test(priority=2,description="To verify ENWR Approve by WSP Checker",groups="Sanity",dataProvider="wordpressdata")
	public void EWR_WSP_Approve(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,int Record_Number) throws InterruptedException, IOException
    {
		
		
		utility.Login(WSP_checker, WSP_Password2);
	
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
	}
	
	@Test(priority=3,description="To verify Assayer is able to approve EWR transaction",groups="Sanity",dataProvider="wordpressdata")
	public void EWR_Assayer_Approve(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,int Record_Number) throws InterruptedException, IOException
    {
		
		
		utility.Login(Login_Assayer, Ass_password);
	
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
			
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
	}
	
	@Test(priority=4,description="To verify WSP Final Verifier is able to Complete EWR transaction",groups="Sanity",dataProvider="wordpressdata")
	public void EWR_WSP_CheckerFinal(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,int Record_Number) throws InterruptedException, IOException
    {
		
		utility.Login(WSP_checker, WSP_Password2);
	
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
			
		ENWR.Result_Chec k1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
	}
	
	@Test(priority=5,description="To verify WSP Maker is able to discard EWR txn",dataProvider="wordpressdata")
	public void EWR_Discard_WSPMaker(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String Para_5,String Para_6,int Record_Number) throws InterruptedException, IOException
		       {
		utility.Login(WSP_maker, WSP_Password1);       
		
		//logger.info("WSP maker Login Successfully");
		
		ENWR.Navigate_To_DepositPage();
		
		ENWR.EWR_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6 ,Record_Number);
	   
		//logger.info("EWR Details Saved Successfully");
		
		EDP_No=ENWR.Transaction_Number();
		
		ENWR.Deposit_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		
		//logger.info("Deposit Details Saved Successfully");
		
		utility.pageScrollDown(NERLConstants.ADD_Vehicle_Details);
		
		ENWR.Vehicle_Deposit_Details(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		   
		//logger.info("Vehicle Details Saved Successfully");
		
		ENWR.Assaying_Details_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6, Record_Number);
		       
		//logger.info("Assaying Details Saved Successfully");
		
	   utility.clickOnWebElement(NERLConstants.Discard_Button, driver);
	
	   //logger.info(ENWR_Number+" EWR Canceled Successfully");
		
	   ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Cancelled Successfully.");
	   
	   utility.logout();
	  
	}
	*/
	@Test(priority=6,description="To verify WSP checker is able to Reject transaction",dataProvider="wordpressdata",groups="Regression")
	public void EWR_WSPchecker_Reject(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,int Record_Number) throws InterruptedException, IOException
    {
		System.out.println("Execution Started");
		
        utility.Login(WSP_maker, WSP_Password1);       
		
		//logger.info("WSP maker Login Successfully");
		
		ENWR.Navigate_To_DepositPage();
		
	//	ENWR.EWR_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
	   
		//logger.info("EWR Details Saved Successfully");
		
		EDP_No=ENWR.Transaction_Number();
		
		//ENWR.Deposit_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		
		//logger.info("Deposit Details Saved Successfully");
		
		utility.pageScrollDown(NERLConstants.ADD_Vehicle_Details);
		
		//ENWR.Vehicle_Deposit_Details(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		   
		//logger.info("Vehicle Details Saved Successfully");
		
		//ENWR.Assaying_Details_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		       
		//logger.info("Assaying Details Saved Successfully");
		
		utility.clickOnWebElement(NERLConstants.SUBMIT_EWR_BUTTON, driver);
		
		driver.switchTo().alert().accept();
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Details Submitted Successfully.");
		
		 ENWR_Number=ENWR.EWR_Number();
		
		//logger.info(ENWR_Number+" EWR Submited Successfully");

		utility.logout();
		
		//------WSP Checker Rejection---------------
		
		utility.Login(WSP_checker, WSP_Password2);
		
		utility.PendingTxn_Rejection(EDP_No, NERLConstants.Reject_BButton);
		
	    utility.logout();
	    
	    //------WSP Maker Resubmit------------------- 
	    
	    utility.Login(WSP_maker, WSP_Password1);
	    
	    utility.PendingTxn_Approval(EDP_No, NERLConstants.SUBMIT_EWR_BUTTON);
	    
	    driver.switchTo().alert().accept();
	    
	    utility.logout();   
	 
	    //-----WSP Checker Approve------------------
	    
	    utility.Login(WSP_checker, WSP_Password2);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
		
		//----Assayer Approve the txn----------------
		
		utility.Login(Login_Assayer, Ass_password);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
			
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
		
		//------WSP Final Approval------------------
		
		utility.Login(WSP_checker, WSP_Password2);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
			
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
    
    }
	
	
	
	@DataProvider(name="wordpressdata")
	public Object[][] passdata1() throws IOException{
		
		 config=new Exceldataconfig();
		  Object[][] data= config.Excel_Data_Reader(0);  
	 
		  return data;
	 
	}
}
