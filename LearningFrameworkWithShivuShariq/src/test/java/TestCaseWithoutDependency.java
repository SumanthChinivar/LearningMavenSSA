import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseWithoutDependency {

	@Test
	public void demo() {
		Reporter.log("Hello world",true);
	}
}
