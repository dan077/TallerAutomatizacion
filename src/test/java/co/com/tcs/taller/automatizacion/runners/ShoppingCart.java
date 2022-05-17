package co.com.tcs.taller.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = "co.com.tcs.taller.automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ShoppingCart {

}
