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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		HumanityMeni.clickOnStaffButton(driver);
		HumanityStaff.clickOnAddEmployeesButton(driver);
		Thread.sleep(3000);
		HumanityStaff.inputFirstName1Field(driver);			
		HumanityStaff.inputLastName1Field(driver);
		HumanityStaff.inputEmail1Field(driver);
		HumanityStaff.clickSaveEmployeesButton(driver);
						
		driver.navigate().back();
		driver.navigate().back();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Aleksa Aleksic" + "')]"));
		Assert.assertTrue(list.size() > 0, "Text not found!");
		
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		}finally {
			
			driver.quit();
		}
		
	}


}
