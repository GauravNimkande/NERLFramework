package Com.Wordpress.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import NERL.NERLConstants;
import library.Utility;
import withdrawal_pkg.Withdrawal_Cons;
public class Com_page_Invoke {

	public Com_page_Invoke(WebDriver driver){
		this.driver=driver;
	}
	WebDriver driver;
	
	Utility utility = new Utility(driver);
	
	By MenuNavigation=By.xpath("//*[@id='menu-trigger']/div");
	
	By PInavigation=By.xpath("//*[@id='mCSB_1_container']/ul/li[2]/a");
	
	By PledgeInvokeLink=By.xpath("//*[@id='mCSB_1_container']/ul/li[2]/ul/li[2]/a");

	By LoanAccNumberButton=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[1]/div[3]/button");
	
	By LoanAccNoDetails=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By LoanAccNO=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By LoanAccDetailslist=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/input");
		
	By LoanAccDetailsFirstR=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Benf_ID=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[5]/div[2]/input");
	
	By Fetch_button=By.xpath("//*[@id='fetch']");
	
	By Enter_EWRno_Searchbox=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");

	By Select_CheckBox=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div");
	
	By Select_CheckBox2=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div");
	
	
	By Select_Button=By.xpath("//*[@id='content']/div/data/div/div[4]/div/div[2]/div/div[2]/div[2]/div/button");
	
	By InvokeQt=By.xpath("/html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
	     
	By Invoke_Units=By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input");
	                          //html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div
	//public static final String Invoke_Units="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input";
	 
	By SAVE_Button=By.xpath("//button[@data-ng-click='saveData()']");
	
	By SUBMIT_Button=By.xpath("//button[@data-ng-click='submitData()']");
	
	public void FetchPIdetails(String Loan_account_no,String EPG_NOO,String Beneficiary_Id,String EWR_NO, String Invoke_unit_no,String pledgee_M, String pledgee_pw,String Pledgee_checker,String Pledgee1_pw,int R_No) throws InterruptedException{
	
	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	
	utility.clickOnWebElement1(MenuNavigation, driver);
	
	utility.clickOnWebElement1(PInavigation, driver);
	
	utility.clickOnWebElement1(PledgeInvokeLink, driver);
	
	utility.clickOnWebElement1(MenuNavigation, driver);
	
	utility.clickOnWebElement1(LoanAccNumberButton, driver);
	
	utility.clickOnWebElement1(LoanAccNoDetails, driver);
	
	driver.findElement(LoanAccNoDetails).sendKeys(Loan_account_no);
	
	driver.findElement(LoanAccDetailslist).sendKeys(EPG_NOO);
	
	Thread.sleep(2000);
	
	utility.clickOnWebElement1(LoanAccDetailsFirstR, driver);
	
	Thread.sleep(2000);
	
	driver.findElement(Benf_ID).sendKeys(Beneficiary_Id);
	
	Thread.sleep(2000);
	
	utility.clickOnWebElement1(Fetch_button, driver);
	
	Thread.sleep(2000);   		   		
    
	utility.XY_PageScrollDown1(driver); 
    
    driver.findElement(Enter_EWRno_Searchbox).sendKeys(EWR_NO);
    
    utility.clickOnWebElement1(Select_CheckBox, driver);
    
    Thread.sleep(2000);   
    
    //utility.XY_PageScrollDown1(driver); 

	utility.clickOnWebElement1(Select_Button, driver);
	
	Result_Check1(NERLConstants.Validation_msg, "Addition of EWR Successfully.");
	
		
	utility.XY_PageScrollDown1(driver); 
		
	utility.DoubleClick1(NERLConstants.Invoke_Qntt, driver);
	
	driver.findElement(Invoke_Units).sendKeys(Invoke_unit_no);
	
	driver.findElement(Invoke_Units).sendKeys(Keys.TAB);
	   
	utility.clickOnWebElement1(SAVE_Button, driver);
   
	Result_Check1(NERLConstants.Validation_msg, "EPC saved Successfully.");
	
	utility.clickOnWebElement1(SUBMIT_Button, driver);
	
	
	
	}
	
public void Result_Check1(String XPATH,String Expected_Result) throws InterruptedException{
		
		String Actual_Validation=driver.findElement(By.xpath(XPATH)).getText();
		
		assertEquals(Actual_Validation, Expected_Result);
		
		Thread.sleep(2000);
	}
}
