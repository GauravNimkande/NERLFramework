package withdrawal_pkg;

public class Withdrawal_Cons {
	//.........................Test case 1-......................
	// Enter user id 
	public static final String Login_UserID="//*[@id='l-login']/form/div[2]/div/div[1]/div/input";
	
	//Enter PW
	public static final String Login_User_Password="//*[@id='l-login']/form/div[2]/div/div[2]/div/input";
	//Click on Login arrow key 
	public static final String Login_Arrow_Key="//*[@id='l-login']/form/a";
	//Menu list icon
	public static final String Menu_List_icon="//*[@id='menu-trigger']";
	
	//Click on Quantity Deduction menu
	public static final String Quantity_Deduction_menu="//*[@id='mCSB_1_container']/ul/li[4]/a";
	//public static final String Quantity_Deduction_menu="//*[@id='mCSB_1_container']/ul/li[5]/a";                                                 
	
	
	//Click on submenu (Quantity Deduction)
	//public static final String Quantity_Deduction_Submenu="//*[@id='mCSB_1_container']/ul/li[5]/ul/li[1]/a";
	public static final String Quantity_Deduction_Submenu=" //*[@id='mCSB_1_container']/ul/li[4]/ul/li[1]/a";
	                                                      
	
   // Click on left arrow key 
	public static final String Left_arrow_key1="//*[@id='menu-trigger']/div"; 
	// Click on Warehouse Toggle
	public static final String Click_Warehouse_Toggle="//*[@id='content']/div/data/div/form/div/div/div[1]/div[3]/button";
	//Enter warehouse code from list
	public static final String Enter_Warehouse_code="html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	                                                //html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input
	//Select check box
	public static final String Select_Checkbox1="//*[@id='content']/div/data/div/form/div/div/div[3]/div[6]/button";
	                                           
	//Click on commodity toggle
	public static final String Click_Commodity_toggle="//*[@id='content']/div/data/div/form/div/div/div[2]/div[6]/button";
	//Enter commodity id
	public static final String Enter_Commodity_id="html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	                                              //html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input
	//Select checkbox
	public static final String Select_checkbox2="html/body/section/section/div/data/div/div[6]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div";
	//Click toggle of Beneficiary Id
	public static final String Toggle_Beneficiaryid="//*[@id='content']/div/data/div/form/div/div/div[4]/div[3]/button";
	//Enter Beneficiary id
	public static final String Enter_Beneficiary_ID="/html/body/section/section/div/data/div/div[8]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	                                                 
	//Select Check box
	public static final String Select_checkbox3="html/body/section/section/div/data/div/div[8]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div";
	//click on fetch button 
	public static final String Fetch_button ="//*[@id='content']/div/data/div/form/div/div/div[8]/div/button[1]";
	//Enter EWR NO
	public static final String Enter_EWR_NO="html/body/section/section/div/data/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	                                         
	//Select checkbox4
	public static final String Select_checkbox4="html/body/section/section/div/data/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/div/div";
	
	//Click on select button 
	public static final String Select_button="//*[@id='content']/div/data/div/div[3]/div/div[2]/div/div[2]/div[2]/div/button";
	
	public static final String EWR_Add_Validation_Message="//div[@role='alert']";
	 //NO of Begs
	public static final String No_of_Begs="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[3]/div";
	                                       
	                                       //For data clear from input no of Begs
	public static final String Clear_data="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[7]/div/input";
	 //Enter input no of begs                                 
	public static final String Input_no_of_begs="/html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[6]/div/input";
	                                            
	//Storage cherge till date                   
	public static final String Storage_cherge_till_date="html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[9]/div/input";        
	                                                    //html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[9]/div/input
	//Click on save button 
	public static final String Save_button="//*[@id='content']/div/data/div/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]";
	//Validation message
	
	public static final String Validation_Message1="//div[@role='alert']";
	public static final String Validation_Message8="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	public static final String DOW_No_Capture="//*[@id='content']/div/data/div/div[2]/div/table/tbody/tr/td[1]";   
	public static final String DOW_No_Capture2="//*[@id='content']/div/data/div/div[2]/div[2]/table/tbody/tr/td[1]";
                                            	
   	//WOW txn no
	public static final String WOW_No_Capture="//*[@id='content']/div/data/div/div[2]/div[2]/table/tbody/tr/td[1]";   
	public static final String Pending_txn_Click="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input";
	                                              ///html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input
	//Click on submit button
	public static final String Submit_Button="//*[@id='content']/div/data/div/form/div/div/div[8]/div/button[3]";
	                                          //*[@id="content"]/div/data/div/form/div/div/div[8]/div/button[3]
	//Validation message
    public static final String Validation_Message2 ="//*[@id='content']/div/data/div/div[2]/div[2]/table/tbody/tr/td[1]"; 
                                                        
                                                 
	//Capture DOW NO    
	//public static final String DOW_NOS="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/a/input";
	public static final String DOW_NOS="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input";
	
