import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ByVariables {
    @Test
    void byVariables(){
    System.setProperty("webdriver.chrome.driver", "d:\\Java\\issoft_github\\selenium\\selenium\\selenium_issoft\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.tut.by/");
    driver.findElement(By.xpath("//input[@id='search_from_str']"));
    driver.findElement(By.name("str"));
    driver.findElement(By.className("header-logo"));
    driver.findElement(By.cssSelector("#search_from_str"));
    driver.findElement(By.id("search_from_str"));
    driver.findElement(By.linkText("Почта")).click();
    driver.findElement(By.tagName("input"));
    }
}
