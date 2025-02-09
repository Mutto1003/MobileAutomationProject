package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestExampleNew {

    @Test
    public void openGoogle() {
      // ใช้ WebDriverManager เพื่อจัดการ ChromeDrive
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      WebDriver driver = new ChromeDriver(options);

      // สร้าง WebDriver สำหรับ Chrome
      // WebDriver driver = new ChromeDriver();

      // เปิดเว็บที่ต้องการ
      driver.get("https://www.google.com");
    }
}
