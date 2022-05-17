package co.com.tcs.taller.automatizacion.stepdefinitions;

import co.com.tcs.taller.automatizacion.tasks.AddItemToShoppingCart;
import co.com.tcs.taller.automatizacion.tasks.SelectCategory;
import co.com.tcs.taller.automatizacion.tasks.SelectSection;
import co.com.tcs.taller.automatizacion.tasks.SelectThis;
import co.com.tcs.taller.automatizacion.userinterfaces.CartPage;
import co.com.tcs.taller.automatizacion.userinterfaces.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ShoppingCartStepDefinitions {

    LinioHomePage homePage;
    CartPage cartPage;

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel Vega");
    }

    @Given("^The user is at web page (.*)$")
    public void theUserIsAtWebPage(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));
    }

    @When("^The user select the category (.*)$")
    public void theUserSelectTheCategory(String categoryName) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCategory.inNavBar(categoryName));
    }

    @When("^The user select the section (.*)$")
    public void theUserSelectTheSection(String section) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectSection.inNavbar(section));
    }

    @When("^The user Select the item (.*)$")
    public void theUserSelectTheItem(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectThis.item(item));
    }

    @When("^The user adds (\\d+) units to the Shopping cart$")
    public void theUserAddsUnitsToTheShoppingCart(int numberOfUnits) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddItemToShoppingCart.thisNumerOfUnits(numberOfUnits));
    }

    @When("^the user go to the Shopping cart$")
    public void theUserGoToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.browserOn(cartPage));
    }

    @Then("^The user see (\\d+) units the item (.*) and it's price$")
    public void theUserSeeUnitsTheItemAndItSPrice(int numberOfUnits, String itemName) {

    }

}
