package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	
	private static final String FULL_NAME_FIELD = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_FIELD = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String ABOUT_US_BUTTON = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String ABOUT_US_ABOUT_US_BUTTON = "//p[contains(text(),'About Us')]";
	private static final String LOGIN_BUTTON = "//p[contains(text(),'LOGIN')]";
	private static final String START_MY_FREE_TRIAL_BUTTON = "//input[@id='free-trial-link-01']";
	private static final String START_MY_FREE_TRIAL_BUTTON1 = "//a[@class='button pale']";
	private static final String EMAIL_USERNAME_FIELD = "//input[@id='email']";
	private static final String PASSWORD_FIELD = "//input[@id='password']";
	private static final String FINAL_LOGIN_BUTTON = "//button[contains(text(),'Log in')]";
	private static final String USERNAME = "wawe@itfast.net";
	private static final String PASSWORD = "12ac99";

	
	public static void goToUrl(WebDriver driver) {
		driver.get(URL);
	}

	public static WebElement getAboutUsButton(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_BUTTON));
	}

	public static void clickAboutUsButton(WebDriver driver) {
		getAboutUsButton(driver).findElement(By.xpath(ABOUT_US_ABOUT_US_BUTTON)).click();
	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	public static WebElement getEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_USERNAME_FIELD));
	}

	public static void clickOnEmailField(WebDriver driver) {
		getEmailField(driver).click();
	}

	public static void inputEmail(WebDriver driver) {
		getEmailField(driver).sendKeys(USERNAME);
	}

	public static WebElement getPasswordField(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_FIELD));
	}

	public static void clickOnPasswordField(WebDriver driver) {
		getPasswordField(driver).click();
	}

	public static void inputPassword(WebDriver driver) {
		getPasswordField(driver).sendKeys(PASSWORD);
	}

	public static WebElement getFinalLogInButton(WebDriver driver) {
		return driver.findElement(By.xpath(FINAL_LOGIN_BUTTON));
	}

	public static void clickOnFinalLogInButton(WebDriver driver) {
		getFinalLogInButton(driver).click();
	}

	public static WebElement getFullNameField(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_FIELD));
	}

	public static void clickOnFullNameField(WebDriver driver) {
		getFullNameField(driver).click();
	}

	public static WebElement getWorkEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_FIELD));
	}

	public static void clickOnWorkEmailField(WebDriver driver) {
		getWorkEmailField(driver).click();
	}
	
	public static WebElement getStartMyFreeTrialButton1(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_BUTTON));
	}

	public static void clickStartMyFreeTrialButton1(WebDriver driver) {
		getStartMyFreeTrialButton1(driver).click();
	}

	public static WebElement getStartMyFreeTrialButton2(WebDriver driver) {
		return driver.findElement(By.xpath(START_MY_FREE_TRIAL_BUTTON1));
	}

	public static void clickStartMyFreeTrialButton2(WebDriver driver) {
		getStartMyFreeTrialButton2(driver).click();
	}
}
