package CrudOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteRequest {
	@Test
	public void deleteRequest() {
				when()
				.delete("http://localhost:8080/prescription/medorder?id=34")
				.then()
				.assertThat().statusCode(200)
				.log().all();
	}

}
