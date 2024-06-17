package Selenium_test_Basic;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image=driver.findElement(By.id("image"));

        WebElement box=driver.findElement(By.id("box"));
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();



        driver.quit();
    }


}
