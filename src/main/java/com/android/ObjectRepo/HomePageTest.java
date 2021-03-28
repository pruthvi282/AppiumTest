package com.android.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageTest {
	
	public HomePageTest(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Media']")
	private MobileElement Media;

	public MobileElement getMedia() {
		return Media;
	}
	
}
