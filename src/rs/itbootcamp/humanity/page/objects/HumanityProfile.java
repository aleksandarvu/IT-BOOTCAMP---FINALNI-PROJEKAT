package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {

	private static final String CLICK_PROFILE_PICTURE ="//img[@id='tr_avatar']";
	private static final String PROFILE = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS ="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY ="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGN_OUT ="//a[contains(text(),'Sign Out')]";
	private static final String VERSION ="//div[@id='humanityAppVersion']";
	
	public static WebElement getProfilePicture(WebDriver driver) {
		return driver.findElement(By.xpath(CLICK_PROFILE_PICTURE));
	}
	public static void clickProfilePicture(WebDriver driver) {
		getProfilePicture(driver).click();
	}
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE));
	}
	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();

	}
	public static WebElement getForm(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION));
	}
	public static void printForm(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(VERSION));
		String print = wb.getText();
		System.out.println(print);
	}

}
