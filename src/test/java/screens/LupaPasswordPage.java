package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LupaPasswordPage extends AbstractObjectScreen {
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email kamu']")
    protected AndroidElement emailTextField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' RESET PASSWORD ']/..")
    protected AndroidElement resetPassButton;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    protected AndroidElement toastMsg;

    public LupaPasswordPage(AndroidDriver driver) {
        super(driver);
    }

    public void isiEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void klikResetPassButton(){
        resetPassButton.click();
    }

    public void validateToastMsg(String msg){
        Assert.assertEquals("Pesan toast message tidak sesuai",msg,toastMsg.getText());
    }

    public void validatePopUpMsg(String msg){
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+msg+"']")).isDisplayed();
    }


}
