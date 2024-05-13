import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AddCoursePage extends Base {
    public AddCoursePage(WebDriver driver) {
        super(driver);
    }

    By courseNameElement = By.name("courseName"),
            courseSubjectElement = By.id("courseSubject"),
            courseGradeElement = By.xpath("//select[@name = 'courseGrade']"),
            teacherCourseCheckboxElement = By.xpath("//label[@id = 'lblGetSelectedSubjectTeachers']/i"),
            courseTeacherElement = By.xpath("//span[contains(text(),'Course Teacher')]"),
            createCourseElement = By.id("btnSaveAsDraftCourse");


    public void setCourseName(String courseName) {
        explicitWait(courseNameElement);
        sendKeys(courseNameElement, courseName);
    }

    public void setCourseSubject(String courseSubject) {
        Select selectCourseSubjectElement = new Select(driver.findElement(courseSubjectElement));
        selectCourseSubjectElement.selectByVisibleText(courseSubject);
    }

    public void setCourseGrade(String courseGrade) {
        Select selectCourseGradeElement = new Select(driver.findElement(courseGradeElement));
        selectCourseGradeElement.selectByVisibleText(courseGrade);
    }

    public void clickOnTeacherCourseCheckbox() {
        clickOnBtn(teacherCourseCheckboxElement);
    }

    public void clickOnCourseTeacher() {
        clickOnBtn(courseTeacherElement);
    }

    public void chooseCourseTeacher(String courseTeacher) {
        driver.findElement(By.xpath("//span[contains(text(),'" + courseTeacher + "')]")).click();
    }

    public void clickOnCreateCourse() {
        clickOnBtn(createCourseElement);
    }
}
