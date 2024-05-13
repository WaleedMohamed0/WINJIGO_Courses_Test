import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static WebDriver driver;
    @BeforeSuite
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swinji.azurewebsites.net/account/login");
    }
//    @AfterTest
//    public void quit()
//    {
//        driver.quit();
//    }
}
