package Propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyutility 
{
	static String path="D:\\Geethub\\testdata\\geethub.properties";
	public static String getpropertypage(String key)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
		    value = prop.getProperty(key);
		}
		catch(Exception e)
		{
			System.out.println("issue in getpropertypage method "+e);
		}
		return value;
		
	}


}
