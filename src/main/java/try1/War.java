package try1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class War {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver D=new ChromeDriver();
			try 
			{
				D.get("https://only-testing-blog.blogspot.com/");
				D.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("ANaa");
				System.out.println(D.findElement(By.tagName("h1")).getText());
				Assert.state(false, null, args)
			
			}
			finally
			{
				
		// TODO Auto-generated method stub

	}

}}
