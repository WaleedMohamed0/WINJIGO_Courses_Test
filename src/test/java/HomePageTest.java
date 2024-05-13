import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
    @Test(priority = 1)
    public void clickOnCoursesElement() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBtn(homePage.courseElement);
    }

    @Test(priority = 2)
    public void clickOnAllCourseBtn() {
        AllCoursesPage allCoursesPage = new AllCoursesPage(driver);
        allCoursesPage.explicitWait(allCoursesPage.addCourseBtnElement);
        allCoursesPage.clickOnBtn(allCoursesPage.addCourseBtnElement);
    }
}
