import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTest {

    @Test
    public void testFirst() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();
    }


}
