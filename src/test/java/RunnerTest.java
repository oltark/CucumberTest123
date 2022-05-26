import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "json:target/cucumber.json"},
        glue = {"StepDefinition", "WebHooks", "AllureResponse"},
        tags = "@TEST"
)
class RunnerTest {
    @BeforeClass
    public static void before() {
        RestAssured.filters(new AllureRestAssured()) ;
    }

}
