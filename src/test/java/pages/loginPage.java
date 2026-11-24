package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.driverFactory;

public class loginPage {

        WebDriver driver;

        By username = By.id("user-name");
        By password = By.id("password");
        By loginBtn = By.id("login-button");



        public loginPage(WebDriver driver) { //constructor to initialize the driver
            this.driver = driver;  // this keyword is used to refer to the current instance of the class.
            // It is used to differentiate between the instance variable and the local variable when they have the same name.
        }

        public void enterUsername(String user) {
          //driver.findElement(username).sendKeys(user);
            driverFactory.initializeDriver().findElement(username).sendKeys(user);
        }

        public void enterPassword(String pass) {
//            driver.findElement(password).sendKeys(pass);
            driverFactory.initializeDriver().findElement(password).sendKeys(pass);
        }

        public void clickLogin() {
//            driver.findElement(loginBtn).click();
            driverFactory.initializeDriver().findElement(loginBtn).click();
        }
        public void loginToApplication(String user, String pass) {
            enterUsername(user);
            enterPassword(pass);
            clickLogin();
        }
}
