package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    // WebDriver'ı başlatmak için constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By emailTextBox = By.xpath("//input[@placeholder='E-posta Adresi veya Telefon Numarası']");
    private By continueButton = By.xpath("//button[normalize-space()='Devam Et']");
    private By passwordTextBox = By.xpath("//input[@placeholder='Şifreniz']");


    // Email gir ve devam et

    public void enterEmail(String email) throws InterruptedException {
        driver.findElement(emailTextBox).sendKeys(email);
        Thread.sleep(3000);
        driver.findElement(continueButton).click();
    }

    //Parola gir ancak giriş yapma
    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(passwordTextBox).sendKeys(password);
        Thread.sleep(3000);
        driver.navigate().to(baseUrl);
    }
}
