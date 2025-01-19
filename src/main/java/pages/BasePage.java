package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    // WebDriver nesnesi, sayfa sınıfları tarafından kullanılacak
    public WebDriver driver;

    // Giriş sayfası için temel URL
    final public String baseUrl = "https://www.lcw.com/";

    // BasePage constructor'ı, WebDriver nesnesini alır ve başlatır
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
