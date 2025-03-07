package tests;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
public class jsonschemavalidator {
@Test
	public void schemavalidator() {
		baseURI="https://reqres.in/api";  ///users?page=2
		
		given()
		.get("users?page=2")
		.then()
		.assertThat().body(matchesJsonSchemaInClasspath("Jsonschema.json"))
		.statusCode(200);
		
	
	
	
	}
}
