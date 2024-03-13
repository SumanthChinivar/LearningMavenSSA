import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseWithDependency {
	@Test
	public void demo() {
		Reporter.log("Hello world",true);
	}
}
