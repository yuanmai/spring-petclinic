package org.springframework.samples.petclinic;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeleniumTest {
    @LocalServerPort
    private int port;

    private static String base;
    private WebDriver driver;

    public static String getBase() {
        return base;
    }

    @Before
    public void setUp() throws Exception {
       // System.setProperty("webdriver.chrome.driver", "chromedriver");
       // driver = new ChromeDriver();
        driver = new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        base = "http://localhost:" + port;
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void quit() throws Exception {
        driver.quit();
    }
    @Test
    public void driveCucumber() throws Exception {
        driver.get(base + "/");
        System.out.println(driver.getPageSource());
        PassiveCucumber.setRunTests(true);
        JUnitCore.runClasses(CucumberAcceptanceTests.class);
    }
}
