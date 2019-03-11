package Home_Work;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 6t");
		
		driver.findElementByClassName("nav-input").click();
		
		driver.findElementByXPath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']").click();
		
		driver.findElementById("add-to-cart-button").click();
	
	}

}
