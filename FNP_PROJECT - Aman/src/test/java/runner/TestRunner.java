package runner;



	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(features = { "src\\test\\resources\\features\\fnp.feature" }, // feature file or folder name
	glue = {"stepdefination"}

	,plugin = {"html:target/cucumber-reports/reports_html.html"}
	,monochrome = true
	,tags="@sanity20"
	,publish = true

	)
	public class TestRunner extends AbstractTestNGCucumberTests{
	}

