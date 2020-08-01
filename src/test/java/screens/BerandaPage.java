package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BerandaPage extends AbstractObjectScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beranda']/..")
    protected AndroidElement berandaButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaksi']/..")
    protected AndroidElement transaksiButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ajak Teman']/..")
    protected AndroidElement ajakTemanButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Akun']/..")
    protected AndroidElement akunButton;

    public BerandaPage(AndroidDriver driver) {
        super(driver);
    }

    public void validasiBerandaPage(){
        berandaButton.isDisplayed();
        transaksiButton.isDisplayed();
        ajakTemanButton.isDisplayed();
        akunButton.isDisplayed();
    }
}
