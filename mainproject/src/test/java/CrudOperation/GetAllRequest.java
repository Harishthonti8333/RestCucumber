package CrudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetAllRequest {
	@Test
	public void getAllRequest() {
		baseURI="http://localhost:8080";
		when()
		.get("prescription/medorder")
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}

}
