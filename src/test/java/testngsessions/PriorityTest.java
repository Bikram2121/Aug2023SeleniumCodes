package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 5)
	public void a_Tets() {
		System.out.println(" a test");
	}
	
	@Test(priority = 4)
	public void b_Tets() {
		System.out.println(" b test");
	}
	@Test(priority = 2)
	public void c_Tets() {
		System.out.println(" c test");
	}
	@Test(priority = 1)
	public void d_Tets() {
		System.out.println(" d test");
	}
	@Test(priority = 3)
	public void e_Tets() {
		System.out.println(" e test");
	}
	
	
}
