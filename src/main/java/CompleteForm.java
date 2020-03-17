
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.Assert.assertEquals;

public class CompleteForm {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


        driver.findElement(By.id("first-name")).sendKeys("First Name");
        driver.findElement(By.id("last-name")).sendKeys("Last Name");
        driver.findElement(By.id("job-title")).sendKeys("Job Title");

        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        LocalDate date = LocalDate.now();
        String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        driver.findElement(By.id("datepicker")).sendKeys(formattedDate);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.className("btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success"))));

        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);


        Thread.sleep(2000);
        driver.quit();
    }
}
