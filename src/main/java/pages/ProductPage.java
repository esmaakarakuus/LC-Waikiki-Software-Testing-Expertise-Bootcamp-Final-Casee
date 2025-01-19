package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    // WebDriver'ı başlatmak için constructor
    public ProductPage(WebDriver driver) {super(driver);}

    // Locators
    private By favoriteButton = By.xpath("//a[@id='add-to-favorite-detail']");
    private By addToCart = By.xpath("//button[normalize-space()='SEPETE EKLE']");
    private By availableSizeOption = By.xpath("//button[@data-label='5-6 Yaş']");
    private By goToFavoritesButton = By.xpath("//span[normalize-space()='Favorilerim']");

    //Bedeni tükenmemiş bir beden seçer
    public void selectAvailableSize() {
        WebElement availableSize = driver.findElement(availableSizeOption);
        availableSize.click();
    }

    //Ürünü sepete ekler
    public void clickAddToCartButton() {
        WebElement addToCartButtonElement = driver.findElement(addToCart);
        addToCartButtonElement.click();
    }

    // Ürünü favorilere ekler
    public void clickAddToFavoritesButton() {
        WebElement favoriteButtonElement = driver.findElement(favoriteButton);
        favoriteButtonElement.click();
    }

    //Favorilerime git butonuna tıklar
    public void clickGoToFavoritesButton() {
        WebElement goToFavoritesElement = driver.findElement(goToFavoritesButton);
        goToFavoritesElement.click();
    }
}
