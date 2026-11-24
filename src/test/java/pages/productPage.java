package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
        WebDriver driver;

        By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
        By cartIcon = By.className("shopping_cart_link");

        public productPage(WebDriver driver) { //to pass 'driver'
            this.driver = driver;
        }

        public void addProductToCart() {
            driver.findElement(addToCartBtn).click();
        }

        public void openCart() {
            driver.findElement(cartIcon).click();
        }
    }