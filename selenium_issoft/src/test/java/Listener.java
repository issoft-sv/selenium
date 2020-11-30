import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class Listener implements TestWatcher {

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] captureScreenshot () {
        return ((TakesScreenshot)TestMainPage.driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        captureScreenshot();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        captureScreenshot();
    }
}
