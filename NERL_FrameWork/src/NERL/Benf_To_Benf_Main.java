package NERL;

import java.awt.List;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import library.Exceldataconfig;
import library.Utility;
import withdrawal_pkg.PledgeeRedemption_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Benf_To_Benf_Main {
	private String part2;
	private static WebDriver driver;
	private Utility utility;
	public Exceldataconfig config;
	private final static Logger logger = LoggerFactory.getLogger(Benf_To_Benf_Main.class);
	
	
	
	@BeforeMethod()		
	public void Befour() throws InterruptedException, MalformedURLException {
		
		logger.info("Benf To Benf Test Cases Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		Thread.sleep(2000);
		
		/*TestFFonGrid Remote=new TestFFonGrid();
		driver=Remote.Grid();*/
		
		driver = new ChromeDriver();
		
	    //driver.get("https://interrepotest.erepository.in/");
		
		//driver.get("https://aws.erepository.in/");
		
		//driver.get("https://test.erepository.in/");
		 
		 driver.get("https://nerltest.erepository.in/");
		
		//driver.get("https://mock.erepository.in/");
		
		driver.manage().window().maximize();
		 
		logger.info("Browser open Succesfully and Url is open");
		
		utility = new Utility(driver);
}
    
	//++++++++++++++++++++++++EOT Initiation/Submit by RP Maker++++++++++++++++++++++++++++++++++++++++++++++++++

	@Test(priority=2,description="To verify if Rp Maker having Provision to initate/Submit EOT txn",dataProvider="Benf_To_Benf_Data")
    public void Benf_To_Benf_Submitt(String WHCode,String Comm_ID,String From_Benf,String To_RP_ID,String To_Benf,String ENWR_Type,String ENWR_Number,String User_ID_1,String Passw_1,String User_ID_2,String Passw_2,String User_ID_3,String Passw_3,String Trans_qt,String Tran_no,int Record_no) throws InterruptedException, IOException {
		
		//Benf_To_Ben.Benf_To_Benf_Submit(WHCode, Comm_ID, From_Benf, To_RP_ID, To_Benf, ENWR_Type, ENWR_Number, User_ID_1, Passw_1, User_ID_2, Passw_2, User_ID_3, Passw_3, Trans_qt, Record_no,driver);
		
        utility.Login(User_ID_1,Passw_1);
		
		logger.info("RP maker Login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on Menu Icon
		driver.findElement(By.xpath(NERLConstants.Menu_Icon)).click();
		
		// Click on Menu Dropdown
		driver.findElement(By.xpath(NERLConstants.Menu_Dropdown)).click();
		
		// Click on Benf To Benf Menu Button
		driver.findElement(By.xpath(NERLConstants.Benf_To_Benf_Transfer))
				.click();
		
		// Click on Back Button
		Thread.sleep(2000);
         driver.findElement(By.xpath(NERLConstants.Back_Button)).click();
		 logger.info("Benf To Benf Window Open");
		 Thread.sleep(2000);
		
		 // Click on Popup (Warehouse Code)Button[...]
		driver.findElement(By.xpath(NERLConstants.Popup_Win_Button)).click();
		 
		logger.info("Warehouse Code Popup open");
		
		Thread.sleep(3000);

		// Send Text Into Search Text box on Popup Window (Warehouse List)
		driver.findElement(By.xpath(NERLConstants.Popup_Send_Txt)).sendKeys(WHCode);
		
		Thread.sleep(2000);

		// Select A 1st record From Popup Win
	    driver.findElement(By.xpath(NERLConstants.Select_Record)).click();
	
		logger.info("Warehouse code Selected");
	
		 Thread.sleep(2000);
		
		// Click on Popup Button[...] Commodity ID
		driver.findElement(By.xpath(NERLConstants.Popup_Win_Button2)).click();
		
		logger.info("Commodity ID Popup open");
		
		Thread.sleep(3000);
		
		// Search Commodity ID
		driver.findElement(By.xpath(NERLConstants.Popup_Send_Txt2)).sendKeys(Comm_ID);
		
		Thread.sleep(2000);
		
		// Select Serched Commodity Record
		driver.findElement(By.xpath(NERLConstants.Select_Record2)).click();
		
		logger.info("Commodity ID Selected");
		Thread.sleep(2000);

		// Click on From Beneficiary ID Button
		driver.findElement(By.xpath(NERLConstants.Popup_Win_Button3)).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.Popup_Send_Txt3)).sendKeys(From_Benf);
		// Select First Record
		
		driver.findElement(By.xpath(NERLConstants.Select_Record3)).click();
		
		logger.info("From Benficiary Selected");
		
		Thread.sleep(2000);
       
		// RP Send To Rp Id
		driver.findElement(By.xpath(NERLConstants.To_RP_ID)).sendKeys(To_RP_ID);
		
		Thread.sleep(2000);
		
		// Beneficiary ID to To Beneficiary ID
		driver.findElement(By.xpath(NERLConstants.To_Beneficiary_Id)).sendKeys(To_Benf);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.EWR_Type_Span)).click();
		
		logger.info("To RP Id Selcted");
		
		Thread.sleep(2000);
		
		//Type of ENWR
		driver.findElement(By.xpath(NERLConstants.EWR_Type_Search)).sendKeys(ENWR_Type);
		
		// Select Searched Record From Dropdown
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.EWR_Type_Record)).click();
		
		// Click on Fetch Button
		logger.info("EWR Type Is Selected");
		
		driver.findElement(By.xpath(NERLConstants.Fetch_Button)).click();

		// Page Scroll upto 0,750
		
		utility.XY_PageScrollDown();
		
		Thread.sleep(2000);
        
		//Send ENWR number into Text box
		
		driver.findElement(By.xpath(NERLConstants.ENWR_number)).sendKeys(ENWR_Number);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.Select_CheckBox)).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.Select_Button)).click();
		Thread.sleep(2000);

		String Actual_Validation = driver.findElement(
				By.xpath(NERLConstants.EWR_Add_Validation_Message)).getText();
		logger.info(Actual_Validation);
		
		Assert.assertEquals(Actual_Validation,
				"EWR added successfully for beneficiary transfer.",
				"Please Select Valid EWR");

		// Page Scroll upto 0,750
		utility.XY_PageScrollDown();

		// Get Text from Available qnt
		String Available_Quantity = driver.findElement(
				By.xpath(NERLConstants.Available_Qnt_Gettext)).getText();
		System.out.println("Available Quantity For Selected ENWR is :"
				+ Available_Quantity);

		
		utility.DoubleClick(NERLConstants.Transfer_Quantity);
		
		// Thread.sleep(2000);
		driver.findElement(By.xpath(NERLConstants.Trans_Qnt_Doubleclick))
				.sendKeys(Trans_qt);

		// Click on Add Button
		driver.findElement(By.xpath(NERLConstants.ADD_Button)).click();

		utility.XY_PageScrollUp();

		Thread.sleep(2000);
		
		String Actual_Validation_ADD = driver.findElement(
				By.xpath(NERLConstants.Add_Validation_Message)).getText();
		Assert.assertEquals(Actual_Validation_ADD,
				"Beneficiary To Beneficiary Transfer Saved Successfully.");
		
		// Capture EOT Transection number
		String EOT_no = driver
				.findElement(
						By.xpath("//*[@id='content']/div/data/div/div[2]/div[2]/div/table/tbody/tr/td[1]"))
				.getText();

		System.out.println(EOT_no);
		String string = EOT_no;
		String[] parts = string.split(":-      ");
		String part1 = parts[0];
		this.part2 = parts[1];
		System.out.println(part1);
		System.out.println("ENWR number is : " + part2);

		config.setExcelPath("D:/TestData.xlsx");
		config.setSheetId(1);
       	config.WriteExcel(part2, Record_no,14);
       	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(NERLConstants.Submit_Button)).click();
		
		Thread.sleep(2000);
		
		utility.CaptureScreenshot(driver, "Benf_To_Benf_Same_Org_Submit",1);
		
		Thread.sleep(2000);
		
		utility.logout();
		
		//Approve by RP Checker Buyer client
		utility.Login(User_ID_2,Passw_2);
		 
	    utility.PendingTxn_Approval(part2,NERLConstants.Approve_Button);
	  	
	    Thread.sleep(2000);
	  	
	    utility.logout();
		
		
		//Approve by RP checker client
		utility.Login(User_ID_3,Passw_3);
		// Click on pending txn button
	    
		utility.PendingTxn_Approval(part2,NERLConstants.Approve_Button);
	  	
		Thread.sleep(3000);
	  	
		utility.logout();
	    
		driver.close();
	  			
		}
	
   
   
 @DataProvider(name="Benf_To_Benf_Data")
	public Object[][] Ben_passdata() throws IOException{
	 
	  config=new Exceldataconfig();
	  Object[][] data= config.Excel_Data_Reader(1);  
 
	  return data; 
	 
	}
}