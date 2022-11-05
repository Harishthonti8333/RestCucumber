package CrudOperation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutRequest {
	@Test
	public void putRequest() {
		JSONObject jobject=new JSONObject();
		jobject.put("cost", 600);
		jobject.put("name", "hello");
		jobject.put("suggestions", "arjun");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobject)
		.when()
		.put("http://localhost:8080/prescription/medorder/4")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
	}

}
