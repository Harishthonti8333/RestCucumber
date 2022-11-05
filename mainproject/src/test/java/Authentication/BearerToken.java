package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class BearerToken {
@Test
	public void b() {
		baseURI="http://github.com";
		 JSONObject obj=new JSONObject();
		 obj.put("name", "hello");
		 given().auth().oauth2("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")
		 .body(obj).contentType(ContentType.JSON)
		 .when().post("")
		 .then().log().all();
	}

}
