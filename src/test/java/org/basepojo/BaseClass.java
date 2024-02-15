package org.basepojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions action;
	public static Alert alert;
	public static Select refname;
	public static Robot robot;
//1
	public static void chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
}

//2
	public static void edgebrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
//3
	public static void launchurl(String url) {
		driver.get(url);

	}
	
//4 
	public static String pagetitle() {
		String title = driver.getTitle();
		
		return title;
	}
	
//5
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
	}
//6 
	public static void maximize() {
		driver.manage().window().maximize();
	
	}
//7
	public static void filltextbox(WebElement element,String value) {
		element.sendKeys(value);
	}
//8
	public static void btnclick(WebElement click) {
		click.click();
	}
//9
	public static void closebrowser() {
		driver.close();
	}
//10
	public static void actionmove(WebElement act) {
		action = new Actions(driver);
		action.moveToElement(act);
	}
	
// 11
	
	public static void actionDragAndDrop(WebElement drag , WebElement drop) {
		action = new Actions (driver);
		action.dragAndDrop(drag, drop);

	}
	
//12
	
	public static void actionDouble() {
		action = new Actions(driver);
		action.doubleClick();

	}
	
//13
	
	public static void actionRightClick() {
		action = new Actions(driver);
		action.contextClick();

	}
	
//14
	
	public static void actionKeyup(String keyup) {
		action = new Actions(driver);
		action.keyUp(keyup);

	}
	
//15
	
	public static void actionKeyDown(String keydown) {
		
		action = new Actions(driver);
		action.keyDown(keydown);
	
	}
	
//16
	public static void alertAccept() {
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
//17	
      public static void alertDimiss() {
	         Alert a=driver.switchTo().alert();
		   	a.dismiss();

}
//18
      
      public static void screenshot(String filename) throws IOException {
    	  TakesScreenshot ts=(TakesScreenshot) driver;
    	  File as = ts.getScreenshotAs(OutputType.FILE);
    	  File file  = new File(""+filename);
    	  FileUtils.copyFile(as, file);
    	  
}
//19
      
      public static void javaScriptSendkeys(String value , WebElement ref) {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("arguments[0].setAttribute('value')"+value,ref);
	
	}
//20
      public static void javascriptclick(int value, WebElement ref) {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("arguements[0].setattribute"+value, ref);
		
	}
//21
      public static void selectvalue(WebElement element,String value) {
    	   refname=new Select (element);
    	   refname.selectByValue(value);
		
		
	}
//22	
	
      public static void selectbyvisible(WebElement element,String text) {
		refname=new Select (element);
		refname.selectByVisibleText(text);

	}
//23
      public static void selectbyIndex(WebElement element,int index) {
    	  refname=new Select(element);
    	  refname.selectByIndex(index);
		
	}
//24
      public static void selectIsMultiple(WebElement element) {
		refname=new Select(element);
		boolean multiple = refname.isMultiple();
		System.out.println(multiple);
	}
//25
      public static void selectGetOption(WebElement element,String value) {
		refname=new Select(element);
		List<WebElement> options = refname.getOptions();
		for(WebElement webElement : options) {
			System.out.println(webElement.getAttribute(value));
		}

	}
//26
      public static void selectAllOption(WebElement element) {
		refname=new Select(element);
		refname.getAllSelectedOptions();

	}
//27
      public static void firstSelected(WebElement element) {
		refname=new Select(element);
		refname.getFirstSelectedOption();
	}
//28
      public static void deSelectAll(WebElement element) {
		refname=new Select(element);
		refname.deselectAll();
	}
//29
      public static void deselectbyvalue(WebElement element,String value) {
		refname=new Select(element);
		refname.deselectByValue(value);
	}
//30
      
      public static void visibletext(WebElement element,String text) {
		refname=new Select(element);
		refname.deselectByVisibleText(text);
	}
//31
      public static void scrolldown(WebElement ref,String value) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollintoview(true)",ref);
	}
//32
      public static void scrollup(WebElement ref,String value) {
      	JavascriptExecutor js=(JavascriptExecutor)driver;
      	js.executeScript("arguments[0].scrollintoview(false)",ref);
      }
//33
      public static void navigateTo(String url) {
    	  driver.navigate().to(url);
		
	}
 //34
      public static void navigatefwd() {
    	  driver.navigate().forward();	
	}
 //35
      public static void navigateback() {
		driver.navigate().back();
	}
 //36
      public static void navigatefresh() {
    	  driver.navigate().refresh();	
	}
//37
      public static void framestring(String value) {
    	  driver.switchTo().frame(value);
		
	}
//38
      public static void framestringId(int value) {
		driver.switchTo().frame(value);
	}
//39
      public static void frameStringWebElement(WebElement element) {
    	  driver.switchTo().frame(element);
		
	}
//40
      public static void switchWindowurl(String url) {
    	  driver.switchTo().window(url);
		
	}
//41
      public static void switchwindowtitle(String title) {
    	  driver.switchTo().window(title);
}
//42
      public static void switchwindowid(String id) {
		driver.switchTo().window(id);

	}
//43
      public static void switchdefaultwindow() {
    	  driver.switchTo().defaultContent();
	
	}
//44
      public static void getwindowhandle() {
		driver.getWindowHandle();

	}
//45
      public static void getwindowhandles(WebElement element,int value) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(value));
		element.click();
		
	}
//46
      public static void robotcopy() throws AWTException {
    	  robot=new Robot();
    	  
    	  robot.keyPress(KeyEvent.VK_CONTROL);
    	  robot.keyPress(KeyEvent.VK_C);
	
    	  robot.keyRelease(KeyEvent.VK_CONTROL);
    	  robot.keyRelease(KeyEvent.VK_C);
	}
	 
      public static void robotpaste() throws AWTException {
    	  robot=new Robot();
    	  
    	  robot.keyPress(KeyEvent.VK_CONTROL);
    	  robot.keyPress(KeyEvent.VK_V);
	
    	  robot.keyRelease(KeyEvent.VK_CONTROL);
    	  robot.keyRelease(KeyEvent.VK_V);
      }
	
      public static void robottab() throws AWTException {
		robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
	}
      public static void robotshift() throws AWTException {
  		robot=new Robot();
  		
  		robot.keyPress(KeyEvent.VK_SHIFT);
  		robot.keyRelease(KeyEvent.VK_SHIFT);
      }
      
      public static  void robotenter() throws AWTException {
    	  robot=new Robot();
    	  
    	  robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);

	}
      public static  void robotcut() throws AWTException {
    	  robot=new Robot();
    	  
    	  robot.keyPress(KeyEvent.VK_CONTROL);
    	  robot.keyPress(KeyEvent.VK_X);
    	  
    	  robot.keyRelease(KeyEvent.VK_CONTROL);
    	  robot.keyRelease(KeyEvent.VK_X);
		
	}
      
      
      
      public static  void getDateAndTime() {

    	  Date d = new Date();
    	  
    	System.out.println(d);
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

	
}
