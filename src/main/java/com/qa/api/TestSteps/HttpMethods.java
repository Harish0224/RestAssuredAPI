package com.qa.api.TestSteps;

import java.util.Properties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class HttpMethods {
	static Properties Prop;
	public HttpMethods(Properties Prop)
	{
	this.Prop=Prop;
	}
	public static Response GetRequest(String URI)
	{
	Response Res=
			RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.get(Prop.getProperty(URI));
	return Res;
	}
	
	public static Response PostRequest(String URI)
	{
	Response Res=
			RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.post(Prop.getProperty(URI));
	return Res;
	}
	

}
