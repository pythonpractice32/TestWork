package TestWork.tests;

import TestWork.pages.Filmix_Film_Page;
import TestWork.pages.Filmix_Login_Form;
import TestWork.pages.Filmix_Search_Page;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilmixCommentDeleteTest extends BaseTest {

    @Test
    public void testCommentDeletion()
    {
        String testComment = "Testing comments section with Selenium WebDriver for Java";
        testPage.authButtonClick();
        Filmix_Login_Form LoginForm = new Filmix_Login_Form(driver);
        LoginForm.loginBoxClick();
        LoginForm.setLogin("pyrogun");
        LoginForm.passwordBoxClick();
        LoginForm.setPassword("745296183");
        LoginForm.submitAuth();
        //TEMP CODE
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class = 'ui-widget-overlay']")));
        //TEMP CODE
        testPage.searchBoxClick();
        testPage.searchBoxTypeText("Дэдпул");
        testPage.submitSearch();
        Filmix_Search_Page searchResultsPage = new Filmix_Search_Page(driver);
        searchResultsPage.clickMovieName();
        Filmix_Film_Page filmPage = new Filmix_Film_Page(driver);
        filmPage.deleteCommentBtnClick();
        filmPage.deletionAcceptBtnClick();

        Assert.assertTrue("Testing comment deletion", filmPage.checkCommentDeletion());
    }
}
