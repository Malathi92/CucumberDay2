package Cucumberday2;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/featuresday2/Delete.feature",glue={"StpsDelete","hooks"},monochrome=true,publish=true,tags="@smoke and @functional"
			)
	public class RunnerDelete extends AbstractTestNGCucumberTests{
		

	}



