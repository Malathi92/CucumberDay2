package Cucumberday2;




	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/featuresday2/Create.feature",glue={"StpsCreate","hooks"},monochrome=true,publish=true
			)
	public class RunnerCreate extends AbstractTestNGCucumberTests{
		

	}

