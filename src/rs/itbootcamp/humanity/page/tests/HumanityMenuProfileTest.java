package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMeni;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityMenuProfileTest {
@Test
	public static void testAppVersion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();
			HumanityHome.clickLoginButton(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			HumanityHome.clickOnEmailField(driver);
			HumanityHome.inputEmail(driver); //valid email
			HumanityHome.clickOnPasswordField(driver);
			HumanityHome.inputPassword(driver); //valid password
			HumanityHome.clickOnFinalLogInButton(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			HumanityMeni.clickOnArrowDownButton(driver);
			HumanityMeni.clickOnProfileButton(driver);
			HumanityProfile.clickEditDetailsButton(driver);
			HumanityProfile.uploadPicture(driver);
			
		}catch (AssertionError asserterror) {
			Assert.fail();
			System.out.println(asserterror.getMessage());
		}finally {
			
			driver.quit();
		}
}
}
