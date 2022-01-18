package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static String getUserDefinedProperty(String prop){
		Properties properties = new Properties();
		try{
			properties.load(new FileInputStream(new File("./resources/project-config.properties")));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return properties.getProperty(prop);
	}

}
