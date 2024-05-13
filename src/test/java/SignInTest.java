import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    SignInPage signInPage;

    @Test
    public void signIn() {
        signInPage = new SignInPage(driver);
        signInPage.enterSignInFields("testregister@aaa.com", "Wakram_123");
        signInPage.clickOnBtn(signInPage.signInBtn);
    }
}
