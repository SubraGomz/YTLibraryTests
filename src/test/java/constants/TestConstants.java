package constants;

/**
* Placeholder for the constants which are used to run Appium Test cases
 * */
public interface TestConstants {

    String url = "http://127.0.0.1:4723/wd/hub";
    String youTubeID = "com.google.android.youtube:id/";
    String nextButton = "next_button";
    String name = "name";
    String libraryName = "libraryTest";
    String createButton = "create_button";
    String squareAvatar = "square_avatar";
    String moreOptions = "More options";

    String editBtn = "edit_button";
    String editTitle = "title_edit";
    String updateLibraryName = "updateLibraryName";
    String savePlaylist = "menu_save_playlist";
    String deleteConfirmBtn = "android:id/button1";
    String libraryXpath = "//android.widget.Button[@content-desc=\"Library\"]/android.widget.ImageView";
    String newLibraryBtnXpath = "//android.widget.LinearLayout[4]";
    String deleteLibraryBtnXpath = "/hierarchy/android.widget.FrameLayout" +
            "/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]" +
            "/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    String connectHardwareKeyboard = "appium:connectHardwareKeyboard";
    String automationName = "appium:automationName";
    String platformName = "platformName";
    String deviceName = "appium:deviceName";
    String noReset = "appium:noReset";
    String appActivity = "appium:appActivity";
    String appPackage = "appium:appPackage";
    String noSign = "appium:noSign";
    String ensureWebviewsHavePages = "appium:ensureWebviewsHavePages";
    String nativeWebScreenshot = "appium:nativeWebScreenshot";
    String newCommandTimeout = "appium:newCommandTimeout";
    String pathToTestResourceFile = "/src/test/java/Resources/platformProperties.json";

}
