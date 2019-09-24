package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMeni;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {
	

	@Test
	public static void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();
			HumanityHome.clickLoginButton(driver);
			HumanityHome.clickOnEmailField(driver);
			HumanityHome.inputEmail(driver);
			HumanityHome.clickOnPasswordField(driver);
			HumanityHome.inputPassword(driver);
			HumanityHome.clickOnFinalLogInButton(driver);
			HumanityStaff.clickOnAddEmployeesButton(driver);
			HumanityStaff.inputFirstNameField(driver);
			HumanityStaff.inputLastNameField(driver);
			HumanityStaff.inputEmailField(driver);
			Assert.assertEquals(driver.getCurrentUrl(), HumanityMeni.URL, "Problem getting URL");

		} catch (AssertionError asserterror) {
			Assert.fail();
			System.out.println(asserterror.getMessage());
		} finally {

			driver.quit();
		}

	}

}
