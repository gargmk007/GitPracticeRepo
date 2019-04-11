package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddAnAddress {

	public static AndroidDriver<WebElement> driver;
	
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
   	
   	DesiredCapabilities capabilities = new DesiredCapabilities();	
   	
   	 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY222X9N3G");
   	
   	 capabilities.setCapability(MobileCapabilityType.VERSION, "6.0.1"); 
   	
   		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
   		
   		
   		capabilities.setCapability("appPackage", "com.flipkart.android");
   		capabilities.setCapability("appActivity","com.flipkart.android.SplashActivity");
		    
   		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	           Thread.sleep(4000);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	       //Flipkart Login functionality 
	         driver.findElementById("com.flipkart.android:id/btn_mlogin").click();
	           
	        driver.findElementByClassName("android.widget.EditText").click();
           driver.findElementById("com.google.android.gms:id/cancel").click();
	        driver.findElementByClassName("android.widget.EditText").sendKeys("7972196744");
	        driver.findElementById("com.flipkart.android:id/et_password").sendKeys("flipkart");	
	       	driver.findElementByClassName("android.widget.Button").click();
	       	driver.findElementByClassName("android.widget.ImageButton").click();
    }
}
