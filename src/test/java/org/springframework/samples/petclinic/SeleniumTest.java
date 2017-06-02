package org.springframework.samples.petclinic;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        base = "http://localhost:" + port;
    }

    @Test
    public void driveCucumber() throws Exception {
        PassiveCucumber.setRunTests(true);
        JUnitCore.runClasses(CucumberAcceptanceTests.class);
    }
}
