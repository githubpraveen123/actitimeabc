package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class CreateCustomer1 extends BaseClass {
	public void createCustemer() {
		Reporter.log("createCustemer",true);
	}
	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}

}
