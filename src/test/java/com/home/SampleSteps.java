package com.home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SampleSteps {
    @Given("Springboot starts up")
    public void springboot_starts_up() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("SpringBoot Started......");    }

    @Then("I should see Hello World Message")
    public void i_should_see_hello_world_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("*******  Hello World...");    }


}
