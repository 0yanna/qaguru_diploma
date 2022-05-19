package voiso.tests.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static voiso.helpers.CustomAllureListener.withCustomTemplates;

public class Specs {
    public static RequestSpecification request = with()
            .filter(withCustomTemplates())
            .baseUri("https://voiso.com/")
            .basePath("/api")
            .log().all()
            .contentType(ContentType.JSON);

    public static ResponseSpecification responseSpec200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.STATUS)
            .build();

    public static ResponseSpecification responseSpec401 = new ResponseSpecBuilder()
            .expectStatusCode(401)
            .log(LogDetail.ALL)
            .build();


}
