package com.practise.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

//
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
		,glue={"com/practise/selenium/stepdefinitions"}
		)

public class TestRunner {

}
