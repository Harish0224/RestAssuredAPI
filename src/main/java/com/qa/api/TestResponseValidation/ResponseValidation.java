package com.qa.api.TestResponseValidation;

import io.restassured.response.Response;

public class ResponseValidation {
	
	public void ResponseValidation(Response Res)
	{
	System.out.println(Res.getStatusLine());
	System.out.println(Res.asString());
	}

}
