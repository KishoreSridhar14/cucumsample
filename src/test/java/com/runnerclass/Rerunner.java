package com.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/Rerun.txt",glue="com.pageexecution",dryRun=false,plugin= {"html:Reports/htmlreports.html","json:Reports/jsonreports.json","rerun:target/Rerun.txt"})

public class Rerunner {
	

}
