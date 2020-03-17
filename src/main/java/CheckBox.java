import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement check1 = driver.findElement(By.id("checkbox-1"));
        check1.click();
        Thread.sleep(500);

        WebElement check2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        check2.click();
        Thread.sleep(500);

        check1.click();
        Thread.sleep(1000);

        driver.quit();
    }



}
