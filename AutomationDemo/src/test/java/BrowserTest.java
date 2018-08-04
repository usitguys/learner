
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserTest extends BaseClass{
	
	
	
	
	@Test
	public void testme() {
		
		Assert.assertEquals(submitButtonTrue(),true);	
		
	}
	
	@Test
	public void testLogin() {		
		System.out.println("ashdfkjdsahfkjlhasklhfkjdsahkljd");	
		
	}
	
	@BeforeClass
	public void openBrowser() {	
		openChrome();
		
	}
	

	
	@AfterClass
	public void closeBrowser() {
		
		quitChrome();
	}
	

}
