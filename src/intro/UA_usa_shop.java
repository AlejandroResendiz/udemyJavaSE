package intro;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UA_usa_shop {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.underarmour.com/en-us");
		
		driver.findElement(By.xpath("//img[@alt='en-us']")).click();
		driver.findElement(By.xpath("html/body/div[7]/div/button")).click();
		
		

	}

}
