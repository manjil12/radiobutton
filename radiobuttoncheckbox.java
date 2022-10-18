package DAY1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoncheckbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghimi\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		WebElement checkbox = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
//		checkbox.click();
//		//checkbox.click();
//		//here we are doing assertion
//		if(checkbox.isSelected()) {
//			System.out.println("option box is selected");
//		}
//			else{
//				System.out.println("option box is not selected");
//			}
		//now we are checking all checkboxes
//		List<WebElement> checking = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
//		
//		for(int i=0;i<checking.size();i++) {
//			System.out.println(i);
//		
//		if(!checking.get(i).isSelected()){
//			checking.get(i).click();
//		}
//		}
//		
//		
		
		
		//Radio button
//		driver.findElement(By.cssSelector("input[value=\"blue\"]")).click();
//		if(driver.findElement(By.cssSelector("input[value=\"blue\"]")).isSelected()) {
//			System.out.println("Radio button is clicked");
//		}
//		else {
//			System.out.println("Radio button is not clicked");
//		}
//		
		//clicking all radio buttons simultaneously
		List<WebElement>Radiobutton = driver.findElements(By.cssSelector("input[name=\"color\"]"));
		
		for(int i=0;i<Radiobutton.size();i++) {
			System.out.println(i);
			if(!Radiobutton.get(i).isSelected()){
				Radiobutton.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
