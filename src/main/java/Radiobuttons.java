import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radio1 = driver.findElement(By.id("radio-button-1"));
        radio1.click();
        Thread.sleep(500);

        WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radio2.click();
        Thread.sleep(500);

        WebElement radio3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radio3.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
