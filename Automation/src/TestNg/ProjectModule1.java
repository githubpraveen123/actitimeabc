package TestNg;

import org.apache.commons.io.FileSystemUtils;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule1 extends BaseClass {
	@Test
	public void CreateProject(){
		Reporter.log("CreateProjetct",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	@Test 
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	
}
