import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Grzegorz on 2015-05-29.
 */
public class MainConfigTest {

    public WebDriver driver;
    private final String BASE_URL = "http://www.kolekcjonuj.net.pl";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Software_Tools\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        System.out.println("Shutting down webdriver...");
        driver.quit();
    }
}
