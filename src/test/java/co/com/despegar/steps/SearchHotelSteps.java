package co.com.despegar.steps;

import co.com.despegar.hooks.Hooks;
import co.com.despegar.sites.DespegarSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelSteps {

    DespegarSite despegarSite;

    public SearchHotelSteps(Hooks hooksClass) {
        this.despegarSite = hooksClass.despegarSite;
    }

    @Given("I navigate to Home Page")
    public void i_navigate_to_Home_Page() {
        despegarSite.home().goTo();
    }

    @When("I search for a hotel in a city")
    public void i_search_for_a_hotel_in_a_city() {
    }

    @Then("I will see the results available to book")
    public void i_will_see_the_results_available_to_book() {
    }

    @When("I search for a hotel in an unexisting city")
    public void i_search_for_a_hotel_in_an_unexisting_city() {
    }

    @Then("I will not see any results")
    public void i_will_not_see_any_results() {

    }
}