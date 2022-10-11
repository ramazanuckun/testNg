package tests.AutomationEnginer;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.Driver;

public class C16_onAltinciSoru {

    AutomationPage automationPage=new AutomationPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Test
    public void test16() {


     //  1. Launch browser
     //  2. Navigate to url 'http://automationexercise.com'
     //  3. Verify that home page is visible successfully
     //  4. Click 'Signup / Login' button
     //  5. Fill email, password and click 'Login' button
     //  6. Verify 'Logged in as username' at top
     //  7. Add products to cart
     //  8. Click 'Cart' button
     //  9. Verify that cart page is displayed
     //  10. Click Proceed To Checkout
     //  11. Verify Address Details and Review Your Order
     //  12. Enter description in comment text area and click 'Place Order'
     //  13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
     //  14. Click 'Pay and Confirm Order' button
     //  15. Verify success message 'Your order has been placed successfully!'
     //  16. Click 'Delete Account' button
     //  17. Verify 'ACCOUNT DELETED!' and click 'Continue' button


    }
}
