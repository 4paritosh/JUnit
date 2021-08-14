import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Test
	public void test6() {
		String a ="abc";
		String b = "abc1";
	    String c = "abc";
		System.out.println("before");
		try {
		Assert.assertEquals(b, a);
		}catch(Throwable x) {
			error.addError(x);
			System.out.println("first assersion failed");
		}
		System.out.println("after");
		try {
		Assert.assertNotEquals(a, c);
		}catch(Throwable x) {
			error.addError(x);
			System.out.println("second assertions failed");
		}
		System.out.println("last");
		
	}
	
	@Test
	public void test7() {
		String a ="abc";
		String b = "abc1";
	    String c = "abc";
		System.out.println("before");
		Assert.assertEquals(c, a);
		System.out.println("after");
		Assert.assertEquals(b, c);
		System.out.println("last");
	}

}
