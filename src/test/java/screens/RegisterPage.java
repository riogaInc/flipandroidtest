package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;

public class RegisterPage extends AbstractObjectScreen {

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Nama Lengkap']")
    protected AndroidElement namaTextField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email']")
    protected AndroidElement emailTextField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    protected AndroidElement passwordTextField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIHAT']/../..")
    protected AndroidElement lihatButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Contoh: 081200880088']")
    protected AndroidElement noHPTextField;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' BUAT AKUN FLIP ']/..")
    protected AndroidElement buatAkunFlipButton;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    protected AndroidElement toastMsg;

    public RegisterPage(AndroidDriver driver) {
        super(driver);
    }

    public void isiNama(String nama){
        namaTextField.sendKeys(nama);
    }

    public void isiEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void isiPassword(String pass){
        passwordTextField.sendKeys(pass);
        lihatButton.click();
    }

    public void isiNoHP(String noHP){
        noHPTextField.sendKeys(noHP);
//        WebElement toastView = driver.findElement(By.xpath("//android.widget.Toast[1]"));
//        System.out.println("pesan TOAST = " + toastView.getText());
    }

    public void validateToastMsg(String msg){
        Assert.assertEquals("Pesan toast message tidak sesuai",msg,toastMsg.getText());
    }

    public void klikBuatAkumFlipButton(){
        buatAkunFlipButton.click();
    }

}
