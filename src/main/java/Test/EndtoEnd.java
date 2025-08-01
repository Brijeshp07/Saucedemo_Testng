package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utils.ExcelUtil;
import Pages.CheckoutPage;



public class EndtoEnd extends BaseTest{
	

	
   
	@Test(description="Valid Credential", priority=1)
    public void Login() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
    	String username = ExcelUtil.getCellValue("LoginData", 1, 0);
    	String password = ExcelUtil.getCellValue("LoginData", 1, 1);
    	login.Login(username, password);
    }
	@Test(description="Valid Credential", priority=7)
    public void Invalid() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
    	String username = ExcelUtil.getCellValue("LoginData", 2, 0);
    	String password = ExcelUtil.getCellValue("LoginData", 2, 1);
    	login.Login(username, password);
    }

	@Test(description="Add first product", priority=3)
    public void Product1() throws InterruptedException {
        test = extent.createTest("Check Inventory");
		InventoryPage product1 = new InventoryPage(driver);
		product1.Product1();
        test.info("First product added to cart successfully");

    }
	
	@Test(description="Checkout Successfully", priority=5)
    public void Checkout() throws InterruptedException {
        test = extent.createTest("Checkout Successfully");
		CheckoutPage checkout = new CheckoutPage(driver);    
		checkout.Checkout();
		test.info("Logout Successfully");
    }
	
 
        
}
	




