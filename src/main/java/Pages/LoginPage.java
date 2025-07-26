package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage{

	
	WebDriver driver;

	public LoginPage(WebDriver driver) throws InterruptedException {
		
		 this.driver = driver;
	}
	By username = By.xpath("//input[@id='user-name']");
    By password = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@class='submit-button btn_action']");

    
    public void Validusernamepass(String emailAddr, String pwd) throws InterruptedException {
    	driver.findElement(username).sendKeys("standard_user");
        Thread.sleep(1500);
        driver.findElement(password).sendKeys("secret_sauce");
        Thread.sleep(1500);
        driver.findElement(loginBtn).click();
        Thread.sleep(2500);
        
    }
    
    public void Invalid(String emailAddr, String pwd) throws InterruptedException {
    	driver.findElement(username).sendKeys("Test");
        Thread.sleep(1500);
        driver.findElement(password).sendKeys("Test");
        Thread.sleep(1500);
        driver.findElement(loginBtn).click();
        Thread.sleep(2500);
        driver.navigate().refresh();
    }
   
}
