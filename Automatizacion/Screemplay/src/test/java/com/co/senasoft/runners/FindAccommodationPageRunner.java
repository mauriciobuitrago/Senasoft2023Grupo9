package com.co.senasoft.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_accommodation.feature",
        glue = "com.co.senasoft.stepsdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class FindAccommodationPageRunner {
}
