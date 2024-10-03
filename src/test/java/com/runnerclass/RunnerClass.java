package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\Projectcucum\\src\\test\\resources\\Features",glue={"com.pageexecution","com.hooks"},dryRun=false,plugin={"html:Reports/htmlreports.html","json:Reports/jsonreports.json","rerun:target/Rerun.txt"},tags="@Demo")
public class RunnerClass {
	

}
