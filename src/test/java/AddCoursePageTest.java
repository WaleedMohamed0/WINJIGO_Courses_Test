import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddCoursePageTest extends BaseTest {
    AddCoursePage addCoursePage;
    HomePageTest homePageTest;

    @Test
    public void AddCourseTest(String courseName, String courseSubject, String courseGrade, String courseTeacher) {
        addCoursePage = new AddCoursePage(driver);
        addCoursePage.setCourseName(courseName);
        addCoursePage.setCourseSubject(courseSubject);
        addCoursePage.setCourseGrade(courseGrade);
        addCoursePage.clickOnTeacherCourseCheckbox();
        addCoursePage.clickOnCourseTeacher();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addCoursePage.chooseCourseTeacher(courseTeacher);
        addCoursePage.clickOnCreateCourse();
        homePageTest = new HomePageTest();
        homePageTest.clickOnCoursesElement();
        AllCoursesPage allCoursesPage = new AllCoursesPage(driver);
        allCoursesPage.selectSortCourses();
        String actualCourseName = driver.findElement(By.xpath("//a[@id='lnkListCourseSelcted']")).getText();
        Assert.assertEquals(actualCourseName, courseName, "Course name is not matching");
    }
}
