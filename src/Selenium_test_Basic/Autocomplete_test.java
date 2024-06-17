package Selenium_test_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autocomplete_test {
    public static void main(String... args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Quatores no 4 ,Mhagasthotte estate, upper division, nuwara -eliya");
        Thread.sleep(1000);

        WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
        autocompleteResult.click();



        driver.quit();
    }

}





