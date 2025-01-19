package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FavoritesPage extends BasePage {
    // WebDriver'ı başlatmak için yapıcı
    public FavoritesPage(WebDriver driver) {super(driver);}

    // Locator
    private By myCartButton = By.xpath("//span[normalize-space()='Sepetim']");

    //Sepetim butonuna tıklar
    public void clickGoToCartButton() {
        WebElement myCartBtn = driver.findElement(myCartButton);
        myCartBtn.click();
    }
}
