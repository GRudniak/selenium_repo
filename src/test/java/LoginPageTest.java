import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Grzegorz on 2015-05-20.
 */


public class LoginPageTest {
    @Test
    public void should_open_login_page(){
        System.setProperty("webdriver.chrome.driver", "D:\\Software_Tools\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }
}
