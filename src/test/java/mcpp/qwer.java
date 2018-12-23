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

public class qwer {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeTest
    public void BeforeMethod () {
        //webDriver driver;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 25);

        driver.get("https://google.com");
    }
        @Test
        public void OpenGoogle () {
            WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".gLFyf")));
            input.sendKeys("wix");
            driver.findElement(By.cssSelector("[class*=e-box__open]")).click();
    }


        @AfterTest
        public void AfterMethod () {
            driver.close();
        }

      }
