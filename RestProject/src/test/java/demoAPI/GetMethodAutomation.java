package demoAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethodAutomation {
	
@Test
public void getHttpMethod() {
	
	RestAssured.baseURI ="https://reqres.in/";
	
	RequestSpecification http = RestAssured.given();
	
	Response response =http.request(Method.GET,"api/users/2");
	
	String responceObject = response.getBody().asString();
	System.out.println("my responce is;\n" +responceObject);
	
	int statuscode = response.getStatusCode();
	Assert.assertEquals(statuscode, 200);
	System.out.println("Status Code:\n" +statuscode);
	
	String statusline = response.statusLine();
	Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	
	System.out.println("Status line:\n" + statusline);
	
	
	
}

}
