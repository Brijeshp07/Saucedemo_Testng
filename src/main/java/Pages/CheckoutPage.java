package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckoutPage {
 		
		  WebDriver driver;
		  
		  public CheckoutPage(WebDriver driver) throws InterruptedException{
			  
			  this.driver = driver;
		    }

		    By fname = By.xpath("//input[@id='first-name']");
		    By lname = By.xpath("//input[@id='last-name']");
		    By postalcode = By.xpath("//input[@id='postal-code']");
		    By continutbtn = By.xpath("//input[@name='continue']");
		    By finalcheckout = By.xpath("//button[@id='finish']");
		    By goback = By.xpath("//button[text()='Back Home']");
		    
		    public void Checkout() throws InterruptedException {
		    	
		    	driver.findElement(fname).sendKeys("Test");
		    	Thread.sleep(1200);
		    	driver.findElement(lname).sendKeys("Test");
		    	Thread.sleep(1200);
		    	driver.findElement(postalcode).sendKeys("12345");
		    	Thread.sleep(1200);
		    	driver.findElement(continutbtn).click();
		    	Thread.sleep(2000);
		    	driver.findElement(finalcheckout).click();
		    	Thread.sleep(2500);
		    	driver.findElement(goback).click();
		    	System.out.println("Checkout successfully completed & page redirect to Home Page");
		    }
		    
		
}


