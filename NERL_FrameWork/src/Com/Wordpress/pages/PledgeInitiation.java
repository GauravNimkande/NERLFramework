package Com.Wordpress.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import NERL.NERLConstants;
import NERL.Pledgee_Initiation_Main;
import library.Utility;

public class PledgeInitiation {
	
	
	public PledgeInitiation(WebDriver driver){
		this.driver=driver;
	}
	WebDriver driver;
	
	Utility utility = new Utility(driver);
	
	By Menu_trigger=By.xpath("//*[@id='menu-trigger']/div");
	
	/*By Pledge_Menu=By.xpath("//*[@id='mCSB_1_container']/ul/li[7]/a");
	                         
	By Pledge_Initiation=By.xpath("//*[@id='mCSB_1_container']/ul/li[7]/ul/li[1]/a");*/
	
	By Pledge_Menu=By.xpath("//*[@id='mCSB_1_container']/ul/li[7]/a");
	                       
	//By Pledge_Menu=By.xpath("//*[@id='mCSB_1_container']/ul/li[7]/a");
    
	By Pledge_Initiation=By.xpath("//*[@id='mCSB_1_container']/ul/li[7]/ul/li[1]/a");
	//By Pledge_Initiation=By.xpath("//*[@id='mCSB_1_container']/ul/li[8]/ul/li[1]/a");
	                             
	//*[@id="mCSB_1_container"]/ul/li[7]/ul/li[1]/a
	By Back_Button=By.xpath("//*[@id='menu-trigger']/div");
	
	By Warehouse=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[2]/div[3]/button");
	//*[@id="content"]/div/data/div/div[3]/div/div[2]/div[3]/button          
	
