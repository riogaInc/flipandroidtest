package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    @BeforeMethod
    @Parameters({"UDID_", "appPackage_", "appActivity_", "deviceName_","androidVersion_"})
    protected void SetupAppium(String UDID_, String appPackage_, String appActivity_, String deviceName_, String androidVersion_) throws MalformedURLException, InterruptedException {
        if(ThreadLocalDriver.getTLDriver()==null) {
            startServer(UDID_, appPackage_, appActivity_, deviceName_, androidVersion_);
        }
    }

    public void startServer(String UDID_, String appPackage_, String appActivity_,String deviceName_, String androidVersion) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName_);
        caps.setCapability(MobileCapabilityType.UDID, UDID_);
        caps.setCapability("appPackage", appPackage_);
        caps.setCapability("appActivity", appActivity_);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidVersion);

        ThreadLocalDriver.setTLDriver(new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps));
        ThreadLocalDriver.getTLDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    protected synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }
}
