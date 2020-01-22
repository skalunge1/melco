package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class utilities {
    public AndroidDriver<AndroidElement> driverAndroid;
    public IOSDriver<IOSElement> driverios;
    AndroidTouchAction t1;
    AndroidElement a1;

    public void connectionAndroid() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set my TestObject API Key

        //capabilities.setCapability("testobject_api_key", "D67ADBEF0B864232B5DB4B72DB073ECA");

        // Dynamic device allocation of an iPhone 7, running iOS 10.3 device
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Pixel3");
        capabilities.setCapability("appPackage", "com.melco.dx.melcoapp.dev");
        capabilities.setCapability("appActivity", "com.melco.dx.melcoapp.presentation.main.MainActivity");
        capabilities.setCapability("deviceId", "emulator-5554");

        // Set Appium version
        capabilities.setCapability("appiumVersion", "1.15.0");

        // Set Appium end point
        driverAndroid = new AndroidDriver<AndroidElement>(new URL("https://us1.appium.testobject.com/wd/hub"), capabilities);
        driverAndroid.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driverAndroid.launchApp();
    }
    
    public static AndroidDriver<AndroidElement> InstallInvokeAPK() throws MalformedURLException
	{
		//Define the source folder
		File f1 = new File("src/test/java");
		
		//Define the destination and name of the APK file
		//File f2 = new File(f1, "ApiDemos-debug.apk");
		File f2 = new File(f1, "Melco_Andriod.apk");
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 3");
		//cap.setCapability(MobileCapabilityType.UDID, "4d0a2350");
		
		//Define the maximum timeout period to execute command
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 100);
		cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		cap.setCapability(MobileCapabilityType.APP, f2.getAbsolutePath());
		
		//Use the Android Driver to work with Android Platform Elements
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
			
	
		return driver;
	}

    public void connectioniOS() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set my TestObject API Key

        capabilities.setCapability("testobject_api_key", "68706397BB9E45E58FECF225AE60B960");

        // Dynamic device allocation of an iPhone 7, running iOS 10.3 device
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "12.4.3");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("bundleID", "com.melco.dx.melcoapp.enterprise.dev");

        // Set Application under test
       //capabilities.setCapability("testobject_app_id", "1");
       capabilities.setCapability("name", "MelcoTest iOS");

        // Set Appium version
        capabilities.setCapability("appiumVersion", "1.15.0");

        // Set Appium end point
        driverios = new IOSDriver<IOSElement>(new URL("https://us1.appium.testobject.com/wd/hub"), capabilities);
        driverios.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driverios.launchApp();
    }
    
    public void signUp()
    {
    	
    }
    
 // Keyword function for click - Android
 	public void ClickElementAndroid(String locator, String locatorValue) {
 		if (locator.equals("id")) {
 			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			driverAndroid.findElementById(locatorValue).click();
 		} else if (locator.equals("className")) {
 			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			driverAndroid.findElementByClassName(locatorValue).click();
 		} else if (locator.equals("name")) {
 			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			driverAndroid.findElementByName(locatorValue).click();
 		} else if (locator.equals("androidUiAutomator")) {
 			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			driverAndroid.findElementByAndroidUIAutomator(locatorValue).click();
 		} else if (locator.equals("xpath")) {
 			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			driverAndroid.findElementByXPath(locatorValue).click();
 		}

 	}
 	
 	public void TypeElement(String locator, String locatorValue, String data) {
		if (locator.equals("id")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driverAndroid.findElementById(locatorValue).setValue(data);
			
		} else if (locator.equals("className")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driverAndroid.findElementByClassName(locatorValue).setValue(data);
			
		} else if (locator.equals("name")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driverAndroid.findElementByName(locatorValue).setValue(data);
			
		} else if (locator.equals("androidUiAutomator")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driverAndroid.findElementByAndroidUIAutomator(locatorValue).setValue(data);
			
		} else if (locator.equals("xpath")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driverAndroid.findElementByXPath(locatorValue).setValue(data);
			
		}
		
	}
 	
 	public void TapElementAndroid(String locator, String locatorValue) {
		if (locator.equals("id")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			a1 = driverAndroid.findElement(By.id(locatorValue));
			// Tap on date widget
			t1 = new AndroidTouchAction(driverAndroid);
			t1.tap(tapOptions().withElement(element(a1))).perform();
		} else if (locator.equals("className")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			a1 = driverAndroid.findElement(By.className(locatorValue));
			// Tap on date widget
			t1 = new AndroidTouchAction(driverAndroid);
			t1.tap(tapOptions().withElement(element(a1))).perform();
		} else if (locator.equals("name")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			a1 = driverAndroid.findElement(By.name(locatorValue));
			// Tap on date widget
			t1 = new AndroidTouchAction(driverAndroid);
			t1.tap(tapOptions().withElement(element(a1))).perform();
		} else if (locator.equals("androidUiAutomator")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			a1 = driverAndroid.findElementByAndroidUIAutomator(locatorValue);
			// Tap on date widget
			t1 = new AndroidTouchAction(driverAndroid);
			t1.tap(tapOptions().withElement(element(a1))).perform();
		} else if (locator.equals("xpath")) {
			driverAndroid.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			a1 = driverAndroid.findElement(By.xpath(locatorValue));
			// Tap on date widget
			AndroidTouchAction t1 = new AndroidTouchAction(driverAndroid);
			t1.tap(tapOptions().withElement(element(a1))).perform();
		}

	}
 	
 	public void AndroidAssertionText(String locator, String locatorValue, String expectedTExt, String msg) {

		if (locator.equals("id")) {
			String expectedTextView = expectedTExt;
			String actualTextViews = driverAndroid.findElement(By.id(locatorValue)).getText();
			//Assert.assertTrue(msg, actualTextViews.equals(expectedTextView));
			Assert.assertTrue(actualTextViews.equals(expectedTextView), msg);
		} else if (locator.equals("className")) {
			String expectedTextView = expectedTExt;
			String actualTextViews = driverAndroid.findElement(By.className(locatorValue)).getText();
			//Assert.assertTrue(msg, actualTextViews.equals(expectedTextView));
			Assert.assertTrue(actualTextViews.equals(expectedTextView), msg);
		} else if (locator.equals("name")) {
			String expectedTextView = expectedTExt;
			String actualTextViews = driverAndroid.findElement(By.name(locatorValue)).getText();
			//Assert.assertTrue(msg, actualTextViews.equals(expectedTextView));
			Assert.assertTrue(actualTextViews.equals(expectedTextView), msg);
		} else if (locator.equals("androidUiAutomator")) {
			String expectedTextView = expectedTExt;
			String actualTextViews = driverAndroid.findElementByAndroidUIAutomator((locatorValue)).getText();
			//Assert.assertTrue(msg, actualTextViews.equals(expectedTextView));
			Assert.assertTrue(actualTextViews.equals(expectedTextView), msg);
		}

	}

}
