package Com.Wordpress.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import NERL.NERLConstants;
import library.Utility;
import withdrawal_pkg.Withdrawal_Cons;

public class PledgeRedeem {
	
	public PledgeRedeem(WebDriver driver){
		this.driver=driver;
	}
	WebDriver driver;
	
	Utility utility = new Utility(driver);
	
	By Loan_account_no_toggle=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[1]/div[3]/button");
	
	By Loan_acc_details=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Loan_Acc_EPGNo=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/input");
	
	By Select_First_AccRecord=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Fetch_Button=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[1]");
	                        
	By Enter_EWRNo=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Select_EWR=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div");
	
	By Select_EWR_Button=By.xpath("//*[@id='content']/div/data/div/div[4]/div/div[2]/div/div[2]/div[2]/div/button");

	By Redeem_Units=By.xpath("html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input");
	                          
	By Save_Button=By.xpath("//button[@data-ng-click='saveData()']");                
	
	By Submit_Button=By.xpath("//button[@data-ng-click='submitData()']");
	
	public void FetchPRdetails(String Loan_account_no,String EPG_NO,String EWR_NO, String Redeem_qty,String RP_maker,String RP_PW,String User_role,String pledgee_M, String pledgee_pw,int R_No) throws InterruptedException{
	
		utility.clickOnWebElement1(Loan_account_no_toggle, driver);
		
		driver.findElement(Loan_acc_details).sendKeys(Loan_account_no);
		
		Thread.sleep(2000);
		
	    driver.findElement(Loan_Acc_EPGNo).sendKeys(EPG_NO);
	    
	    Thread.sleep(2000);
			
		utility.clickOnWebElement1(Select_First_AccRecord, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Fetch_Button, driver);
		
		utility.XY_PageScrollDown1(driver); 
		
		Thread.sleep(2000);
		
		driver.findElement(Enter_EWRNo).sendKeys(EWR_NO);
		
		utility.clickOnWebElement1(Select_EWR, driver);
		
		utility.clickOnWebElement1(Select_EWR_Button, driver);
		
		Thread.sleep(2000);
		
		utility.DoubleClick1(NERLConstants.Redeem_Qnt, driver);
		
		driver.findElement(Redeem_Units).sendKeys(Redeem_qty);
		
		driver.findElement(Redeem_Units).sendKeys(Keys.TAB);
		
		utility.clickOnWebElement1(Save_Button, driver);
		
		Result_Check1(NERLConstants.Validation_msg, "Saved Successfully.");
		
		utility.clickOnWebElement1(Submit_Button, driver);
				
	}
	
public void Result_Check1(String XPATH,String Expected_Result) throws InterruptedException{
		
		String Actual_Validation=driver.findElement(By.xpath(XPATH)).getText();
		
		assertEquals(Actual_Validation, Expected_Result);
		
		Thread.sleep(2000);
	}
	
}
