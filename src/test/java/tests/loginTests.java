package tests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;
import utility.driverFactory;

public class loginTests extends baseTest {
   // public class loginTests extends baseTest {
        @Test
        public void verifyValidLogin() {

            loginPage loginPage1 = new loginPage(driverFactory.initializeDriver());//object initialization

            loginPage1.loginToApplication("standard_user", "secret_sauce");

            String currentUrl = driverFactory.initializeDriver().getCurrentUrl();

            Assert.assertTrue(currentUrl.contains("inventory"));
        }
    }

