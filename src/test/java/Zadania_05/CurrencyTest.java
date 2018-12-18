package Zadania_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CurrencyTest {

    WebDriver driver;

    @BeforeMethod
    public void openFireFox(){
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeFireFox(){
        driver.close();
    }

    @Parameters({"webPage","search"})
    @Test
    public void getCurrency(String webPage,String search){
        driver.get(webPage);

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(search);
        element.submit();

        new WebDriverWait(driver, 25)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[7]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/a/h3"))).click();


        String currency = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/center/table[1]/tbody/tr[19]")).getText();


        System.out.println(currency);




    }
}
