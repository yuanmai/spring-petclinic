package org.springframework.samples.petclinic;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(PassiveCucumber.class)
@CucumberOptions(features = "src/features/login")
public class CucumberAcceptanceTests {
}
