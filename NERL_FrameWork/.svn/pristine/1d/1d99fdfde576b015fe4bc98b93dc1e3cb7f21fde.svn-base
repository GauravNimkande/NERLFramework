package Com.Wordpress.pages;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import NERL.NERLConstants;
import library.Utility;
import sun.nio.cs.ext.ISCII91;

public class Com_ExchangeDeposit_Page {
	WebDriver driver;
	public String part2;
	Utility utility = new Utility(driver);
	
	public Com_ExchangeDeposit_Page(WebDriver driver){
		
		this.driver=driver;
	}
	
	   //Arrow to Open menu
	   By Menu_trigger=By.xpath("//*[@id='menu-trigger']/div");
		
       //Select EWR Dropdon
	   By EWR_Menu=By.xpath("//*[@id='mCSB_1_container']/ul/li[2]/a");
		                       
       //EWR With Deposit Link
	   By ENWR_link=By.xpath("//*[@id='mCSB_1_container']/ul/li[2]/ul/li[1]/a");
	
	   By Exchange_Code_Button=By.xpath("//button[@data-ng-click='fetchExchangeDetails()']");
	
	   By Send_Exchange_Code=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");                         
	                              
	   By Select_First_Exchange_Code=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[4]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	    
	   By WSR_IDD=By.name("wsrId");
	   
	   By Is_Exchange_Deposit=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/label[2]/input");
	   
	   //By Warehouse_Details_Button_NMCE=By.xpath("//button[data-ng-click='fetchWarehouseExchangeData()']");
	   By Warehouse_Details_Button_NCDEX=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[5]/div[3]/div/button");
	 
	   By Warehouse_Details_Button_NonEX=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[3]/div[3]/div/button");
	                                                 
	                                              
	   By Warehouse_Details_Button_NMCE=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[4]/div[3]/div/button");      
	                                                                             
	   By Goods_code_Button_NMCE=By.xpath("//button[@data-ng-click='fetchWhComEWRExchangeMapData()']");                                        
	                                             
	   //By Pack_Type_Button_NMCE=By.xpath("//data-ng-click[@fetchPackDetails()]");
	   
	   //By Pack_Type_Button_NMCE=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[10]/div[3]/div/button");
	 
	   By Pack_Type_Button_NMCE=By.xpath("//button[@data-ng-click='fetchPackDetails()']");

	   By Storage_Charge_Date_NMCE=By.xpath(" //span[@class='input-group-addon']");
	   
	   By Storage_date_Today_NCDEX=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[12]/div[2]/div/div/div/ul/li[2]/span/button[1]");
	
	   By Storage_date_Today_NMCE=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[10]/div[2]/div/div/div/ul/li[2]/span/button[1]");
  
	   By Storage_date_Today_NonEX=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[9]/div[2]/div/div/div/ul/li[2]/span/button[1]");
	                                          
	   By Send_Assayer_ID_NMCE=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	                                
	   By Select_first_assayer_NMCE=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");

	   //Send Warehouse Into Text
	   By Warehouse=By.className("ui-grid-filter-input-0");
	    
	   //Select First Record From Warehouse detail frame
	   By First_Record=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	                            
	   // By First_Record=By.xpath("//input[contains(@id,'0') and contains(@id, '0004') and contains(@id, 'cell')]");
	   
	   //Select Goods Code Button
	   By Goods_code_Button=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[4]/div[3]/div/button");
	                                 
	   //Send Commodity code
	   By Commodity_Code=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	                              
	   //Type Of Enwr
	   By Enwr_Type=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[4]/div[2]/div[3]/div/div/input");
	                        
	   //Select First Commodity
	   By First_Commodity=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");

	   //Pack Type Button
	   By Pack_Type_Button=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[6]/div[3]/div/button");
	   
	   //Send Pack Type
	   By Packk_Type=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	                          
	   //Select First Pack Type
	   By First_Pack_Type=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	   
	   //Storage charge date
	   By Storage_Charge_Date=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[7]/div[2]/div/div/span");
	                                  
	   //By Storage_date_Today=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[9]/div[2]/div/div/div/ul/li[2]/span/button[1]");
	   By Storage_date_Today=By.xpath("//*[@id='content']/div/data/div/div/div/div[1]/form/div/div/div[7]/div[2]/div/div/div/ul/li[2]/span/button[1]");
          
	   By Save_Button=By.xpath("//button[@data-ng-click='saveEWRData()']");
	   
	   By Assayer_ID_Select=By.xpath("//button[@data-ng-click='fetchExchangeAssayerData()']");
	   
	   //By Send_Assayer_ID=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	  
	   By Send_Assayer_ID=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");

	   //By Select_first_assayer=By.xpath("html/body/section/section/div/data/div/div/div/div[1]/div[4]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	  
	   By Select_first_assayer=By.xpath("/html/body/section/section/div/data/div/div/div/div[1]/div[4]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");

	   //Save EWR Details Validation message
	   
	   By EWR_Save_Validation=By.xpath("//div[@role='alert']");
	   
	   //++++++++++++++++++++++++++++++++Deposit Page++++++++++++++++++++++++++++++++++++++++++++++++
	   
	   
	   By Deposit_Date=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[1]/div[5]/div/span/i");
	                            
	   By Todays_Date=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[1]/div[5]/div/div/ul/li[2]/span/button[1]");
	                                       
	   //Benf account code
	   
	   By Beneficiary_Acc_Code=By.xpath("//input[@id='beneficiaryId']");
	   
	   //Number of packs
	   By No_Of_Packs_bags=By.xpath("//input[@name='numberOfPacks']");
	   
	   //Depositor Name
	   By Depositor_NM=By.xpath("//*[@id='depositorName']");
	   
	   //Depositor address
	   By DepositorADD=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[5]/div[5]/div/textarea");
	   
	   //Gross Quantity
	   By Gross_qnt=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[6]/div[2]/div/input");
	   
	   //Physical qnt
	   By Phy_qnt=By.xpath(" //*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[6]/div[5]/div/input");
	     
	   //Commodity rate
	   By Comm_Rate=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[7]/div[2]/div/input");
	   
	   //Estimated Value
	   By Estimated_Value=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[7]/div[5]/div/input");
	   
