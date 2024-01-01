package stepdefinitions.us_08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.bson.assertions.Assertions;
import pojos.us_08.LessonCreationPojo;
import pojos.us_08.LessonsResponse;


import static baseurls.BaseUrl.spec;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;


public class US_08TC_01 {
    Response response;
    LessonCreationPojo payload;
    @When("the user sends a POST request to the lesson-controller endpoint with compulsory {string}")
    public void the_user_sends_a_post_request_to_the_lesson_controller_endpoint_with_compulsory(String comp) {
        spec.pathParams("first", "lessons",
                "second", "save");
        Boolean com=Boolean.parseBoolean(comp);
        payload = new LessonCreationPojo(com,10,"physics 4");

        response = given(spec).when().body(payload).post("{first}/{second}");
        response.prettyPrint();

    }
    @Then("the API should respond with a successful status code")
    public void the_api_should_respond_with_a_successful_status_code() {
     assertEquals(200, response.statusCode());
    }
    @Then("the response should confirm the creation of the lesson")
    public void the_response_should_confirm_the_creation_of_the_lesson() {
        LessonsResponse actualData = response.as(LessonsResponse.class);
        assertEquals(payload.getCompulsory().toString(),actualData.getObject().getCompulsory().toString());
    }
}
