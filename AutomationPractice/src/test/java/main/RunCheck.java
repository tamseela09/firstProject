package main;

import org.openqa.selenium.chrome.ChromeDriver;

public class RunCheck {

	public void run() {
		
		SingeltonDriver d = new SingeltonDriver(new ChromeDriver() );
		

		d.openBrowser("Chrome", "www.rakibbhaiapizzastore.com");
	}
}
