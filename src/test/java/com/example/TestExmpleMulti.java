package com.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExmpleMulti {
  // การตั้งค่าก่อนคลาส (เรียกแค่ครั้งเดียวก่อนการทดสอบในคลาสนี้)
  @BeforeClass
  public void setup() {
      System.out.println("Setting up the test...");
  }

  // การตั้งค่าก่อนแต่ละ Test method
  @BeforeMethod
  public void beforeEachTest() {
      System.out.println("Running setup before each test...");
  }

  @Test
  public void testMethod1() {
      System.out.println("Test Case 1 Passed!");
  }

  @Test
  public void testMethod2() {
      System.out.println("Test Case 2 Passed!");
  }

  @Test
  public void testMethod3() {
      System.out.println("Test Case 3 Passed!");
  }
}