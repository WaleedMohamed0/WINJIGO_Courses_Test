import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By courseElement = By.xpath("//*[@id=\"btnMyCoursesList\"]");
}
