package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMeni;
import rs.itbootcamp.humanity.page.objects.HumanityMeni;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {

	
@Test
public static void settingsTest() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	try {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver);
		HumanityHome.clickOnEmailField(driver);
		HumanityHome.inputEmail(driver); //valid email
		HumanityHome.clickOnPasswordField(driver);
		HumanityHome.inputPassword(driver); //valid password
		HumanityHome.clickOnFinalLogInButton(driver);
		Thread.sleep(8000);
		System.out.println("dosao sam dovde");
		HumanityMeni.clickOnSettingsButton(driver);
		System.out.println("kliknuo sam settings");

		String country="Serbia";
		HumanitySettings.selectCountry(driver, country);
		HumanitySettings.selectDefaultLanguage(driver, "Croatian (machine)");
		HumanitySettings.selectTimeFormat(driver, "24 hour");
		String s=HumanitySettings.getSelectCountry(driver).getFirstSelectedOption().getText();
		Thread.sleep(3000);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(s, country);
		
	}catch (AssertionError asserterror) {
		Assert.fail();
		System.out.println(asserterror.getMessage());
	}finally {
		
		driver.quit();
	}
}

}
