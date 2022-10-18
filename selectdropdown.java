package DAY1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghimi\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.cssSelector("select[id=\"dropdowm-menu-1\"]"));
		//System.out.println(dropdown);
		
		//class ----object-----property methods
		Select select = new Select(dropdown);
		
		
		//selectbyINDEX
		//select.selectByIndex(3);
		
		//selectbyTEXT
		select.selectByVisibleText("C#");
		
		
		//selectbyVALUE
		//select.selectByValue("sql");
		
		
		
		

	}

}
