import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup Chrome browser
 * 2. Open URL https://opensource-demo.orangehrmlive.com/
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

public class ChromeBrowserTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();// Object creation of WebDriver using ChromeDriver Class
        driver.get("https://opensource-demo.orangehrmlive.com/");// Opening provided url in Chrome Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// Telling browser to wait implicitly
        System.out.println(driver.getTitle());// Get title of the web page
        System.out.println(driver.getCurrentUrl());// Getting and printing current url of the page
        System.out.println(driver.getPageSource());// Getting and printing current page source
        driver.findElement(By.name("username")).sendKeys("maulin1@gmail.com");// Finding email field with name Locator and passing value to put into email field
        driver.findElement(By.name("password")).sendKeys("12345");// Finding password field with name Locator and passing value to put into password field
        driver.close(); // Close the browser
    }
}
