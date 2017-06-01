package org.springframework.samples.petclinic;

import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.FeatureRunner;
import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassiveCucumber extends Cucumber {

    public static boolean isRunTests() {
        return runTests;
    }

    public static void setRunTests(boolean runTests) {
        PassiveCucumber.runTests = runTests;
    }

    private static boolean runTests;

    public PassiveCucumber(Class clazz) throws InitializationError, IOException {
        super(clazz);
    }

    @Override
    public List<FeatureRunner> getChildren() {
        return runTests ? super.getChildren() : new ArrayList<>();
    }
}
