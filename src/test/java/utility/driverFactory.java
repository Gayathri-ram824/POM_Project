package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactory {
        public static WebDriver driver;

        public static WebDriver initializeDriver() {

            //   WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); //dr

            driver.manage().window().maximize();

            return driver;
        }
    }

