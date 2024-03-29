package rs.itbootcamp.humanity.page.objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL = "https://testerinc.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEES_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String FIRST_NAME_AND_LAST_NAME_FIRST_PART_XPATH = "//a[contains(text(),'";
	private static final String FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH = "']";
	private static final String EDIT_DETAILS_XPATH="//a[contains(text(),'Edit Details')]";
	private static final String FIRST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asf1']";
	private static final String FIRST_NAME_EMPLOYEE_XPATH = "//input[@id='_asf";
	private static final String LAST_NAME_EMPLOYEE_1_XPATH = "//input[@id='_asl1']";
	private static final String LAST_NAME_EMPLOYEE_XPATH = "//input[@id='_asl";
	private static final String EMAIL_EMPLOYEE_1_XPATH = "//input[@id='_ase1']";
	private static final String EMAIL_EMPLOYEE_XPATH = "//input[@id='_ase";
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
		driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH)).sendKeys("C:\\Users\\38165\\Desktop\\IT Bootcamp projekat\\picture.jpg");
	}
	
	public static WebElement getAddEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_BUTTON_XPATH));
	}

	public static void clickOnAddEmployeesButton(WebDriver driver) {
		getAddEmployeesButton(driver).click();
	}
	
	public static WebElement getFirstName1Field(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_EMPLOYEE_1_XPATH));
	}
	
	public static void clickFirstName1Field(WebDriver driver) {
		getFirstName1Field(driver).click();
	}
	
	public static void inputFirstName1Field(WebDriver driver) {
		getFirstName1Field(driver).sendKeys("Aleksa");
	}
	
	public static WebElement getFirstNameField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(FIRST_NAME_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
			
	public static void clickFirstNameField(WebDriver driver, int n) {
		getFirstNameField(driver, n).click();
	}
	
	public static void inputFirstNameField(WebDriver driver, int n, String firstName) {
		getFirstNameField(driver, n).sendKeys(firstName);
	}
	
	public static WebElement getLastName1Field(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_EMPLOYEE_1_XPATH));
	}
		
	public static void clickLastName1Field(WebDriver driver) {
		getLastName1Field(driver).click();
	}
		
	public static void inputLastName1Field(WebDriver driver) {
		getLastName1Field(driver).sendKeys("Aleksic");
	}
	
	public static WebElement getLastNameField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(LAST_NAME_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
		
	public static void clickLastNameField(WebDriver driver, int n) {
		getLastNameField(driver,n).click();
	}
			
	public static void inputLastNameField(WebDriver driver, int n, String lastName) {
		getLastNameField(driver,n).sendKeys(lastName);
	}
	
	public static WebElement getEmail1Field(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_EMPLOYEE_1_XPATH));
	}
			
	public static void clickEmail1Field(WebDriver driver) {
		getEmail1Field(driver).click();
	}
			
	public static void inputEmail1Field(WebDriver driver) {
		getEmail1Field(driver).sendKeys("mikimikic@gmail.com");
	}
	
	public static WebElement getEmailField(WebDriver driver, int n) {
		return driver.findElement(By.xpath(EMAIL_EMPLOYEE_XPATH+n+FIRST_NAME_AND_LAST_NAME_LAST_PART_XPATH));
	}
				
	public static void clickEmailField(WebDriver driver, int n) {
		getEmailField(driver,n).click();
	}
			
	public static void inputEmailField(WebDriver driver, int n, String email) {
		getEmailField(driver, n).sendKeys(email);
	}
	
	public static WebElement getSaveEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEES_BUTTON_XPATH));
	}
			
	public static void clickSaveEmployeesButton(WebDriver driver) {
		getSaveEmployeesButton(driver).click();
	}
}