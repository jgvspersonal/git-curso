package DrogasLaRebaja.stepdefinitions;

import DrogasLaRebaja.models.DrogasLaRebajaModel;
import DrogasLaRebaja.questions.OnThePage;
import DrogasLaRebaja.tasks.EnterThe;
import DrogasLaRebaja.tasks.OpenThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DrogasLaRebajaStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I want to visit larebaja website$")
    public void iWantToVisitLarebajaWebsite() {
        OnStage.theActorCalled("Guillermo").wasAbleTo(OpenThe.page());
    }


    @When("^I search an add a product to shopping car$")
    public void iSearchAnAddAProductToShoppingCar(List<DrogasLaRebajaModel> product) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterThe.data(product));
    }

    @Then("^I shoud see the message on the screen (.*)$")
    public void iShoudSeeTheMessageOnTheScreen(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(OnThePage.the(message)));
    }

}
