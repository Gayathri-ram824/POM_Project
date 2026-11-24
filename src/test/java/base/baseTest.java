package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utility.driverFactory;

public class baseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driverFactory.initializeDriver();
        driverFactory.initializeDriver().get("https://www.saucedemo.com/");
    }

//    @AfterMethod
//    public void tearDown() {
//
//        if (driver != null) {
//            driver.quit(); // Close the browser and end the WebDriver session
//        }
//    }

}
