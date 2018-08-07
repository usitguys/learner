import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BlueFlyTest extends BaseClass {
	
	
	@Test
	public void testBlueFlySignIn() {
		Assert.assertEquals(signInButtonTrue(), true);		
		
	}

	
	@Test
	public void testBlueFlySearch() {
		Assert.assertEquals(searchButtonTrue(), true);
		
	}
	
	@BeforeClass
	public void openBrowser() {	
		openUpBlueFly();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		quitChrome();
	}


}
