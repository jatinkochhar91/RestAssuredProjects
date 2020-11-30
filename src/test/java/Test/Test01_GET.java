package Test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	public void Setup()
	{
		
	}
	@Test
	public void TestO1_Get_Request()
	{

		Response response = RestAssured.get("https://reqres.in/api/users?page=2"); 
		
		System.out.println(response.getBody());
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		
		
	}

	public void Teardown()
	{
		
	}
	
}
