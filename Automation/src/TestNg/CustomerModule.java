package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	
	@Test(priority=1,invocationCount=3)
	public void CreateCustomer()
	{
	Reporter.log("CreateCustomer",true);		
	}
	
	@Test(priority=2,dependsOnMethods="CreateCustomer")
    public void ModifyCustomer()
	{
    	Reporter.log("ModifyCustomer",true);
    }
	
	@Test(dependsOnMethods = {"CreateCustomer","ModifyCustomer"})
	public void deleteCutomer()
	{
		Reporter.log("deleteCutomer",true);
	}
    
}
