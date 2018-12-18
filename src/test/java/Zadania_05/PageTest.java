package Zadania_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class PageTest {

    WebDriver driver;

    @BeforeTest
    public void beforeMethodFireFox() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Parameters({"webPage", "acc", "pass"})
    @Test
    public void loggingUser(String webPage, String acc, String pass) {
        driver.get(webPage);

        WebElement accElement = driver.findElement(By.name("login"));
        WebElement passElement = driver.findElement(By.name("password"));

        accElement.sendKeys(acc);
        passElement.sendKeys(pass);
        passElement.submit();

    }

    @Test(dependsOnMethods = {"loggingUser"})
    public void createNewRepository() {

        new WebDriverWait(driver, 25)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[1]/div/div/div[1]/div/div[1]/h3/a"))).click();

        WebElement link = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[1]/div/div[1]/h3/a"));
        link.click();
    }

    @Parameters({"repoName","description"})
    @Test(dependsOnMethods = {"createNewRepository"})
    public void fulfillForm(String repoName, String description){

        new WebDriverWait(driver, 25)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"repository_name\"]")));

        WebElement name = driver.findElement(By.xpath("//*[@id=\"repository_name\"]"));
        name.sendKeys(repoName);

        WebElement var = driver.findElement(By.xpath("//*[@id=\"repository_description\"]"));
        var.sendKeys(description);


    }

    @AfterSuite
    public void afterMethod() {
        driver.quit();
    }
}
