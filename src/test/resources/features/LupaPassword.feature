Feature: Lupa Password

@dev
Scenario: Normal Scenario - Lupa password dengan email
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengklik Lupa Password? di halaman login
  And user mengisi email "satrioajiewijaya@gmail.com" di halaman lupa password
  And user mengklik tombol RESET PASSWORD di halaman lupa password
  Then notifikasi pup up "Silakan cek email kamu untuk melihat instruksi lebih lanjut" di halaman lupa password

  @dev
Scenario Outline: Negative Scenario - Lupa password dengan email
  Given aplikasi flip berhasil dibuka di android
  When user mengklik tombol MASUK di halaman onboarding
  And user mengklik Lupa Password? di halaman login
  And user mengisi email "<email>" di halaman lupa password
  And user mengklik tombol RESET PASSWORD di halaman lupa password
  Then pesan toast "Email kamu salah" muncul di halaman lupa password
  Examples:
  |email|
  |a    |
#  |a@   |
#  |a@c  |
#  |q@c.c|
