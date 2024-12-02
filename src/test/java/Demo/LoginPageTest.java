package Demo;

import org.testng.annotations.Test;

import PageObjectModel.LoginPage;

public class LoginPageTest extends baseTest{
	@Test
	public void SuccessLoginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("standard_user");
		loginPage.setPassword("secret_sauce");
		loginPage.ClickLogin();
		Thread.sleep(3000);
	}
}
