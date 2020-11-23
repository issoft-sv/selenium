import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByVariables {
    static WebDriver driver;
    public ByVariables(){
        driver = new ChromeDriver();
    }
    @AfterAll
    static void closeAll(){
        driver.quit();
    }
    @Test
    void byVariables(){
    driver.get("https://www.tut.by/");
    driver.findElement(By.xpath("//input[@id='search_from_str']"));
    driver.findElement(By.name("str"));
    driver.findElement(By.className("header-logo"));
    driver.findElement(By.cssSelector("#search_from_str"));
    driver.findElement(By.id("search_from_str"));
    driver.findElement(By.linkText("Почта"));
    driver.findElement(By.tagName("input"));
    }
}
