package com.jikexueyuan;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Demo2 extends UiAutomatorTestCase {
   public void press(){
//	   getUiDevice().pressMenu();
//	   getUiDevice().pressHome();
	   UiDevice.getInstance().pressMenu();
	   sleep(2000);
	   UiDevice.getInstance().pressHome();
   }
}
