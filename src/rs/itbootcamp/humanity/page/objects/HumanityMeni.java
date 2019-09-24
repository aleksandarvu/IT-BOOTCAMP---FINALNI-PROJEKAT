package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMeni {

	public static final String URL = "https://testerinc.humanity.com/app/dashboard/";
	private static final String DASHBOARD_BUTTON = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFT_PLANNING_BUTTON = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME_CLOCK_BUTTON = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_BUTTON = "//p[@class='primNavQtip__itemName'][contains(text(),'Leave')]";
	private static final String TRAINING_BUTTON = "//p[contains(text(),'Training')]";
	private static final String STAFF_BUTTON = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL_BUTTON = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS_BUTTON = "//p[contains(text(),'Reports')]";


	public static WebElement getDashboardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BUTTON));
	}

	public static void clickOnDashboardButton(WebDriver driver) {
		getDashboardButton(driver).click();
	}

	public static WebElement getShiftPlanningButton(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_BUTTON));
	}

	public static void clickOnShiftPlanningButton(WebDriver driver) {
		getShiftPlanningButton(driver).click();
	}

	public static WebElement getTimeClockButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_BUTTON));
	}

	public static void clickOnTimeClockButton(WebDriver driver) {
		getTimeClockButton(driver).click();
	}

	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON));
	}

	public static void clickOnLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON));
	}

	public static void clickOnTrainingButton(WebDriver driver) {
		getTrainingButton(driver).click();
	}

	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON));
	}

	public static void clickOnStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}
	
	public static WebElement getPayrollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON));
	}

	public static void clickOnPayrollButton(WebDriver driver) {
		getPayrollButton(driver).click();
	}

	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_BUTTON));
	}

	public static void clickOnReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}

	}


