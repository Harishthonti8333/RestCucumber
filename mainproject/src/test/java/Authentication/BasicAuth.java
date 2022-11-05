package Authentication;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class BasicAuth {

	public static void main(String[] args) {
		baseURI="http://github.com";
		
		given().auth().basic("harishthonti8333@gmail.com" , "862415Ha@")
		.when().get("/login")
		.then().log().all();

	}

}
