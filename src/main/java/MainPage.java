import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class MainPage {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.nhl.com/");
        WebElement standingsButton = driver.findElement(By.xpath("//*[@class='top-nav__primary__menu__item top-nav__primary__menu__item--standings']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(standingsButton).click();

    }

}
