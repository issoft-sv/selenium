import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.TestCaseId;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(Listener.class)
public class TestMainPage {
        protected static WebDriver driver;
        private WebDriverWait wait;
        private MainPage mainPage;

        @BeforeEach
        public void start () {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://www.tut.by/");
            mainPage = new MainPage(driver);
            mainPage.makeMainPageScreenshot();

        }
        @AfterEach
        public void stop () {
            driver.quit();
            driver = null;
        }

        @Feature("Login")
        @Description ("Verify user can login to the site")
        @TestCaseId("1234")
        @Test
        public void signInTest () {
            mainPage.signIn("seleniumtests@tut.by", "123456789zxcvbn");
            assertEquals("Selenium Test", mainPage.getUserNameDisplayed());
        }

        @Feature("Login")
        @Description ("Verify user can logout from the site")
        @TestCaseId("2345")
        @Test
        public void signOutTest () {
            mainPage.signIn("seleniumtests@tut.by", "123456789zxcvbn");
            mainPage.signOut();
            assertEquals("Войти", mainPage.getFirstSignButtonText());
        }
    }
