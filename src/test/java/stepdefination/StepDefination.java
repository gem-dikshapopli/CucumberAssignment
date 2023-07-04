package stepdefination;

import implementations.DemoImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class StepDefination {
    @Given("^User Is On The Home Page Of Amazon$")
    public void openLink() {
        DemoImplementation.openUrl();
    }

    @When("^User Will Enter Books In The Search Box$")
    public void search() {
        DemoImplementation.searchHere();
    }

    @And("^Name Of The First Book Will Be Printed$")
    public void firstBook() {
        DemoImplementation.firstBookName();
    }

    @Then("^Chrome Will be Closed$")
    public void quit() {
        DemoImplementation.closeChrome();
    }

}
