package TestWork.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Filmix_Search_Page extends Base_Page{

    public Filmix_Search_Page(WebDriver driver)
    {
        super(driver);

    }
    @FindBy(xpath = "//h2[@class = 'result-title']/span")
    private WebElement resultCount;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/section/div/div/div[3]/article[1]/div[2]/div[2]/h2/a")
    private List<WebElement> results;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/section/div/div/div[3]/article[1]/div[1]/a")
    private WebElement firstFilmBtn;


    public int countResults()
    {
        return results.size();
    }
    public void clickMovieName()
    {
       firstFilmBtn.click();

    }
}
