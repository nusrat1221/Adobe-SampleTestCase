import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adobe_Project {
WebDriver driver;
		@Test
		public void validade_Email()
		{
			// Open Browser
			driver=new FirefoxDriver();
			// Open Adobe page 
			driver.get("http://www.adobe.com");
			//Click sign in Button
			driver.findElement(By.xpath(".//*[@id='globalnav__menu-bar']/ul/li[4]/button")).click();
			//To Enter email address on the console
			Scanner sc=new Scanner(System.in);
			  System.out.println("Please enter a single character: ");
			 //hold email to a string
			  String email = sc.next();
			  // imput the email to email edit box
			driver.findElement(By.xpath(".//*[@id='adobeid_username']")).sendKeys(email);
			
			
	          String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	          // check the email is valid or not
	          Boolean b = email.matches(emailregex);
	          if (b == false) 
	              {
	              System.out.println("Email Address is Invalid");
	              }
	          else if(b == true)
	              {
	              System.out.println("Email Address is Valid");
	              }
			
		}
			
			

	
}
