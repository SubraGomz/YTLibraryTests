package handlers;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommonHandler extends BaseTestClass{


/**
 * Added explicit wait for each element to load and verify
 * */
static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

/**
 * Method to click the mobile element using its xpath
 * */
    public static void clickByXPath(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(xpathLocator)));
        driver.findElement(AppiumBy.xpath(xpathLocator)).click();

    }

    /**
     * Method to verify the mobile element is available or not using its xpath
     * */
    public static void checkByXPath(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(xpathLocator)));
        driver.findElement(AppiumBy.xpath(xpathLocator)).isDisplayed();
    }

    /**
     * Method to click the mobile element using its accessibility ID
     * */
    public static void clickByAccessibilityID(String a11yLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(a11yLocator)));
        driver.findElement(AppiumBy.accessibilityId(a11yLocator)).click();
    }

    /**
     * Method to check the mobile element using its accessibility ID
     * */
    public static void checkByAccessibilityID(String a11yLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId(a11yLocator)));
        driver.findElement(AppiumBy.accessibilityId(a11yLocator)).isDisplayed();
    }

    /**
     * Method to click the mobile element using its ID
     * */
    public static void clickByID(String idLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id(idLocator)));
        driver.findElement(AppiumBy.id(idLocator)).click();
    }

    /**
     * Method to check the mobile element using its ID
     * */
    public static void checkByID(String idLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id(idLocator)));
        driver.findElement(AppiumBy.id(idLocator)).isDisplayed();
    }

    /**
     * Method to send values to the mobile element using its ID
     * */
    public static void sendKeysByID(String idLocator, String valueName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id(idLocator)));
        driver.findElement(AppiumBy.id(idLocator)).sendKeys(valueName);
    }

    /**
     * Method to clear the mobile element using its ID
     * */
    public static void clearID(String idLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id(idLocator)));
        driver.findElement(AppiumBy.id(idLocator)).clear();
    }

}
