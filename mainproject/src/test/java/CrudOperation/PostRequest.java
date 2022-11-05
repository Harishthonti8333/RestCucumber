package CrudOperation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void postRequest() {
		JSONObject object=new JSONObject();
		object.put("cost", 600);
		object.put("name", "hello");
		object.put("suggestions", "arjun");
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		.when()
		.post("http://localhost:8080/prescription/medorder")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
		
	}

}
