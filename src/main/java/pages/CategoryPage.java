package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CategoryPage extends BasePage {
    // WebDriver'ı başlatmak için constructor
    public CategoryPage(WebDriver driver) {super(driver);}

    // Locators
    private By kidsAndBabyCategory = By.xpath("//a[normalize-space()='ÇOCUK & BEBEK']");
    private By girlsCategory = By.xpath("//span[normalize-space()='KIZ ÇOCUK']");
    private By outerwearCategory = By.xpath("//section[contains(@class,'content-tab')]//a[contains(@class,'')][normalize-space()='Mont ve Kaban']");


    // Çocuk & Bebek kategorisini seçer
    public void selectChildAndBabyCategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(kidsAndBabyCategory)).perform();
    }

    // Kız Çocuk (6-14 Yaş) kategorisini seçer
    public void selectGirlCategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(girlsCategory)).click().perform();
    }

    // Mont ve Kaban alt menüsünü seçer
    public void selectCoatAndJacketSubCategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(outerwearCategory)).click().perform();
    }
}