	   //Market Value
	   By Mark_val=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[8]/div[2]/input");
	   
	   //Lot Number
	   By Lot_no=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[8]/div[5]/div/input");
	   
	   //Storage Charges
	   By Storage_Chargess=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[9]/div[2]/div/input");
	   
	   //Handling Charges
	   By Handling_ch=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[9]/div[5]/div/input");
	  
	   //PrivateRemarks
	   By PrivateRemarks=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[10]/div[2]/div/input");
	  
	   //Advance_Amount_Paid
	   By Advance_Amount_Paid=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[10]/div[5]/div/input");
	   
	   //Sample Number
	   By Sample_No=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[11]/div[2]/div/input");
	   
	   By Sample_NoAss=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[1]/div[5]/div/input");
	                         
	   //Sampling Date
	   By Sampling_Date=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[11]/div[5]/div/span");
	  
	   //Sample Date Today
	   By Sampling_Date_Today= By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div/div/div[11]/div[5]/div/div/ul/li[2]/span/button[1]");
			   
	   //Depositor PAN Number
	   By PAN_no=By.xpath("//input[@data-ng-model='ewrMain.qtyDepToEWR.depositorPANNumber']");
	   
	   //Depositor State
	   By Depositor_State=By.xpath("//input[@data-ng-model='ewrMain.qtyDepToEWR.depositorState']");
	   
	   //Depositor GST Number
	   By Depositor_GST_Number=By.xpath("//input[@data-ng-model='ewrMain.qtyDepToEWR.depositorGSTNumber']");
	   
	   //Depositor Contact Number*
	   By Depositor_Contact_Number=By.xpath("//input[@data-ng-model='ewrMain.qtyDepToEWR.depositorContactNumber']");
	   
	   //Depositor Email ID
	   By Depositor_Email_ID=By.xpath("//input[@data-ng-model='ewrMain.qtyDepToEWR.depositorEmailId']");
	   
	   //Save button
	   By Save_DP_Button=By.xpath("//button[@data-ng-click='saveDepositData()']");
	   
	 //+++++++++++++++++++++++++++++++++++++++++++++++++++ Vehicle Deposit Details ++++++++++++++++++++++++++++++++++++
	   //ADD button
	   By Add_button=By.xpath("//*[@id='content']/div/data/div/div/div/div[2]/form/div[2]/div/div[2]/div/button[4]");
	   
	   //Suplyar name
	   By Supplier_name=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/input");
	                             
	   //Date
	   By Date=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[2]/div/input");
	   
	   //Transporter name
	   By Transp_Name=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[3]/div/input");
	   
	   //Vehicle number
	   By Vehicle_no=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[4]/div/input");
	   
	   //Mobileno
	   By Mob_no=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[5]/div/input");
	   
	   //Select Adhar card
	   By Adhar_Card=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[6]/select");
	   
	   //Enter Adhar number
	   By Adhar_no=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[7]/div/input");
	   
	   //Gross Qnt
	   By Grossqt=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[8]/div/input");
	   
	   //Net Quantity
	   By NetQt=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[9]/div/input");
	   
	   //Number Of Packs
	   By No_Pack=By.xpath("html/body/section/section/div/data/div/div/div/div[2]/form/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[10]/div/input");
	   
	   //Save Button
	   By Save_Vehicle=By.xpath("//button[@data-ng-click='saveVehicleDepositDtls()']");
	   
	   By GENRRATE_EWR_NO=By.xpath("//button[@data-ng-click='generateEWRNumber()']");
	   //+++++++++++++++++++++++++++++++++++++ Assaying Page +++++++++++++++++++++++++++++++++++++++++++++++++++++
	   
	   By Assayer_pending_txn=By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/a/i");
	   
	   By Assayer_pending_Sendrecord=By.xpath(".//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p//a");
	   
	   By Assayer_Pending_FirstRecord=By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input");
	   
	   By Assayer_click_firstrecord=By.xpath("html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input");
	   
	   
	   
	   By Sample_No1=By.xpath("//input[@data-ng-model='ewrMain.assayMp.sampleNo']");
	   
	   By Assayer_ID_Button=By.xpath(".//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[2]/div[3]/button");
	   
	   By Assayer_first_Select=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div");
	   
	   By Assaying_Metho_Button=By.xpath("//button[@data-target='#assayMethodModal']");
	             
	   By Assaying_meth_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input ");
	                                                                
	   By Assaying_Select_First=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/div/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div");
	                                                                
	   By Assaying_Type=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[7]/div[5]/div/a/span");
	   
	   By Assaying_Type_Normal=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[2]/div[5]/div/a/span");                           
	   //*[@id="content"]/div/data/div/div/div/div[3]/form/div[1]/div/div[2]/div[5]/div/a/span            
	 
	   By Assaying_Type_first_Record1=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[2]/div[5]/div/div/ul/li[1]");
	   
	   By Is_Reval_Requ1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[2]/input");
	                             
	   By Revalidation_Date1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[4]/div[2]/div/span");
	                         
	   By Next_mnt1=By.xpath("//button[@ng-click='move(1)']");
	   
	   By Date_next1=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[4]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[5]/td[6]/button");
	   
	   By Final_date_calbutton1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/span");
	                           
	   By Next_mmnt1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/div/ul/li[1]/div/table/thead/tr[1]/th[3]/button");
	   
	   By Final_ex_Date1=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[6]/button");

	   By Low_Value=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div");
	   
	   
	   
	   By Assaying_Type_first_Record=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[7]/div[5]/div/div/ul/li[1]");
	                                             
	   By Is_Reval_Requ=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[2]/input");
	                             
	   By Revalidation_Date=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[4]/div[2]/div/span");
	                         
	   By Next_mnt=By.xpath("//button[@ng-click='move(1)']");
	   
	   By Date_next=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[3]/div[4]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[5]/td[6]/button");
	   
	   By Final_date_calbutton=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/span");
	                           
	   By Next_mmnt=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/div/ul/li[1]/div/table/thead/tr[1]/th[3]/button");
	   
	   By Final_ex_Date=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[6]/button");
	 
	   /*By Actual_gd=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/a/span");
	                 
	   By Actual_gr_send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/div/div/input");
	   
	   By Select_Actual_GD=By.xpath(".//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/div/ul/li");
	*/   
	   By Assaying_Date_Button=By.xpath("  //*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[3]/div[2]/div/span");
	                                          
