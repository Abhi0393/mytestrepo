package demoAPI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpPostMethod {
@Test
void postmethodAutomation() {
	
	RestAssured.baseURI= "https://reqres.in";
	RequestSpecification http =RestAssured.given();
	
	JSONObject inputbody= new JSONObject();
	inputbody.put("name", "morpheus");
	inputbody.put("job","leader");
	
	http.body(inputbody.toJSONString());
	Response respons =http.request(Method.POST,"/api/users");
	String responsobj= respons.getBody().asString();
	System.out.println("My response is: \n" +responsobj);
	
	int statuscode=respons.getStatusCode();
	Assert.assertEquals(statuscode, 201);
		System.out.println("statusCodeis: \n" +statuscode);
		
	String statusline = respons.statusLine();
	System.out.println("Status Line is:\n "+ statusline);
	Assert.assertEquals(statusline, "HTTP/1.1 201 Created ");
			
}
	
	
}
