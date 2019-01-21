package utils;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pagesobjects.AuthenticationPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties;


    private  String browser;
    private String os;
    private final int webDriverWait = 30;
    private final int webDriverPageLoadWait = 60;

    private final String MAC_CHROME_WEBDRIVER_PATH = "src/test/resources/webdriver/chromedriver/machromedriver";
    private final String CHROME_WEBDRIVER_PATH = "src/test/resources/webdriver/chromedriver/linuxchromedriver";
    private final String DEFAULT_CHROME_WEBDRIVER_PATH = "src/test/resources/webdriver/chromedriver/Chromedriver.exe";

    private final String MAC_GECKO_WEBDRIVER_PATH = "src/test/resources/webdriver/geckodriver/macgeckodriver";
    private final String GECKO_WEBDRIVER_PATH = "src/test/resources/webdriver/geckodriver/linuxchromedriver";
    private final String DEFAULT_WEBDRIVER_PATH = "src/test/resources/webdriver/geckodriver/chromedriver.exe";


    private final String IE_WEBDRIVER_PATH = "src/test/resources/webdriver/iedriver.exe";
    private static String siteAddress = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public static Scenario scenario;


    public TestBase(){
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/properties/Properties.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Scenario getScenario() {
        return scenario;
    }


    public static AuthenticationPage initiateApplication(){
        driver = new TestBase().getWebDriver();
            driver.navigate().to(siteAddress);
            return new AuthenticationPage();
    }

    public static void tearDown(){
        driver.quit();
    }


    public  WebDriver  getWebDriver() {
        WebDriver driver = null;
        browser = System.getProperty("browser");
        if (browser==null) browser="chrome";
        os = System.getProperty("os.name").toLowerCase();
        switch(browser.toLowerCase())
        {
            case  "ie":
                File file = new File("C:/Selenium/iexploredriver.exe");
                System.setProperty("webdriver.ie.driver", IE_WEBDRIVER_PATH);
                driver = new InternetExplorerDriver();
            case  "firefox":
                if (os.contains("mac")) {
                    System.setProperty("webdriver.gecko.driver", MAC_GECKO_WEBDRIVER_PATH);
                } else if (os.contains("linux")) {
                    System.setProperty("webdriver.gecko.driver", CHROME_WEBDRIVER_PATH);
                } else
                    System.setProperty("webdriver.gecko.driver", DEFAULT_CHROME_WEBDRIVER_PATH);
                    ProfilesIni profiles = new ProfilesIni();
                    FirefoxProfile firefoxProfile = profiles.getProfile("default");
                    DesiredCapabilities dcap = DesiredCapabilities.firefox();
                    dcap.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
                    dcap.setCapability("marlonette", true);
                    driver = new FirefoxDriver(dcap);
            case "chrome":
                if (os.contains("mac")) {
                    System.setProperty("webdriver.chrome.driver", MAC_CHROME_WEBDRIVER_PATH);
                } else if (os.contains("linux")) {
                    System.setProperty("webdriver.chrome.driver", CHROME_WEBDRIVER_PATH);
                } else
                    System.setProperty("webdriver.chrome.driver", DEFAULT_CHROME_WEBDRIVER_PATH);
                ChromeOptions options = new ChromeOptions();
                if (browser.equalsIgnoreCase("chrome")) {
                    options.addArguments("--disable-extensions");
                    options.addArguments("--start-maximized");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                    driver = new ChromeDriver(capabilities);
                    driver.manage().timeouts().pageLoadTimeout(webDriverPageLoadWait, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(webDriverWait, TimeUnit.SECONDS);
                } else if (browser.equalsIgnoreCase("chrome-headless")) {
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);
                }
        }
        return driver;
    }
}
