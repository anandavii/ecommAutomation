package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UserAccountPage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserAccountDef {
    private final UserAccountPage userAccountPage = new UserAccountPage();

    @Given("User is on My Account Page")
    public void user_is_on_my_account_page() {
        assertTrue("User is not on the My Account", userAccountPage.isOnMyAccountByTitle());
    }

    @Then("User must see the following labels on the My Account page")
    public void user_must_see_the_following_labels_on_the_my_account_page(List<String> expectedLabels){
        Assert.assertTrue("One or more labels are missing!", userAccountPage.verifyMyAccountLabels(expectedLabels));
    }
    @Then("User must see My Account label and following links")
    public void user_must_see_My_Account_label_and_following_links(List<String> expectedLinks) {
        for (String link : expectedLinks) {
            Assert.assertTrue("Link missing under My Account section: " + link, userAccountPage.verifyMyAccountLink(link));
        }
    }
    @Then("User must see the following links under My Orders section")
    public void user_must_see_My_Orders_section(List<String> expectedLinks) {
        for (String link : expectedLinks) {
            Assert.assertTrue("Link missing under My Orders section: " + link, userAccountPage.verifyMyOrdersLink(link));
        }
    }
    @Then("User must see the following links under My Affiliate Account section")
    public void user_must_see_My_Affiliate_Account_section(List<String> expectedLinks) {
        for (String link : expectedLinks) {
            Assert.assertTrue("Link missing under My Affiliate Account section: " + link, userAccountPage.verifyMyAffiliateLink(link));
        }
    }

    @Then("User must see the following links under Newsletter section")
    public void user_must_see_Newsletter_section(List<String> expectedLinks) {
        for (String link : expectedLinks) {
            Assert.assertTrue("Link missing under Newsletter section: " + link, userAccountPage.verifyNewsletterLink(link));
        }
    }

}