	   By Assayng_Date_Today=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[3]/div[2]/div/div/ul/li[2]/span/button[1]");
	   
	   By Assaying_Date_Button1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[6]/div[2]/div/span");
       
	   By Assayng_Date_Today1=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[6]/div[2]/div/div/ul/li[2]/span/button[1]");
	   
	   
	   
	   By Actual_Agmark_Grade_Button=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[5]/div[2]/div/a/span");
	   
	   By Actual_Agmark_Grade=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[5]/div[2]/div/div/div/input");
	   
	   By Select_First_Agmark=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[5]/div[2]/div/div/ul/li[1]");
	   
       By Exchange_Grade_Button=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[6]/div[5]/div/a/span");
	   
	   By Exchange_Agmark_Grade=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[6]/div[5]/div/div/div/input");
	                                      
	   By Select_First_ExchangeGD=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[6]/div[5]/div/div/ul/li[1]");
	                                        
	   By Actual_gd=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/a/span");
	                           
	   By Actual_gr_send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/div/div/input");
	   
	   By Select_Actual_GD=By.xpath(".//*[@id='content']/div/data/div/div/div/div[3]/form/div/div[1]/div[4]/div[5]/div/div/ul/li");
                                                        
	   By Additional_Ch=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[6]/div[5]/div/div/textarea");             
	 //------------ Parametter details--------------
	   
	/*   By Parameter_Detail_1_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/form/input");
	         
	   By Parameter_Detail_2_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_3_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/form/input");
	   
	   By Parameter_Detail_4_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_5_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_6_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[6]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_7_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[7]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_8_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[8]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_9_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[9]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_10_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[10]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_11_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[11]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_12_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[12]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_13_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[13]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_14_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[14]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_15_Send=By.xpath("html/body/section/section/div/data/div/div/div/div[3]/form/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[15]/div/div[2]/div[2]/form/input");

	 
	 */

	   By Parameter_Detail_1_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/form/input");
	                                       
	   By Parameter_Detail_2_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/form/input");
	                                           
	   By Parameter_Detail_3_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/form/input");
	   
	   By Parameter_Detail_4_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_5_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_6_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[6]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_7_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[7]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_8_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[8]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_9_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[9]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_10_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[10]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_11_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[11]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_12_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[12]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_13_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[13]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_14_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[14]/div/div[2]/div[2]/form/input");

	   By Parameter_Detail_15_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[15]/div/div[2]/div[2]/form/input");

	   
	   //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Exchange Parameter ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	   
	   By EXParameter_Detail_1_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/form/input");
	   
	                                          //html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]                           
	   By EXParameter_Detail_2_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/form/input");
	                                          
	                                          //html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]
	   By EXParameter_Detail_3_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/form/input");
	   
	   By EXParameter_Detail_4_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_5_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_6_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[6]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_7_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[7]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_8_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[8]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_9_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[9]/div/div[2]/div[2]/form/input");

	   By EXParameter_Detail_10_Send=By.xpath("/html/body/section/section/div/data/div/div/div/div[3]/form/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div[10]/div/div[2]/div[2]/form/input");

	  
	   By Remark=By.xpath("//*[@id='content']/div/data/div/div/div/div[3]/form/div[1]/div/div[7]/div[2]/div/div/textarea");
	  
	   
	   
	   //Fetch_Button
	   
	   By Fetch_Button=By.xpath("//button[@data-ng-click='fetchGrade()']");
	   
	   By Save_Ass_Details_Button=By.xpath("//button[@data-ng-click='saveAssayingDtls()']");
	   
	   //Generate EWR number
	 //  By GENRRATE_EWR_NO=By.xpath("//button[@data-ng-click='generateEWRNumber()']");
	 

	 
	public void Navigate_To_DepositPage() throws InterruptedException{
		
		System.out.println("Inside Navigate to deposit");
		
		Thread.sleep(3000);
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(Menu_trigger).click();
		 
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(EWR_Menu).click();
		 
		 //utility.clickOnWebElement1(EWR_Menu, driver);
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 utility.clickOnWebElement1(ENWR_link, driver);
		 
		 //driver.findElement(ENWR_link).click();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(Menu_trigger).click();		
		
	}
	
	public void EWR_Page_NonExchange(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,String Exchange_Code,String WSR_ID,String AssayerID,String Pan_No,String Egmark_Grade,String EXPara_1,String EXPara_2,String EXPara_3,String EXPara_4,String EXPara_5,String EXPara_6,String EXPara_7,String EXPara_8,String EXPara_9,String EXPara_10,String No_EX_Para,int Record_Number) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.findElement(Is_Exchange_Deposit).click();
   		    
		//Warehouse details
		utility.clickOnWebElement1(Warehouse_Details_Button_NonEX, driver);
		
		driver.findElement(Warehouse).sendKeys(WHCode);
		
		utility.clickOnWebElement1(First_Record, driver);		
			
		Thread.sleep(2000);
		
		//Goods Code
		utility.clickOnWebElement1(Goods_code_Button_NMCE, driver);
		
		driver.findElement(Commodity_Code).sendKeys(Comm_ID);
		
		driver.findElement(Enwr_Type).sendKeys("Y");
		
		utility.clickOnWebElement1(First_Commodity, driver);
		
        
		Thread.sleep(2000);
		
		//Pack Type
		utility.clickOnWebElement1(Pack_Type_Button_NMCE, driver);
		
		driver.findElement(Packk_Type).sendKeys(Pack_Type);
		
