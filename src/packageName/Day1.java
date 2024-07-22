package packageName;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void one() {
		System.out.println("Hii");
	}
	
	@Test
	public void Two() {
		System.out.println("Bye!!");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
}
