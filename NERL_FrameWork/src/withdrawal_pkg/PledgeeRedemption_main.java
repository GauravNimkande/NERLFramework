package withdrawal_pkg;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import library.Exceldataconfig;
import library.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Wordpress.pages.Deposit;
import Com.Wordpress.pages.PledgeRedeem;
import NERL.NERLConstants;
import NERL.TestFFonGrid;

public class PledgeeRedemption_main {
	public String part2;
	public String part4;
	public String part3;
	public String part5;  
	private static WebDriver driver;
	private Utility utility;
	private static Deposit ENWR;
	public Exceldataconfig config;
	private final static Logger logger = LoggerFactory.getLogger(PledgeeRedemption_main.class);
	public String EPR_No;
	
	public static PledgeRedeem PR;
	
	@BeforeMethod
	public void Befour() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Withdrawal Test Case Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    Thread.sleep(2000);

	   /* TestFFonGrid Remote=new TestFFonGrid();
		driver=Remote.Grid();*/
	   
	    
		driver = new ChromeDriver();
		
		 driver.get("https://nerltest.erepository.in/");
	
		 //driver.get("https://aws.erepository.in/");
		
	     //driver.get("https://interrepotest.erepository.in/");
	
	    // driver.get("https://test.erepository.in");
	 	
		 logger.info("Web application launched");
		
	    driver.manage().window().maximize();
	    
	    PR=new PledgeRedeem(driver);
	    
	    ENWR=new Deposit(driver);
	    
	    utility=new Utility(driver);
	}
	  //################ Test case 1####################################
	  @Test 
		(priority=4,description ="To verify initation/submit for pledgee Redeem transaction by Pledgee Maker",dataProvider="Withdrawal")
		
		public void Pledgee_creation1(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,
				String User_role,String pledgee_M, String pledgee_pw,int R_No) throws InterruptedException{
	     
	     if (User_role.equalsIgnoreCase("RP"))
	       {
	    	System.out.println("User Role is RP");
	       
	    	utility.RP_Maker(RP_maker, RP_PW);
	        
	    	logger.info("Click action performed on login key RP Maker");
	       }	
	    else
	       {
	    	System.out.println("User Role is Pledgee");
	    	
	    	utility.Pledgee_Maker(RP_maker, RP_PW);
	    	
	    	logger.info("Click action performed on login key Pledgee Checker");
	       }
	    	 	   
	     PR.FetchPRdetails(Loan_account_no,EPG_NO,EWR_NO,Redeem_qty,RP_maker,RP_PW,User_role,pledgee_M,pledgee_pw,R_No);
	     
	     PR.Result_Check1(NERLConstants.Validation_msg, "Pledge Redeem submitted Successfully");
	    
	     EPR_No=ENWR.Transaction_Number3();
	     
	     utility.logout();
	    
	     utility.Login(pledgee_M, pledgee_pw);
	     
	     utility.PendingTxn_Approval(EPR_No
	    		 ,NERLConstants.Approve_Button_pledgee2);
	     
	     PR.Result_Check1(NERLConstants.Validation_msg, "Pledge Redeem approved Successfully.");
	   
	     utility.logout();
	     
	     driver.close();
	     
	     }
	  
	  
	  @DataProvider(name="Withdrawal")
	  public Object[][] passdata1() throws IOException{
		 
		  config=new Exceldataconfig();
		 
		  Object[][] data= config.Excel_Data_Reader(5);  
	 
		  return data; 
		}
	}

	 