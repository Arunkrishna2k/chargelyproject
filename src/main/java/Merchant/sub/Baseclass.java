package Merchant.sub;



import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Baseclass {
		public static WebDriver driver;
		public static String parentTab;
		public static Set<String> childTab, childTabOne;
		public static ChromeDriver WebDriver;

//		Browser Config chrome,firefox,edge
//		1.
		public static void chromeBrowserPath() {


    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\eclipse-workspace\\sub\\driver\\chromedriver.exe");
	
	}
//		4.
		public static void chromeBrowser() {
			WebDriver = new ChromeDriver();
		}
//	
//		7.	window maximize
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
//		8.	get the url
		public static void launchUrl(String url) {
			driver.get(url);
		}
// 	    9.	Sendkeys 


	public static void fill(WebElement element,String values) {
		element.sendKeys(values);
	}
//		10.	Robot class Enter Button
		public static void enterButton() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_ENTER);
			press.keyRelease(KeyEvent.VK_ENTER);
		}
//		11.	Robot class Tab Button
		public static void tabButton() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_TAB);
			press.keyRelease(KeyEvent.VK_TAB);
		}
//		12. Robot class Control Button
		public static void controlButton() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_CONTROL);
			press.keyRelease(KeyEvent.VK_CONTROL);
		}
//		13.	Robot class A Key
		public static void buttonA() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_A);
			press.keyRelease(KeyEvent.VK_A);
		}
	//  14. Robot class C Key
		public static void buttonC() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_C);
			press.keyRelease(KeyEvent.VK_C);
		}
//		15.	Robot class V Key
		public static void buttonV() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_V);
			press.keyRelease(KeyEvent.VK_V);
		}
//		16.	Robot class Down Button
		public static void oneDown() throws AWTException {
			Robot press = new Robot();
			press.keyPress(KeyEvent.VK_DOWN);
			press.keyRelease(KeyEvent.VK_DOWN);
		}
//		17.
		public static void twoDown() throws AWTException {
			Robot press = new Robot();
			for(int i=0;i<2;i++) {
			press.keyPress(KeyEvent.VK_DOWN);
			press.keyRelease(KeyEvent.VK_DOWN);
			}
		}	
//		18.
		public static void threeDown() throws AWTException {
			Robot press = new Robot();
			for(int i=0;i<3;i++) {
			press.keyPress(KeyEvent.VK_DOWN);
			press.keyRelease(KeyEvent.VK_DOWN);
			}
		}	
//		 Alerts
//		19.
		public static void simpleAlert() {
			Alert simple = driver.switchTo().alert();
			simple.accept();
		}
//		20.
		public static void confirmAlert() {
			Alert simple = driver.switchTo().alert();
			simple.dismiss();
		}
//		21.
		public static void promptAlert(String values) {
			Alert simple = driver.switchTo().alert();
			simple.sendKeys(values);
			simple.accept();
		}
//		22.	 Screen Short
		public static void screenShot(String text) throws IOException {
			TakesScreenshot pic = (TakesScreenshot)driver;
			File sourceFile = pic.getScreenshotAs(OutputType.FILE);
			File destFile   = new File(text);
			Files.copy(sourceFile, destFile);
		}
//		23.	Window Handle
		public static void windowHandleUrl(String url) {
			driver.switchTo().window(url);
		}
//		24.
		public static void windowHandleTitle(String text) {
			driver.switchTo().window(text);
		}
//		25.
		public static void windowHandleparentID() {
			 parentTab = driver.getWindowHandle();
		}
//		26.
		public static void windowHandleChildOne() {
			 childTab = driver.getWindowHandles();
		}	
//		27.
		public static void windowhandleChildTwo() {
			 childTabOne = driver.getWindowHandles();
		}
//		28.
		public static void windowHandleAll() {
			for(String fristTab : childTabOne) {
				if((fristTab!=parentTab)&&(childTabOne!=childTab)) {
					driver.switchTo().window(fristTab);
		            }
			   }	
		}
