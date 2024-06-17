package Selenium_test_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindow {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement button=driver.findElement(By.id("new-tab-button"));
        button.click();

        String OriginalHandle=driver.getWindowHandle();

        for(String handle1:driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(OriginalHandle);






        driver.quit();
    }
}


