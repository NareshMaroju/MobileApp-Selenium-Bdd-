package setup;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class Driver {
    public static AppiumDriver driver;

    private static final Logger log = Logger.getLogger(Driver.class.getName());

    public static void setUp() throws MalformedURLException {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("sdk_gphone64_x86_64");
            options.setUdid("emulator-5554");
            options.setPlatformName("Android");
            options.setPlatformVersion("14");
            options.setAutomationName("uiAutomator2");
            options.setAppPackage("com.swaglabsmobileapp");
            options.setAppActivity("com.swaglabsmobileapp.MainActivity");
            options.setCapability("ignoreHiddenApiPolicyError", true);

            URL url = new URL("http://127.0.0.1:4723");
            driver = new AppiumDriver(url, options);
            log.info("Driver initialized successfully.");
            System.out.println("**************");

    }


}
