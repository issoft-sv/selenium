import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_1 {
    static WebDriver driver;
    public Test_1(){
        System.setProperty("webdriver.chrome.driver", "d:\\Java\\issoft_github\\selenium\\selenium\\selenium_issoft\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterAll
    static void closeAll(){
        driver.quit();
    }
    @Test
    public void testMethod(){

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"authorize\"]/div/a")).click();
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("seleniumtests@tut.by");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789zxcvbn");
        driver.findElement(By.xpath("//input[@class='button m-green auth__enter']")).click();
        assertEquals("Selenium Test", driver.findElement(By.xpath("//span[@class='uname']")).getText());
    }
}
