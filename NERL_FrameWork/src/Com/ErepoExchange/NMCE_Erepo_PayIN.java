package Com.ErepoExchange;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Com.Wordpress.pages.Deposit;
import Com.Wordpress.pages.PayINpageElement;import NERL.NERLConstants;
import library.Exceldataconfig;
import library.Utility;
public class NMCE_Erepo_PayIN {
	public  WebDriver driver;
	private static Deposit ENWR;
	
	public PayINpageElement BTP;
	public Utility utility;
	public Exceldataconfig config;
	public String EBP_No;
	
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		
	 
		
					 System.out.println("Test Case Execution Started");
					 
					 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
					 
					 Thread.sleep(2000);
				 
					/*TestFFonGrid Remote=new TestFFonGrid();
						driver=Remote.Grid();*/
								 
					  driver = new ChromeDriver();
					 
					 driver.get("https://interrepotest.erepository.in/");
					 
					//driver.get("https://nerltest.erepository.in/");
					 
					//driver.get("https://nerltest.erepository.in/"); 
					 
					 driver.manage().window().maximize();
					 
					 BTP=new PayINpageElement(driver);
					 								 
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 
					 utility = new Utility(driver);
					 
					 
					 			 							 
		  }
	
	@Test(dataProvider="Exchange_Pay_In")
	public void Test(String Exchange_Code,String Contract_Code,String CM_ID,String TM_ID,String TAC_ID,String BENF_ID,String Client_Code
			,String Settlement_Number,String Number_Of_EnWR,String ENWR1,String ENWR2,String ENWR3,String ENWR4,String ENWR5,String ENWR6,String ENWR7,
			String ENWR8,String ENWR9,String ENWR10,String ENWR11,String ENWR12,String ENWR13,String ENWR14,String ENWR15,String input_Phy_Qty,int Record_No) throws InterruptedException{
			
		utility.Login("VIKASP", "Dell@1234");
		
		BTP.Navigate_To_BenfToPool();
		
		BTP.BenfToPoolDetails(Exchange_Code, Contract_Code,CM_ID,TM_ID,TAC_ID,BENF_ID,Client_Code,Settlement_Number,Number_Of_EnWR,ENWR1,ENWR2,ENWR3,ENWR4,ENWR5
				,ENWR6,	ENWR7,ENWR8,ENWR9,ENWR10,ENWR11,ENWR12,ENWR13,ENWR14,ENWR15,input_Phy_Qty);
			
		BTP.Result_Check1(NERLConstants.Validation_msg, "Beneficiary to Pool transaction Saved Successfully");
		
		utility.clickOnWebElement(NERLConstants.SUBMIT_button, driver);
		
		BTP.Result_Check1(NERLConstants.Validation_msg, "Beneficiary to Pool transaction Submitted Successfully");
		
		Thread.sleep(3000);
		
		EBP_No=BTP.Transaction_Number4();
		
		utility.logout();
		
		utility.Login("RAJIVR", "Dell@1234");
		
		//utility.PendingTxn_Rejection(EBP_No, NERLConstants.RejectButton);
		
		utility.PendingTxn_Rejection(EBP_No, NERLConstants.DiscardButton);
		
		//utility.PendingTxn_Approval(EBP_No, NERLConstants.ApproveButton);
		
		//BTP.Result_Check1(NERLConstants.Validation_msg, "Beneficiary to Pool transaction Submitted Successfully");
		
		utility.logout();
		
		driver.quit();
		
	}
	
	
	
	@DataProvider(name="Exchange_Pay_In")
	public Object[][] passdata1() throws IOException{
		
		  config=new Exceldataconfig();
	
		  Object[][] data= config.Excel_ExchangeData_Reader(1);  	
		   
		  return data;		
		
   }
}
