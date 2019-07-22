//kobster testing - this is login and order plceing functionlity 
package newelite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions_locators {

	  WebDriver driver;
		//Login locators
	  By username=By.id("login_email");
	  By password=By.id("login_passwd");
	  By clicksubmit=By.id("SubmitDashLogin");
	  
	  //Region selection
	  By procure=By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/ul/li[2]/div/a");
	  By stateselect=By.id("stateSelect");
	  
	  //Adding product to cart 
	  By Productq1=By.id("listProduct_91_3511");
	  By Productq2=By.id("listProduct_91_201256");
	  By addcart=By.xpath("//*[@id=\"purchaseListForm\"]/div[2]/div/button");
      By cartnext=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/button[2]");	  
	   //reorder 
	  By Orders=By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/ul/li[3]/div/a");
	  By reorder=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/button[2]");
      By Next=By.xpath("//*[@id=\"addressSelection\"]/div/div[3]/div[4]/button[2]");	  
	  By PO =By.id("po-number");
      By uploadpo=By.xpath("//*[@id=\"upload-po\"]/label");
      By payment=By.id("PENDING FOR APPROVAL");
      
       //Reorder in Order status widget
      By Orderfromwidget=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]");
      By reorderfromwidget=By.xpath("//*[@id=\"orderContent\"]/div/div[5]/button");
      By Dashboard=By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/ul/li[1]/div/a/span");
      
        //Order by Excel 
      By orderbyexcel=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[1]/div/div[2]/a");
      By downloadexcel=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/ul/li[1]/div[2]/button");
      By choosefile=By.id("upload-purchase-order-input");
      By uploadfile=By.xpath("//*[@id=\"upload-purchase-order\"]/button");
      By cartexcel=By.xpath("//*[@id=\"poListForm\"]/div[2]/div/button");
      
       //Reorder list
      By procurereorderlsit=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]/div[1]/div/div[3]/a");
      By procurereorder =By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]");
      
      
    //logout
      By account=By.xpath("//*[@id=\"sticky\"]/div[3]/div[6]/a/span");
      By logoff=By.xpath("//*[@id=\"logoutLink\"]");
      
      
      
      public Actions_locators(WebDriver driver)
		{
		  this.driver=driver;
			
		}

//Login to the site	  
public void login(String uname,String upassword)

{
	
   driver.findElement(username).sendKeys(uname);	
   driver.findElement(password).sendKeys(upassword);
   driver.findElement(clicksubmit).click();

}

//State selection 
public void Selectstate() throws InterruptedException
{

	driver.findElement(procure).click();
	Thread.sleep(2000);
	driver.findElement(stateselect).click();
	Thread.sleep(2000);
	Select region=new Select(driver.findElement(stateselect));
	region.selectByIndex(2);
	Thread.sleep(2000);
}

//Order placing using Adding the products to cart 
public void Orderplace_001_Addtocart() throws InterruptedException, AWTException 
{
   Thread.sleep(10000);
   driver.findElement(Productq1).clear();
   Thread.sleep(4000);
   driver.findElement(Productq1).sendKeys("10");
   Thread.sleep(5000);
   driver.findElement(Productq2).clear();
   Thread.sleep(4000);
   driver.findElement(Productq2).sendKeys("5");
  
   Thread.sleep(8000);
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");     

   driver.findElement(addcart).click();
   Thread.sleep(5000);
   
   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");     
	Robot page=new Robot();
	page.keyPress(KeyEvent.VK_PAGE_DOWN);
	page.keyRelease(KeyEvent.VK_PAGE_DOWN);

   driver.findElement(cartnext).click();
   Thread.sleep(2000);
}
  public void addresspage() throws AWTException, InterruptedException {
	  
	    Thread.sleep(5000);
	    Robot page=new Robot();
		page.keyPress(KeyEvent.VK_PAGE_DOWN);
		page.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);
		driver.findElement(Next).click();
		Thread.sleep(2000);

	  
  }

//Order placing using REORDER option
public void Orderplace_002_Reorder() throws Exception
{
	Thread.sleep(3000);
	driver.findElement(Orders).click();
	Thread.sleep(3000);
	driver.findElement(reorder).click();
	Thread.sleep(2000);
	
}
//confirmation page 	
public void confrmtionpage() throws InterruptedException, AWTException {
		
	Thread.sleep(2000);
	driver.findElement(PO).sendKeys("kobster12345");
	Thread.sleep(5000);
 

	//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(uploadpo)).sendKeys("C:\\Users\\Sivadass\\Desktop\\Defects screenshot\\0.png");

	WebElement podoc=driver.findElement(uploadpo);
    podoc.click(); 	
	WebElement frame =driver.switchTo().activeElement();
	Thread.sleep(5000);
	frame.sendKeys("C:\\Users\\Sivadass\\Desktop\\Defects screenshot\\0.png");
	Thread.sleep(5000);
	
	WebElement pendingapproval= driver.findElement(payment);
	pendingapproval.click();
    WebElement frame2=driver.switchTo().activeElement();
    frame2.click(); 
    
    Thread.sleep(10000);

	
}

public void Orderplace_003_Widget() throws InterruptedException {
	
	Thread.sleep(3000);
    driver.findElement(Dashboard).click();
    Thread.sleep(5000);
    driver.findElement(Orderfromwidget).click();
    Thread.sleep(2000);
    driver.findElement(reorderfromwidget).click();
	
	
}

public void Orderplace_004_orderByExcel() throws InterruptedException, AWTException {
	Thread.sleep(3000);
	driver.findElement(procure).click();
	Thread.sleep(2000);
	driver.findElement(orderbyexcel).click();
	Thread.sleep(2000);
	driver.findElement(downloadexcel).click();
	Thread.sleep(2000);
	driver.findElement(choosefile).sendKeys("C:\\Users\\Sivadass\\Desktop\\Test cases\\33171purchase-order (5).xlsx");
	Thread.sleep(2000);
	driver.findElement(uploadfile).click();
Thread.sleep(5000);
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");     

	driver.findElement(cartexcel).click();
	Thread.sleep(5000);
	
	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");     
	Robot page=new Robot();
	page.keyPress(KeyEvent.VK_PAGE_DOWN);
	page.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	driver.findElement(cartnext).click();
		
}

  //Reorder list in procure/Buy section 
public void Orderplace_005_reorderlist() throws InterruptedException {
	
	Thread.sleep(3000);
	driver.findElement(procure).click();
	Thread.sleep(3000);
	driver.findElement(procurereorderlsit).click();
	Thread.sleep(3000);
	driver.findElement(procurereorder).click();
	
	
}






}
