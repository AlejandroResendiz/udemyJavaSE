package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		
		String text;
		String selector="Descargas";
		WebElement container = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		for(int i=0; i<container.findElements(By.tagName("a")).size(); i++){
			text = container.findElements(By.tagName("a")).get(i).getText();
			System.out.println(text);
			if(text==selector){
				//click on text
				System.out.println("Item found");
			}
		}

	}

}
