 package Api_testing;

import static io.restassured.RestAssured.given;

import javax.annotation.meta.When;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Dummyjson {
	
	@Test
	public void loginauth() {
		JSONObject js= new JSONObject();
		
		js.put("username", "emilys");
		
		js.put("password", "emilyspass");
		
		js.put("expiresInMins", "30");
		
		given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/auth/login").then().statusCode(200).log().all();

	
		
	}
	@Test
	public void currentauthuser() {
		
		given().headers("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3Mjc4OTE4MDcsImV4cCI6MTcyNzg5MzYwN30.lxihmT0saqU2FNS6uuhHpuvZZM8ZSojD0rVU9NfxQVY")
		
		
		
		.when().get("https://dummyjson.com/auth/me").then().statusCode(200).log().all();

				
				
				
				
				
				
				//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3Mjc4OTE4MDcsImV4cCI6MTcyNzg5MzYwN30.lxihmT0saqU2FNS6uuhHpuvZZM8ZSojD0rVU9NfxQVY
	}
	
	@Test
	
	public void refrshtoken() {
		
		JSONObject js= new JSONObject();
		
		
		
		js.put("refreshToken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3Mjc4OTM1NTgsImV4cCI6MTczMDQ4NTU1OH0.kYAEI-kvhjjntbXsilfDEWRst8iCFBc7rUENF8SG2x4");
		
		js.put("expiresInMins", "30");
		
		given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/auth/refresh").then().statusCode(200).log().all();

		
		
		
	}
	
	@Test
	public void getproducts() {
		given().get("https://dummyjson.com/products").then().statusCode(200).log().all();
		
		
		
	}
	@Test
	
	public void singleproduct() {
		
		given().get("https://dummyjson.com/products/1").then().statusCode(200).log().all();
		
		
	}
	
	@Test
	
	public void searchproduct() {
		given().get("https://dummyjson.com/products/search?q=phone").then().statusCode(200).log().all();
		
	}
	
	@Test
	
	public void limitandskip() {
		
		given().get("https://dummyjson.com/products?limit=10&skip=10&select=title,price").then().statusCode(200).log().all();
		
		
	}
	@Test
	
	public void sortproducts() {
		
		given().get("https://dummyjson.com/products?sortBy=title&order=asc").then().statusCode(200).log().all();
		
	}
	
	@Test
	
	public void getallproductscategory() {
		given().get("https://dummyjson.com/products/categories").then().statusCode(200).log().all();
		
		
	}
	@Test
	 public void getproductbycategorylist() {
		given().get("https://dummyjson.com/products/category-list").then().statusCode(200).log().all();
		
	}
	@Test
	
	public void getproductbycategory() {
		given().get("https://dummyjson.com/products/category/smartphones").then().statusCode(200).log().all();
		
	}
	
	@Test
	
	public void addproduct() {
		JSONObject js= new JSONObject();
		
		js.put("title", "BMW Pencil");
		
		given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/products/add").then().statusCode(201).log().all();

		
	}
	
	@Test
	
	public void updateproduct() {
		JSONObject js= new JSONObject();
		
		js.put("title", "iPhone Galaxy +1");
		
		given().contentType("application/json").body(js.toJSONString()).when().put("https://dummyjson.com/products/1").then().statusCode(200).log().all();

		
		
		
		
	}
	@Test
	
	public void deletproduct() {
		
		given().delete("https://dummyjson.com/products/1").then().statusCode(200).log().all();
		
		
	}
	
	


}
