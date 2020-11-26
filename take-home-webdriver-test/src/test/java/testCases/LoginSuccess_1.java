package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import testPages.HomePage;
import testPages.LoginPage;
import utilities.Utils;

public class LoginSuccess_1 extends BaseTest {
	
	@Test
	public void userAbleToValidateErrorTextOnSignInpage(){
		
		LoginPage sp = new LoginPage(driver);
		driver.get(Utils.BASE_URLS + "/login");
		sp.getUserName().sendKeys(Utils.USER_NAME);
		sp.getPassword().sendKeys(Utils.CORRECT_PASSWORD);
		sp.getSignInBtn().click();
		
		HomePage hp = new HomePage(driver);
		String successTextMessage = hp.getLoginSuccessMessage().getText();
		assertEquals(Utils.LOGIN_EXPECTED_SUCCESS_MESSAGER, successTextMessage);
		//sleepTest(1000);			
		
	}
	
	

}