package com.android.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MediaPageTest {

	public MediaPageTest(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility="AudioFx")
	private MobileElement AudioFx;

	public MobileElement getAudioFx() {
		return AudioFx;
	}

}
