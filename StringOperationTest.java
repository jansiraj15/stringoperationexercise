package prescreenexercise.com.pre;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationTest {

	@Test
	public void test() {
	}

	@Test
	public void removeCharInstances1() {
		StringOperation obj = new StringOperation();
		String orig = "Welcome to Java";
		String result = obj.removeCharInstances1(orig, 'o');
		Assert.assertEquals("Result match", result, "Welcme t Java");
	}
	
	@Test
	public void removeCharInstances() {
		StringOperation obj = new StringOperation();
		String orig = "";
		String result = obj.removeCharInstances1(orig, 'o');
		Assert.assertEquals("Result match", result, "");
	}
	
	@Test
	public void removeCharInstancesDoesNotMatch() {
		StringOperation obj = new StringOperation();
		String orig = "Welcome to Java";
		String result = obj.removeCharInstances1(orig, 'o');
		Assert.assertEquals("Result does not match", result, "Welcme to Java");
	}
	@Test
	public void removeCharInstances2() {
		StringOperation obj = new StringOperation();
		String orig = "Welcome to Java";
		String result = obj.removeCharInstances2(orig, "o");
		Assert.assertEquals("Result match", result, "Welcme t Java");
	}
	
	@Test
	public void removeCharInstancesNull() {
		StringOperation obj = new StringOperation();
		String orig = "";
		String result = obj.removeCharInstances2(orig, "o");
		Assert.assertEquals("Result match", result, "");
	}
	
	@Test
	public void removeCharInstancesDoesNotMatch1() {
		StringOperation obj = new StringOperation();
		String orig = "Welcome to Java";
		String result = obj.removeCharInstances2(orig, "o");
		Assert.assertEquals("Result does not match", result, "Welcme to Java");
	}
}
