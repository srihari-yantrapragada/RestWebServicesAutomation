package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_001_GetMethod {
	
	@Test
	public void tc_001_getMethod_Validation()
	{
		Response res=RestAssured.get("http://services.groupkt.com/country/get/iso2code/HELLO/IN");
		System.out.println(res.asString());
	
		System.out.println(res.getStatusCode());
		Assert.assertEquals(200, res.getStatusCode());
		
	}

}
