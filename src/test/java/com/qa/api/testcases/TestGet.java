package com.qa.api.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.qa.api.TestResponseValidation.ResponseValidation;
import com.qa.api.TestSteps.HttpMethods;
import com.qa.api.TestUtilities.PropertiesFileLoad;

import io.restassured.response.Response;

public class TestGet {
	@Test
	public void Booksdata() throws IOException {
		Properties Pr= PropertiesFileLoad.PropFileLoad("C:\\Users\\user\\eclipse-workspace\\RestAssuredAPi\\src\\main\\java\\com\\qa\\api\\config\\Env.properties");
		HttpMethods http=new HttpMethods(Pr);
		Response Res=http.GetRequest("URI");
		ResponseValidation ResObj=new ResponseValidation();
		ResObj.ResponseValidations(Res);
		}
	}


