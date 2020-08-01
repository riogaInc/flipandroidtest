package utils;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<AndroidDriver> tlDriver = new ThreadLocal<>();
    private static ThreadLocal<Scenario> tlScenario = new ThreadLocal<>();

    public static void setTLDriver(AndroidDriver driver) {
        tlDriver.set(driver);
    }

    public static AndroidDriver getTLDriver() {
        return tlDriver.get();
    }

    public static void setScenario(Scenario scenario){
        tlScenario.set(scenario);
    }

    public static Scenario getTLScenario(){
        return  tlScenario.get();
    }
}
