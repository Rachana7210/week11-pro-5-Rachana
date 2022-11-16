import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "https://courses.ultimateqa.com/users/sign_in";

        //Set Edge driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Edge browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is :" + driver.getCurrentUrl());

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
