package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage{

	
	WebDriver driver;

	public InventoryPage(WebDriver driver) throws InterruptedException {
		
		 this.driver = driver;
	}
	
	By product1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By cart = By.xpath("//span[@class='shopping_cart_badge']");
	By checkoutbtn = By.xpath("//button[text()='Checkout']");
	

	
    public void Product1() throws InterruptedException {
    	Thread.sleep(2500);
    	driver.findElement(product1).click();
    	Thread.sleep(2000);
    	driver.findElement(cart).click();
    	Thread.sleep(1500);
    	driver.findElement(checkoutbtn).click();
    	Thread.sleep(2000);
   
    }

}
