import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\Java\\issoft_github\\selenium\\selenium\\selenium_issoft\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tut.by/");
        driver.findElement(By.xpath("//*[@id=\"authorize\"]/div/a")).click();
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("seleniumtests@tut.by");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789zxcvbn");
        driver.findElement(By.xpath("//input[@class='button m-green auth__enter']")).click();
        System.out.println(driver.findElement(By.xpath("//span[@class='uname']")).getText());
        driver.quit();
    }
}
