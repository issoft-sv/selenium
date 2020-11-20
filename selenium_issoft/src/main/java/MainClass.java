import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\Java\\issoft_github\\selenium\\selenium\\selenium_issoft\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://coursehunter.net/course/selenium-webdriver-java-dlya-nachinayushchih");
    }
}
