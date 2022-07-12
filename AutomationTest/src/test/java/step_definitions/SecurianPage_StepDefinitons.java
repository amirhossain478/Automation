package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SecurianPage;

public class SecurianPage_StepDefinitons {
	
    SecurianPage securianPage = new SecurianPage();
    
    @Given("user is on the securian pre_retirment calculator page")
    public void user_is_on_the_securian_pre_retirment_calculator_page() throws InterruptedException {
        securianPage.verifySecurianCalculatorPage();
    }
    @Then("user enters required fields")
    public void user_enters_required_fields(){
        securianPage.enterRequiredFields();
    }
    @Then("user clicks on calculate and verify for submission")
    public void user_clicks_on_calculate_and_verify_for_submission(){
        securianPage.verifyCalculatorResults();
    }
    @Then("user enters additional security field")
    public void user_enters_additional_security_field(){
        securianPage.additionalSecurityField();
    }
    @Then("user enters all fields")
    public void user_enters_all_fields(){
        securianPage.enterAllfields();
    }
    @Then("user updates default calculator values")
    public void user_updates_default_calculator_values(){
        securianPage.updateDefaultCalculatorValues();
    }
}
