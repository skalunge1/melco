import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features"
//,glue="src/test/java/stepDefination"
,glue="stepDefination"
,tags = "@HomeScreen, @HomeScreenDetails"
,monochrome = true
,strict = true
,plugin = {"pretty", "html:target/cucumber"}
)

@Test
public class runTest{

}
