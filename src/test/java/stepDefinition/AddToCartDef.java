package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartDef {

    @When("User searches for macbook")
    public void user_searches_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User adds {string} priced at {string} to the cart")
    public void user_adds_priced_at_to_the_cart(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should see a success message {string}")
    public void user_should_see_a_success_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on the cart button")
    public void user_clicks_on_the_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on {string} from the cart pop-up")
    public void user_clicks_on_from_the_cart_pop_up(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be on the Shopping Cart page")
    public void user_should_be_on_the_shopping_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies the following product details in the cart:")
    public void user_verifies_the_following_product_details_in_the_cart(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("User clicks on the Logout option")
    public void user_clicks_on_the_logout_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
