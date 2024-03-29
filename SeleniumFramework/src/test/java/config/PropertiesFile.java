package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}
	
	public static void getProperties()
	{
		
		try {
			InputStream input = new FileInputStream("C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("Browser");
			System.out.println(browser);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println();
			e.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try{
		OutputStream output = new FileOutputStream("C:\\Users\\PRAGYAN\\git\\SeleniumJavaFramework1\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "firefox");
		prop.store(output, "got output from input file");
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println();
		e.printStackTrace();
	}
	}
}

