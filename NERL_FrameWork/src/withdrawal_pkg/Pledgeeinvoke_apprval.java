package withdrawal_pkg;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/*import org.slf4j.////////logger;
import org.slf4j.////////loggerFactory;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Wordpress.pages.Com_page_Invoke;
import Com.Wordpress.pages.Deposit;
import NERL.NERLConstants;
import NERL.TestFFonGrid;
import library.Exceldataconfig;
import library.Utility;
public class Pledgeeinvoke_apprval {
	
	public String part2;
	public String part4;
	public String part3;
	public String part5;
	private static WebDriver driver;
	private Utility utility;
	public Exceldataconfig config;
	public static Com_page_Invoke PI;
	public String EPC_No;
	private static Deposit ENWR;
	
	//private final static //logger //logger = //loggerFactory.get//logger(Pledgee_invocation_main.class);
@BeforeMethod

public void Befour() throws InterruptedException, MalformedURLException 
{
	System.out.println("Pledgee invoke  Test Case Execution Started");
	
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
    Thread.sleep(2000);

  /*TestFFonGrid Remote=new TestFFonGrid();
	driver=Remote.Grid();*/
	
	driver = new ChromeDriver();
	
	//logger.info("New Driver Initiated");
	
	//driver.get("https://interrepotest.erepository.in/");
	
	 driver.get("https://nerltest.erepository.in/");
	
	//driver.get("https://test.erepository.in");
	
	 //logger.info("Browser open Succesfully and Url is open");
    driver.manage().window().maximize();
    
    PI=new Com_page_Invoke(driver);
    ENWR=new Deposit(driver);
    utility=new Utility(driver);

}
//###################################### TESTCASE 1 Submit by Maker ########################
 
  @Test 
	(priority=5,description ="To verify initation/submit for pledgee invoke transaction by Pledgee Maker",dataProvider="Withdrawal")
	
	public void Pledgee_Invoke(String Loan_account_no,String EPG_NO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
	  
	utility.Login(pledgee_M, pledgee_pw); 
	  
    PI.FetchPIdetails(Loan_account_no, EPG_NO, Beneficiary_Id, EWR_NO, Invoke_unit_no, pledgee_M, pledgee_pw, Pledgee_checker, Pledgee1_pw, R_No); 
	   
    EPC_No=ENWR.Transaction_Number3();
    
    utility.logout();
   
    utility.Login(Pledgee_checker, Pledgee1_pw);
    
    utility.PendingTxn_Approval(EPC_No,NERLConstants.Approve_Button_pledgee3);
    
    PI.Result_Check1(NERLConstants.Validation_msg, "Pledge Invoke approved Successfully.");
  
    utility.logout();
    
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