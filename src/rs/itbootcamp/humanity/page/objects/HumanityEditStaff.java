package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {

	private static final String CLICK_ALLSTAFF = "//a[@class='mi first mitem']";
	private static final String CLICK_STAFF_MEMBER = "//a[contains(text(),'Duki duca')]";
	private static final String EDIT_DETAILS = "//a[contains(text(),'Edit Details')]";
	private static final String NICKNAME = "//input[@id='nick_name']";
	private static final String SAVE_EMPLOYEE = "//button[@id='act_primary']";

	public static WebElement getAllStaff(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_ALLSTAFF));
	}

	public static void clickAllStaff(WebDriver driver) {
		getAllStaff(driver).click();
	}

	public static WebElement getStaffMember(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_STAFF_MEMBER));
	}

	public static void clickStaffMember(WebDriver driver) {
		getStaffMember(driver).click();
	}

	public static WebElement getDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS));
	}

	public static void clickDetails(WebDriver driver) {
		getDetails(driver).click();
	}
	public static WebElement getNickname(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME));
	}
	public static void clickNickname(WebDriver driver) {
		getNickname(driver).click();
	}
	public static void inputNickname(WebDriver driver, String nickname) {
		getNickname(driver).sendKeys(nickname);
	}
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE));
	}
	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
