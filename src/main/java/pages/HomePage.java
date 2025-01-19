package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    // WebDriver'ı başlatmak için yapıcı
    public HomePage(WebDriver driver) {super(driver);}

    // Locators
    public By cookieAcceptButton = By.xpath("//*[@id='cookieseal-banner-accept']");
    public By loginButton = By.xpath("//span[contains(@class,'user-wrapper')]//span[1]");



    // Çerez kapatma fonksiyonu
    public void closeCookies() {
        // Çerez düğmesini bul ve tıkla
        WebElement cookieButton = driver.findElement(cookieAcceptButton);
        if (cookieButton.isDisplayed()) {
            cookieButton.click();
            System.out.println("Çerez banner'ı başarıyla kapatıldı.");
        } else {
            System.out.println("Çerez banner'ı görüntülenmedi veya zaten kapalı.");
        }
    }

    // Giriş yap butonuna tıklama fonksiyonu
    public LoginPage goToLoginPage() {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
}
