package implementations;

import locators.Locators;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class DemoImplementation {
    static WebDriver driver = new ChromeDriver();

    public static void openUrl() {
        try {
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void searchHere() {
        driver.findElement(Locators.searchBox).sendKeys("Books" + Keys.ENTER);
    }

    public static void firstBookName() {
        try{
         Logger log = Logger.getLogger(String.valueOf(DemoImplementation.class));
        WebElement firstAppear = driver.findElement(Locators.firstBook);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", firstAppear);
        String bookName = firstAppear.getText();

            log.info(bookName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void closeChrome() {
        driver.quit();
    }

}
