package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

public class JavaScriptUtility {

	
	
	public void scrollBy(WebDriver driver,int x,int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+");");
	}
}
