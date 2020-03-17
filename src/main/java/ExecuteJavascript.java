
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        Thread.sleep(500);

        WebElement closeModal = driver.findElement(By.id("close-button"));
        JavascriptExecutor jsE = (JavascriptExecutor)driver;
        jsE.executeScript("arguments[0].click();", closeModal);


        driver.quit();
    }
}
