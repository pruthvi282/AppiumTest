package com.android.ObjectRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Media_AudioFxTest {
	public Media_AudioFxTest(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
}
