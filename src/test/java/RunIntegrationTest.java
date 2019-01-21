import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags = {"@Regression"},
        features = "src/test/resources/features/")
public class RunIntegrationTest {

}
