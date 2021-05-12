package other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class TestMother {

    Logger LOGGER = Logger.getLogger(TestMother.class.getName());

    // run before first test
    @BeforeClass
    public void setUp() {
        LOGGER.info("BeforeClass");
    }


    // runs after all tests are done
    @AfterClass
    public void afterClass() {
        LOGGER.info("AfterClass");
    }
}
