import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Social_media {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\marwan pc\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		
		String myTitle=driver.getTitle();
		System.out.println(myTitle);
		String myOption=driver.findElements(By.tagName("option")).get(3).getText();
		System.out.println(myOption);
		List <WebElement>myListOptions=driver.findElements(By.tagName("option"));
		System.out.println(myListOptions.size());
		for(int i=0; i<myListOptions.size();i++)
		{ 
			System.out.println(myListOptions.get(i).getText());
			
			
		}
		
	}

}