		utility.clickOnWebElement1(First_Pack_Type, driver);
				
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Storage_Charge_Date_NMCE, driver);
		
		Thread.sleep(2000);
				
	   utility.clickOnWebElement1(Storage_date_Today_NonEX, driver);
		
		utility.clickOnWebElement1(Assayer_ID_Select, driver);
		
		driver.findElement(Send_Assayer_ID_NMCE).sendKeys(AssayerID);
	
		
		utility.clickOnWebElement1(Select_first_assayer_NMCE, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Save_Button, driver);
		
		driver.switchTo().alert().accept();
		
		Result_Check(EWR_Save_Validation, "EWR Transaction Details Saved Successfully.");
	
		
	}	
	public void EWR_Page_EXCHANGE(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,String Exchange_Code,String WSR_ID,String AssayerID,String Pan_No,String Egmark_Grade,String EXPara_1,String EXPara_2,String EXPara_3,String EXPara_4,String EXPara_5,String EXPara_6,String EXPara_7,String EXPara_8,String EXPara_9,String EXPara_10,String No_EX_Para,int Record_Number) throws InterruptedException
	{
		
			
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Is Exchange Deposit Radio Button
		
		
		//Exchange Code Button
		utility.clickOnWebElement1(Exchange_Code_Button, driver);
		
		Thread.sleep(2000);
		
		//Send Exchange Code to Text Box
		driver.findElement(Send_Exchange_Code).sendKeys(Exchange_Code);
		
		//Select first exchange Code
		utility.clickOnWebElement1(Select_First_Exchange_Code, driver);
		
		Thread.sleep(2000);
			
		
		if(Exchange_Code.equalsIgnoreCase("NCDEX")){
				
		
			   utility.DoubleClick1("//*[@id='wsrId']",driver);
			   driver.findElement(WSR_IDD).sendKeys(WSR_ID);
			   
			 //Warehouse details
				utility.clickOnWebElement1(Warehouse_Details_Button_NCDEX, driver);
				
				driver.findElement(Warehouse).sendKeys(WHCode);
				
				utility.clickOnWebElement1(First_Record, driver);		
					
				Thread.sleep(2000);
				
				//Goods Code
				utility.clickOnWebElement1(Goods_code_Button_NMCE, driver);
				
				driver.findElement(Commodity_Code).sendKeys(Comm_ID);
				
				driver.findElement(Enwr_Type).sendKeys("Y");
				
				utility.clickOnWebElement1(First_Commodity, driver);
				
		        
				Thread.sleep(2000);
				
				//Pack Type
				utility.clickOnWebElement1(Pack_Type_Button_NMCE, driver);
				
				driver.findElement(Packk_Type).sendKeys(Pack_Type);
				
				utility.clickOnWebElement1(First_Pack_Type, driver);
						
				
				Thread.sleep(2000);
				
				utility.clickOnWebElement1(Storage_Charge_Date_NMCE, driver);
				
				utility.clickOnWebElement1(Storage_date_Today_NCDEX, driver);
				
				utility.clickOnWebElement1(Assayer_ID_Select, driver);
				
				driver.findElement(Send_Assayer_ID_NMCE).sendKeys(AssayerID);
			
				
				utility.clickOnWebElement1(Select_first_assayer_NMCE, driver);
				
				Thread.sleep(2000);
				
				utility.clickOnWebElement1(Save_Button, driver);
				
				driver.switchTo().alert().accept();
				
				Result_Check(EWR_Save_Validation, "EWR Transaction Details Saved Successfully.");

		}else if(Exchange_Code.equalsIgnoreCase("ICEX")){
			
			//Warehouse details
			utility.clickOnWebElement1(Warehouse_Details_Button_NMCE, driver);
			
			driver.findElement(Warehouse).sendKeys(WHCode);
			
			utility.clickOnWebElement1(First_Record, driver);		
				
			Thread.sleep(2000);
			
			//Goods Code
			utility.clickOnWebElement1(Goods_code_Button_NMCE, driver);
			
			driver.findElement(Commodity_Code).sendKeys(Comm_ID);
			
			driver.findElement(Enwr_Type).sendKeys("Y");
			
			utility.clickOnWebElement1(First_Commodity, driver);
			
	        
			Thread.sleep(2000);
			
			//Pack Type
			utility.clickOnWebElement1(Pack_Type_Button_NMCE, driver);
			
			driver.findElement(Packk_Type).sendKeys(Pack_Type);
			
			utility.clickOnWebElement1(First_Pack_Type, driver);
								
			Thread.sleep(2000);
			
			utility.clickOnWebElement1(Storage_Charge_Date_NMCE, driver);
			
			Thread.sleep(2000);
					
		    utility.clickOnWebElement1(Storage_date_Today_NMCE, driver);
			
			utility.clickOnWebElement1(Assayer_ID_Select, driver);
			
			driver.findElement(Send_Assayer_ID_NMCE).sendKeys(AssayerID);
		
			
			utility.clickOnWebElement1(Select_first_assayer_NMCE, driver);
			
			Thread.sleep(2000);
			
			utility.clickOnWebElement1(Save_Button, driver);
			
			driver.switchTo().alert().accept();
			
			Result_Check(EWR_Save_Validation, "EWR Transaction Details Saved Successfully.");
		
		}
	}

	public void Deposit_Page(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,String Exchange_Code,String WSR_ID,String AssayerID,String Pan_No,String Egmark_Grade,String EXPara_1,String EXPara_2,String EXPara_3,String EXPara_4,String EXPara_5,String EXPara_6,String EXPara_7,String EXPara_8,String EXPara_9,String EXPara_10,String No_EX_Para,int Record_Number) throws InterruptedException{
		
		 utility.clickOnWebElement1(Deposit_Date, driver);
		 
		 utility.clickOnWebElement1(Todays_Date, driver);
		 
		 driver.findElement(Beneficiary_Acc_Code).sendKeys(Benf_Code);
		 
		 driver.findElement(No_Of_Packs_bags).sendKeys(No_Packs);
		 
		 driver.findElement(Depositor_NM).sendKeys(DepositorName);

		 driver.findElement(DepositorADD).sendKeys("Kanjurmarg W");
		 
		 driver.findElement(Gross_qnt).sendKeys(Gross_Quantity);
		 
		 if(!Exchange_Code.equals("NCDEX")){
				 
		 driver.findElement(Phy_qnt).sendKeys(Physical_Quantity);
		 
		 }else{
	    
			 System.out.println("Exchange is Non NCDEX");
	     }
		 
		 driver.findElement(Comm_Rate).sendKeys(Commodity_Rate);
		 
		 driver.findElement(Estimated_Value).sendKeys(Estimated_deposit);
		 
		 driver.findElement(Mark_val).sendKeys("250000");
		 
		 driver.findElement(Lot_no).sendKeys(Lot_Number);
		 
	     driver.findElement(Storage_Chargess).sendKeys(Storage_Charges);
	     
	     driver.findElement(Handling_ch).sendKeys(Handling_Charges);
	     
	     driver.findElement(PrivateRemarks).sendKeys("OK");
	     
	     driver.findElement(Advance_Amount_Paid).sendKeys("1234");
	     
	     if(Exchange_Code.equals("NCDEX")){
	    
	     driver.findElement(Sample_No).sendKeys("223344"); 
	     
	     utility.clickOnWebElement1(Sampling_Date, driver);
	    
	     utility.clickOnWebElement1(Sampling_Date_Today, driver);
	     
	     }
	     else{
	    	 System.out.println("Exchange is Non NCDEX");
	     }
	     
	     
	     driver.findElement(PAN_no).sendKeys(Pan_No);
	     
	     driver.findElement(Depositor_State).sendKeys("MAHARASTRA");
	     
	     driver.findElement(Depositor_GST_Number).sendKeys("22ASDFG1234F1Z5");
	     
	     driver.findElement(Depositor_Contact_Number).sendKeys("9925463217");
	     
	     driver.findElement(Depositor_Email_ID).sendKeys("a@a.com");
	     
	     utility.clickOnWebElement1(Save_DP_Button, driver);
	     
	    Result_Check(EWR_Save_Validation, "Deposit Transaction Details Saved Successfully.");
	     
	}

	public void Vehicle_Deposit_Details(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,String Exchange_Code,String WSR_ID,String AssayerID,String Pan_No,String Egmark_Grade,String EXPara_1,String EXPara_2,String EXPara_3,String EXPara_4,String EXPara_5,String EXPara_6,String EXPara_7,String EXPara_8,String EXPara_9,String EXPara_10,String No_EX_Para,int Record_Number) throws InterruptedException{

	/*	utility.clickOnWebElement1(Add_button, driver);
		
		driver.findElement(Supplier_name).sendKeys("Sahara");
		
		 Calendar cal = Calendar.getInstance();
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 String strDate = sdf.format(cal.getTime());
		 
		 driver.findElement(Date).sendKeys(strDate);
		 
		 driver.findElement(Transp_Name).sendKeys("Shree transport");
		 
		 driver.findElement(Vehicle_no).sendKeys("MH12AS1234");
		 
		 driver.findElement(Mob_no).sendKeys("8796004476");
		 
		 driver.findElement(Adhar_Card).sendKeys("Aadhar Card");
		
		 driver.findElement(Adhar_no).sendKeys("123564789456");
		 
		 driver.findElement(Grossqt).sendKeys(VDD_Gross_Qty);
		
		 driver.findElement(NetQt).sendKeys(VDD_Net_Qty);
		 
		 driver.findElement(No_Pack).sendKeys(VDD_Number_of_Packs);*/
		 
		 utility.clickOnWebElement1(Save_Vehicle, driver);
		 
		// Result_Check(EWR_Save_Validation, "Vehicle wise deposit details saved successfully.");
		 
		 Thread.sleep(2000);
		 	
		 utility.clickOnWebElement1(GENRRATE_EWR_NO, driver);
		   
		 Result_Check(EWR_Save_Validation, "EWR ID Generated Successfully.");
	}

	public void Assayer_Mkr(String Transaction_Number) throws InterruptedException{
		
		  utility.clickOnWebElement1(Assayer_pending_txn, driver);
	    
		    Thread.sleep(2000);
		
		    utility.clickOnWebElement1(Assayer_pending_Sendrecord, driver);	
			
		    Thread.sleep(2000);
		    
			driver.findElement(Assayer_Pending_FirstRecord).sendKeys(Transaction_Number);
			
			Thread.sleep(2000);
			//Click On EDP No
			
			utility.clickOnWebElement1(Assayer_click_firstrecord, driver); 
			
			Thread.sleep(2000);
	       
			utility.pageScrollDown1(NERLConstants.Edit_Assayer,driver);
			
			utility.clickOnWebElement(NERLConstants.Edit_Assayer, driver);		
			
	}
	
	
	public void Assaying_Details_Page(String WHCode,String Comm_ID,String Pack_Type,String Benf_Code,String No_Packs,String DepositorName,String Gross_Quantity,String Physical_Quantity,String Commodity_Rate,String Estimated_deposit,String Private_Marks,String Lot_Number,String Storage_Charges,String Handling_Charges,String Other_Charges,String Advance_Paid,String Remaining_Charges,String Depositor_Address,String VDD_Gross_Qty,String VDD_Net_Qty,String VDD_Number_of_Packs,String Ass_Sampleno,String Assayer_Methodology,String Actual_Grade,String Para_1,String Para_2,String Para_3,String Para_4,String WSP_maker,String WSP_Password1,String WSP_checker,String WSP_Password2,String Login_Assayer,String Ass_password,String AssayerChecker,String Ass_PassCKR,String Para_5,String Para_6,String Para_7,String Para_8,String Para_9,String Para_10,String Para_11,String Para_12,String Para_13,String Para_14,String Para_15,String Number_Of_Para,String Exchange_Code,String WSR_ID,String AssayerID,String Pan_No,String Egmark_Grade,String EXPara_1,String EXPara_2,String EXPara_3,String EXPara_4,String EXPara_5,String EXPara_6,String EXPara_7,String EXPara_8,String EXPara_9,String EXPara_10,String No_EX_Para,int Record_Number) throws InterruptedException{
		
		//driver.findElement(Sample_No).sendKeys(Ass_Sampleno);
		
		/*utility.clickOnWebElement1(Assayer_ID_Button, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Assayer_first_Select, driver);
		*/
		
		if(Exchange_Code.equals("NCDEX")){
			
		
		Thread.sleep(2000);
		utility.XY_PageScrollUp1(driver);
		utility.clickOnWebElement1(Assaying_Metho_Button, driver);
		
		Thread.sleep(2000);
		
		driver.findElement(Assaying_meth_Send).sendKeys(Assayer_Methodology);
		
		utility.clickOnWebElement1(Assaying_Select_First, driver);
		
		Thread.sleep(2000);
		
		utility.clickOnWebElement1(Assaying_Date_Button, driver);
		   
		utility.clickOnWebElement1(Assayng_Date_Today, driver);
		
		Thread.sleep(2000);
		
		//Agmark Grade
		utility.clickOnWebElement1(Actual_Agmark_Grade_Button, driver);
		
        driver.findElement(Actual_Agmark_Grade).sendKeys(Actual_Grade);
        
        utility.clickOnWebElement1(Select_First_Agmark, driver);
        
        //Exchange Grade
        utility.clickOnWebElement1(Exchange_Grade_Button, driver);
		
        driver.findElement(Exchange_Agmark_Grade).sendKeys(Egmark_Grade);
        
        utility.clickOnWebElement1(Select_First_ExchangeGD, driver);
        
        
        
		utility.clickOnWebElement1(Assaying_Type, driver);
		
		Thread.sleep(1000);
		
		utility.clickOnWebElement1(Assaying_Type_first_Record, driver);
		
		driver.findElement(Remark).sendKeys("OK");
		
		/*	
	    utility.clickOnWebElement1(Is_Reval_Requ, driver);
	    
	    Thread.sleep(1000);
	    
	    utility.clickOnWebElement1(Revalidation_Date, driver);
	    
	    utility.clickOnWebElement1(Next_mnt, driver);
	    
	    utility.clickOnWebElement1(Date_next, driver);
		
	    utility.clickOnWebElement1(Final_date_calbutton, driver);
	    
	    utility.clickOnWebElement1(Next_mmnt, driver);
	    
	    utility.clickOnWebElement1(Next_mmnt, driver);
	    
	    utility.clickOnWebElement1(Final_ex_Date, driver);
	   */	    
	   Thread.sleep(1000);
	   
	  int Parameter_Records=Integer.parseInt(Number_Of_Para);
	   	  
	   switch(Parameter_Records){
	   
	   
	   
	   case 1:
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
		   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
		   break;
		   
	   case 2:  
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
		   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
		   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
		   break;
		   
	   case 3:  
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			 //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   break;
		   
	   case 4:
		   
		  //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
		   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
		   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
		   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
		   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
		   break;
		
	   case 5:
		  
		   //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
		   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
		   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
		   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
		   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
		   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
		   break;
		   
	   case 6:
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
		   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
		   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		    utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
		   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
		   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
		   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
		   
		   //Parameter Details 6
		   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
		   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
		   break;
		   
	   case 7:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			   break;
			  
	   case 8:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   break;
			     
	   case 9:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			   //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			   //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			   //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   break;   
	   case 10:
			  //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10); 
			   break; 
			   
	   case 11:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
			   
			 //Parameter Details 11
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
			   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
			   break;   
		   
	   case 12:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
			   
			 //Parameter Details 11
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
			   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
			   
			 //Parameter Details 12
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
			   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
			  
			   break;   
			   
	   case 13:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
			   
			 //Parameter Details 11
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
			   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
			   
			 //Parameter Details 12
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
			   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
			   
			 //Parameter Details 13
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
			   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13); 	  
			   break;    
			   
	   case 14:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
			   
			 //Parameter Details 11
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
			   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
			   
			 //Parameter Details 12
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
			   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
			   
			 //Parameter Details 13
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
			   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13);
			   
			 //Parameter Details 14
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_14,driver);
			   driver.findElement(Parameter_Detail_14_Send).sendKeys(Para_14); 
			   break;  
	         
	   case 15:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
			   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
			 
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
			   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
			   
			 //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
			   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
			   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
			   
			 //Parameter Details 11
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
			   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
			   
			 //Parameter Details 12
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
			   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
			   
			 //Parameter Details 13
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
			   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13);
			   
			 //Parameter Details 14
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_14,driver);
			   driver.findElement(Parameter_Detail_14_Send).sendKeys(Para_14); 
			   
			 //Parameter Details 15
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_15,driver);
			   driver.findElement(Parameter_Detail_15_Send).sendKeys(Para_15);
			   break;   
			  }
	   
	   
	   
	   
	  
	   utility.pageScrollDown1("//button[@data-ng-click='fetchGrade()']",driver);
	   
	   int Number_Exchange_Para=Integer.parseInt(No_EX_Para);
	   	
	   Thread.sleep(2000);
	   
	   switch(Number_Exchange_Para){
	   
	   
	   
	   case 1:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver); 
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
		   break;
		   
	   case 2: 
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(Para_2);
		   break;
		   
	   case 3:  
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
			   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
			   driver.findElement(EXParameter_Detail_2_Send).sendKeys(Para_2);
			   
			 //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
			   driver.findElement(EXParameter_Detail_3_Send).sendKeys(Para_3);
			   break;
		   
	   case 4:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		   
		  //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(Para_4);
		   break;
		
	   case 5:
		  
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		   //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(Para_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
		   driver.findElement(EXParameter_Detail_5_Send).sendKeys(Para_5);
		   break;
		   
	   case 6:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		 //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(EXPara_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(EXPara_2);
		   
		   //Parameter Details 3
		    utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(EXPara_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(EXPara_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
		   driver.findElement(EXParameter_Detail_5_Send).sendKeys(EXPara_5);
		   
		   //Parameter Details 6
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_6,driver);
		   driver.findElement(EXParameter_Detail_6_Send).sendKeys(EXPara_6);
		   break;
		   
	   case 7:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		  	   
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
			   driver.findElement(EXParameter_Detail_1_Send).sendKeys(EXPara_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
			   driver.findElement(EXParameter_Detail_2_Send).sendKeys(EXPara_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
			   driver.findElement(EXParameter_Detail_3_Send).sendKeys(EXPara_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
			   driver.findElement(EXParameter_Detail_4_Send).sendKeys(EXPara_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
			   driver.findElement(EXParameter_Detail_5_Send).sendKeys(EXPara_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_6,driver);
			   driver.findElement(EXParameter_Detail_6_Send).sendKeys(EXPara_6);
			   
			 //Parameter Details 7
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_7,driver);
			   driver.findElement(EXParameter_Detail_7_Send).sendKeys(EXPara_7);
			   break;
			  
	   case 8:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		      		   
		  /* driver.findElement(Low_Value).click();
		   Thread.sleep(2000);*/
		   
		   //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);		   
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(EXPara_1);	   
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(EXPara_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(EXPara_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(EXPara_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
		   driver.findElement(EXParameter_Detail_5_Send).sendKeys(EXPara_5);
		   
		   //Parameter Details 6
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_6,driver);
		   driver.findElement(EXParameter_Detail_6_Send).sendKeys(EXPara_6);
		   
		 //Parameter Details 7
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_7,driver);
		   driver.findElement(EXParameter_Detail_7_Send).sendKeys(EXPara_7);
		   
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_8,driver);
			   driver.findElement(EXParameter_Detail_8_Send).sendKeys(EXPara_8);
			   break;
			     
	   case 9:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		   //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(EXPara_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(EXPara_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(EXPara_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(EXPara_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
		   driver.findElement(EXParameter_Detail_5_Send).sendKeys(EXPara_5);
		   
		   //Parameter Details 6
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_6,driver);
		   driver.findElement(EXParameter_Detail_6_Send).sendKeys(EXPara_6);
		   
		 //Parameter Details 7
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_7,driver);
		   driver.findElement(EXParameter_Detail_7_Send).sendKeys(EXPara_7);
		   
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_8,driver);
			   driver.findElement(EXParameter_Detail_8_Send).sendKeys(EXPara_8);
			   
			   //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_9,driver);
			   driver.findElement(EXParameter_Detail_9_Send).sendKeys(EXPara_9);
			   break;   
	   case 10:
		   driver.findElement(Low_Value).click();
		   Thread.sleep(2000);
		   
		   //Parameter Details 1
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_1,driver);
		   driver.findElement(EXParameter_Detail_1_Send).sendKeys(Para_1);
		   
		   //Parameter Details 2
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_2,driver);
		   driver.findElement(EXParameter_Detail_2_Send).sendKeys(Para_2);
		   
		   //Parameter Details 3
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_3,driver);
		   driver.findElement(EXParameter_Detail_3_Send).sendKeys(Para_3);
		   
		   //Parameter Details 4
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_4,driver);
		   driver.findElement(EXParameter_Detail_4_Send).sendKeys(Para_4);
		   
		   //Parameter Details 5
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_5,driver);
		   driver.findElement(EXParameter_Detail_5_Send).sendKeys(Para_5);
		   
		   //Parameter Details 6
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_6,driver);
		   driver.findElement(EXParameter_Detail_6_Send).sendKeys(Para_6);
		   
		 //Parameter Details 7
		   utility.DoubleClick1(NERLConstants.EXParameter_Detail_7,driver);
		   driver.findElement(EXParameter_Detail_7_Send).sendKeys(Para_7);
		   
			 //Parameter Details 8
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_8,driver);
			   driver.findElement(EXParameter_Detail_8_Send).sendKeys(Para_8);
			   
			   //Parameter Details 9
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_9,driver);
			   driver.findElement(EXParameter_Detail_9_Send).sendKeys(Para_9);
			   
			 //Parameter Details 10
			   utility.DoubleClick1(NERLConstants.EXParameter_Detail_10,driver);
			   driver.findElement(EXParameter_Detail_10_Send).sendKeys(Para_10); 
			   break; 
	   }
	   
	   Thread.sleep(3000);
	   utility.clickOnWebElement1(Fetch_Button, driver);
	   
	   utility.clickOnWebElement1(Save_Ass_Details_Button, driver);

	   Result_Check(EWR_Save_Validation, "Assaying Transaction Details Saved Successfully.");
	   
	   utility.clickOnWebElement(NERLConstants.Approve_EWR_Button, driver);
	   
	   driver.switchTo().alert().accept();
	   
	   driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
	   
	   Result_Check(EWR_Save_Validation, "EWR Transaction Approved Successfully.");
	   
		
		}
		else{
			
			driver.findElement(Sample_NoAss).sendKeys(Ass_Sampleno);
			
			/*utility.clickOnWebElement1(Assayer_ID_Button, driver);
			
			Thread.sleep(2000);
			
			utility.clickOnWebElement1(Assayer_first_Select, driver);
			*/
			Thread.sleep(2000);
			
			utility.clickOnWebElement1(Assaying_Metho_Button, driver);
			
			Thread.sleep(2000);
			
			driver.findElement(Assaying_meth_Send).sendKeys(Assayer_Methodology);
			
			utility.clickOnWebElement1(Assaying_Select_First, driver);
			
			Thread.sleep(2000);
			
			utility.clickOnWebElement1(Assaying_Type_Normal, driver);
			
			Thread.sleep(1000);
			
			utility.clickOnWebElement1(Assaying_Type_first_Record1, driver);
			
		    utility.clickOnWebElement1(Is_Reval_Requ1, driver);
		    
		    Thread.sleep(1000);
		    
		    utility.clickOnWebElement1(Revalidation_Date1, driver);
		    
		    utility.clickOnWebElement1(Next_mnt1, driver);
		    
		    utility.clickOnWebElement1(Date_next1, driver);
			
		    utility.clickOnWebElement1(Final_date_calbutton1, driver);
		    
		    utility.clickOnWebElement1(Next_mmnt1, driver);
		    
		    utility.clickOnWebElement1(Next_mmnt1, driver);
		    
		    utility.clickOnWebElement1(Final_ex_Date1, driver);
		    
		    utility.clickOnWebElement1(Actual_gd, driver);
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(Actual_gr_send).sendKeys(Actual_Grade);
		    
		   utility.clickOnWebElement1(Select_Actual_GD, driver);
		   
		   utility.clickOnWebElement1(Assaying_Date_Button1, driver);
		   
		   utility.clickOnWebElement1(Assayng_Date_Today1, driver);
		   
		   driver.findElement(Additional_Ch).sendKeys("OK");
		    
		   Thread.sleep(1000);
		   
		  int Parameter_Records=Integer.parseInt(Number_Of_Para);
		   
		   switch(Parameter_Records){
		   
		   case 1:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   break;
			   
		   case 2:  
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   break;
			   
		   case 3:  
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				 //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   break;
			   
		   case 4:
			   
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   break;
			
		   case 5:
			  
			   //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   break;
			   
		   case 6:
			 //Parameter Details 1
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
			   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
			   
			   //Parameter Details 2
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
			   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
			   
			   //Parameter Details 3
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
			   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
			   
			   //Parameter Details 4
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
			   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
			   
			   //Parameter Details 5
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
			   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
			   
			   //Parameter Details 6
			   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
			   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
			   break;
			   
		   case 7:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				   break;
				  
		   case 8:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   break;
				     
		   case 9:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   break;   
		   case 10:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10); 
				   break; 
				   
		   case 11:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
				   
				 //Parameter Details 11
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
				   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
				   break;   
			   
		   case 12:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
				   
				 //Parameter Details 11
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
				   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
				   
				 //Parameter Details 12
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
				   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
				  
				   break;   
				   
		   case 13:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
				   
				 //Parameter Details 11
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
				   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
				   
				 //Parameter Details 12
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
				   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
				   
				 //Parameter Details 13
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
				   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13); 	  
				   break;    
				   
		   case 14:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
				   
				 //Parameter Details 11
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
				   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
				   
				 //Parameter Details 12
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
				   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
				   
				 //Parameter Details 13
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
				   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13);
				   
				 //Parameter Details 14
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_14,driver);
				   driver.findElement(Parameter_Detail_14_Send).sendKeys(Para_14); 
				   break;  
		         
		   case 15:
				 //Parameter Details 1
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_1,driver);
				   driver.findElement(Parameter_Detail_1_Send).sendKeys(Para_1);
				   
				   //Parameter Details 2
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_2,driver);
				   driver.findElement(Parameter_Detail_2_Send).sendKeys(Para_2);
				   
				   //Parameter Details 3
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_3,driver);
				   driver.findElement(Parameter_Detail_3_Send).sendKeys(Para_3);
				   
				   //Parameter Details 4
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_4,driver);
				   driver.findElement(Parameter_Detail_4_Send).sendKeys(Para_4);
				   
				   //Parameter Details 5
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_5,driver);
				   driver.findElement(Parameter_Detail_5_Send).sendKeys(Para_5);
				   
				   //Parameter Details 6
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_6,driver);
				   driver.findElement(Parameter_Detail_6_Send).sendKeys(Para_6);
				   
				 //Parameter Details 7
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_7,driver);
				   driver.findElement(Parameter_Detail_7_Send).sendKeys(Para_7);
				 
				 //Parameter Details 8
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_8,driver);
				   driver.findElement(Parameter_Detail_8_Send).sendKeys(Para_8);
				   
				 //Parameter Details 9
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_9,driver);
				   driver.findElement(Parameter_Detail_9_Send).sendKeys(Para_9);
				   
				 //Parameter Details 10
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_10,driver);
				   driver.findElement(Parameter_Detail_10_Send).sendKeys(Para_10);
				   
				 //Parameter Details 11
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_11,driver);
				   driver.findElement(Parameter_Detail_11_Send).sendKeys(Para_11);
				   
				 //Parameter Details 12
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_12,driver);
				   driver.findElement(Parameter_Detail_12_Send).sendKeys(Para_12);
				   
				 //Parameter Details 13
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_13,driver);
				   driver.findElement(Parameter_Detail_13_Send).sendKeys(Para_13);
				   
				 //Parameter Details 14
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_14,driver);
				   driver.findElement(Parameter_Detail_14_Send).sendKeys(Para_14); 
				   
				 //Parameter Details 15
				   utility.DoubleClick1(NERLConstants.Parameter_Detail_15,driver);
				   driver.findElement(Parameter_Detail_15_Send).sendKeys(Para_15);
				   break;   
				  }
		   
		   
		   
		   Thread.sleep(3000);
		   utility.clickOnWebElement1(Fetch_Button, driver);
		   
		   utility.clickOnWebElement1(Save_Ass_Details_Button, driver);

		   Result_Check(EWR_Save_Validation, "Assaying Transaction Details Saved Successfully.");
		   
		   utility.clickOnWebElement(NERLConstants.Approve_EWR_Button, driver);
		   
		   driver.switchTo().alert().accept();
		   
		   driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		   
		   Result_Check(EWR_Save_Validation, "EWR Transaction Approved Successfully.");

		}
		
	}
	
	
	public void Result_Check(By XPATH,String Expected_Result){
		
		String Actual_Validation=driver.findElement((XPATH)).getText();
		
		assertEquals(Actual_Validation, Expected_Result);
	}
    
	public void Result_Check1(String XPATH,String Expected_Result){
		
		String Actual_Validation=driver.findElement(By.xpath(XPATH)).getText();
		
		assertEquals(Actual_Validation, Expected_Result);
	}
	public String Transaction_Number() throws InterruptedException{
		Thread.sleep(3000);
		String Reference_No=driver.findElement(By.xpath(".//*[@id='content']/div/data/div/div/ul/table/tbody/tr/td[1]")).getText();
		                                                 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		System.out.println(Reference_No);
			String string = Reference_No;
			String[] parts = string.split(":-      ");
			String part1 = parts[0];
			this.part2 = parts[1];
			System.out.println("Transaction number is : "+part2);
			return part2;
			
		}

	public String Transaction_Number2() throws InterruptedException{
		Thread.sleep(3000);
		String Reference_No=driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
		                                                
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		System.out.println(Reference_No);
			String string = Reference_No;
			String[] parts = string.split(":-      ");
			String part1 = parts[0];
			this.part2 = parts[1];
			System.out.println("Transaction number is : "+part2);
			return part2;
			
		}

	public String Transaction_Number3() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("Inside transaction number");
		String Reference_No=driver.findElement(By.xpath("//*[@id='content']/div/data/div/div[3]/div/table/tbody/tr/td[1]")).getText();
		                                                 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		System.out.println(Reference_No);
			String string = Reference_No;
			String[] parts = string.split(":-      ");
			String part1 = parts[0];
			this.part2 = parts[1];
			System.out.println("Transaction number is : "+part2);
			return part2;
			
		}
	public String EWR_Number(){
		
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	 	String EWR_Nor = (String) jse.executeScript("return arguments[0].value;",driver.findElement(By.xpath("//input[@name='ewrNo']")));
	 	                                                                                                                
	 	System.out.println("EWR number is ="+ EWR_Nor);
	    
	    String string1 = EWR_Nor;
		String[] parts6 = string1.split("2200");
		String part3 = parts6[0];
		String part4 = parts6[1];
		System.out.println(part3);
		System.out.println("ENWR number is : "+part4);

		return part4;
	}
}