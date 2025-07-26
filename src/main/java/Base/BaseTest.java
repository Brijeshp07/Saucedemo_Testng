package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utils.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;
 

    @BeforeSuite
    public void setupReport() {
    	extent = ExtentManager.createInstance();
    	
        extent.setSystemInfo("Tester", "Brijesh Parmar");
        extent.setSystemInfo("Environment", "Staging");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    	
    	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/"); // Replace with your actual URL
        
    }

    @AfterSuite
    public void flushReport() throws InterruptedException {
        extent.flush();
        
        if (driver != null) {
            Thread.sleep(3000);
            driver.quit();
        }
    }
}
