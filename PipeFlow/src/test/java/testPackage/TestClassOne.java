package testPackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassOne {

	@Test(priority=1,enabled=true)
	public void firstTest()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test has started");
		softAssert.assertTrue(true);
		softAssert.assertAll();
	}
}
