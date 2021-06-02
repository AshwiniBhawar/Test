package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class BrokenPage extends BaseClass {
	
	public static void BrokenPage() throws MalformedURLException, IOException {
	List<WebElement> ele= driver.findElements(By.tagName("a"));
	ele.addAll(driver.findElements(By.tagName("img")));
	System.out.println("Size of full link and img----"+ele.size());
	
	
	List<WebElement> activeLink= new ArrayList<WebElement>();
	
	for(int i=0;i<ele.size();i++) {
		if(ele.get(i).getAttribute("href") !=null) {
			activeLink.add(ele.get(i));
			
		}
		
		}	
	
	System.out.println("Active Links are------------>"+activeLink.size());
	
	for(int j=0;j<activeLink.size();j++) {
		
		HttpURLConnection conn= (HttpURLConnection) new URL(activeLink.get(j).getAttribute("href")).openConnection();
		conn.connect();
		String code= conn.getResponseMessage();
		conn.disconnect();
		System.out.println(activeLink.get(j).getAttribute("href")+"----"+ code);
	
	}}
}
