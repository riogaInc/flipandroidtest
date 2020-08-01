Feature: Login


#real password for valid account in normal scenario cannot be put into the code, for security purpose
Scenario: Normal Scenario - Login dengan menggunakan credential yang benar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengisi email "satrioajiewijaya@gmail.com" di halaman login
  And user mengisi password "XXXXXXXXXX" di halaman login
  And user mengklik tombol MASUK di halaman login
  Then user berada di halaman beranda

Scenario: Normal Scenario - Login dengan menggunakan email yang tidak terdaftar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengisi email "user@gmail.com" di halaman login
  And user mengisi password "XXXXXXXXXX" di halaman login
  And user mengklik tombol MASUK di halaman login
  Then pesan toast "Password yang dimasukkan salah. Silakan masukkan password ulang atau masuk ke menu Lupa Password" muncul di halaman login

Scenario: Normal Scenario - Login dengan menggunakan password yang salah
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengisi email "satrioajiewijaya@gmail.com" di halaman login
  And user mengisi password "XXXXXXXXXX" di halaman login
  And user mengklik tombol MASUK di halaman login
  Then pesan toast "Password yang dimasukkan salah. Silakan masukkan password ulang atau masuk ke menu Lupa Password" muncul di halaman login


Scenario Outline: Normal Scenario - Login dengan menggunakan format email yang tidak benar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengisi email "<email>" di halaman login
  And user mengklik tombol MASUK di halaman login
  Then pesan toast "Email kamu salah" muncul di halaman login
Examples:
  |email|
  |     |
  |a    |
  |a@   |
  |a@c  |
  |q@c.c|

Scenario Outline: Normal Scenario - Login dengan menggunakan format password yang tidak benar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengisi email "user@mail.com" di halaman login
  And user mengisi password "<password>" di halaman login
  And user mengklik tombol MASUK di halaman login
  Then pesan toast "Password minimal terdiri dari 8 karakter" muncul di halaman login
  Examples:
    |password|
    |        |
    |a       |
    |aaaaaaa |