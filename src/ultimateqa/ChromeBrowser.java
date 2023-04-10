package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // launch the chrome browser
        WebDriver driver = new ChromeDriver();
        // open the url into browser
        driver.get(baseUrl);
        // maximise the browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get the current url
        driver.getCurrentUrl();
        System.out.println("Current url : " + driver.getCurrentUrl());
        // get page source
        System.out.println("page source : " + driver.getPageSource());
        // find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("ultimate@gmail.com");
        //find the password field element
        driver.findElement(By.name("user[password]")).sendKeys("Prime123");
        // closing browser
        driver.close();
    }
}
