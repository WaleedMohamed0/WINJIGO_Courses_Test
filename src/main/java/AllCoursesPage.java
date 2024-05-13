import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCoursesPage extends Base {
    public AllCoursesPage(WebDriver driver) {
        super(driver);
    }

    By addCourseBtnElement = By.xpath("//*[@id=\"btnListAddCourse\"]"),
            sortCoursesElement = By.id("CoursesOrderBy");

    public void selectSortCourses() {
        Select selectSortCoursesElement = new Select(driver.findElement(sortCoursesElement));
        selectSortCoursesElement.selectByIndex(3);
    }
}