  //.........................Test case 2......................
    
    //click on discard
    public static final String discard_button="//*[@id='content']/div/data/div/form/div/div/div[7]/div/button[4]";
    
  //*[@id="content"]/div/data/div/form/div/div/div[7]/div/button[4]
  //validation message -Please enter remarks
    public static final String Validation_message_remark="//*[@id='content']/div/data/div/div[1]";
 
    //Enter remark in text box
    public static final String Enter_remark="//*[@id='content']/div/data/div/form/div/div/div[5]/div[2]/textarea";
  
  //Now again  click on discard button 
    public static final String Agian_click_discard_button="//*[@id='content']/div/data/div/form/div/div/div[7]/div/button[4]";
    //validation message -Quantity Deduction Transaction has been discarded successfully.
    public static final String Validation_message3="//*[@id='content']/div/data/div/div[1]";
    
    //#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope
    
  //....................................TESTCASE 3 Login with CHECKER ..............................
    
  //Click on toggle for select pending transaction
     public static final String Click_toggle="//*[@id='header']/ul/li[3]/ul/li[3]/a";
   
      
    
    public static final String Click_Pending_transaction="//*[@id='header']/ul/li[3]/ul/li[3]/div/div[1]/div[2]/p/a";
    
   // public static final String Enter_Transaction_ref_no="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
    public static final String Enter_Transaction_ref_no="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";

    //public static final String Click_DOW_NO="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/a/input";
    public static final String Click_DOW_NO="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input";
    
    
    
    
    public static final String Click_Approve_button="//*[@id='content']/div/data/div/form/div/div/div[8]/div/button[5]";
    public static final String Click_Approve_WOW_button="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[3]";
    //validation message -"Quantity Deduction Transaction has been Approved successfully.
    
    public static final String Validation_message4="//*[@id='content']/div/data/div/div[1]";
    public static final String VAlidation_CSS_msg="//*[@id='content']/div/data/div/div[2]/div[1]/div";
                                                    
     
  //....................................TESTCASE 4 Login with WSP Maker..............................
    
    //Click on menu _toggle 
    public static final String Menu_Toggle= "//*[@id='menu-trigger']";
    
    //Click on Quantity_deduction_menu
    public static final String Quantity_deduction_menu_wsp ="//*[@id='mCSB_1_container']/ul/li[4]/a";
  //Click on Quantity_deduction_menu                 
   // public static final String Quantity_deduction_submenu_wsp="//*[@id='mCSB_1_container']/ul/li[4]/ul/li[1]/a";
    
    public static final String Quantity_deduction_submenu_wsp="//*[@id='mCSB_1_container']/ul/li[4]/ul/li[2]/a";
    //public static final String Quantity_deduction_submenu_wsp="//*[@id='mCSB_1_container']/ul/li[4]/ul/li[3]/a";
                                                              
  
  
                                                              
 // Click on arrow key for hide menu list
    public static final String Hidemenulist_arrow_key="//*[@id='menu-trigger']/div";
  //click on toggle for new window list
    public static final String DOW_Toggle_newwindow="//*[@id='content']/div/data/div/form/div/div/div[2]/div[3]/button";
  //Enter transaction ref no_dow details
    public static final String transaction_ref_no_wsp="html/body/section/section/div/data/div/div[4]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";

    //Select check box from grid table
    public static final String select_checkbox_wsp="html/body/section/section/div/data/div/div[4]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div";

                                                   
    //Enter EWR NO_WSP
    public static final String select_EWR_NO_WSP="html/body/section/section/div/data/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
    
  //Select check box from grid table EWR_NO_WSP
    public static final String EWR_N0_WSP_CHECKBOX="html/body/section/section/div/data/div/div[3]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div";
    //Click on select button
    public static final String select_button_wsp="//*[@id='content']/div/data/div/div[3]/div/div[2]/div/div[2]/div[2]/div/button";
    //Now click on check box from available ewr list
   public static final String checkbox_EWR="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div";
                              
  
  //Clear input no of begs 
    public static final String Clear_input_no_of_begs1="html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[7]/div/input";
                                                        //html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[7]/div/input                                       
    //Enter input no of begs                                 
   	public static final String Input_no_of_begs1="html/body/section/section/div/data/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[7]/div/input";
    
                                                 
   	//Click on input physical quantity 
   	public static final String input_physical_quantity_gridtable="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div/div/div[8]/div"; 
	                                                             
   	
   	//click on save button     
   	public static final String save_button1="//*[@id='content']/div/data/div/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]";
                                            //*[@id="content"]/div/data/div/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]
   	//validation message capture 
   	public static final String validation_message5="//div[@role='alert']";
   	//Now click on submit button 
   	public static final String Click_submit_button2="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[1]";
   	public static final String Click_Approve_button1="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[3]";
   	
   	                                                
  //validation message - WOW Transaction has been submitted successfully. 
   	public static final String validation_message6="//*[@id='content']/div/data/div/div[1]";
   	public static final String validation_message7="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
   	
