package com.example;

// import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
  @BeforeClass
  public void setup() {
      System.out.println("Setting up the test...");
  }

  @Test
  public void testMethod() {
      System.out.println("Test Passed!");
  }
}