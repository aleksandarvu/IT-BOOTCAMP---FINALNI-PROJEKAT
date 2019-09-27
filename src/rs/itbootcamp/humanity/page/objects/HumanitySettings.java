package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	public static final String URL= "https://testerinc.humanity.com/app/admin/settings/";
	private static final String COUNTRY_DROP_DOWN_MENU_XPATH = "//select[@id='country']";
	private static final String LANGUAGE_DROP_DOWN_MENU_XPATH = "//select[@name='language']";
	private static final String TIME_FORMAT_DROP_DOWN_MENU_XPATH = "//select[@name='pref_24hr']";
	private static final String SAVE_SETTINGS_BUTTON_XPATH ="//button[@id='_save_settings_button']";
	public static void goToUrl(WebDriver driver) {
		driver.get(URL);
	}
	
	public static Select getSelectCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_DROP_DOWN_MENU_XPATH)));
	}
	
	public static void selectCountry(WebDriver driver, String country) {
		getSelectCountry(driver).selectByVisibleText(country);
	}
	
	public static Select getDefaultLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_DROP_DOWN_MENU_XPATH)));
	}
		
	public static void selectDefaultLanguage(WebDriver driver, String language) {
		getDefaultLanguage(driver).selectByVisibleText(language);
	}
			
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIME_FORMAT_DROP_DOWN_MENU_XPATH)));
	}
			
	public static void selectTimeFormat(WebDriver driver, String timeFormat) {
		getTimeFormat(driver).selectByVisibleText(timeFormat);
	}
	
	public static WebElement getSaveSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_SETTINGS_BUTTON_XPATH));
	}
			
	public static void clickSaveSettingsButton(WebDriver driver) {
		getSaveSettingsButton(driver).click();
	}

}
