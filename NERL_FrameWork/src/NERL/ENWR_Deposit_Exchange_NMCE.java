package NERL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Wordpress.pages.Deposit;
import library.Exceldataconfig;
import library.Utility;

public class ENWR_Deposit_Exchange_NMCE {
	
    private String Is_Exchange_Deposit="NO";	
	public Utility utility;
	public  WebDriver driver;
	public Exceldataconfig config;
	private static Deposit ENWR;
	public String ENWR_Number;
	public String EDP_No;
	private EWR_With_Deposite EWR=new EWR_With_Deposite();
	
	 
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		
	 
		
					 System.out.println("Test Case Execution Started");
					 
					 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
					 
					 Thread.sleep(2000);
				 
					/*TestFFonGrid Remote=new TestFFonGrid();
						driver=Remote.Grid();*/
					
					 
					 driver = new ChromeDriver();
					 
					  driver.get("https://interrepotest.erepository.in/");
					
					 //driver.get("https://aws.erepository.in");
					 
					//driver.get("https://mock.erepository.in/");
					 
					//driver.get("https://nerltest.erepository.in/");
					 	 
					 driver.manage().window().maximize();
					 
					 ENWR=new Deposit(driver);		
					 
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 
					 utility = new Utility(driver);
					 			 		
					 
		  }
	
	/*@org.testng.annotations.AfterMethod
	public void AfterMetho`d() throws InterruptedException, MalformedURLException {
		  driver.quit();
	}*/
	
	
	@Test(priority=1,description="To verify Creation Of ENWR With Valid details",dataProvider="wordpressdata")
	public void EWR_creation_Approval(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,int Record_Number) throws InterruptedException, IOException
{
	
		if(Is_Exchange_Deposit=="YES")
		{	
    	utility.Login(WSP_maker, WSP_Password1);       
		
		//logger.info("WSP maker Login Successfully");
		
		ENWR.Navigate_To_DepositPage();
		
		ENWR.EWR_Page_NMCE(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
	   
		//logger.info("EWR Details Saved Successfully");
		
		EDP_No=ENWR.Transaction_Number();
		
		ENWR.Deposit_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		
		//logger.info("Deposit Details Saved Successfully");
			
		utility.pageScrollDown(NERLConstants.ADD_Vehicle_Details); 
		
		ENWR.Vehicle_Deposit_Details(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		   
		//logger.info("Vehicle Details Saved Successfully");
				
		utility.clickOnWebElement(NERLConstants.SUBMIT_EWR_BUTTON, driver);
		
		driver.switchTo().alert().accept();
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Details Submitted Successfully.");
		
		ENWR_Number=ENWR.EWR_Number();
		
		//logger.info(ENWR_Number+" EWR Submited Successfully");
		
		/*//-------Write ENWR Into Benf to Benf Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 1, Record_Number, 6);*/
		
		/*//-------Write ENWR Into Pledge Initiation Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 2, Record_Number, 6);*/
		/*	
		//-------Write ENWR Into Quantity Deduction Sheet-----------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 3, Record_Number, 3);
		
		//-------Write ENWR Into Pledgee Invoke Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 4, Record_Number, 3);
		
	    //-------Write ENWR Into Pledgee Redeem Sheet----------------------
		utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 5, Record_Number, 2);*/
		
		utility.logout();
		
		//Approve by WSP checker
		
		utility.Login(WSP_checker, WSP_Password2);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
        
		ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
		//ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
		
		//Login With Assayer Maker to fill Assaying details
		
		utility.Login(Login_Assayer, Ass_password);
				
		ENWR.Assayer_Mkr(EDP_No);
 		
		ENWR.Assaying_Details_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
	    
		utility.logout();
		
		
		//Assayer Checker Approval
        utility.Login(AssayerChecker,Ass_PassCKR);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);

		ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
		//ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
		
		//Approv by WSP checker final
		
		utility.Login(WSP_checker, WSP_Password2);
		
		utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
		
		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		
		ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
		//ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
		
		utility.logout();
		
		driver.quit();
	}
		else if(Is_Exchange_Deposit=="NO"){
			
			utility.Login(WSP_maker, WSP_Password1);       
			
			//logger.info("WSP maker Login Successfully");
			
			ENWR.Navigate_To_DepositPage();
			
			ENWR.EWR_Page_NonNMCE(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		   
			//logger.info("EWR Details Saved Successfully");
			
			EDP_No=ENWR.Transaction_Number();
			
			ENWR.Deposit_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
			
			//logger.info("Deposit Details Saved Successfully");
				
			utility.pageScrollDown(NERLConstants.ADD_Vehicle_Details); 
			
			ENWR.Vehicle_Deposit_Details(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
			   
			//logger.info("Vehicle Details Saved Successfully");
					
			utility.clickOnWebElement(NERLConstants.SUBMIT_EWR_BUTTON, driver);
			
			driver.switchTo().alert().accept();
		
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			Thread.sleep(3000);
			
			ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Details Submitted Successfully.");
			
		 	ENWR_Number=ENWR.EWR_Number();
			
			//logger.info(ENWR_Number+" EWR Submited Successfully");
			
			/*//-------Write ENWR Into Benf to Benf Sheet----------------------
			utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 1, Record_Number, 6);
			
			//-------Write ENWR Into Pledge Initiation Sheet----------------------
			utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 2, Record_Number, 6);
			
			//-------Write ENWR Into Quantity Deduction Sheet-----------------
			utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 3, Record_Number, 3);
			
			//-------Write ENWR Into Pledgee Invoke Sheet----------------------
			utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 4, Record_Number, 3);
			
		    //-------Write ENWR Into Pledgee Redeem Sheet----------------------
			utility.Write_EWR_No("D:/TestData.xlsx", ENWR_Number, 5, Record_Number, 2);*/
			
			utility.logout();
			
			//Approve by WSP checker
			
			utility.Login(WSP_checker, WSP_Password2);
			
			Thread.sleep(3000);
			
			utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
			
			driver.switchTo().alert().accept();
			
			driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
            
			//ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
			ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
			
			utility.logout();
			
			//Login With Assayer Maker to fill Assaying details
			
			utility.Login(Login_Assayer, Ass_password);
					
			ENWR.Assayer_Mkr(EDP_No);
	 		
			ENWR.Assaying_Details_Page(WHCode, Comm_ID, Pack_Type, Benf_Code, No_Packs, DepositorName, Gross_Quantity, Physical_Quantity, Commodity_Rate, Estimated_deposit, Private_Marks, Lot_Number, Storage_Charges, Handling_Charges, Other_Charges, Advance_Paid, Remaining_Charges, Depositor_Address, VDD_Gross_Qty, VDD_Net_Qty, VDD_Number_of_Packs, Ass_Sampleno, Assayer_Methodology, Actual_Grade, Para_1, Para_2, Para_3, Para_4, WSP_maker, WSP_Password1, WSP_checker, WSP_Password2, Login_Assayer, Ass_password,AssayerChecker,Ass_PassCKR,Para_5,Para_6,Para_7,Para_8,Para_9,Para_10,Para_11,Para_12,Para_13,Para_14,Para_15,Number_Of_Para,Record_Number);
		
			utility.logout();
			
			
			//Assayer Checker Approval
	        utility.Login(AssayerChecker,Ass_PassCKR);
			
			utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
			
			driver.switchTo().alert().accept();
			
			driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);

			//ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
			ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
			
			utility.logout();
					
			//Approv by WSP checker final
			
			utility.Login(WSP_checker, WSP_Password2);
			
			utility.PendingTxn_Approval(EDP_No, NERLConstants.Approve_EWR_Button);
			
			driver.switchTo().alert().accept();
			
			driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
			
			//ENWR.Result_Check1(NERLConstants.Validation_msg, "Error while approval of EWR Transaction. Please contact administrator");
			ENWR.Result_Check1(NERLConstants.Validation_msg, "EWR Transaction Approved Successfully.");
			
			utility.logout();
			//driver.quit();
		}
				
}

	@DataProvider(name="wordpressdata")
	public Object[][] passdata1() throws IOException{
		
		  config=new Exceldataconfig();
		  Object[][] data= config.Excel_Data_Reader(0);  	
		   
		  return data;
		
		}	
}
