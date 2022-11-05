package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DigestAuth {

	public static void main(String[] args) {
	baseURI="http:github.com";
		
		given()
		.auth().digest("", "")
		.when().get("")
		.then().log().all();

	}

}
