package org.springframework.samples.petclinic;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/login")
public class  CucumberAcceptanceTests {
}