//		29.
		public static void switchHomePage() {
			driver.switchTo().window(parentTab);		
		}
//		30.	 Actions Class
		public static void moveToElement(WebElement refName ) {
			Actions mouse = new Actions(driver);
			mouse.moveToElement(refName).perform();
		}
//		31.
		public static void dragAndDrop(WebElement source, WebElement target) {
			Actions mouse = new Actions(driver);
			mouse.dragAndDrop(source, target).perform();
		}
//		32.
		public static void doubleClick(WebElement source) {
			Actions mouse = new Actions(driver);
			mouse.doubleClick(source).perform();
		}
//		33.
		public static void contextClick(WebElement source) {
			Actions mouse = new Actions(driver);
			mouse.doubleClick(source).perform();
		}
//		 34.  JavaScript
		public static void sendKeyExecuter(WebElement element) {
			JavascriptExecutor jS = (JavascriptExecutor)driver;
			jS.executeScript("arguments[0].setAttribute('value','sanitizer')", element);
		}
//		35.
		public static void clickExecuter(WebElement element) {
			JavascriptExecutor jS = (JavascriptExecutor)driver;
			jS.executeScript("arguments[0].click()", element);
		}
//		36.
		public static void getValuesExecuter(WebElement element) {
			JavascriptExecutor jS = (JavascriptExecutor)driver;
			jS.executeScript("return arguments[0].getAttribute('value')", element);
		}
//		37.
		public static void scrollDown(WebElement element) {
			JavascriptExecutor jS = (JavascriptExecutor)driver;
			jS.executeScript("arguments[0].scrollIntoView(true)", element);
		}
//		38.
		public static void scrollUp(WebElement element) {
			JavascriptExecutor jS = (JavascriptExecutor)driver;
			jS.executeScript("arguments[0].scrollIntoView(false)", element);
		}
//		39.
		public static void normalGetValues(WebElement element) {
			element.getAttribute("values");
		}
//		40. Drop And Down
		public static void selectByIndex(WebElement element,int num) {
			Select s = new Select (element);
			s.selectByIndex(num);
		}
//		41.
		public static void deselectByIndex(WebElement element,int num) {
			Select s = new Select (element);
			s.deselectByIndex(num);
		}
//		42.
		public static void selectByVisibleText(WebElement element,String text) {
			Select s = new Select (element);
			s.selectByVisibleText(text);
		}
//		43.
		public static void deselectByVisibleText(WebElement element,String text) {
			Select s = new Select (element);
			s.deselectByVisibleText(text);
		}
//		44.
		public static void selectByValue(WebElement element,String text) {
			Select s = new Select (element);
			s.selectByValue(text);
		}
//		45.
		public static void deselectByValue(WebElement element,String text) {
			Select s = new Select (element);
			s.deselectByValue(text);
		}
//		46.
		public static void getOption(WebElement element) {
			Select s = new Select (element);
			s.getOptions();
		}
//		47.
		public static void isMultiple(WebElement element) {
			Select s = new Select (element);
			s.isMultiple();
		}
//		48.
		public static void getFirstSelectedOption(WebElement element) {
			Select s = new Select (element);
			s.getFirstSelectedOption();
		}
//		49.
		public static void getAllSelectedOption(WebElement element) {
			Select s = new Select (element);
			s.getAllSelectedOptions();
		}
//		50.
		public static void deselectAll(WebElement element) {
			Select s = new Select (element);
			s.deselectAll();
		}
//		51.	Waits
		@SuppressWarnings("deprecation")
		public static void waitSeconds() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
//		52. Thread
		public static void threadSleep(int i) throws InterruptedException {
			Thread.sleep(1000);
		}
//		53. Current Window Close
		public static void close() {
			driver.close();
		}
//		54. Close Whole Windows
		public static void quit() {
			driver.quit();
		}
//		55. Full Screen Window
		public static void fullScreen() {
			driver.manage().window().fullscreen();
		}
//		56. Actions Class
		public static void singleClick(WebElement element) {
			element.click();
		}	

}

