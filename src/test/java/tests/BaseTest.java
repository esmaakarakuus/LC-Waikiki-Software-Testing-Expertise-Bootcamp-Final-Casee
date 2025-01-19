package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    final public String baseUrl = "https://www.lcw.com/";

    // Setup işlemleri
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Esma\\OneDrive\\Masaüstü\\lcwBootcamp-POM-Design\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        // Belirtilen URL'ye git ve pencereyi maksimize et
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
    }

    // Her testten sonra tarayıcıyı kapat
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
