package tek.sdet.framework.runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@VerifyReview",
        features = ("classpath:features"),
        glue = "tek.sdet.framework",
        dryRun =false,
  
       plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"        },
        snippets = CAMELCASE, // public void clickOnLoginButton  public void click_On_Login_Button        
        monochrome = true
        )

public class TestRunner {

}
