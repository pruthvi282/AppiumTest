package com.android.GenericUtility;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Baseclass {
	public AppiumDriverLocalService service;
	Property p=new Property();
	
	@BeforeSuite
	public void serverConnection(){
		
		 service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		
	}
	
	@BeforeMethod
	public void launchApp() throws Throwable{
		
		String deviceName=p.getproperty("deviceName");
		String automationName=p.getproperty("automationName");
		String platformName=p.getproperty("platformName");
		String platformVersion=p.getproperty("platformVersion");
		String UDID=p.getproperty("UDID");
		String appActivity=p.getproperty("appActivity");
		String appPackage=p.getproperty("appPackage");
		
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("automationName", automationName);
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);
		cap.setCapability("UDID", UDID);
		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);
		
		URL url=new URL(Icostants.url);
		
		AndroidDriver driver=new AndroidDriver(url, cap);
		
	}

@AfterSuite
public void servicestop(){
	service.stop();
}

}
