package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.*;

public class UAshop {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\jok\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.underarmour.com.mx");
		
		
		
		//banner
		driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/div[1]")).click();
		
		//Menu
		driver.findElement(By.xpath(".//*[@id='primary-nav']/ul/li[2]/a")).click();
		//Actions move = new Actions(driver);
		//WebElement menu = driver.findElement(By.xpath(".//*[@id='primary-nav']/ul/li[2]/a"));
		//move.moveToElement(menu).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='primary-nav']/ul/li[2]/nav/nav/div/div[4]/ul/li[5]/a")).click();
		
		
		//Select the shoe
		driver.findElement(By.xpath("//a[@title='Zapatos de Basketball UA Curry Two para Hombre']")).click();
		
		driver.findElement(By.xpath("//a[@title='MX 9']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Select quantity = new Select(driver.findElement(By.xpath("//select[@id='Quantity']")));
		//quantity.selectByVisibleText("1");
				
//		driver.switchTo().frame(0);
		
		//WebElement composeButton = driver.findElement(By.id("add-to-cart"));
		//composeButton.click();
		//driver.findElement(By.xpath("//button[@id='add-to-cart']")).submit();
		
		
		
		//Add to car
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@class='mini-cart-link-cart button']")).click();


/*		
		//pop up
		driver.findElement(By.xpath("//button[@value='Finalizar Compra']")).click();
		
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")).sendKeys("Jok");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")).sendKeys("Resendiz");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']")).sendKeys("Evergreen Terrace");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_exteriorNumber']")).sendKeys("742");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_colony']")).sendKeys("Springfield");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_dependentLocality']")).sendKeys("Springfield");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_zip']")).sendKeys("76047");
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']")).sendKeys("Queretaro");
		
		Select state = new Select(driver.findElement(By.xpath("//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_state']")));
		state.selectByVisibleText("Querétaro");
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_country']")));
		country.selectByVisibleText("Querétaro");
		
		driver.findElement(By.xpath("//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']")).sendKeys("8180112233");
		
		driver.findElement(By.xpath("//input[@value='use-shipping']")).click();
		
		driver.findElement(By.xpath("//input[@id='shipping-method-MX-Standard-Shipping']")).click();
		
		driver.findElement(By.xpath("//input[@id='dwfrm_billing_billingAddress_addressFields_dob']")).sendKeys("01/01/1990");
		driver.findElement(By.xpath("//input[@id='dwfrm_billing_billingAddress_email_emailAddress']")).sendKeys("alejandro.resendiz@enroute.xyz");
		driver.findElement(By.xpath("//input[@id='billingterms']")).click();
		driver.findElement(By.xpath("//button[@value='Continuar >']")).click();
		
		driver.findElement(By.xpath("//button[@id='summarycontinue']")).click();
*/
	}

}
