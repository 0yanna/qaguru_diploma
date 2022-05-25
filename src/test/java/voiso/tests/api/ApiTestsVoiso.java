package voiso.tests.api;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import voiso.tests.api.lombok.EmailDataLombok;
import voiso.tests.api.models.EmailDataModels;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static voiso.tests.api.specs.Specs.*;

@Owner("0yanna")
public class ApiTestsVoiso {
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();

    @Tag("API")
    @Test
    @Description("Email validation with condition Undeliverable:True with Faker")
    @DisplayName("Voiso API test 1")
    void checkEmailWithUndeliverableStateAndFaker() {
        given()
                .spec(request)
                .when()
                .params("email", email)
                .get("/email_validation")
                .then()
                .log().all()
                .spec(responseSpec200)
                .body("state", is("undeliverable"));
    }

    @Tag("API")
    @Test
    @Description("Email validation with condition Disposable:True and models")
    @DisplayName("Voiso API test 2")
    void checkDisposableEmailWihtModels() {

        EmailDataModels EmailDataModels = given()
                .spec(request)
                .when()
                .params("email", "nejeko5007@dufeed.com")
                .get("/email_validation")
                .then()
                .log().all()
                .spec(responseSpec200)
                .extract().as(EmailDataModels.class);
        assertThat(EmailDataModels.getEmail()).isEqualTo("nejeko5007@dufeed.com");
        assertThat(EmailDataModels.getDomain()).isEqualTo("dufeed.com");
        assertThat(EmailDataModels.getUser()).isEqualTo("nejeko5007");
        assertThat(EmailDataModels.getFull_name()).isEqualTo(null);
        assertThat(EmailDataModels.getState()).isEqualTo("risky");
    }

    @Tag("API")
    @Test
    @Description("Email validation with condition Deliverable:True")
    @DisplayName("Voiso API test 3")
    void checkDeliverableEmail() {
        given()
                .spec(request)
                .when()
                .params("email", "xx45x@rambler.ru")
                .get("/email_validation")
                .then()
                .log().all()
                .spec(responseSpec200)
                .body("state", is("deliverable"));
    }

   @Tag("API")
   @Test
   @Description("Invalid email and password verification with Lombok")
   @DisplayName("Voiso API test 4")
   void checkInvalidEmailAndPasswordWithLombok() {
       EmailDataLombok emailDataLombok = new EmailDataLombok();
       emailDataLombok.setEmail(email);
       emailDataLombok.setPassword(password);

       given()
               .spec(request)
               .body(emailDataLombok)
               .when()
               .post("/session.json")
               .then()
               .log().all()
               .spec(responseSpec401)
               .body("error", is("invalid_email"))
               .extract().as(EmailDataLombok.class);
   }

}
