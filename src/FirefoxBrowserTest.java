import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";

        //Set Firefox driver path
        System.setProperty("webdriver.firefox.driver", "drivers/gehkodriver.exe");

        //Start Firefox bbrowser
        WebDriver driver = new FirefoxDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find and enter email in email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("abc45@gmail.com");

        //Find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("itsy34");

        //Close browser
         driver.quit();
    }
}
