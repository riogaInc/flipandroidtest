package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends BaseStep{

    @Given("^aplikasi flip berhasil dibuka di android$")
    public void buka_aplikasi_flip_di_android() throws Throwable {
        onboardingPage.validasiHalamanOnboarding();
    }

    @When("^user mengklik tombol BUAT AKUN di halaman onboarding$")
    public void user_mengklik_tombol_BUAT_AKUN_di_halaman_onboarding() throws Throwable {
        onboardingPage.clickBuatAkunButton();
    }

    @When("^user mengisi nama lengkap \"([^\"]*)\" di halaman register$")
    public void user_mengisi_nama_lengkap_di_halaman_register(String nama) throws Throwable {
        registerPage.isiNama(nama);
    }

    @When("^user mengisi email \"([^\"]*)\" di halaman register$")
    public void user_mengisi_email_di_halaman_register(String email) throws Throwable {
        registerPage.isiEmail(email);
    }

    @When("^user mengisi password \"([^\"]*)\" di halaman register$")
    public void user_mengisi_password_di_halaman_register(String pass) throws Throwable {
        registerPage.isiPassword(pass);
    }

    @When("^user mengisi nomor handphone \"([^\"]*)\" di halaman register$")
    public void user_mengisi_nomor_handphone_di_halaman_register(String noHP) throws Throwable {
        registerPage.isiNoHP(noHP);
    }

    @When("^user mengklik tombol BUAT AKUN FLIP di halaman register$")
    public void user_mengklik_tombol_BUAT_AKUN_FLIP_di_halaman_register() throws Throwable {
        registerPage.klikBuatAkumFlipButton();
    }

    @Then("^pesan toast \"([^\"]*)\" muncul di halaman register$")
    public void pesan_toast_muncul_di_halaman_register(String msg) throws Throwable {
        registerPage.validateToastMsg(msg);
    }



}
