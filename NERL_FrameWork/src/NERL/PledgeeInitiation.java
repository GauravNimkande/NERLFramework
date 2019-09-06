package NERL;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.slf4j.//logger;
//import org.slf4j.//loggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import withdrawal_pkg.PledgeeRedemption_main;
import library.Exceldataconfig;
import library.Utility;

public class PledgeeInitiation {
	
	private static WebDriver driver;
	private Utility utility;
	public Exceldataconfig config;
    public String EPGno;
   // private final static //logger //logger = //loggerFactory.get//logger(PledgeeRedemption_main.class);
	@BeforeMethod		
	public void Befour() throws InterruptedException {
		System.out.println("Pledge Initiation Test Case Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		Thread.sleep(2000);
		
		/*TestFFonGrid Remote=new TestFFonGrid();
		driver=Remote.Grid();
	   */
		
		  driver = new ChromeDriver();
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	     //driver.get("https://interrepotest.erepository.in/");
		  driver.get("https://nerltest.erepository.in/");
		  //logger.info("Web application launched");
     	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	  //logger.info("Implicit wait applied on the driver for 20 seconds");
		
	      driver.manage().window().maximize();
		
		 utility = new Utility(driver);

	}
	
	@AfterMethod
	public void After() {
		
		System.out.println("Pledge Initiation Test Case Execution Completed");
		driver.close();
	
	}
 
	
	//++++++++++++++++++++++++EOT Initiation/Submit by RP Maker++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test(priority=3,description="To verify if Rp maker having provision to Initiate Pledgee Initiation",dataProvider="PledgeeInintiation")

	public void Pledgee_Initiation_Submit(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws IOException {
		try {
			
		utility.Login(RPMaker,RPMaker_password);
	    //logger.info("RP MAKER Login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on Menu Icon
		driver.findElement(By.xpath(NERLConstants.Menu_Icon)).click();
		
			Thread.sleep(2000);
		
		// Click on Pldgee Menu Dropdown
		driver.findElement(By.xpath(NERLConstants.Pledge_Menu)).click();
		driver.findElement(By.xpath(NERLConstants.Pledge_Initiation)).click();
		
		// Click on Back Button
		Thread.sleep(2000);
       driver.findElement(By.xpath(NERLConstants.Back_Button)).click();
       //logger.info("PledgeeInition Window Open");
       //Warehouse button
       driver.findElement(By.xpath(NERLConstants.Warehouse)).click();
       
       Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.Warehouse_code)).sendKeys(Ware_Code);
	   
	   //First record from dynamic table
	   driver.findElement(By.xpath(NERLConstants.Warehouse_code_firstrecord)).click();			
	   Thread.sleep(2000);
	   
	   //Commodity button
	   driver.findElement(By.xpath(NERLConstants.Commodity)).click();
	   driver.findElement(By.xpath(NERLConstants.Commodity_Code)).sendKeys(Comm_Id);
	   //logger.info("Commdity Code Popup open");
	   //EWR Type
	   driver.findElement(By.xpath(NERLConstants.EWR_type2)).sendKeys("Y");
	   Thread.sleep(1000);
	   
	   //Select First Record
	   driver.findElement(By.xpath(NERLConstants.Commodity_code_firstrecord)).click();
	   Thread.sleep(2000);
	   
       //Beneficiary Button
	   driver.findElement(By.xpath(NERLConstants.BenficiaryButton)).click();
	   //logger.info("Click on Benficiary button");
	   //Enter Beneficiary ID 
	   driver.findElement(By.xpath(NERLConstants.BenficiaryID)).sendKeys(Benf_Id);
	   //Select first record
	   driver.findElement(By.xpath(NERLConstants.Benefitiary_ID_FirstRecord)).click();
	   Thread.sleep(1000);
	   
	   //Pledgee
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Button)).click();
	   //logger.info("Click on Pledgee button");
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Send)).sendKeys(Pledgee);
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Select_FirstRecord)).click();
	   Thread.sleep(2000);
	   
	   //IFSC code
	   driver.findElement(By.xpath(NERLConstants.IFSC)).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(NERLConstants.IFCSEnter)).sendKeys(IFSC);
	   //logger.info("Print IFSC");
	   driver.findElement(By.xpath(NERLConstants.AgreementType)).sendKeys("TRIPARTITE");
	   //logger.info("Print TRIPARTITE");
	   driver.findElement(By.xpath(NERLConstants.IFSC_SelectFirstrecord)).click();
	   
	   Thread.sleep(2000);
	   //Is block for Auction "Yes"
	   driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[6]/div[5]/div/label[1]/input")).click();
	  //Is block for Auction "No"
	   //driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[6]/div[5]/div/label[2]/input")).click();
	   
	   //Select Repayment Date
	   driver.findElement(By.xpath(NERLConstants.Repayment_Date)).click();
	   driver.findElement(By.xpath(NERLConstants.Repayment_Date_next)).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.Repayment_date_1m)).click();
	   
	   //Account Number
	   driver.findElement(By.xpath(NERLConstants.Account_Number)).sendKeys(ACC_no);
	   //logger.info("Print ACC_NO");
	   Thread.sleep(2000);
	   
	  // utility.pageScrollDown(NERLConstants.Fetch_Button);
	   //Click Fetch button
	   driver.findElement(By.xpath(NERLConstants.Fatch_button2)).click();
	   //logger.info("Click on Fetch button");
	   utility.XY_PageScrollDown();
	   Thread.sleep(2000);
	   
	   //Send EWR number
	   driver.findElement(By.xpath(NERLConstants.EWR_ID)).sendKeys(ENWR_no);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.EWR_ID_FirstRecord)).click();
	   //Click on Save button
	   driver.findElement(By.xpath(NERLConstants.Save_Button_Pledge)).click();
	   //logger.info("Click on save button");
	   Thread.sleep(2000);
	   
	   //Pledgee Qnt double click send.
	   utility.DoubleClick(NERLConstants.pledgee_qnt_doubleclick);
	   driver.findElement(By.xpath(NERLConstants.pledgee_qnt_send)).sendKeys(Pledge_Qnt);
	   Thread.sleep(2000);
	   
	   //Save button
	   driver.findElement(By.xpath(NERLConstants.Save_Button_Selected_EWR)).click();
	   Thread.sleep(2000);
	   utility.XY_PageScrollUp();
	   Thread.sleep(2000);
	   //Submit button
	   driver.findElement(By.xpath(NERLConstants.Submit_Button_pledgee)).click();
	   //logger.info("Click on Submit button");
	   Thread.sleep(3000);
	   
	   utility.XY_PageScrollUp();
	   utility.CaptureScreenshot(driver,"Pledge Initiation Submit", R_No);
	   
	   String Actual_Validation=driver.findElement(By.xpath(NERLConstants.Actual_Validatio)).getText();
	   System.out.println("RP Maker : "+Actual_Validation);
	   
	    String EPGno1=driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(EPGno1);
		String string = EPGno1;
		String[] parts = string.split(":-      ");
		this.EPGno = parts[1];
		System.out.println("EPG number is : "+EPGno);
		
		utility.Write_EWR_No("D:/TestData.xlsx", EPGno, 4, R_No, 1);
		
		utility.Write_EWR_No("D:/TestData.xlsx", EPGno, 5, R_No, 1);
	   
		utility.logout();
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=4,description="To verify if Rp Checker having provision to Approve Pledgee Initiation transaction",dataProvider="PledgeeInintiation")
	public void PI_Approve_RPchecker(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		
		utility.Login(RPChecker,RPchecker_password);
		//logger.info("RP Checker login- Approve");
		   // Click on pending txn button
	  		utility.PendingTxn_Approval(EPGno,NERLConstants.Approve_Button_pledgee);
	  		//logger.info("Click on Approve button");
	   		Thread.sleep(2000);
	  		utility.CaptureScreenshot(driver, "Pledgee Initiation RPChecker Approval",R_No);
	  		utility.logout();
	}
	
	@Test(priority=5,description="To verify if WSP Checker having provision to Approve Pledgee Initiation transaction",dataProvider="PledgeeInintiation")
	public void PI_Approve_WSP(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		utility.Login(WSP_USER_ID,WSP_Password);
		//logger.info("WSP checker login- Approve");
		   // Click on pending txn button
		 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
		 //logger.info("Click on approve button");
	  		Thread.sleep(2000);
	  		String Actual_pledgee_Validation=driver.findElement(By.xpath(NERLConstants.Validation_pledgee_On_Approve)).getText();
	  		System.out.println("WSP Checker : "+Actual_pledgee_Validation);
	  		Assert.assertEquals(Actual_pledgee_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By WSP checker");
	  		
	   		//Thread.sleep(2000);
	  		utility.CaptureScreenshot(driver, "Pledgee Initiation WSPChecker Approval",R_No);
	  		utility.logout();
	}

	@Test(priority=6,description="To verify if Pledgee Maker having provision to Approve Pledgee Initiation transaction",dataProvider="PledgeeInintiation")
	public void PI_Approve_PledgeeM(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		 
		utility.Login(Pledgee_maker,PledgeeM_Pass);
		//logger.info("Pledgee maker login- Approve");
		   // Click on pending txn button
		 
		 driver.findElement(By.xpath(NERLConstants.Pending_txn_navigation)).click();
	   		Thread.sleep(3000);
	   		driver.findElement(By.xpath(NERLConstants.Pending_tcn_navigation2)).click();
	   		System.out.println(EPGno);
	   		Thread.sleep(3000);
	   		//Put EDP number into search box
	   		driver.findElement(By.xpath(NERLConstants.EDP_no_Search_pending_txn)).sendKeys(EPGno);
	   		//logger.info("Print EPG NO");
	   		Thread.sleep(3000);
	   		//Click On EDP No
	   		driver.findElement(By.xpath(NERLConstants.EDP_ni_Click_FirstRecord)).click();
	       Thread.sleep(2000);
		    utility.XY_PageScrollDown();
		   
		    utility.DoubleClick(NERLConstants.Loan_amount_single_click);
		    driver.findElement(By.xpath(NERLConstants.Loan_amount_Send_amount)).sendKeys(Loan_amt);
		    
		    Thread.sleep(2000);
		    utility.DoubleClick(NERLConstants.MV_by_pledgee);
		    driver.findElement(By.xpath(NERLConstants.MV_By_pledgee_Send)).sendKeys(Loan_amt);
		    //logger.info("Print Loan amt");
		    Thread.sleep(2000);

		    utility.XY_PageScrollUp();
		    
	       driver.findElement(By.xpath(NERLConstants.Approve_pledgee_button)).click(); 	
	       //logger.info("Click on Pledgee button - Approved ");
	       Thread.sleep(2000);
	  		String Actual_pledgeeM_Validation=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
	  		System.out.println("Pledgee Maker : "+Actual_pledgeeM_Validation);
	  		Assert.assertEquals(Actual_pledgeeM_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee Maker");
	  		
	   		//Thread.sleep(2000);
	  		utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee Maker Approval",R_No);
	  		utility.logout();
	}	
	
	

	@Test(priority=7,description="To verify if Pledgee Checker having provision to Approve Pledgee Initiation transaction",dataProvider="PledgeeInintiation")
	public void PI_Approve_Pledgee_Checker1(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		 
		utility.Login(Pledgee_checker1,PledgeeC1_pass);
		//logger.info("Pledgee Checker login - Approve");
		   // Click on pending txn button
		 
		 
		 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
		 //logger.info("Approved by Pledgee checker");
	  		Thread.sleep(2000);
	  		String Actual_pledgee_Validation=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
	  		System.out.println("Pledgee Checker1 : "+Actual_pledgee_Validation);
	  		Assert.assertEquals(Actual_pledgee_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee checker1");
	  		
	   		//Thread.sleep(2000);
	  		utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
	  		utility.logout();
	}
	
	@Test(priority=8,description="To verify if Pledgee Verifier having provision to Approve Pledgee Initiation transaction",dataProvider="PledgeeInintiation")
	public void PI_Approve_Pledgee_Verifier(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		
		utility.Login(Pledgee_Checker2,PledgeeC2_pass);
		//logger.info("Pledgee checker login - Approve");
		   // Click on pending txn button
		 
		 
		 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
		 //logger.info("Approve by pledgee checker - EPG NO  ");
	  		Thread.sleep(2000);
	  		String Actual_pledgee_Validation=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
	  		System.out.println("Pledgee Checker1 : "+Actual_pledgee_Validation);
	  		Assert.assertEquals(Actual_pledgee_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee checker1");
	  		
	   		//Thread.sleep(2000);
	  		utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
	  		System.out.println("--------------------Pledgee Initiation COMPLETED Successfully-----------------------");
	  		utility.logout();
	}
	
	
	@Test(priority=9,description="To verify if Rp maker having provision to Discard Pledgee Initiation",dataProvider="PledgeeInintiation")

	public void EPG__Discard_RPmaker(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) {
		try {
			
		utility.Login(RPMaker,RPMaker_password);
		//logger.info("RP Maker login -Discard Pledgee Initiation");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on Menu Icon
		driver.findElement(By.xpath(NERLConstants.Menu_Icon)).click();
		
			Thread.sleep(2000);
		
		// Click on Pldgee Menu Dropdown
		driver.findElement(By.xpath(NERLConstants.Pledge_Menu)).click();
		driver.findElement(By.xpath(NERLConstants.Pledge_Initiation)).click();
		
		// Click on Back Button
		Thread.sleep(2000);
       driver.findElement(By.xpath(NERLConstants.Back_Button)).click();
	   
       //Warehouse button
       driver.findElement(By.xpath(NERLConstants.Warehouse)).click();
       
       Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.Warehouse_code)).sendKeys(Ware_Code);
	   //logger.info("Enter Ware_code");
	   //First record from dynamic table
	   driver.findElement(By.xpath(NERLConstants.Warehouse_code_firstrecord)).click();			
	   Thread.sleep(2000);
	   
	   //Commodity button
	   driver.findElement(By.xpath(NERLConstants.Commodity)).click();
	   driver.findElement(By.xpath(NERLConstants.Commodity_Code)).sendKeys(Comm_Id);
	   //logger.info("");
	   //EWR Type
	   driver.findElement(By.xpath(NERLConstants.EWR_type2)).sendKeys("Y");
	   //logger.info("Select Y");
	   Thread.sleep(1000);
	   
	   //Select First Record
	   driver.findElement(By.xpath(NERLConstants.Commodity_code_firstrecord)).click();
	   Thread.sleep(2000);
	   
       //Beneficiary Button
	   driver.findElement(By.xpath(NERLConstants.BenficiaryButton)).click();
	   //Enter Beneficiary ID 
	   driver.findElement(By.xpath(NERLConstants.BenficiaryID)).sendKeys(Benf_Id);
	   //Select first record
	   driver.findElement(By.xpath(NERLConstants.Benefitiary_ID_FirstRecord)).click();
	   Thread.sleep(1000);
	   
	   //Pledgee
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Button)).click();
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Send)).sendKeys(Pledgee);
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(NERLConstants.Pledgee_Select_FirstRecord)).click();
	   Thread.sleep(2000);
	   
	   //IFSC code
	   driver.findElement(By.xpath(NERLConstants.IFSC)).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(NERLConstants.IFCSEnter)).sendKeys(IFSC);
	   driver.findElement(By.xpath(NERLConstants.AgreementType)).sendKeys("TRIPARTITE");
	   driver.findElement(By.xpath(NERLConstants.IFSC_SelectFirstrecord)).click();
	   
	   Thread.sleep(2000);
	   //Is block for Auction "Yes"
	   driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[6]/div[5]/div/label[1]/input")).click();
	  //Is block for Auction "No"
	   //driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[6]/div[5]/div/label[2]/input")).click();
	   
	   //Select Repayment Date
	   driver.findElement(By.xpath(NERLConstants.Repayment_Date)).click();
	   driver.findElement(By.xpath(NERLConstants.Repayment_Date_next)).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.Repayment_date_1m)).click();
	   
	   //Account Number
	   driver.findElement(By.xpath(NERLConstants.Account_Number)).sendKeys(ACC_no);
	   Thread.sleep(2000);
	   
	  // utility.pageScrollDown(NERLConstants.Fetch_Button);
	   //Click Fetch button
	   driver.findElement(By.xpath(NERLConstants.Fatch_button2)).click();
	   //logger.info("Click on Fetch button");
	   
	   utility.XY_PageScrollDown();
	   Thread.sleep(2000);
	   
	   //Send EWR number
	   driver.findElement(By.xpath(NERLConstants.EWR_ID)).sendKeys(ENWR_no);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(NERLConstants.EWR_ID_FirstRecord)).click();
	   //Click on Save button
	   driver.findElement(By.xpath(NERLConstants.Save_Button_Pledge)).click();
	   //logger.info("Click on save button ");
	   Thread.sleep(2000);
	   
	   //Pledgee Qnt double click send.
	   utility.DoubleClick(NERLConstants.pledgee_qnt_doubleclick);
	   driver.findElement(By.xpath(NERLConstants.pledgee_qnt_send)).sendKeys(Pledge_Qnt);
	   //logger.info("Enter pledgee qty");
	   Thread.sleep(2000);
	   
	   //Save button
	   driver.findElement(By.xpath(NERLConstants.Save_Button_Selected_EWR)).click();
	   //logger.info("Click on save button");
	   Thread.sleep(2000);
	   utility.XY_PageScrollUp();
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//textarea[@placeholder='Remarks']")).sendKeys("Discard Txn");
	   Thread.sleep(3000);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //Discard button
	  driver.findElement(By.xpath(NERLConstants.Pledgee_Discard_RPMak)).click();
	  //logger.info("Click on discard button- Pledge discarded successfully ");
	   Thread.sleep(3000);
	   
	   utility.XY_PageScrollUp();
	   
	   utility.CaptureScreenshot(driver,"Pledge Initiation Discard by RPMaker", R_No);
	   
	   String Actual_Validation=driver.findElement(By.xpath(NERLConstants.Actual_Validatio)).getText();
	   System.out.println("RP Maker : "+Actual_Validation);
	   Assert.assertEquals(Actual_Validation,"Pledge discarded successfully");
	   
	    String EPGno1=driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(EPGno1);
		String string = EPGno1;
		String[] parts = string.split(":-      ");
		this.EPGno = parts[1];
		System.out.println("EPG number is : "+EPGno);
	   
	   utility.logout();
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=10,description="To verify if Rp Checker having provision to Discard EPG txn",dataProvider="PledgeeInintiation")

	public void EPG_Discard_RPchecker(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws IOException {
		try {
			
		
	Pledgee_Initiation_Submit(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
				
	 
			utility.Login(RPChecker,RPchecker_password);
			//logger.info("RP checker Login- Discard EPG txn ");
			   //Click on pending txn button
		  		utility.Checker_Discard(EPGno);
		   		Thread.sleep(3000);
		  		utility.CaptureScreenshot(driver, "EPG Discard RPChecker",R_No);
		  		 Thread.sleep(2000);
		  		String Actual_Discard_Validation=driver.findElement(By.xpath(NERLConstants.Actual_Validatio)).getText();
		 	   System.out.println("RP Maker : "+Actual_Discard_Validation);
		 	   Assert.assertEquals(Actual_Discard_Validation,"Pledge discarded successfully");
		  		
		  		utility.logout();
		
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=11,description="To verify if Rp Checker having provision to Discard EPG txn",dataProvider="PledgeeInintiation")

	public void EPG_Reject_RPchecker(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws IOException {
		try {
			
			Pledgee_Initiation_Submit(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
			
	   
	 
		
	   
	 //----------------------RP checker Rejection---------------------------------
	   
		 utility.Login(RPChecker,RPchecker_password);
		   // Click on pending txn button
	  		utility.PendingTxn_Rejection(EPGno,NERLConstants.Reject_Button_pledge_rpchecker);
	  		Thread.sleep(3000);
	  		utility.logout();
	  	
	  		
	  //----------------------RP Maker Resubmit-------------------------------------	
	  		
	  		utility.Login(RPMaker,RPMaker_password);
			   // Click on pending txn button
		  		utility.Rejected_Submit(EPGno,NERLConstants.ReSubmit_button);
		  		Thread.sleep(3000);
		  		utility.logout();
	  
	  //--------------------RP Checker Approve EPG Txn------------------------------------
		  	
 PI_Approve_RPchecker(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
		  				  		
		  		
		  		/* utility.Login(RPChecker,RPchecker_password);
				   // Click on pending txn button
			  		utility.PendingTxn_Approval(EPGno,NERLConstants.Approve_Button_pledgee);
			   		Thread.sleep(2000);
			  		utility.CaptureScreenshot(driver, "Pledgee Initiation RPChecker Approval",R_No);
			  		utility.logout();*/
	   
	 //---------------------WSP Checker Approve---------------------------------------------------
			  	
 PI_Approve_WSP(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
		
			  		/* utility.Login(WSP_USER_ID,WSP_Password);
					   // Click on pending txn button
					 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
				  		Thread.sleep(2000);
				  		String Actual_pledgee_Validation=driver.findElement(By.xpath(NERLConstants.Validation_pledgee_On_Approve)).getText();
				  		System.out.println("WSP Checker : "+Actual_pledgee_Validation);
				  		Assert.assertEquals(Actual_pledgee_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By WSP checker");
				  		
				   		//Thread.sleep(2000);
				  		utility.CaptureScreenshot(driver, "Pledgee Initiation WSPChecker Approval",R_No);
				  		utility.logout();*/
				  		
	//--------------------Pledgee Maker Approve-------------------------------------------------------
				 
 PI_Approve_PledgeeM(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
 
		
                        /* utility.Login(Pledgee_maker,PledgeeM_Pass);
						   // Click on pending txn button
						 
						 driver.findElement(By.xpath(NERLConstants.Pending_txn_navigation)).click();
					   		Thread.sleep(3000);
					   		driver.findElement(By.xpath(NERLConstants.Pending_tcn_navigation2)).click();
					   		System.out.println(EPGno);
					   		Thread.sleep(3000);
					   		//Put EDP number into search box
					   		driver.findElement(By.xpath(NERLConstants.EDP_no_Search_pending_txn)).sendKeys(EPGno);
					   		Thread.sleep(3000);
					   		//Click On EDP No
					   		driver.findElement(By.xpath(NERLConstants.EDP_ni_Click_FirstRecord)).click();
					       Thread.sleep(2000);
						    utility.XY_PageScrollDown();
						   
						    utility.DoubleClick(NERLConstants.Loan_amount_single_click);
						    driver.findElement(By.xpath(NERLConstants.Loan_amount_Send_amount)).sendKeys(Loan_amt);
						    Thread.sleep(2000);
						    utility.DoubleClick(NERLConstants.MV_by_pledgee);
						    driver.findElement(By.xpath(NERLConstants.MV_By_pledgee_Send)).sendKeys(Loan_amt);
						   
						    Thread.sleep(2000);

						    utility.XY_PageScrollUp();
						    
					       driver.findElement(By.xpath(NERLConstants.Approve_pledgee_button)).click(); 	
					       utility.XY_PageScrollUp();
					       Thread.sleep(2000);
					  		
					       String Actual_pledgeeM_Validation=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
					  		System.out.println("Pledgee Maker : "+Actual_pledgeeM_Validation);
					  		
					  		Assert.assertEquals(Actual_pledgeeM_Validation, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee Maker");
					  		
					   		Thread.sleep(2000);
					  		utility.CaptureScreenshot(driver, "Rejecterd EPGion Pledgee Maker Approval",R_No);
					  		utility.logout();
*/					  		
			//--------------------Reject From Pledgee Checker-	-----------------------------------------------------		  		
					  		
					  		utility.Login(Pledgee_checker1,PledgeeC1_pass);
							   // Click on pending txn button
						  		utility.PendingTxn_Rejection(EPGno,NERLConstants.Reject_Button_pledge_rpchecker);
						  		Thread.sleep(3000);
						  		utility.logout();
						  	  		
			//--------------------Approve From Pledgee Maker------------------------------------------------------			  		
						
						  		utility.Login(Pledgee_maker,PledgeeM_Pass);
								   // Click on pending txn button
						  		utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);	
						  		String Actual_pledgee_Validation1=driver.findElement(By.xpath(NERLConstants.Validation_pledgee_On_Approve)).getText();
						  		System.out.println("WSP Checker : "+Actual_pledgee_Validation1);
						  		Assert.assertEquals(Actual_pledgee_Validation1, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee maker");
						  		
						  		
							  		Thread.sleep(3000);
							  		utility.logout();
							  		
			//------------------------Approve from Pledgee Checker1------------------------------------------------------------------
							  		
							  		utility.Login(Pledgee_checker1,PledgeeC1_pass);
									   // Click on pending txn button
									 
									 
									 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
								  		Thread.sleep(2000);
								  		String Actual_pledgee_Validation2=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
								  		System.out.println("Pledgee Checker1 : "+Actual_pledgee_Validation2);
								  		Assert.assertEquals(Actual_pledgee_Validation2, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee checker1");
								  		
								   		//Thread.sleep(2000);
								  		utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
								  		utility.logout();
			
		  //------------------------Approve from Pledgee Verifier------------------------------------------------------------------				  		
	PI_Approve_Pledgee_Verifier(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker,RPMaker_password,RPChecker,RPchecker_password,WSP_USER_ID,WSP_Password,Pledgee_maker,PledgeeM_Pass,Pledgee_checker1,PledgeeC1_pass,Pledgee_Checker2,PledgeeC2_pass,Loan_amt,R_No);
								  									  		
								  		 /*utility.Login(Pledgee_Checker2,PledgeeC2_pass);
										   // Click on pending txn button
										 
										 
										 utility.PendingTxn_Approval(EPGno, NERLConstants.Approve_pledgee_Wsp);
									  		Thread.sleep(2000);
									  		String Actual_pledgee_Validation3=driver.findElement(By.cssSelector(NERLConstants.Approve_By_Pledgee_validation)).getText();
									  		System.out.println("Pledgee Checker1 : "+Actual_pledgee_Validation3);
									  		Assert.assertEquals(Actual_pledgee_Validation3, "Pledge approved successfully", "Error While Approve Pledgee Initiation By Pledgee checker1");
									  		
									   		//Thread.sleep(2000);
									  		utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
									  		System.out.println("--------------------Pledgee Initiation COMPLETED Successfully-----------------------");
									  		utility.logout();		  		
								  		*/
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@DataProvider(name="PledgeeInintiation")
	public Object[][] Pledgee_passdata() throws IOException{
		 config=new Exceldataconfig();
		  Object[][] data= config.Excel_Data_Reader(2);  
		  return data;
	}
}
