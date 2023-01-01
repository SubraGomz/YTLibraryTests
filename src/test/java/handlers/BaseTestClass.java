package handlers;

import io.appium.java_client.android.AndroidDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import static constants.LibraryConstants.*;
public class BaseTestClass {

    public static AndroidDriver driver;

    @BeforeSuite
    public void setUp() throws IOException, ParseException {

        String dataRootPath = new File(System.getProperty("user.dir")).getPath() + "/src/test/java/Resources/platformProperties.json";
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(dataRootPath);
        Object objectFromJson = jsonParser.parse(reader);
        JSONObject jsonData = (JSONObject) objectFromJson;

        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(automationName, jsonData.get(automationName));
            desiredCapabilities.setCapability(platformName, jsonData.get(platformName));
            desiredCapabilities.setCapability(deviceName, jsonData.get(deviceName));
            desiredCapabilities.setCapability(noReset, true);
            desiredCapabilities.setCapability(appActivity, jsonData.get(appActivity));
            desiredCapabilities.setCapability(appPackage, jsonData.get(appPackage));
            desiredCapabilities.setCapability(noSign, true);
            desiredCapabilities.setCapability(ensureWebviewsHavePages, true);
            desiredCapabilities.setCapability(nativeWebScreenshot, true);
            desiredCapabilities.setCapability(newCommandTimeout, 3600);
            desiredCapabilities.setCapability(connectHardwareKeyboard, true);

            URL remoteUrl = new URL(url);

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        }
        catch (Exception exception) {
            System.out.println("Cause is: " + exception.getCause());
            System.out.println("Message is: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
