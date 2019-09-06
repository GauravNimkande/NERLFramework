package NERL;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.slf4j.//logger;
//import org.slf4j.//loggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Wordpress.pages.Deposit;
import Com.Wordpress.pages.PledgeInitiation;
import library.Exceldataconfig;
import library.Utility;
import withdrawal_pkg.PledgeeRedemption_main;

public class Pledgee_Initiation_Main {
	
	public WebDriver driver;
	public Utility utility;
	public Exceldataconfig config;
	private static Deposit ENWR;
    public String EPGno;
    public String EPG_No;
    
    
    //public PledgeeInitiation PI=new PledgeeInitiation();
    private EWR_With_Deposite EWR=new EWR_With_Deposite();
    
    //private final static //logger //logger = //loggerFactory.get//logger(PledgeeRedemption_main.class);
    
    private static PledgeInitiation PI;
    
	@BeforeMethod		
	public void Befour() throws InterruptedException, MalformedURLException {
		
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		/*TestFFonGrid Remote=new TestFFonGrid();
		driver=Remote.Grid();*/
		
		
		 driver = new ChromeDriver();
		
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	     
	     
	      // driver.get("https://aws.erepository.in/");
	     
	    //  driver.get("https://interrepotest.erepository.in/");
		    
	        driver.get("https://nerltest.erepository.in/");
	
	    // driver.get("https://awsuat.erepository.in/");
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	     driver.manage().window().maximize();
	     
	     ENWR=new Deposit(driver);
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     PI=new PledgeInitiation(driver);
	  	
		 utility = new Utility(driver);
	}
		
	//++++++++++++++++++++++++EPG Initiation/Submit by RP Maker++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test(priority=3,description="To verify if Rp maker having provision to Initiate Pledgee Initiation",dataProvider="PledgeeInintiation")

	public void Pledgee_Initiation_Submit(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws IOException, InterruptedException {
		
		 utility.Login(RPMaker,RPMaker_password);
		
	     //logger.info("RP MAKER Login Successfully");
		
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	     PI.Nevigate_Pledge_Initiatio();
	    
	     PI.FetchPIdetails(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker, RPMaker_password, RPChecker, RPchecker_password, WSP_USER_ID, WSP_Password, Pledgee_maker, PledgeeM_Pass, Pledgee_checker1, PledgeeC1_pass, Pledgee_Checker2, PledgeeC2_pass, Loan_amt, R_No);
	
	     PI.Result_Check1(NERLConstants.Validation_msg, "Pledge initiation submitted successfully");
		
	     Thread.sleep(2000);
	     
	     EPG_No=ENWR.Transaction_Number2();
	     
	     utility.Write_EWR_No("D:/TestData.xlsx", EPG_No, 4, R_No, 1);
			
		 utility.Write_EWR_No("D:/TestData.xlsx", EPG_No, 5, R_No, 1);
		
		 Thread.sleep(2000);
		 
		 utility.logout();
	     
		 //RP Checker Approval
		 utility.Login(RPChecker,RPchecker_password);
		
		 utility.PendingTxn_Approval(EPG_No,NERLConstants.Approve_pledgee_RPmak);
		 
		 Thread.sleep(2000);
		 
	  	 utility.logout();
		 
	  	 Thread.sleep(2000);
	  	 
	  	 //WSP Checker Approval
	  	 utility.Login(WSP_USER_ID,WSP_Password);
	  	 
		 utility.PendingTxn_Approval(EPG_No, NERLConstants.Approve_pledgee_Wsp);
		
		 utility.XY_PageScrollUp1(driver);
		 
	   	 Thread.sleep(2000);
	  		
	   	 PI.Result_Check1(NERLConstants.Validation_msg, "Pledge approved successfully");  	 
	   	 
	   	 utility.logout();
	   	 
	   	 //Thread.sleep(2000);
	   	 
	   	 //Pledgee Maker Approval
	   	 utility.Login(Pledgee_maker,PledgeeM_Pass);
	   	 
	   	 PI.PledgeePIdetails(Ware_Code,Comm_Id,Benf_Id,Pledgee,IFSC,ACC_no,ENWR_no,Pledge_Qnt,RPMaker, RPMaker_password, RPChecker, RPchecker_password, WSP_USER_ID, WSP_Password, Pledgee_maker, PledgeeM_Pass, Pledgee_checker1, PledgeeC1_pass, Pledgee_Checker2, PledgeeC2_pass, Loan_amt, R_No,EPG_No);

	   	 utility.XY_PageScrollUp1(driver);
	   	 
	   	 Thread.sleep(2000);
	   	 
	     PI.Result_Check1(NERLConstants.Validation_msg, "Pledge approved successfully");
	      
	     utility.logout();
	     
	     
	     Thread.sleep(2000);
	     
	     //Pledge Checker Login
	     utility.Login(Pledgee_checker1,PledgeeC1_pass);
		 		 
		 utility.PendingTxn_Approval(EPG_No, NERLConstants.Approve_pledgee_RPmak);
		 
		 utility.XY_PageScrollUp1(driver);
			 
		 PI.Result_Check1(NERLConstants.Validation_msg, "Pledge approved successfully");
		  		
		 //utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
		 
		 utility.logout();
		 
		 Thread.sleep(2000);
		 
		 //Pledge Verifier Approval
		 utility.Login(Pledgee_Checker2,PledgeeC2_pass);
		 
		 utility.PendingTxn_Approval(EPG_No, NERLConstants.Approve_pledgee_Wsp);
		 
		 utility.XY_PageScrollUp1(driver);
		 
		 PI.Result_Check1(NERLConstants.Validation_msg, "Pledge approved successfully");
		  		
		 //utility.CaptureScreenshot(driver, "Pledgee Initiation Pledgee checker1 Approval",R_No);
		  
		 utility.logout();
		 
		 driver.close();
			
		}	
		
	
	@DataProvider(name="PledgeeInintiation")
	public Object[][] Pledgee_passdata() throws IOException{
		
		  config=new Exceldataconfig();
		  Object[][] data= config.Excel_Data_Reader(2);  
		  return data;

	}
}
