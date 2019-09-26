package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	
	public static final String URL="https://testerinc.humanity.com/app/staff/edit/5093154/";
	private static final String SAVE_EMPLOYEE_BUTTON_XPATH = "//button[@id='act_primary']";
	private static final String EDIT_DETAILS_BUTTON_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_PICTURE_BUTTON_XPATH="//input[@id='fileupload']";
	private static final String NICK_NAME_XPATH = "//input[@id='nick_name']";
	
	
	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_BUTTON_XPATH));
	}
			
	public static void clickSaveEmployeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}
	
	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_BUTTON_XPATH));
	}
		
	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}
	
	public static void uploadPicture(WebDriver driver) {
		driver.findElement(By.xpath(UPLOAD_PICTURE_BUTTON_XPATH)).sendKeys("C:\\Users\\38165\\Desktop\\IT Bootcamp projekat\\picture.jpg");
	}
	
	public static WebElement getNickNameButton(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}
				
	public static void clickNickNameButton(WebDriver driver) {
		getNickNameButton(driver).click();
	}
	
	public static void inputNickNameButton(WebDriver driver, String nickname) {
		getNickNameButton(driver).sendKeys(nickname);
	}

}
