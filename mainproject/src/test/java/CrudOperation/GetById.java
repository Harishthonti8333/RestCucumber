package CrudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetById {
	@Test
	public void getById() {
		baseURI="http://localhost:8080";
		when()
		.get("prescription/medorder/18")
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}

}
