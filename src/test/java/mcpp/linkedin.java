package mcpp;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linkedin {

    @Test
    public void openGoogle() {
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



        driver.findElement(By.cssSelector("[class*=share-box__open]")).click();

        driver.findElement (By.cssSelector("")).click();
        driver.findElement (By.cssSelector(".mentions-texteditor__content")).sendKeys ("Hell");



    }
}