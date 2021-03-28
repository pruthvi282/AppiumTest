package com.android.ApiDemos;

import java.io.IOException;

import org.testng.annotations.Test;

import com.android.GenericUtility.Baseclass;
import com.android.GenericUtility.Property;
import com.android.ObjectRepo.HomePageTest;
import com.android.ObjectRepo.MediaPageTest;

import io.appium.java_client.TouchAction;

public class TestBase extends Baseclass {

	@Test
	public void test() {
		HomePageTest h = new HomePageTest(driver);
		MediaPageTest m = new MediaPageTest(driver);
		h.getMedia().click();
		m.getAudioFx().click();

		driver.swipe(173, 393, 562, 393, 1000);

	}
}