   	public static final String Download_Receipt="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[5]";
   	
  //..............................WSP2002 DISCARD...............................
   	
   	public static final String discardbutton_final="//*[@id='content']/div/data/div/div[4]/div/div[7]/div[3]/button[3]";
	
	//..........................Test case 6 .... discard by WSP Maker-- WSP2001..................
   	
   	public static final String wow_Submit_Button_="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[1]";
  //*[@id="content"]/div/data/div/div/div/div[1]/form/div/div/div[10]/div[5]/div/button
   	
   	
	public static final String wow_capture1="//*[@id='content']/div/data/div/div[2]/div/table/tbody/tr/td[1]";
	public static final String wow_capture2="//*[@id='content']/div/data/div/div[3]/div/table/tbody/tr/td[1]";
	
	public static final String Reject_button= "//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[4]";
	public static final String Remark_field="//*[@id='content']/div/data/div/form/div/div/div[7]/div[2]/textarea";
	//..........................Test case 8 .... resubmit by WSP Maker-- WSP2001..................
	 // Click on discard button 
	public static final String Resubmit_button_wsp_M="//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[1]";
	//..........................Test case 8 .... discard  by WSP checker-- WSP2002..................
	public static final String Discard_button_cheker= "//*[@id='content']/div/data/div/form/div/div/div[9]/div/button[2]";
	
	//.....................##########  NEW MODULE - PLEDGEE_INVOCATION  ##########...........................
//...............TESCASE 1:- 
	
	public static final String Menu_Link ="//*[@id='menu-trigger']/div";
	public static final String Navigation_Pledge ="//*[@id='mCSB_1_container']/ul/li[2]/a";
	public static final String Pledge_invoke_link="//*[@id='mCSB_1_container']/ul/li[2]/ul/li[2]/a";
	public static final String Pledge_Redeem_link1="//*[@id='mCSB_1_container']/ul/li[2]/ul/li[1]/a";                                               
	
	public static final String Menu_trigger = ".//*[@id='menu-trigger']/div";      
	public static final String Loan_account_no_toggle  = "//*[@id='content']/div/data/div/div[3]/div/div[1]/div[3]/button"; 
	public static final String Loan_account_details_list ="html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	public static final String Loan_account_details_list1 ="html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/input";
	public static final String Checkbox_loan_account ="html/body/section/section/div/data/div/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div";
	                                                   
	public static final String To_Beneficiary_Id = "//*[@id='content']/div/data/div/div[3]/div/div[5]/div[2]/input";   
	                                                
	public static final String Fetch_button1 ="//*[@id='fetch']"; 
	
	
	                                          
	public static final String enter_ewr ="html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	public static final String select_checkbox_ewr ="html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div";
	public static final String select_button_pledgee = "//*[@id='content']/div/data/div/div[4]/div/div[2]/div/div[2]/div[2]/div/button";
	public static final String after_select_validation_msg ="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	                                                         
	//public static final String enter_ewr1 ="html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";                                                         
	public static final String ewr_checkbox = " html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div";
	                                          
	//public static final String enter_invoke_unit="html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input";
	
	public static final String enter_invoke_unit="html/body/section/section/div/data/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div/input";

	

	
	public static final String loan_amount_to_relese ="html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[5]/div";
	public static final String Click_save_button ="//*[@id='content']/div/data/div/div[5]/div/div[1]/div/div[2]/div[2]/div/button[1]";
	public static final String Validation_message_Approval ="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	public static final String Validation_message_Savebuttom="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	public static final String Click_submit_button_pledgee ="//*[@id='content']/div/data/div/div[4]/div/div[7]/div[2]/button[2]";
	public static final String Click_submit_button_pledgee1 ="//*[@id='content']/div/data/div/div[3]/div/div[7]/div[2]/button[2]";
	public static final String Click_submit_button_pledgee2="//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[2]";                                                          
	public static final String Validation_message_pledgee2="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope"; 

 static final String Invoke_no_capture= "//*[@id='content']/div/data/div/div[3]/div/table/tbody/tr/td[1]";	
	 
  //test case 2
	//public static final String Txn_no ="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	public static final String Txn_no ="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
                                
	//public static final String Click_Txn_no ="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/a/input";
	public static final String Click_Txn_no ="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input";
	
