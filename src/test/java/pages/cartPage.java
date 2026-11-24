package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {
   ///verifying if the added product is in the cart page
        WebDriver driver;
        By cartItem = By.className("inventory_item_name");

        public cartPage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isProductDisplayed() {
            return driver.findElement(cartItem).isDisplayed();
        }
    }

