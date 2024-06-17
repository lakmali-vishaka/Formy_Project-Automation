package CompleteForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CompleteWebForm {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

       driver.findElement(By.id("first-name")).sendKeys("vishaka");

        driver.findElement(By.id("last-name")).sendKeys("lakmali");

        driver.findElement(By.id("job-title")).sendKeys("Quality Asurance Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("02/23/2024");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector("btn btn-lg btn-primary")).click();





        driver.quit();
    }
}
