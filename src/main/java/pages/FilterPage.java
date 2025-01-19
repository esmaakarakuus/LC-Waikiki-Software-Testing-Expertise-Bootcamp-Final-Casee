package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class FilterPage extends BasePage {
    // WebDriver'ı başlatmak için constructor
    public FilterPage(WebDriver driver){super(driver);}

    // Locators
    private By sizeFilter5_6 = By.xpath("//div[@class='collapsible-filter-container__content-area collapsible-filter-container__content-area--size-filter']//div[2]//div[1]//span[1]");
    private By sizeFilter6 = By.xpath("//div[@class='collapsible-filter-container__content-area collapsible-filter-container__content-area--size-filter']//div[3]//div[1]//span[1]");
    private By sizeFilter6_7 = By.xpath("//div[@class='collapsible-filter-container__content-area collapsible-filter-container__content-area--size-filter']//div[4]//div[1]//span[1]");
    private By colorBeige = By.xpath("//span[normalize-space()='BEJ']");
    private By sortDropdown = By.xpath("//span[contains(text(),'Sırala')]");
    private By mostSellingOption = By.xpath("//a[normalize-space()='En çok satanlar']");
    private By fourthProduct = By.xpath("//h5[contains(text(),'Kapüşonlu Kız Çocuk Kaban')]");


    /**
     * Beden filtresini uygular
     */
    public void applySizeFilters() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Sayfayı kaydırarak Beden filtresi 5-6 Yaş
        WebElement element5_6 = driver.findElement(sizeFilter5_6);
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element5_6);
        wait.until(ExpectedConditions.elementToBeClickable(element5_6)).click();
        Thread.sleep(5000);

        // Sayfayı kaydırarak Beden filtresi 6 Yaş
        WebElement element6 = driver.findElement(sizeFilter6);
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element6);
        wait.until(ExpectedConditions.elementToBeClickable(element6)).click();
        Thread.sleep(5000);

        // Sayfayı kaydırarak Beden filtresi 6-7 Yaş
        WebElement element6_7 = driver.findElement(sizeFilter6_7);
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element6_7);
        wait.until(ExpectedConditions.elementToBeClickable(element6_7)).click();
        Thread.sleep(6000); }

    /**
     * Renk filtresini uygular
     */
    public void applyColorFilter() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Renk filtresi için Bej'i seç
        WebElement elementBeige = driver.findElement(colorBeige);
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", elementBeige);
        wait.until(ExpectedConditions.elementToBeClickable(elementBeige)).click();
        Thread.sleep(5000);
    }


    /**
     * Ürünleri belirli bir kritere göre sıralar
     */
    public void applySortOption() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Sayfanın en üstüne kaydır
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);

        // Sırala combobox'ına tıkla
        WebElement sortDropdownElement = driver.findElement(sortDropdown);
        wait.until(ExpectedConditions.elementToBeClickable(sortDropdown)).click();
        Thread.sleep(2000);

        // "En çok satanlar" seçeneğini seç
        WebElement mostSellingOptionElement = driver.findElement(mostSellingOption);
        wait.until(ExpectedConditions.elementToBeClickable(mostSellingOption)).click();
        Thread.sleep(4000);
    }

    /**
     * 4. ürüne gider ve tıklar
     */
    public void goToFourthProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 4. ürüne git ve tıkla
        WebElement fourthProductElement = driver.findElement(fourthProduct);
        js.executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - (window.innerHeight / 2));", fourthProductElement);
        wait.until(ExpectedConditions.elementToBeClickable(fourthProduct)).click();
        Thread.sleep(4000);
    }
}
