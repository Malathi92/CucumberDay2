package Cucumberday2;


	

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/featuresday2/Duplicate.feature",glue={"StpsDuplicate","hooks"},monochrome=true,publish=true
			)
	public class RunnerDuplicate extends AbstractTestNGCucumberTests{
		

	}




