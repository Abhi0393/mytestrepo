package demoAPI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HttpPutMethod {
	@Test
	public void PutMethodAutomatin() {
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification http =RestAssured.given();
		
		JSONObject inputbody = new JSONObject();
		inputbody.put("name", "Abhijit");
		inputbody.put("job", "QA");
		
		http.body(inputbody.toJSONString());
		
		Response response =http.request(Method.PUT,"/api/users/2");
		String responceobj = response.getBody().asString();
		System.out.println("Response is; \n" +responceobj);
		  int statuscode =response.getStatusCode();
		  System.out.println("Status code is: \n"+statuscode);
		Assert.assertEquals(statuscode, 200);
		
		String StatusLine = response.statusLine();
		System.out.println("Statusline is: \n"+ StatusLine );
		Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK");
		
		
		
		
		
		
	}
	
	
	

}