	By Warehouse_Code=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Warehouse_Code_FirstReord=By.xpath("html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Commodity_button=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[2]/div[6]/button");
	//*[@id="content"]/div/data/div/div[3]/div/div[2]/div[6]/button
	                              
	                             	  
	By Commodity_Code=By.xpath("/html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	//By Commodity_Code=By.xpath("//input[@ng-model='colFilter.term']");
	
	By EWR_Type=By.xpath("html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[4]/div[2]/div[3]/div/div/input");
	
	By Commodity_Code_FirstRecord=By.xpath("html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Benf_Button=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[4]/div[6]/button");
	//*[@id="content"]/div/data/div/div[3]/div/div[4]/div[6]/button
	By Benf_ID=By.xpath("/html/body/section/section/div/data/div/div[9]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	                     
	By Benf_ID_First=By.xpath("html/body/section/section/div/data/div/div[9]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Pledge_Button=By.xpath(".//*[@id='content']/div/data/div/div[3]/div/div[6]/div[3]/button");
	                            //*[@id="content"]/div/data/div/div[3]/div/div[6]/div[3]/button
	By Pledge_Send=By.xpath("html/body/section/section/div/data/div/div[7]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Pledge_Select_FirstRecord=By.xpath("html/body/section/section/div/data/div/div[7]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By IFSC_Buttone=By.xpath(".//*[@id='content']/div/data/div/div[3]/div/div[6]/div[6]/button");
	//*[@id="content"]/div/data/div/div[3]/div/div[6]/div[6]/button
	By IFSC_textbox_Send=By.xpath("html/body/section/section/div/data/div/div[8]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Agrimenttype=By.xpath("html/body/section/section/div/data/div/div[8]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[4]/div[2]/div[3]/div/div/input");
	
	By IFSC_SelectFirstrecord=By.xpath("html/body/section/section/div/data/div/div[8]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	
	By Is_BlockFor_Auction_Yes=By.xpath("//input[@value='T']");
	
	By Is_BlockFor_Auction_NO=By.xpath("//input[@value='F']");
	
	By Account_Number=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[8]/div[2]/div/input");
	                            
	
	
	By Fetch_Button=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[12]/div/button[1]");
	
	
	
	By EWR_ID=By.xpath("/html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By EWR_ID_FirstRecord=By.xpath("/html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div");
	
	By Select_Button=By.xpath("//*[@id='content']/div/data/div/div[4]/div/div[2]/div/div[2]/div[2]/div/button");
	
	//By Pledge_Units=By.xpath("/html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[3]/div");
	                         
	By Pledge_Qty_Click=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
	
	By Pledge_Qty_sent=By.xpath("html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input");
	                            
	By SAVE_button=By.xpath("//button[@data-ng-click='savePledge()']");
	
	By SUBMIT_button=By.xpath("//button[@data-ng-click='submitPledge()']");
	
	By Pending_Txn_Button=By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i");
	
	By Pending_txn_Link=By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a");
	
	By Pending_txn_numberSearchbox=By.xpath("/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	
	By Click_On_EPGno=By.xpath("/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input");

	By Repayment_Date=By.xpath(" //*[@id='content']/div/data/div/div[3]/div/div[10]/div[2]/div/div/input");
	                           
	By Nextmnt=By.xpath("//*[@id='content']/div/data/div/div[3]/div/div[10]/div[2]/div/div/ul/li[1]/div/table/thead/tr[1]/th[3]/button");
	                     
	By Date=By.xpath("/html/body/section/section/div/data/div/div[3]/div/div[10]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[5]/td[5]/button");
	       
	By LoanAmount=By.xpath("/html/body/section/section/div/data/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[3]/div");
	                      
	By LoanAmountInpute=By.xpath("html/body/section/section/div/data/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[3]/div[2]/form/input");                              
	
	By MVBypledge=By.xpath("/html/body/section/section/div/data/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div");
	
	By MVBypledgeInpute=By.xpath("html/body/section/section/div/data/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input");
	
	By Approve_Button=By.xpath("//button[@data-ng-click='approvePledge()']");
	
	public void Nevigate_Pledge_Initiatio(){
		
		driver.findElement(Menu_trigger).click();
		
		utility.clickOnWebElement1(Pledge_Menu, driver);
		
		utility.clickOnWebElement1(Pledge_Initiation, driver);
		
		utility.clickOnWebElement1(Back_Button, driver);
		
	}

	public void FetchPIdetails(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No) throws InterruptedException{
		
		
		
		utility.clickOnWebElement1(Warehouse, driver);
		
        driver.findElement(Warehouse_Code).sendKeys(Ware_Code);
		
		utility.clickOnWebElement1(Warehouse_Code_FirstReord, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Commodity_button, driver);
		
		driver.findElement(Commodity_Code).sendKeys(Comm_Id);
		
		driver.findElement(EWR_Type).sendKeys("Y");
		
		utility.clickOnWebElement1(Commodity_Code_FirstRecord, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Benf_Button,	driver);
		
		driver.findElement(Benf_ID).sendKeys(Benf_Id);
	
		utility.clickOnWebElement1(Benf_ID_First, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Pledge_Button, driver);
		
		driver.findElement(Pledge_Send).sendKeys(Pledgee);
		
		utility.clickOnWebElement1(Pledge_Select_FirstRecord, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(IFSC_Buttone, driver);
		
		driver.findElement(IFSC_textbox_Send).sendKeys(IFSC);
		
		driver.findElement(Agrimenttype).sendKeys("BIPARTITE");
		
		utility.clickOnWebElement1(IFSC_SelectFirstrecord, driver);
		
		Thread.sleep(2000);
		
		driver.findElement(Is_BlockFor_Auction_Yes).click();
		
		driver.findElement(Account_Number).sendKeys(ACC_no);
		
		utility.clickOnWebElement1(Fetch_Button, driver);
		
		Thread.sleep(2000);
		
		utility.XY_PageScrollDown1(driver);
		
		driver.findElement(EWR_ID).sendKeys(ENWR_no);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(EWR_ID_FirstRecord).click();
		
		driver.findElement(Select_Button).click();
		
		Thread.sleep(2000);
		
		//utility.DoubleClick(NERLConstants.pledgee_qnt_doubleclick);
		
		driver.findElement(Pledge_Qty_Click).click();
		
		driver.findElement(Pledge_Qty_sent).sendKeys(Pledge_Qnt);
		driver.findElement(Pledge_Qty_sent).sendKeys(Keys.TAB);
		utility.clickOnWebElement1(SAVE_button, driver);	
		
		utility.XY_PageScrollUp1(driver);
		
		utility.clickOnWebElement1(SUBMIT_button, driver);
		
		utility.XY_PageScrollUp1(driver);	
		
	}
	
	public void PledgeePIdetails(String Ware_Code,String Comm_Id,String Benf_Id,String Pledgee,String IFSC,String ACC_no,String ENWR_no,String Pledge_Qnt,String RPMaker,String RPMaker_password,String RPChecker,String RPchecker_password,String WSP_USER_ID,String WSP_Password,String Pledgee_maker,String PledgeeM_Pass,String Pledgee_checker1,String PledgeeC1_pass,String Pledgee_Checker2,String PledgeeC2_pass,String Loan_amt,int R_No,String EPGno) throws InterruptedException{
		
		utility.clickOnWebElement1(Pending_Txn_Button, driver);
			
		utility.clickOnWebElement1(Pending_txn_Link, driver);
		
		Thread.sleep(2000);
		
		driver.findElement(Pending_txn_numberSearchbox).sendKeys(EPGno);
		
		utility.clickOnWebElement1(Click_On_EPGno, driver);
		
		utility.clickOnWebElement1(Repayment_Date, driver);
		
		utility.clickOnWebElement1(Nextmnt, driver);
		
		utility.clickOnWebElement1(Nextmnt, driver);
		
		utility.clickOnWebElement1(Date, driver);
		
		utility.XY_PageScrollDown1(driver);
		
		Thread.sleep(2000);
		utility.DoubleClick1(NERLConstants.Loan_amount_single_click,driver);
		driver.findElement(By.xpath(NERLConstants.Loan_amount_Send_amount)).sendKeys(Loan_amt);
		    
		Thread.sleep(2000);
		utility.DoubleClick1(NERLConstants.MV_by_pledgee,driver);
		driver.findElement(By.xpath(NERLConstants.MV_By_pledgee_Send)).sendKeys(Loan_amt);
		
		utility.XY_PageScrollUp1(driver);
		 
		Thread.sleep(2000);
		    
		utility.clickOnWebElement1(Approve_Button, driver);
		 
		}
	
	
	public void Result_Check1(String XPATH,String Expected_Result) throws InterruptedException{
		
		String Actual_Validation=driver.findElement(By.xpath(XPATH)).getText();
		
		assertEquals(Actual_Validation, Expected_Result);
		
		Thread.sleep(2000);
	}
	
}
