package rs.itbootcamp.humanity.page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMeni;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	@Test
	public static void testAddNewEmployee() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	try {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HumanityHome.clickOnEmailField(driver);
		HumanityHome.inputEmail(driver);
		HumanityHome.clickOnPasswordField(driver);
		HumanityHome.inputPassword(driver);
		HumanityHome.clickOnFinalLogInButton(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		HumanityMeni.clickOnStaffButton(driver);
		HumanityStaff.clickOnAddEmployeesButton(driver);
		HumanityStaff.inputFirstNameField(driver);			
		HumanityStaff.inputLastNameField(driver);
		HumanityStaff.inputEmailField(driver);
		HumanityStaff.clickSaveEmployeesButton(driver);
						
		driver.navigate().back(); 
		driver.navigate().back();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Aleksa Aleksic" + "')]"));
		Assert.assertTrue(list.size() > 0, "Wrong!");
		
		}catch (AssertionError asserterror) {
			Assert.fail();
			System.out.println(asserterror.getMessage());
		}finally {
			
			driver.quit();
		}
		
	}

}
