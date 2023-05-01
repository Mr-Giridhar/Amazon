import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sofyware Learning\\Selinium\\Browser\\New Version 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Add Cart Redmi note 10 pro
		
		// URL of Amazon
		driver.get("https://www.amazon.in/");
		
		// Maximize browser and Delay execution for 5 sec. as to view the maximize browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Click DropDown, select Electronics, Enter mobile name
		Select drop = new Select (driver.findElement(By.id("searchDropdownBox")));
		drop.selectByVisibleText("Electronics");
		Thread.sleep(5000);
		WebElement text= driver.findElement(By.name("field-keywords"));
		text.sendKeys("Redmi note 10 pro");
		text.sendKeys(Keys.ENTER);
		
		// View the element
		WebElement ele = driver.findElement(By.xpath("//span[text()='Redmi Note 10 Pro (Dark Night, 8GB RAM, 128GB Storage) -120hz Super Amoled Display | 64MP with 5MP Super Tele-Macro']"));
		Thread.sleep(5000);
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();" , ele);
		Thread.sleep(5000);
		ele.click();
		
		// hold all window handles in array list
	     ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	     
	    //switch to new tab
	     driver.switchTo().window(newTb.get(1));
	     System.out.println("Page title of new tab: " + driver.getTitle());
	     Thread.sleep(5000);
	      
	  /* //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of parent window: " + driver.getTitle()); */
	     
	     // select 6GB Variant with scroll down
	     WebElement a = driver.findElement(By.xpath("//p[text()='6GB RAM,128GB Storage']"));
	     Thread.sleep(3000);
	     js.executeScript("arguments[0].scrollIntoView();" , a);
	     Thread.sleep(3000);
	     a.click();
	     Thread.sleep(3000);
	     
	     // Change color
	     driver.findElement(By.xpath("(//img[@class='imgSwatch'])[3]")).click();	
	     Thread.sleep(3000);
	     
	     // Click add cart
	     WebElement b = driver.findElement(By.id("add-to-cart-button"));
	     js.executeScript("arguments[0].scrollIntoView();" , b);
	     Thread.sleep(3000);
	     b.click();
	     
	     // Click Cart button
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
	     
	     // Close Browser
	        Thread.sleep(15000);
	        driver.close():
	     
	}

}
