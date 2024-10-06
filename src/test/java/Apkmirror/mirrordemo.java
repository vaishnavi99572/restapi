package Apkmirror;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Apk_capabilities.Apk_cap_class;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class mirrordemo extends Apk_cap_class{
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	
	public void bt() throws MalformedURLException {
		driver= cap();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	
	@Test

	public void apk() {
		System.out.println("Mirror installler is opened");
		
		driver.findElement(MobileBy.id("com.apkmirror.helper.prod:id/buttonSettings")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Dark mode\"))")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dark\")")).click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	
	}
	@Test
	public void notification() {
		driver.openNotifications();
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
	
		
		
	}
	@Test
	
	public void sendkeys() {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Browse files\"))")).click();
		
		driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		
		driver.findElement(MobileBy.AccessibilityId("Filter")).click();
		
		driver.findElement(MobileBy.id("com.apkmirror.helper.prod:id/search_src_text")).sendKeys("Noti");
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"APK\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Apply\")")).click();
		
	}
	
	@Test
	
	public void enabledisablebatterysaver() {
		
		driver.openNotifications();
		
		driver.findElement(MobileBy.AccessibilityId("Open settings.")).click();	
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Battery\")")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Battery saver")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Battery saver")).click();
	
		
	}
	@Test
	
	public void scroll() throws InterruptedException {
		
		//Browse files

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Browse files\"))")).click();
		
		driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		driver.findElement(MobileBy.id("com.apkmirror.helper.prod:id/imageViewIcon")).click();
		

		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pictures\"))")).click();
		 
	
	}
	
	
	
	
	

}
