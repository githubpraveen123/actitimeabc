package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TastModule extends BaseClass
{
	
	@Test
	public void CreateTask() {
		Reporter.log("CreateTask",true);
	}
	@Test
	public void ModifyTask() {
		Reporter.log("ModifyTask",true);
	}
	@Test
	public void DeleteTask() {
		Reporter.log("DeleteTask",true);
	}

}
