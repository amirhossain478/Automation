package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Driver;

public class Hook {
    Scenario scenario;
    /*
    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
        System.out.println("Test setup!");
        Driver.get();
    }
    */
    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Test failed!");
        } else {
            System.out.println("Test completed!");
        }
        Driver.close();
    }
}
