package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseStep {

    @When("^user mengklik tombol MASUK di halaman onboarding$")
    public void user_mengklik_tombol_MASUK_di_halaman_onboarding() throws Throwable {
        onboardingPage.clickMasukButton();
    }

    @When("^user mengisi email \"([^\"]*)\" di halaman login$")
    public void user_mengisi_email_di_halaman_login(String email) throws Throwable {
        loginPage.isiEmail(email);
    }

    @When("^user mengisi password \"([^\"]*)\" di halaman login$")
    public void user_mengisi_password_di_halaman_login(String pass) throws Throwable {
        loginPage.isiPassword(pass);
    }

    @When("^user mengklik tombol MASUK di halaman login$")
    public void user_mengklik_tombol_MASUK_di_halaman_login() throws Throwable {
        loginPage.klikMasukButton();
    }

    @Then("^user berada di halaman beranda$")
    public void user_berada_di_halaman_beranda() throws Throwable {
        berandaPage.validasiBerandaPage();
    }

    @Then("^pesan toast \"([^\"]*)\" muncul di halaman login$")
    public void pesan_toast_muncul_di_halaman_login(String msg) throws Throwable {
        loginPage.validateToastMsg(msg);
    }

}
