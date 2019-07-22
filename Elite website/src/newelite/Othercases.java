package newelite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Othercases {
	
	  WebDriver driver;

	  
	    //logout
    By account=By.xpath("//*[@id=\"sticky\"]/div[3]/div[6]/a/span");
    By logoff=By.xpath("//*[@id=\"logoutLink\"]");
    
	  //Region selection
	  By procure=By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/ul/li[2]/div/a");
	  By stateselection=By.id("stateSelect");
  
	   //In Dashbaord -region selction
	  By regiondashboard=By.xpath("//*[@id=\"state-selection-topbar\"]/a/span");
	   
	   //ReOrder 
	  By orderidlink=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[1]/a");
	  By reorderlink=By.xpath("//*[@id=\"orderContent\"]/div/div[5]/button");
	
	  //Supplier invite locators
	  By dashboardelite=By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/ul/li[1]/div/a/span");
	  By supplierlocator=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/a");
	  By suppliermailid=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/div[1]");
	  By inviteloc=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]/button");
	  
	  //procure/buy other validations 
	  By increase=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]/td[3]/div/span[3]");
	  By decrease=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]/td[3]/div/span[1]");
	  By priceamount=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]/td[2]/p[2]/span[1]");
	  By qtyvalue=By.xpath("//*[@id=\"listProduct_91_3511\"]");
	  By gstvalue=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]/td[4]/p[2]/span");
	  By totalpriceproduct=By.xpath("//*[@id=\"finalPrice_91_3511\"]");
	  
	  //supplier filter locators
	  By supplierlist=By.id("pl-supplier-filter");
	  By supplier1=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]/td[5]/p[2]/span");
	  By supplier2=By.xpath("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[2]/td[5]/p[2]/span");
	  
	  //Procure cart locators 
	  By procuresection=By.id("purchaseListForm");
	  By close=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/span/i");
	  By Clear=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/button[1]");
	  By plussymbol=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]/div/span[2]/i");
	  By minussysmbl=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/span[1]/i");
	  
	  //Order By Excel
      By orderbyexcel=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[1]/div/div[2]/a");
      By choosefile=By.id("upload-purchase-order-input");
      By uploadfile=By.xpath("//*[@id=\"upload-purchase-order\"]/button");
      By errormsg=By.xpath("//*[@id=\"app\"]/div/div[2]/div");
	  
      //widget
      By widgetclose1=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/button/i");
      By widgetclose2=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/button/i");
      By widgetclosemsg=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]");
      By addwidget=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/a");
      By orderwidget=By.xpath("//*[@id=\"widget_10\"]/div/div/button");
      By topcatewidget=By.xpath("//*[@id=\"widget_12\"]/div/div/button");
      By approvalwidget=By.xpath("//*[@id=\"widget_11\"]/div/div/button");
      By spendconwidget=By.xpath("//*[@id=\"widget_17\"]/div/div/button");
      By apprerrormsg=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]");
      By spenderrormsg=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]");
      
	  public Othercases(WebDriver driver)
			{
			  this.driver=driver;
				
			}
	
	  public void logout() throws InterruptedException 
	  {
			Thread.sleep(4000);
            driver.findElement(account).click();
			Thread.sleep(3000);
			driver.findElement(logoff).click();
			Thread.sleep(2000);
			
		}

	  public void  statedropdown() throws InterruptedException
	  {
		  
		 // By loadingImage = By.id("loading image ID");
		//  WebDriverWait wait = new WebDriverWait(driver, 30);
		  //wait.until(ExpectedConditions.invisibilityOfElementLocated(stateselect));
		  //driver.findElement(stateselect).click();
			
		  //WebElement frame =driver.switchTo().activeElement();
            //frame.click();
		  
		   Thread.sleep(5000);
            JavascriptExecutor jse = (JavascriptExecutor)driver;

            jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");     
  		     driver.findElement(stateselection).click();

            
            
			Thread.sleep(5000);
			Select region1=new Select(driver.findElement(stateselection));
			region1.selectByIndex(2);
			Thread.sleep(2000);

		  
	  }
	  
	  
	public void region_002_Region() throws InterruptedException
	{	
		Thread.sleep(3000);
		driver.findElement(regiondashboard).click();
		Thread.sleep(2000);
	}

	public void region_003_Reorder() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(orderidlink).click();
		Thread.sleep(3000);
		driver.findElement(reorderlink).click();
		
	}
	
	//Procure/Buy functionality-other validations 
	
	public void procure_001_procurebuy_validations() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(procure).click();
		Thread.sleep(3000);
		//driver.findElement(increase).click();
		
		for (int i = 0; i < 5; i++)
		{
			  driver.findElement(increase).click();
			  Thread.sleep(2000);
			  
		}
       System.out.println("Product's quantity increment test executed  successfully");
		for (int j = 0; j < 5; j++)
		{
			  driver.findElement(decrease).click();
			  Thread.sleep(2000);
			  
		}
      System.out.println("Product's quantity decrement test executed  successfully");
		
	}
	
	//Validation of total price in procure section
	public void procure_002_totalprice() throws InterruptedException 
	{
		Thread.sleep(2000);
		for (int i = 0; i < 5; i++)
		{
			  driver.findElement(increase).click();
			  Thread.sleep(1000);	  
		}
		//remove the 1st character from the price value  ?21.00
		String Product_price=driver.findElement(priceamount).getText();
          String a = Product_price.substring(2);
	      System.out.println("the price amount of selected product(String) = "+a);
		
	      //get the quantity value
	    
	    String Product_qty = driver.findElement(qtyvalue).getAttribute("value");
	    System.out.println("the quantity value of selected product(string) = "+Product_qty);
	   
	    double QTY_result=Double.parseDouble(Product_qty);  
	    System.out.println("the quantity count of selected product = "+QTY_result);

		
	    //get the GST value
		String Product_gst=driver.findElement(gstvalue).getText();
		System.out.println("GST value of selected product(String) = "+Product_gst);
	
		//remove the last character from gst value 18%
	    String b = Product_gst.substring(0, Product_gst.length() - 1);
	    System.out.println("trimmed value of GST = "+b);
		
		//string into double 		
	    double price_result=Double.parseDouble(a);  
	    System.out.println("the price amount of product = "+price_result);
	   
	    double GST_result=Double.parseDouble(b);  
	    System.out.println("GST value of product = "+GST_result);

	    Double total_sum_price_taxexcluded  = (price_result*QTY_result);
	    
	    Double total_sum_price_taxincluded = (((total_sum_price_taxexcluded * GST_result)/100) + total_sum_price_taxexcluded);
	    System.out.println("Total amount of product with tax included "+total_sum_price_taxincluded);
	      
	    
		String finalprice =driver.findElement(totalpriceproduct).getText();
        String d = finalprice.substring(2);

	    double total_result=Double.parseDouble(d);  

        Assert.assertEquals(total_sum_price_taxincluded, total_result);
        if(total_sum_price_taxincluded == total_result) {
        	
    	    System.out.println("System displaying correct total price with tax included -test executed successfully");
        }


	}

	//Validation of supplier filter 
	public void procure_003_supplierfilter() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(supplierlist).click();
		Select supp_dropdown=new Select(driver.findElement(supplierlist));
		supp_dropdown.selectByIndex(4);
		Thread.sleep(2000);
		
		  WebElement option = supp_dropdown.getFirstSelectedOption();
		  String appliedfilter = option.getText();
		 // System.out.println(appliedfilter );
	
		String beforexpath="//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[";
		String afterxpath ="]/td[5]/p[2]/span";
		
		 for(int i=1;i<=3;i++) {
			  String name=driver.findElement(By.xpath(beforexpath+i+afterxpath)).getText();
		      System.out.println(name);
	
		 
		      System.out.println("System displaying the data based on the applied supplier filter "+name.equals(appliedfilter));
		      
		 }
	
}

    //validation of total count of product in procure section
	public void procure_005_countofproduct() throws InterruptedException {
		
		Thread.sleep(4000);
		Select supp_dropdown=new Select(driver.findElement(supplierlist));
		supp_dropdown.selectByIndex(0);
		Thread.sleep(2000);  

//	A("//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[1]")

     //  String a= "//*[@id=\"purchaseListForm\"]/div[1]/div[1]/table/tbody/tr[";
       //String b ="]";

	}

	//Validation of remove and Clear functionality in cart 
    public void procure_004_removeclear() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.findElement(minussysmbl).click();          //validation of incraese and decrease 
    	Thread.sleep(5000);
    	driver.findElement(plussymbol).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(close).click();                //validation of close and clear functionality
    	Thread.sleep(4000);
    	driver.findElement(Clear).click();
    	Thread.sleep(2000);
    	
    	
    }
	
