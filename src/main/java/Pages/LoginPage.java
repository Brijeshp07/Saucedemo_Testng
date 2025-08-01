package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage{

	
	WebDriver driver;

	By uname = By.xpath("//input[@id='user-name']");
    By pass = By.xpath("//input[@id='password']");
    By loginBtn = By.xpath("//input[@class='submit-button btn_action']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void Login(String username, String password) throws InterruptedException {
    	driver.findElement(uname).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(pass).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(loginBtn).click();
		Thread.sleep(2500);
        
    }
    public void Invalid(String username, String password) throws InterruptedException {
    	driver.findElement(uname).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(pass).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(loginBtn).click();
		Thread.sleep(2500);
        
    }
      
}