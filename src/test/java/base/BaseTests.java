package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
        public static void inicializar() {
            System.setProperty("webdriver.chrome.driver","D:\\Repositories\\SeleniumWebDiverIterasys\\ecommerce_prestashop_WebTests\\drive\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    @BeforeEach
        public void carregarPaginaInicial(){
            driver.get("https://marcelodebittencourt.com/demoprestashop/");
            homePage = new HomePage(driver);
        }
    @AfterAll
    public static void finalizar(){
        driver.quit();

    }


}
