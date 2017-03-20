package slen;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Selegood {

	public static void main(String[] args) throws InterruptedException {

		// @Test()
		// public void a() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\manjit.kumar.patro\\Documents\\selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");

		// declaration and instantiation of objects/variables
		WebDriver driver = new FirefoxDriver();

		// String baseUrl = "http://www.seleniumframework.com/Practiceform/";
		// String expectedTitle = "Welcome: Mercury Tours";
		// String actualTitle = "";

		// launch Firefox and direct it to the Base URL
		driver.get("http://www.seleniumframework.com/Practiceform/");
		// FindElement
		WebElement text = driver.findElement(By.xpath(".//*[@id='vfb-10']"));
		text.click();
		text.clear();
		text.sendKeys("hiii");
		String man = "manjit.1217@gmail.com";
		WebElement sub = driver.findElement(By.xpath(".//*[@id='text-11']/div/form/p[2]/input"));
		sub.click();
		sub.sendKeys(man);
		

		WebElement subbutton = driver.findElement(By.xpath(".//*[@id='text-11']/div/form/input[3]"));
		subbutton.click();
//Window handde
		//String parentWindow = driver.getWindowHandle();
//		Set<String> handles = driver.getWindowHandles();
//		for(int i=0; i<handles.size(); i++) {
//		    String name = handles.;
//		    }
//		
//	}
//}
//	    	 if (!windowHandle.equals(parentWindow)) {
////		//for (String windowHandle : handles) {
////			
////				driver.switchTo().window(windowHandle);
////				Thread.sleep(8000);
////				WebElement newwin = driver.findElement(By.xpath(".//*[@id='pageHolder']/div[1]/p[2]/strong"));
////				String tex = newwin.getText();
////				if (tex.contentEquals(man)) {
////					System.out.println("Match");
////				} else {
////					System.out.println("Not Match");
////				}
////				driver.close();
////				driver.switchTo().window(parentWindow);
////			}}
//			}
//
//		// // Store the current window handle
//		// String winHandleBefore = driver.getWindowHandle();
//		//
//		// // Perform the click operation that opens new window
//		//
//		// // Switch to new window opened
//		// for(String winHandle : driver.getWindowHandles()){
//		// driver.switchTo().window(winHandle);
//		// }
//		// String tit = driver.getTitle();
//		//
//		// // Perform the actions on new window
//		// // WebElement newwin =
//		// driver.findElement(By.xpath("//*[contains(text(),'manjit.1217@gmail.com')]"));
//		// WebElement newwin =
//		// driver.findElement(By.xpath(".//*[@id='pageHolder']/div[1]/p[2]/strong"));
//		//
//		// String tex = newwin.getText();
//		// // String man = "manjit.1217@gmail.com";
//		// if (tex.contentEquals(man))
//		// {
//		// System.out.println("Match");
//		// }
//		//
//		// System.out.println("Not Match");
//		//
//		// // Close the new window, if that window no more required
//		// driver.close();
//		//
//		// // Switch back to original browser (first window)
//		// driver.switchTo().window(winHandleBefore);
//		//
//		//
//		//
//		// // get the actual value of the title
		String actualTitle = driver.getTitle();
StringBuffer expectedTitle = null;
		//		//
//		// /*
//		// * compare the actual title of the page witht the expected one and
//		// print
//		// * the result as "Passed" or "Failed"
//		// */
		 if (actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
		} else {
		 System.out.println("Test Failed");
		}
//		//
//		// //close Firefox
		// driver.close();
//		//
//		// // exit the program explicitly
		// System.exit(0);
	}

}