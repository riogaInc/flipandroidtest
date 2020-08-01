package stepDefinitions;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import screens.*;
import utils.ThreadLocalDriver;

public class BaseStep {

    protected AndroidDriver driver = ThreadLocalDriver.getTLDriver();
    protected Scenario scenario = ThreadLocalDriver.getTLScenario();

    OnboardingPage onboardingPage = new OnboardingPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    BerandaPage berandaPage = new BerandaPage(driver);
    LupaPasswordPage lupaPasswordPage = new LupaPasswordPage(driver);
}
