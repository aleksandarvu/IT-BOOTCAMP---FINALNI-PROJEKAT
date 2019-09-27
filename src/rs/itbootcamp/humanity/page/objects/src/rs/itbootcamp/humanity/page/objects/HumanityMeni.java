package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMeni {

	public static final String URL = "https://testerinc.humanity.com/app/dashboard/";
	private static final String DASHBOARD_BUTTON_XPATH = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFT_PLANNING_BUTTON_XPATH = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME_CLOCK_BUTTON_XPATH = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_BUTTON_XPATH = "//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String TRAINING_BUTTON_XPATH = "//p[contains(text(),'Training')]";
	private static final String STAFF_BUTTON_XPATH = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL_BUTTON_XPATH = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS_BUTTON_XPATH = "//p[contains(text(),'Reports')]";
	private static final String AVATAR_XPATH = "//img[@id='tr_avatar']";
	private static final String ARROW_DOWN_BUTTON_XPATH = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE_BUTTON_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_BUTTON_XPATH = "//i[@class='primNavQtip__icon icon-gear']";
	private static final String AVAILABILITY_BUTTON_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGN_OUT_BUTTON_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String HUMANITY_APP_VERSION_XPATH = "//div[@id='humanityAppVersion']";
	
	
	public static WebElement getDashboardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BUTTON_XPATH));
	}

	public static void clickOnDashboardButton(WebDriver driver) {
		getDashboardButton(driver).click();
	}

	public static WebElement getShiftPlanningButton(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_BUTTON_XPATH));
	}

	public static void clickOnShiftPlanningButton(WebDriver driver) {
		getShiftPlanningButton(driver).click();
	}

	public static WebElement getTimeClockButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_BUTTON_XPATH));
	}

	public static void clickOnTimeClockButton(WebDriver driver) {
		getTimeClockButton(driver).click();
	}

	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON_XPATH));
	}

	public static void clickOnLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON_XPATH));
	}

	public static void clickOnTrainingButton(WebDriver driver) {
		getTrainingButton(driver).click();
	}

	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON_XPATH));
	}

	public static void clickOnStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}

	public static WebElement getPayrollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON_XPATH));
	}

	public static void clickOnPayrollButton(WebDriver driver) {
		getPayrollButton(driver).click();
	}

	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_BUTTON_XPATH));
	}

	public static void clickOnReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}
	
	public static WebElement getAvatarButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVATAR_XPATH));
	}

	public static void clickOnAvatarButton(WebDriver driver) {
		getAvatarButton(driver).click();
	}
	
		public static WebElement getArrowDownButton(WebDriver driver) {
			return driver.findElement(By.xpath(ARROW_DOWN_BUTTON_XPATH));
	}

	public static void clickOnArrowDownButton(WebDriver driver) {
		getArrowDownButton(driver).click();
	}
	
			public static WebElement getProfileButton(WebDriver driver) {
				return driver.findElement(By.xpath(PROFILE_BUTTON_XPATH));
	}

	public static void clickOnProfileButton(WebDriver driver) {
		getProfileButton(driver).click();
	}
	
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}

	public static void clickOnSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
	
	public static WebElement getAvailabilityButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_BUTTON_XPATH));
	}

	public static void clickOnAvailabilityButton(WebDriver driver) {
		getAvailabilityButton(driver).click();
	}
	
	public static WebElement getSignOutButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_BUTTON_XPATH));
	}

	public static void clickOnSignOutButton(WebDriver driver) {
		getSignOutButton(driver).click();
	}
	
	public static WebElement getHumanityAppVersion(WebDriver driver) {
		return driver.findElement(By.xpath(HUMANITY_APP_VERSION_XPATH));
	}
	
	public static String versionNumber(WebDriver driver) {
		return getHumanityAppVersion(driver).findElement(By.tagName("b")).getText();
	}
	}


