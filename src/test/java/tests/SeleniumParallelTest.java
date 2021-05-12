package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import other.TestMother;

import static org.testng.Assert.assertTrue;

public class SeleniumParallelTest extends TestMother {

    private WebDriver driver;


    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browser) {

        switch (browser) {
            case "firefox":  driver = new RemoteWebDriver(new FirefoxOptions());break;
            case "edge":  driver = new RemoteWebDriver(new EdgeOptions());break;
            default: driver = new RemoteWebDriver(new ChromeOptions());break;
        }
    }


    @Test(threadPoolSize = 3)
    public void sampleTestOne() {
        System.out.println("sampleTestOne");
        System.out.println(String.format("thread ID: %s", Thread.currentThread().getId()));
        driver.get("http://host.docker.internal:3000");
        assertTrue(driver.findElement(By.xpath("//h1[text()='This is login page']")).isDisplayed());
        driver.quit();
    }


    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            // Quits this driver, closing every associated window.
            driver.quit();
        }
    }
}
