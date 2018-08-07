import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlueFlyTest extends BaseClass {
	
	
	@Test
	public void testBlueFlySignIn() {
		Assert.assertEquals(signInButtonTrue(), true);		
		
	}
	//The BeforeClass is used to open up the browser
	@BeforeClass
	public void openBrowser() {	
		openUpBlueFly();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		quitChrome();
	}


}
