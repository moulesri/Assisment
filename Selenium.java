package week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mouli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("periyasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("moulithedon");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("done the test case in effective manner");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mouli2000@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("testcase");
		driver.findElement(By.className("smallSubmit")).click();
		String Driver = driver.getTitle();
		System.out.println(Driver);
		
	}

}
