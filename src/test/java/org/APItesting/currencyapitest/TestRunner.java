package org.APItesting.currencyapitest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.APItesting.currencyapitest.steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
