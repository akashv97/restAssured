package restAssured.restAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetListOfAllObjects {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://api.restful-api.dev";
		
		// listOfAllObject
		String getPlaceResponse =given().log().all().when()
				.get("/objects").then().assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(getPlaceResponse);
//		
		JsonPath js=new JsonPath(getPlaceResponse);
		String placeId=js.getString("id");
		System.out.println(placeId);
		
		// listOfAllObjectById
		
		String getListOfObjectById =given().log().all().queryParam("id","1").when()
				.get("/objects").then().assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(getListOfObjectById);
		
		// listOfSingleObject
		
		String getSingleOfObjectById =given().log().all().queryParam("id","7").header("Cache-Control", "no-cache").when()
				.get("/objects").then().assertThat().log().all().statusCode(200).extract().response().asString();
	
		System.out.println(getSingleOfObjectById);
		
		//AddingObject
		
		String abc=given().log().all().header("Content-Type","application/json").
		body(payloads.UpdateObject()).when()
.post("/objects").then().assertThat().log().all().statusCode(200).body("name", equalTo("MSI PlayBook Pro 1")).extract().response().asString();
		System.out.println(abc);
		
		JsonPath js1=new JsonPath(abc);
		String Id=js1.getString("id");
		System.out.println(Id);
		
		//GetAfterAddingNew
		
		String addedNewObject =given().log().all().queryParam("id",""+Id+"").header("Cache-Control", "no-cache").when()
				.get("/objects").then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		System.out.println(addedNewObject);
		
		

	}

}
