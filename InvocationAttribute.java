package testNG;
import org.testng.annotations.Test;


public class InvocationAttribute {

	@Test
	public void create() {
		System.out.println("Create Lead");
	}
	
	@Test(invocationCount = 5)
	public void edit() {
		System.out.println("Edit Lead");
	}

	@Test
	public void delete() {
		System.out.println("Delete Lead");
	}
}