package DrogasLaRebaja.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (
        tags = "@BuyAProduct",
        features = {"src/test/resources/feature/larebaja.feature"},
        glue = {"DrogasLaRebaja.utils", "DrogasLaRebaja.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTag {
}
