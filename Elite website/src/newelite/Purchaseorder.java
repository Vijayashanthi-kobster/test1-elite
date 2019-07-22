package newelite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Purchaseorder {
	  WebDriver driver;
     
	  By addnewpo=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[4]/div[1]/a");
	  By ponumber=By.id("poNumber");
	  By podate=By.id("poDate");
	  By podatecalender=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[3]");
	  By povalidfrom=By.id("poValidFrom");
	  By povalidto=By.id("poValidThrough");
	  By poaddress=By.xpath("//*[@id=\"selectCabinCrews\"]/div/div[1]/div[1]");
	  By poamount=By.id("poValue");
	  By pofile=By.id("upload-purchase-order-budget-input");
	  By posubmit=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[3]/button");
	  
	
	
	
	
	
	
	  public Purchaseorder(WebDriver driver)
			{
			  this.driver=driver;
				
			}

	  
	
	  public void AddNewPO() throws InterruptedException {
		  
		  Thread.sleep(2000);
		  driver.findElement(ponumber).sendKeys("KOBSTER_001");
		  Thread.sleep(2000);
		driver.findElement(podate).click();
	
		   ((JavascriptExecutor)driver).executeScript("document.getElementByXpath('//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[3]').setAttribute('value','June 12, 2019')"); 
		   Thread.sleep(2000);

		driver.findElement(povalidfrom).click();
		   ((JavascriptExecutor)driver).executeScript("document.getElementByXpath('//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[3]').setAttribute('value','June 18, 2019')"); 
		   Thread.sleep(2000);

		
		
		driver.findElement(povalidto).click();
		   ((JavascriptExecutor)driver).executeScript("document.getElementByXpath('//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[3]').setAttribute('value','June 20, 2019')"); 
		   Thread.sleep(2000);

		
		driver.findElement(poaddress).click();
		driver.findElement(poamount).sendKeys("10000");
		  driver.findElement(pofile).sendKeys("");
		  driver.findElement(posubmit).click();
		  
		  
	  }
	  
	  
}
