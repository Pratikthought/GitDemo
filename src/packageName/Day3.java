package packageName;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	
	@Parameters({"URL"})
	@Test(groups = {"Smoke"})
	public void WebLoginCarLoan(String UrlName) {
		System.out.println("Web login Car loan-------3 ");
		System.out.println(UrlName);
	}

	@Test(enabled=false)
	public void mobileloginCarLoan() {
		System.out.println("Mobile login  Car loan ");
	}

	@Test(timeOut = 4000)
	public void mobileSignUpCarLoan() {
		System.out.println("Mobile Sign Up  Car loan ");
	}

	
	@Test(dataProvider = "getData")
	public void mobileSignOutCarLoan(String username, String password) {
		System.out.println("Mobile Sign Out  Car loan ");
		System.out.println(username+" "+password);
	}

	@Test
	public void APIloginCarLoan() {
		System.out.println("API login Car loan ------------1");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will execute before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I will execute After method");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="Username1";
		data[0][1]="password1";
		
		data[1][0]="Username2";
		data[1][1]="password2";
		
		data[2][0]="Username3";
		data[2][1]="password3";
		
		return data;
	}
}
