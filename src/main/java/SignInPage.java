import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
    public SignInPage(WebDriver driver)
    {
        super(driver);
    }
    By email = By.id("Email"),
            password = By.id("inputPassword"),
            signInBtn = By.xpath("//input[@type = 'submit']");
    void enterSignInFields(String email, String password)
    {
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);
    }
}
