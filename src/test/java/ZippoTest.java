
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ZippoTest {

    @Test

    public void test1() {
        given()
                //hazırlık işlemleri: token, send body

                .when()
                // endpoint (url), method


                .then();
        //Assertion, test, data işlemleri

    }

    @Test
    public void statusCodeTest() {

        given().

                when().
                get("http://api.zippopotam.us/us/90210").

                then()
                //.log().body()
                .statusCode(200)
        ;
    }

    @Test
    public void contentTypeTest() {

        given().

                when().
                get("http://api.zippopotam.us/us/90210")

                .then()
                .log().body()
                .statusCode(200)
                .contentType(ContentType.JSON);
        ;
    }



    @Test
    public void logRequestAndResponseDetails() {
        given().
                //log().all().
                        when().

                get("http://api.zippopotam.us/us/90210").
                then()
                .log().body();

    }
}
