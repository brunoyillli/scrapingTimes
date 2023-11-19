package io.github.brunoyillli.scrapingdemo.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import io.github.bonigarcia.wdm.WebDriverManager;

@Component
public class EstatisticasExtractorBot {

	public void capturarLinks() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sofascore.com");
		
		WebElement botaoCalendario = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/button[19]/div/span"));
		
		botaoCalendario.click();
		System.out.println("robo");
	}
}