//Order BY Excel functionality 
    public void Orderbyexcel_001_unsupportfile() throws InterruptedException {
  
    Thread.sleep(3000);
	driver.findElement(orderbyexcel).click();
	Thread.sleep(2000);
	driver.findElement(choosefile).sendKeys("C:\\Users\\Sivadass\\Desktop\\Test cases\\Sample-Test-Plan-Template (1).pdf");
	Thread.sleep(5000);
	driver.findElement(uploadfile).click();
    Thread.sleep(3000);

   System.out.println(driver.findElement(errormsg).getText());
   System.out.println("System doesnot allowing to upload the unsupported fiel ,test passed successfully");    

    }
    
    public void Orderbyexcel_002_hugefilesize() throws InterruptedException 
    {

    Thread.sleep(5000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.findElement(choosefile).sendKeys("C:\\Users\\Sivadass\\Desktop\\Test cases\\SampleDocs-SampleXLSFile_6800kb.xls");
	Thread.sleep(2000);
	driver.findElement(uploadfile).click();
   Thread.sleep(20000);
   driver.navigate().refresh();
    }

    //validation of adding/removing widget from dashboard
    public void Widget_001_widgetaddremove() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(dashboardelite).click();
    	Thread.sleep(2000);
    	driver.findElement(widgetclose1).click();
    	Thread.sleep(5000);
    	
		driver.findElement(widgetclose1).click();
    	Thread.sleep(4000);
    	driver.findElement(addwidget).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(orderwidget).click();
    	Thread.sleep(2000);
    	driver.findElement(topcatewidget).click();
    	Thread.sleep(2000);
    	
    }
    
    //Verify that Creator user cant add Spend Control7 Approvals widget
     public void Widget_003_widgetrestriction() throws InterruptedException {
    	 
    	 Thread.sleep(2000);
    	 driver.findElement(approvalwidget).click();
    	 Thread.sleep(2000);
    	 String actualmsg = driver.findElement(apprerrormsg).getText();
    	 System.out.println(actualmsg);
    	 String expectedmsg="You don't have an access to add this widget";
    	 System.out.println(actualmsg.equals(expectedmsg));
    	 System.out.println("System should not allow CREATOR to add approval widget -Test passed ");

    	 
    	 driver.findElement(spendconwidget).click();
    	 Thread.sleep(2000);
    	 String actualmsg1 =driver.findElement(spenderrormsg).getText();
    	 System.out.println(actualmsg1);
    	 String expectedmsg1="Sorry, this feature is only for approvers";
    	 System.out.println(actualmsg1.equals(expectedmsg1));
    	 System.out.println("System should not allow CREATOR to add SpendControl widget -Test passed ");

        }

    
    public void spenconrtol() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	
    	
    	
    	
    }
}
