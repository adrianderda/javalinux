package Zadania_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG {

    WebDriver driver;


    @BeforeGroups("firefox")
    public void beforeMethodFireFox() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeGroups("chrome")
    public void beforeMethodChrome() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Parameters({"webPage", "search"})
    @Test(groups = {"firefox", "chrome"})
    public void main_test(String webPage, String search) {
        driver.get(webPage);

        System.out.println("Page title is: " + driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(search);
        element.submit();


        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });


        System.out.println("Page title is: " + driver.getTitle());

    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}


