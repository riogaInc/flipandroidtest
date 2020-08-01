Feature: Register

#  positive scenario for register feature is difficult to be automated because it contain process that was using other aplication (whatshapp or SMS) to get verification code

Scenario Outline: Negative Scenario - register dengan  format email yang salah
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol BUAT AKUN di halaman onboarding
  And user mengisi nama lengkap "Bahrun" di halaman register
  And user mengisi email "<email>" di halaman register
  And user mengklik tombol BUAT AKUN FLIP di halaman register
  Then pesan toast "<pesan>" muncul di halaman register
Examples:
  |email|pesan|
  |     |Email tidak valid|
  |a    |Email tidak valid|
  |a@   |Email tidak valid|
  |a@l  |Email tidak valid|
  |a@l.c|Email tidak valid|

Scenario Outline: Negative Scenario - register dengan  format password yang salah
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol BUAT AKUN di halaman onboarding
  And user mengisi nama lengkap "Bahrun" di halaman register
  And user mengisi email "bahrun@gmail.com" di halaman register
  And user mengisi password "<password>" di halaman register
  And user mengklik tombol BUAT AKUN FLIP di halaman register
  Then pesan toast "<pesan>" muncul di halaman register
  Examples:
    |password|pesan|
    |        |Password terlalu pendek|
    |z       |Password terlalu pendek|
    |ccccccc |Password terlalu pendek|


Scenario Outline: Negative Scenario - register dengan  format password yang salah
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol BUAT AKUN di halaman onboarding
  And user mengisi nama lengkap "Bahrun" di halaman register
  And user mengisi email "bahrun@gmail.com" di halaman register
  And user mengisi password "XXXXXXXXXX" di halaman register
  And user mengisi nomor handphone "<noHP>" di halaman register
  And user mengklik tombol BUAT AKUN FLIP di halaman register
  Then pesan toast "<pesan>" muncul di halaman register
  Examples:
    |noHP|pesan|
    |        |Nomor HP kamu terlalu panjang atau terlalu pendek.|
    |1       |Nomor HP kamu terlalu panjang atau terlalu pendek.|
    |88888888888888888888999999999999|Nomor HP kamu terlalu panjang atau terlalu pendek.|


Scenario: Negative Scenario - register dengan email yang sudah terdaftar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol BUAT AKUN di halaman onboarding
  And user mengisi nama lengkap "Satrio Ajie Wijaya" di halaman register
  And user mengisi email "satrioajiewijaya@gmail.com" di halaman register
  And user mengisi password "XXXXXXXXXX" di halaman register
  And user mengisi nomor handphone "08123456789001" di halaman register
  And user mengklik tombol BUAT AKUN FLIP di halaman register
  Then pesan toast "Email yang dimasukkan sudah terdaftar. Mohon cek email kamu." muncul di halaman register


Scenario: Negative Scenario - register dengan no handphone yang sudah terdaftar
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol BUAT AKUN di halaman onboarding
  And user mengisi nama lengkap "Satrio Ajie Wijaya" di halaman register
  And user mengisi email "satrioajieeeee@gmail.com" di halaman register
  And user mengisi password "XXXXXXXXXX" di halaman register
  And user mengisi nomor handphone "081394758911" di halaman register
  And user mengklik tombol BUAT AKUN FLIP di halaman register
  Then pesan toast "Nomor handphone sudah terdaftar. Silakan masuk dengan akun yang menggunakan nomor tersebut." muncul di halaman register





