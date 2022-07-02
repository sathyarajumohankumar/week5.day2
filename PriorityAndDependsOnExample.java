package Arrtibutess;

import org.testng.annotations.Test;

public class PriorityAndDependsOnExample {
@Test(priority=2)
public void edd()
{
	System.out.println("edd");
	//throw new RuntimeException();
}
@Test
public void cedd()
{
	System.out.println("cedd");
}
@Test(dependsOnMethods= {"edd"})
public void fud()
{
	System.out.println("fud");
}
}
