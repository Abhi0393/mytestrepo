package demoAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpDeleteMethod {
	@Test
	public void DeleteMethodAutomation() {
		
		RestAssured.baseURI= "https://reqres.in";
		
		RequestSpecification https =RestAssured.given();
		
		Response response  = https.request(Method.DELETE, "/api/users/2");
		
	    String Responseobj= response.getBody().toString();
		System.out.println("Responceobj: \n" +Responseobj);
		 
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 204);
		
		String StatusLine =response.statusLine();
		System.out.println(StatusLine);
		
	}

}
