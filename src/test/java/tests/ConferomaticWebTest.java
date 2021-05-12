package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ConferomaticWebTest {

    @Test
    public void conferomaticHomePageHasH1title() {
        WebDriver driver = new RemoteWebDriver(new FirefoxOptions());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://conferomatic.com");
        wait.until(visibilityOfElementLocated(By.xpath("//h1[text()='Confer-O-Matic']")));
        driver.quit();
    }
}
