package Advance_locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class DatePicker {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField=driver.findElement(By.id("datepicker"));
        dateField.sendKeys("18/06/2024");
        dateField.sendKeys(Keys.RETURN);



        driver.quit();
    }

}
