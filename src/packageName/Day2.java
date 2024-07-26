package packageName;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day2 {

	@Parameters({"URL"})
	@Test
	public void ploan(String UName) {
		System.out.println("personal loan");
		System.out.println(UName);
	}
	
	@Test
	public void QA() {
		System.out.println("pull from GitDemo");
	}
	
	@Test(groups = {"Smoke"})
	public void loan() {
		System.out.println("loan");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	
	
}
