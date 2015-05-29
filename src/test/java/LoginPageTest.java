import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Grzegorz on 2015-05-20.
 */


public class LoginPageTest extends MainConfigTest{

    @Test
    public void should_check_title_and_domain(){
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        //assertEquals("Tytul jest niepoprawny","Portal kolekcjonerów. Gie³da antyków. Forum kolekcjonerskie.", title);
        assertEquals("Url jest niepoprawny","http://www.kolekcjonuj.net.pl/articles.php", url);
    }

    @Test
    public void should_accept_cookie_message(){
        WebElement cookieOk = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/button[2]"));
        cookieOk.click();
    }

    @Test
    public void should_login_correctly(){
        WebElement login = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("pass"));
        WebElement loginBtn = driver.findElement(By.name("loguj"));

        login.click();
        login.sendKeys("annakow855@gmail.com");
        pass.click();
        pass.sendKeys("Qwerty01");

        loginBtn.click();



    }


}
