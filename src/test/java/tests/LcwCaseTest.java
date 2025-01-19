package tests;

import pages.*;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.testng.annotations.Test;


public class LcwCaseTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    CategoryPage categoryPage;
    FilterPage filterPage;
    ProductPage productPage;
    FavoritesPage favoritesPage;

    //Home Page Test
    @Test(priority = 1)
    @Description("Bu testte ana sayfa yüklenir, çerez banner'ı kapatılır ve giriş sayfasına yönlendirilir.")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void testHomePage() throws InterruptedException {
        Allure.step("// HomePage nesnesini başlat");
        // HomePage nesnesini başlat
        homePage = new HomePage(driver);

        Allure.step("Çerez banner'ını kapat");
        // Çerez banner'ını kapat
        homePage.closeCookies();
        Thread.sleep(2000);

        Allure.step("Giriş sayfasına git");
        // Giriş yap sayfasına git
        LoginPage loginPage = homePage.goToLoginPage();
        Thread.sleep(1000);
    }

    //Login Page Test
    @Test(priority = 2)
    @Description("Bu testte kullanıcı bilgileri girilir: e-posta adresi ve şifre. Şifre doğrulanmaz, doğrudan ana sayfaya dönülür.")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void loginTest() throws InterruptedException {
        Allure.step("// LoginPage nesnesini başlat");
        // LoginPage nesnesini başlat
        loginPage = new LoginPage(driver);

        Allure.step("// Email gir ve devam et");
        // Email gir ve devam et
        loginPage.enterEmail("esmaakarakuus@hotmail.com");
        Thread.sleep(2000);

        Allure.step("// Şifre gir ancak giriş yapmadan ana sayfaya dön");
        // Şifre gir ancak giriş yapmadan ana sayfaya dön
        loginPage.enterPassword("aBe258452!");
        Thread.sleep(2000);
    }

    //Category Page Test
    @Test(priority = 3)
    @Description("Bu testte Çocuk & Bebek kategorisi seçilir, ardından Kız Çocuk (6-14 yaş) kategorisi seçilir ve Mont & Kaban alt kategorisine gidilir.")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void testSelectCategory() throws InterruptedException {
        Allure.step("CategoryPage nesnesini başlat");
        // CategoryPage nesnesini başlat
        categoryPage = new CategoryPage(driver);

        Allure.step("Çocuk & Bebek kategorisine tıkla");
        // Çocuk & Bebek kategorisine tıkla
        categoryPage.selectChildAndBabyCategory();
        Thread.sleep(1000);

        Allure.step("Kız Çocuk (6-14 Yaş) kategorisini seç");
        // Kız Çocuk (6-14 Yaş) kategorisini seç
        categoryPage.selectGirlCategory();
        Thread.sleep(1000);

        Allure.step("Mont ve Kaban alt menüsünü seç");
        // Mont ve Kaban alt menüsünü seç
        categoryPage.selectCoatAndJacketSubCategory();
        Thread.sleep(1000);
    }

    //Filter Page Test
    @Test(priority = 4)
    @Description("Bu testte Filtreleme işlemleri gerçekleştirilir: beden filtreleri, renk filtresi ve ürün sıralama işlemi yapılır. 4. ürüne yönlendirilir.")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void testApplyFilters() throws InterruptedException {
        Allure.step("FilterPage nesnesini başlat");
        // FilterPage nesnesini başlat
        filterPage = new FilterPage(driver);

        Allure.step("Beden filtrelerini uygula");
        // Beden filtrelerini uygula
        filterPage.applySizeFilters();

        Allure.step("Renk filtresini uygula");
        // Renk filtresini uygula
        filterPage.applyColorFilter();

        Allure.step("Ürünleri \"En çok satanlar\" kriterine göre sırala");
        // Ürünleri "En çok satanlar" kriterine göre sırala
        filterPage.applySortOption();

        Allure.step("4. ürüne git ve tıkla");
        // 4. ürüne git ve tıkla
        filterPage.goToFourthProduct();
    }

    //Product Page Test
    @Test(priority = 5)
    @Description("Bu testte seçilen ürün bedeni tükenmemiş bir boyutla güncellenir. Ürün sepete eklenir, favorilere eklenir ve favoriler sayfasına yönlendirilir")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void testAddToCartAndFavorites() throws InterruptedException {
        Allure.step("ProductDetailPage nesnesini başlat");
        // ProductDetailPage nesnesini başlat
        productPage = new ProductPage(driver);

        Allure.step("Sayfayı yenile");
        // Sayfayı yenile
        driver.navigate().refresh();
        Thread.sleep(2000);

        Allure.step("Bedeni tükenmemiş bir beden seç");
        // Bedeni tükenmemiş bir beden seç
        productPage.selectAvailableSize();
        Thread.sleep(2000);

        Allure.step("Ürünü sepete ekle");
        // Ürünü sepete ekle
        productPage.clickAddToCartButton();
        Thread.sleep(7000);

        Allure.step("Ürünü favorilere ekle");
        // Ürünü favorilere ekle
        productPage.clickAddToFavoritesButton();
        Thread.sleep(3000);

        Allure.step("Favorilerime git butonuna tıkla");
        // Favorilerime git butonuna tıkla
        productPage.clickGoToFavoritesButton();
        Thread.sleep(4000);
    }

    //Favorites Page Test
    @Test(priority = 6)
    @Description("Bu testte favoriler sayfasından sepete yönlendirilir ve ödeme işlemleri için hazırlık yapılır.")
    @Severity(io.qameta.allure.SeverityLevel.CRITICAL)
    public void testGoToCartFromFavorites() throws InterruptedException {
        Allure.step("FavoritesPage nesnesini başlat");
        // FavoritesPage nesnesini başlat
        favoritesPage = new FavoritesPage(driver);

        Allure.step("Sepete git butonuna tıkla");
        // Sepete git butonuna tıkla
        favoritesPage.clickGoToCartButton();
        Thread.sleep(4000);
    }

}

