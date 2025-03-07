package tests;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
public class postusers {
	@Test
public void postuser() {
	
	//Map<String, Object> map = new HashMap<String, Object>();
	
	JSONObject request = new JSONObject();
	request.put("Name", "Aswini");
	request.put("Job", "Engineer");
	
	System.out.println(request.toJSONString());
	
	baseURI ="https://reqres.in/api";
	
	given().
	headers("content-type","Application/Json")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.when()
	.post("/users")
	.then()
	.statusCode(201)
	.log().all();
	
}
	
	
	
}
