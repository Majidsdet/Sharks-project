package testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	/*
	 * In TestNG we have two types of assertions Hard Assert and Soft Assert Hard
	 * Assert: if the assertion fails the flow of execution stops right away Soft
	 * AssertL" if the assertion fails the flow of execution will not stop and
	 * continue to next line of code, but the test case will be marked as filed at
	 * the of execution
	 */
	@Test
	public void hardAssert() {
		int a = 10;
		int b = 20;
		System.out.println("this is before assertion");
		Assert.assertEquals(a, b);
		System.out.println("this is after assertion");

	}
	@Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("before soft assert");
		softAssert.assertTrue(false);
		System.out.println("after soft assert one");
		softAssert.assertEquals(10,50);
		System.out.println("after soft assert two");
		softAssert.assertTrue(true);
		System.out.println("after soft assert three");
		softAssert.assertAll();
	}

}
