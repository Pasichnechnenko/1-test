package mcpp;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linke1 {
    WebDriverWait wait;

    @BeforeTest
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.linkedin.com");
    }
    @Test
    public void userLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://www.linkedin.com");

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-email")));
        login.sendKeys("d.pasichnechenko@gmail.com");

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-password")));
        password.sendKeys("adgjmptw21");

        WebElement buttonlogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-submit")));
        buttonlogin.submit();


        driver.findElement(By.cssSelector("#jobs-tab-icon")).click();

        driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]")).click();

        driver.findElement(By.cssSelector("[id*=jobs-search-box-keyword]")).sendKeys("QA");


        driver.findElement(By.cssSelector("button.jobs-search-box__submit-button")).click();

    }
       @AfterTest
        public  void cheaklin() {
        WebElement buttonspecialty = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pv2 ph3 flex-grow-1")));

           Assert.assertEquals("«Qa» – Украина", buttonspecialty);


        }

    }

