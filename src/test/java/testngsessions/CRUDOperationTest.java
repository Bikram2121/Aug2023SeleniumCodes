package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {
		System.out.println("createUser");
	}

	public void getUser() {
		System.out.println("getUser");
	}

	public void updateUser() {
		System.out.println("updateUser");
	}

	public void deleteUser() {
		System.out.println("deleteUser");
	}

	@Test
	public void createUserTest() {
		createUser();
	}

	@Test
	public void getUserTest() {
		createUser();
		getUser();
	}
	
	@Test
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
		
	}
	
	@Test
	public void deleteUserTest() {
		createUser();
		getUser();
		deleteUser();
		getUser();
	}
	
	
	@Test
	public void getUserTesting() {
		int userID = 123; //hard coded user id
		//QA->Stage->dev->UAT->Prod
		getUser();
		//assert
	}
	
	
	
	
	
	
}
