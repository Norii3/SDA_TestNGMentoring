package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class C05_DependencyTesting {
    /*
    Task 3: Dependency Testing
Objective: Create interdependent test methods using dependsOnMethods
Requirements:
1. Create a class called DependencyTest
2. Create a @BeforeClass method to set up WebDriver
3. Create the following dependent test chain:
openYahoo() - Navigate to Yahoo
openBing() - Navigate to Bing (depends on Yahoo test)
openDuckDuckGo() - Navigate to DuckDuckGo (depends on Bing test)
4. Add intentional failure in Yahoo test and observe behavior
5. Create @AfterClass method to close driver

     */

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(timeOut = 1000)
    void openYahoo() throws InterruptedException {
        driver.get("https://yahoo.com");
        Thread.sleep(2000);
        // Intentional failure
        //Assert.fail("Intentional Failure in openYahoo");
    }

    @Test(dependsOnMethods = "openYahoo")
    void openBing() {
        driver.get("https://bing.com");
    }

    @Test(dependsOnMethods = "openBing")
    void openDuckDuckGo() {
        driver.get("https://duckduckgo.com");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

