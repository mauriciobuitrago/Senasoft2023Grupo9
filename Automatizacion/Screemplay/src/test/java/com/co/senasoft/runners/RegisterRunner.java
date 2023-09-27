package com.co.senasoft.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        glue = "com.co.senasoft.stepsdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegisterRunner {
}
