import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	//this is the webdriver instance
	WebDriver driver;
	
	public By signInButton =By.linkText("SIGN IN");
	public By submitButton=By.name("websubmit");
	
	
	public void launchChromeBrowser() {
		//setup Chrome driver server
		System.setProperty("webdriver.chrome.driver","//Users//mdrubel//Documents//driver//chromedriver");    
		driver=new ChromeDriver();
	}
	


	public void openChrome() {
		launchChromeBrowser();// Testing 
		navigateToURL("http://www.facebook.com");
		
	}
	
	public void quitChrome() {
		driver.quit();
		
	}
	
	public boolean submitButtonTrue() {
		
		return driver.findElement(submitButton).isDisplayed();
		
	}
	
	public void openUpBlueFly() {
		launchChromeBrowser();
		navigateToURL("http://www.bluefly.com");
		
	
	}
	
	public boolean signInButtonTrue() {
		return driver.findElement(signInButton).isDisplayed();
	}
	
	public void navigateToURL(String URL) {
		driver.get(URL);
	}
	
	
}
