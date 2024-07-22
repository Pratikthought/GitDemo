package packageName;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {


	@Test(dependsOnMethods = {"MobileloginHomeLoan"})
	public void WebloginHomeLoan() {
		System.out.println("Web login Home loan .......3 ");
	}
	
	@Test
	public void MobileloginHomeLoan() {
		System.out.println("Mobile login Home loan...........2 ");
	}
	@Parameters({"URL"})
	@Test(groups = {"Smoke"})
	public void APIloginHomeLoan(String GlobalURL) {
		System.out.println("API login Home loan...........1 ");
		System.out.println(GlobalURL);
	}
}
