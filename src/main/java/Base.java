import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    protected WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBtn(By element) {
        driver.findElement(element).click();
    }

    public void sendKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void explicitWait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
