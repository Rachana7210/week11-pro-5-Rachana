import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";

        //Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Start Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current Url
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is:" + driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("abc45@gmail.com");

        //Find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("itsy34");

        //Close browser
         driver.quit();


    }


}
