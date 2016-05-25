package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bestbuy {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bestbuy.com");
		
		//Select USA
		Select country = new Select(driver.findElement(By.xpath("//select[@name='select_locale']")));
		country.selectByValue("1");
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		//Search Nexus 6
		driver.findElement(By.id("gh-search-input")).sendKeys("Nexus 6");
		driver.findElement(By.className("search-button")).click();
		
		//Filter by Huawei & LG
	
		String brand="Huawei";
		int brandContainer = driver.findElements(By.xpath(".//*[@id='brand_facet']/div/ul/li")).size();
		System.out.println(brandContainer);
		
		for(int i=1; i<brandContainer; i++){
		driver.findElement(By.xpath("//li[@id='brand_facet']")).click();
			String textBrand = driver.findElement(By.xpath(".//*[@id='brand_facet']/div/ul/li["+i+"]")).getText();
			System.out.println(textBrand);
			if(textBrand.contains(brand)){
				System.out.println("Into the loop:");
				driver.findElement(By.xpath("//input[@id='brand_facet-"+(i-1)+"']")).click();
			} else {
				System.out.println("Brand not found");
			
			}
		}
			
			
		
/*
		driver.findElement(By.xpath("//li[@id='brand_facet']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='brand_facet-0']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='brand_facet-1']")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
*/		
		//Filter by Price
		 
		String price="$250 - $499.99";
		int priceContainer = driver.findElements(By.xpath(".//*[@id='currentprice_facet']/div/ul/li")).size();
		System.out.println(priceContainer);					
		
		for(int a=1; a<priceContainer; a++){
		driver.findElement(By.xpath("//li[@id='currentprice_facet']")).click();
			String textPrice = driver.findElement(By.xpath(".//*[@id='currentprice_facet']/div/ul/li["+a+"]")).getText();
			System.out.println(textPrice);					
			if(textPrice.contains(price)){
				System.out.println("Into the loop:");
				driver.findElement(By.xpath("//input[@id='currentprice_facet-"+(a-1)+"']")).click();
			} else {						
				System.out.println("Price not found");
			
			}
		}

/*
		driver.findElement(By.xpath("//li[@id='currentprice_facet']")).click();
		driver.findElement(By.xpath("//input[@id='currentprice_facet-1']")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Filter by RAM
		driver.findElement(By.xpath("//li[@id='internalmemorysv_facet']")).click();
		driver.findElement(By.xpath("//input[@id='internalmemorysv_facet-1']")).click();
*/		
		
		
		//.//*[@id='list-page']/div[2]/div[2]/div[2]
		
		String theChosen="Huawei - Google Nexus 6P 4G with 32GB Memory Cell Phone (Unlocked) - Aluminum";
		int deviceContainer = driver.findElements(By.xpath(".//*[@id='list-page']/div[2]/div[2]/div[2]")).size();
		System.out.println(deviceContainer);					
		
		for(int b=1; b<deviceContainer; b++){
		driver.findElement(By.xpath("//li[@id='currentprice_facet']")).click();
			String textChosen = driver.findElement(By.xpath(".//*[@id='currentprice_facet']/div/ul/li["+b+"]")).getText();
			System.out.println(textChosen);					
			if(textChosen.contains(theChosen)){
				System.out.println("Into the loop:");
				driver.findElement(By.xpath(".//*[@id='main-results']/div[3]/div["+(b-1)+"]")).click();
			} else {						
				System.out.println("Price not found");
			
			}
		}
/*		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Huawei - Google Nexus 6P 4G with 32GB Memory Cell Phone (Unlocked) - Aluminum")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='priceblock-wrapper-wrapper']/div[1]/div[1]/div[1]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[14]/div/div/div/div/div/div/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn btn-block btn-secondary btn-lg checkout-btn']")).click();
*/		
		

	}

}
