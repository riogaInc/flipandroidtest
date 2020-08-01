package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class LoginPage extends AbstractObjectScreen {
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
    protected AndroidElement emailTextField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    protected AndroidElement passwordTextField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIHAT']/../..")
    protected AndroidElement lihatButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' MASUK ']/..")
    protected AndroidElement masukButton;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    protected AndroidElement toastMsg;

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void isiEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void isiPassword(String pass){
        passwordTextField.sendKeys(pass);
        lihatButton.click();
    }

    public void klikMasukButton(){
        masukButton.click();
    }

    public void validateToastMsg(String msg){
        Assert.assertEquals("Pesan toast message tidak sesuai",msg,toastMsg.getText());
    }
}
