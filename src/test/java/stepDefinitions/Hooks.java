package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import utils.ThreadLocalDriver;

public class Hooks {

    @Before
    public void getScenario(Scenario scenario){
        ThreadLocalDriver.setScenario(scenario);
        ThreadLocalDriver.getTLDriver().resetApp();
    }

    @After
    public void teardownCucumber(Scenario scenario){
        if (scenario.isFailed()) {
            try {
                final byte[] screenshot = ((TakesScreenshot) ThreadLocalDriver.getTLDriver()).getScreenshotAs(OutputType.BYTES);
                ThreadLocalDriver.getTLScenario().embed(screenshot, "image/png"); // ... and embed it in
            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        }
        ThreadLocalDriver.getTLDriver().closeApp();
    }
}
