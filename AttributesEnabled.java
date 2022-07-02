package testNG;

import org.testng.annotations.Test;



public class AttributesEnabled{
	
	@Test(enabled = false)
	public void create() {
		System.out.println("Create Lead");
	}
	
	@Test
	public void edit() {
		System.out.println("Edit Lead");
	}

	@Test
	public void delete() {
		System.out.println("Delete Lead");
	}
	
}

