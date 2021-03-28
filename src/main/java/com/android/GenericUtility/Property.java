package com.android.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	public String getproperty(String value) throws IOException{
		FileInputStream fis=new FileInputStream("./Resources/propert.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(value);
		return data;
	}

}
