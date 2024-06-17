package Selenium_test_Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        Thread.sleep(40000);

        WebElement name=driver.findElement(By.id("name"));
        Actions actions=new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("vishaka");

        WebElement date=driver.findElement(By.id("date"));
        date.sendKeys("12/22/2025");




        driver.quit();

    }
}
