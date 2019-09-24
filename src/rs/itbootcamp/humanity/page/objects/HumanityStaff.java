package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	private static final String URL = "https://testerinc.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEES_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_AND_LAST_NAME_FIRST_PART_XPATH = "//a[contains(text(),'";
	private static final String FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH = "')]";
	private static final String EDIT_DETAILS_XPATH="//a[contains(text(),'Edit Details')]";
	private static final String FIRST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asf1']";
	private static final String LAST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asl1']";
	private static final String EMAIL_EMPLOYEE_1_XPATH = "//input[@id='_ase1']";
	private static final String SAVE_EMPLOYEES_BUTTON_XPATH="//button[@id='_as_save_multiple']";
	private static final String UPLOAD_PICTURE_BUTTON_XPATH="//input[@id='fileupload']";
	
	
	public static void chooseEmployee(WebDriver driver, String name) {
		driver.findElement(By.xpath(FIRST_NAME_AND_LAST_NAME_FIRST_PART_XPATH + name + FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH)).click();
	}
	
	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}
	
	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}
	
	public static void inputPicture(WebDriver driver) {
		
		driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH)).sendKeys("C:\\Users\\38165\\Desktop\\IT Bootcamp projekat\\picture");
	}
	
	public static WebElement getAddEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_BUTTON_XPATH));
	}

	public static void clickOnAddEmployeesButton(WebDriver driver) {
		getAddEmployeesButton(driver).click();
	}
	
	public static WebElement getFirstNameField(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_EMPLOYEE_1_XPATH));
	}
	
	public static void clickFirstNameField(WebDriver driver) {
		getFirstNameField(driver).click();
	}
	
	public static void inputFirstNameField(WebDriver driver) {
		getFirstNameField(driver).sendKeys("Mitar");;
	}
	
	public static WebElement getLastNameField(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_EMPLOYEE_1_XPATH));
	}
		
	public static void clickLastNameField(WebDriver driver) {
		getLastNameField(driver).click();
	}
		
	public static void inputLastNameField(WebDriver driver) {
		getLastNameField(driver).sendKeys("Miric");;
	}
	
	public static WebElement getEmailField(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_EMPLOYEE_1_XPATH));
	}
			
	public static void clickEmailField(WebDriver driver) {
		getEmailField(driver).click();
	}
			
	public static void inputEmailField(WebDriver driver) {
		getEmailField(driver).sendKeys("mmiric@grand.com");;
	}

	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_BUTTON_XPATH));
	}
			
	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}
}