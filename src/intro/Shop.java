package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Shop {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.nike.com/us/en_us/");
		
		driver.findElement(By.xpath("//img[@title='United States']")).click();
		
		Actions move = new Actions(driver);
		WebElement menumen = driver.findElement(By.xpath("html/body/div[7]/nav/div[2]/ul/li[1]/a/span"));
		WebElement basket = driver.findElement(By.xpath("html/body/div[7]/nav/div[2]/ul/li[1]/div/div/div/div[2]/div/div/ul/li[4]/a"));
		move.moveToElement(menumen).build().perform();
		move.click(basket).build().perform();
		
		
		
		

	}

}
