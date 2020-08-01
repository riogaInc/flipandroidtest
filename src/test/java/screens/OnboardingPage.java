package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardingPage extends AbstractObjectScreen{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' BUAT AKUN ']/..")
    protected AndroidElement buatAkunButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' MASUK ']/..")
    protected AndroidElement masukButton;

    public OnboardingPage(AndroidDriver driver) {
        super(driver);
    }

    public void validasiHalamanOnboarding(){
        buatAkunButton.isDisplayed();
        masukButton.isDisplayed();
    }

    public void clickBuatAkunButton(){
        buatAkunButton.click();
    }

    public void clickMasukButton(){
        masukButton.click();
    }
}
