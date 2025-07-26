package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryPage{

	
	WebDriver driver;

	public InventoryPage(WebDriver driver) throws InterruptedException {
		
		 this.driver = driver;
	}
	
	By product1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By cart = By.xpath("//span[@class='shopping_cart_badge']");
	By checkoutbtn = By.xpath("//button[text()='Checkout']");
	By contishoping = By.xpath("//button[@name='continue-shopping']");
	By product2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	
    public void Product1() throws InterruptedException {
    	Thread.sleep(2500);
    	driver.findElement(product1).click();
    	Thread.sleep(2000);
    	driver.findElement(cart).click();
    	Thread.sleep(1500);
    	driver.findElement(checkoutbtn).click();
    	Thread.sleep(2000);
   
    }

    public void Product2() throws InterruptedException {
    	Thread.sleep(2500);
    	driver.findElement(contishoping).click();
    	Thread.sleep(2500);
    	driver.findElement(product2).click();
    	Thread.sleep(2000);
    	driver.findElement(cart).click();
    	Thread.sleep(1500);
    	driver.findElement(checkoutbtn).click();
    	Thread.sleep(2000);
   
    }


   
   

}
