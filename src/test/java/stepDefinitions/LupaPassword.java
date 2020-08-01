package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LupaPassword extends BaseStep {

    @When("^user mengklik Lupa Password\\? di halaman login$")
    public void user_mengklik_Lupa_Password_di_halaman_login() throws Throwable {
        loginPage.klikLupaPassword();
    }

    @When("^user mengisi email \"([^\"]*)\" di halaman lupa password$")
    public void user_mengisi_email_di_halaman_lupa_password(String email) throws Throwable {
        lupaPasswordPage.isiEmail(email);
    }

    @When("^user mengklik tombol RESET PASSWORD di halaman lupa password$")
    public void user_mengklik_tombol_RESET_PASSWORD_di_halaman_lupa_password() throws Throwable {
        lupaPasswordPage.klikResetPassButton();
    }

    @Then("^notifikasi pup up \"([^\"]*)\" di halaman lupa password$")
    public void notifikasi_pup_up_di_halaman_lupa_password(String msg) throws Throwable {
        lupaPasswordPage.validatePopUpMsg(msg);
    }

    @Then("^pesan toast \"([^\"]*)\" muncul di halaman lupa password$")
    public void pesan_toast_muncul_di_halaman_lupa_password(String msg) throws Throwable {
        lupaPasswordPage.validateToastMsg(msg);
    }


}
