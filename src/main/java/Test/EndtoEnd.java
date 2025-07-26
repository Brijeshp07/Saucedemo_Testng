package Test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseTest;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.CheckoutPage;



public class EndtoEnd extends BaseTest{
	
	
	@Test(description="Valid Credential", priority=2)
    public void Validusernamepass() throws InterruptedException {
		test = extent.createTest("Login");        
		LoginPage loginPage = new LoginPage(driver);
        loginPage.Validusernamepass("standard_user", "secret_sauce");
        test.log(Status.PASS, "User logged in successfully");
        test.info("Valid Username and Password");
    }
	
	@Test(description="Valid Credential", priority=1)
    public void Invalid() throws InterruptedException {
		test = extent.createTest("Login");        
		LoginPage invalidlogin = new LoginPage(driver);
        invalidlogin.Invalid("Test", "Test");
        test.log(Status.FAIL, "User should not be able to login with invalid credentials");
        test.info("Invalid Username or Password");
    }

	
	@Test(description="Add first product", priority=3)
    public void Product1() throws InterruptedException {
        test = extent.createTest("Check Inventory");
		InventoryPage product1 = new InventoryPage(driver);
		product1.Product1();
        test.info("First product added to cart successfully");

    }
	
	@Test(description="Add second product", priority=4)
    public void Product2() throws InterruptedException {
        test = extent.createTest("Check Inventory");
		InventoryPage product2 = new InventoryPage(driver);
		product2.Product2();
		test.info("Second product added to cart successfully");
    }
	
	@Test(description="Checkout Successfully", priority=12)
    public void Checkout() throws InterruptedException {
        test = extent.createTest("Checkout Successfully");
		CheckoutPage checkout = new CheckoutPage(driver);    
		checkout.Checkout();
    }
	
 
        
}
	




