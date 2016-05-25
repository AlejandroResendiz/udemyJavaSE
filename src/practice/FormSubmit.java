package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.*;

public class FormSubmit {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.underarmour.com.mx");
		
		driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div[1]")).click();

		driver.findElement(By.xpath("//a[@data-navdrawer-toggle='mens']")).click();
		//Select dropdown = new Select(driver.findElement(By.xpath("//a[@class='first-stick-a']")));
		//dropdown.selectByVisibleText("Hombre");
		
		//Actions action = new Actions(driver);
		//action.moveToElement(toElement)
		
		
	}

}