	public static final String Approve_button_pledgee= "//*[@id='content']/div/data/div/div[3]/div/div[7]/div[3]/button[1]";
	public static final String Validation_message_pledgee ="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";                                                  
	public static final String Click_discard = "//*[@id='content']/div/data/div/div[4]/div/div[7]/div[2]/button[4]";
	
	public static final String Click_Approve_button2 ="//*[@id='content']/div/data/div/div[3]/div/div[7]/div[3]/button[1]";                                            
	public static final String Remark_message="//*[@id='content']/div/data/div/div[2]";
	public static final String Remark_message1="#content > div > data > div > div.alert.alert-danger.ng-binding.ng-scope";
	                                            
	                                            
	public static final String Enter_remark_discard ="//*[@id='content']/div/data/div/div[4]/div/div[6]/div[2]/textarea";
	

	public static final String Discard_button_pledgee="//*[@id='content']/div/data/div/div[4]/div/div[7]/div[2]/button[4]"; 
	public static final String Discard_button_pledgee3="//*[@id='content']/div/data/div/div[3]/div/div[7]/div[3]/button[3]";
	                                                   
	                                                  
	
	public static final String Enter_remark_reject ="//*[@id='content']/div/data/div/div[4]/div/div[6]/div[2]/textarea";
	public static final String Enter_remark_reject1 ="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[24]/button[4]";
	public static final String Reject_button_pledgee="//*[@id='content']/div/data/div/div[3]/div/div[7]/div[3]/button[2]";
	public static final String Reject_button_pledgee1= "//*[@id='content']/div/data/div/div[4]/div/div[7]/div[3]/button[2]";
	                                          
	public static final String Reject_validation_plrdgee="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	
	                                                     
	public static final String Discard_validation ="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	
	//       Pledgee Redemption
	//public static final String Pledgee_Submenu = "//*[@id='mCSB_1_container']/ul/li[8]/a";
	public static final String Pledgee_Submenu = "//*[@id='mCSB_1_container']/ul/li[7]/a";
	
	//public static final String Pledgee_redem = "//*[@id='mCSB_1_container']/ul/li[8]/ul/li[2]/a";
	public static final String Pledgee_redem = "//*[@id='mCSB_1_container']/ul/li[7]/ul/li[2]/a";
	
	public static final String Fetch_redem ="//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[1]";
	public static final String Enter_EWR= "html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	public static final String Enter_EWR_1= "html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input ";                                                               
	public static final String Select_EWR= "html/body/section/section/div/data/div/div[4]/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div";                                             
	public static final String Select_EWR_1 ="html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div ";                                      
    public static final String Double_Click1= "html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div";
	public static final String sendkey1= "html/body/section/section/div/data/div/div[5]/div/div[1]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[4]/div[2]/form/input"; 
	
	
	
	public static final String Click_select_button="//*[@id='content']/div/data/div/div[4]/div/div[2]/div/div[2]/div[2]/div/button";                                      
	public static final String Click_save="//*[@id='content']/div/data/div/div[4]/div/div[1]/div/div[2]/div[2]/div/button[1]";
	
	public static final String validation_message_save ="#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	
	public static final String Submit_Redeem ="//button[@data-ng-click='submitData()']";
	
	//public static final String Submit_Redeem ="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[24]/button[2]";
	public static final String validation_message_Submit= "#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	
	public static final String Redeem_no_capture= "//*[@id='content']/div/data/div/div[3]/div/table/tbody/tr/td[1]";
	 
	//public static final String Redeem_Txn_no="html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	public static final String Redeem_Txn_no="/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div[3]/div/div/input";
	
	
	//public static final String Redeem_Txn= "html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/a/input";                            
	public static final String Redeem_Txn= "/html/body/section/section/div/data/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div[1]/div/a/input";                            
	
	
	public static final String Approve_redeem="//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[3]";
	
	public static final String Approve_validation= "#content > div > data > div > div.alert.alert-success.ng-binding.ng-scope";
	public static final String Discard_redeem ="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[24]/button[5]"; 
	                                          
	public static final String Remark_textfield ="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[23]/textarea";
	                                              
	public static final String Remark_textfield1 ="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[23]/textarea";
	public static final String Redeem_Reject_button= "//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[4]";
	public static final String Redeem_Reject_button1= "//*[@id='content']/div/data/div/div[4]/div/div[4]/div[24]/button[4]";
	//*[@id="content"]/div/data/div/div[4]/div/div[4]/div[23]/textarea                       
	public static final String pledgee_discard_checker="//*[@id='content']/div/data/div/div[3]/div/div[4]/div[24]/button[5]";
	public static final String pledgee_discard_checker1="//*[@id='content']/div/data/div/div[4]/div/div[4]/div[24]/button[5]";
	public static final String Validation_discard="#content > div > data > div > div.alert.alert-danger.ng-binding.ng-scope";

	

	                                            
	
	
}
   	


                 
