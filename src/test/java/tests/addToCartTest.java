//package tests;
//
//import base.baseTest;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.cartPage;
//import pages.loginPage;
//import pages.productPage;
//
//import static utility.driverFactory.driver;
//
//public class addToCartTest extends baseTest {
//    //public class addToCartTest extends baseTest {
//        @Test
//        public void verifyAddToCart() {
//
//            loginPage loginPage2 = new loginPage(driver);
//            productPage productsPage = new productPage(driver);
//            cartPage cartPage = new cartPage(driver);
//
//            loginPage2.loginToApplication("standard_user", "secret_sauce");
//
//            productsPage.addProductToCart();
//            productsPage.openCart();
//
//            Assert.assertTrue(cartPage.isProductDisplayed());
//        }
//    }

