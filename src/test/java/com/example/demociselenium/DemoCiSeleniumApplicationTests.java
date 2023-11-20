package com.example.demociselenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoCiSeleniumApplicationTests {

	public static WebDriver driver;

	@Test
	void contextLoads() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);

		driver.get("https://iths.se");

		Assertions.assertEquals("IT-Högskolan – Här startar din IT-karriär!", driver.getTitle(), "The title is not correct");
	}

}
