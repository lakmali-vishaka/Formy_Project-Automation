package Selenium_test_Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Keyboard_Mouse_test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        Thread.sleep(10000);

        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Vishaka");



        WebElement button=driver.findElement(By.id("button"));
        button.click();
        driver.quit();

    }
}

