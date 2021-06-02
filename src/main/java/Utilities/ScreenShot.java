package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import baseClass.BaseClass;

public class ScreenShot extends BaseClass{
	
	public void TakeScreenshot() throws IOException {
	File scrShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrShot, new File("C:/Users/ashwi/Seleni/CucumberTest/target/Screenshots/test.png"));

	}
}
