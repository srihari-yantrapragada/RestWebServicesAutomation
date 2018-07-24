package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_001_GetMethod {
	
	@Test
	public void tc_001_getMethod_Validation()
	{
		Response res=RestAssured.get("http://services.groupkt.com/country/get/iso2code/IN");
		System.out.println(res.asString());
	
		System.out.println(res.getStatusCode());
		Assert.assertEquals(200, res.getStatusCode());
		
	}
	
	@Test
	public void tc_002_getMethod_Response_Validation()
	{
		Response res=RestAssured.get("http://services.groupkt.com/country/get/all");
		//System.out.println(res.asString());
		
		
		//System.out.println(res.getStatusCode());
		System.out.println(res.getContentType());
		Assert.assertEquals(res.getContentType(),"application/json;charset=UTF-8");//in case of json mentioned format is
		//Assert.assertEquals(res.getContentType(),"json");
		
	}
	
	@Test
	public void tc_003_getMethod_with_parameters()
	{
		Response res=RestAssured.get("http://www.omdapi.com/?t=Spiderman&y=&plot=short&r=json");
		System.out.println(res.asString());

		
		Assert.assertEquals(res.getStatusCode(),200);
		
		
	}
	
	

}
