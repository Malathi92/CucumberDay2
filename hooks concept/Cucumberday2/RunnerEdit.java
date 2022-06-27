package Cucumberday2;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/featuresday2/Edit.feature",glue={"StpsEdit","hooks"},monochrome=true,publish=true
			)
	public class RunnerEdit extends AbstractTestNGCucumberTests{
		

	}

