package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/Signuo&Login.feature"},
glue = {"com/cts/stepdefinitions"} ,monochrome=true,dryRun =false)

@RunWith(Cucumber.class)
public class RunnerTest {
	
	


}
