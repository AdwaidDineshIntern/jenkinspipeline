import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YourSeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the Geckodriver executable if it's not in the system PATH
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // Initialize the WebDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testExample() {
        driver.get("http://www.example.com");
        // Your test code here
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
