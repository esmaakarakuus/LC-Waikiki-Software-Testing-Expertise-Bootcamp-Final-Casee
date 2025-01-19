# LC Waikiki Yazılım Test Uzmanlığı Bootcamp Bitirme Projesi

Bu proje, LC Waikiki'nin web sitesinde belirtilen adımları otomatikleştiren bir test otomasyon projesidir. **Selenium**, **Java**, **TestNG**, **Maven** ve **Allure Report** gibi teknolojiler kullanılarak geliştirilmiştir. Projede **Page Object Model (POM)** tasarım deseni uygulanmıştır.

---

## Proje Hedefi

Kullanıcıların LC Waikiki web sitesinde belirli bir akışı takip ederek alışveriş yapma senaryosunu test etmek ve sonuçları raporlamaktır.

---

## 📋 Proje Adımları
1. **Ana Sayfa**  
   - `https://www.lcw.com/` adresine gidilir.
   - Giriş yap butonuna tıklanır, kullanıcı giriş sayfası açılır.

2. **Giriş Yapma**  
   - Geçerli bir e-posta ve şifre girilir.  
   - Şifre girildikten sonra ana sayfaya yönlendirilir.

3. **Kategori Seçimi**  
   - ÇOCUK & BEBEK kategorisinden **KIZ ÇOCUK (6-14 YAŞ)** alt kategorisi seçilir.  
   - **Mont ve Kaban** sayfasına yönlendirilir.

4. **Filtreleme**  
   - Beden filtresi: "5-6 Yaş", "6 Yaş", "6-7 Yaş" olarak seçilir.  
   - Renk filtresi: "Bej" olarak uygulanır.

5. **Sıralama**  
   - Sıralama menüsünden "En çok satanlar" seçilir.  

6. **Ürün İşlemleri**  
   - İlk sıradaki 4. ürüne tıklanır.  
   - Ürün detay sayfasında, uygun beden seçilir ve sepete eklenir.  
   - Aynı ürün favorilere de eklenir.

7. **Favoriler ve Sepet**  
   - Favoriler sayfasına gidilir, ardından sepete yönlendirilir.  
---

## 🛠️ Kullanılan Teknolojiler
- **Java**: Proje dili olarak kullanıldı.
- **Selenium**: Web sayfası elementlerinin otomasyonu için.
- **TestNG**: Test yönetimi ve çalıştırılması için.
- **Allure Report**: Test sonuçlarını detaylı bir şekilde raporlamak için.
- **Maven**: Proje bağımlılıklarını yönetmek için.
---

## 📂 Proje Yapısı
1. **Page Object Model (POM)**  
   - Her sayfa için ayrı bir sınıf oluşturulmuştur.  
   - Tüm elementler ve işlemler bu sınıflarda tanımlanmıştır.

2. **Test Paketleri**  
   - Test senaryoları ayrı bir test sınıfında tanımlanmıştır.

3. **Allure Raporlama**  
   - Test çalıştırıldıktan sonra rapor oluşturulur.

---

## Projeyi Çalıştırma

1. **Testleri Çalıştır**  
mvn clean test


2. **Raporları Görüntüle**  
allure serve target/allure-results

---

## Notlar

- Giriş bilgileriniz geçerli bir e-posta ve şifre içermelidir.  
- Allure raporları için Maven ve Allure'ın kurulu olduğundan emin olun.
