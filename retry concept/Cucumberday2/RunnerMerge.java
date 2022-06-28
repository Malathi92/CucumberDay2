package Cucumberday2;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/featuresday2/Merge.feature",glue={"StpsMerge","hooks"},monochrome=true,publish=true,tags="@smoke or @sanity"
			)
	public class RunnerMerge extends AbstractTestNGCucumberTests{
		

	}



