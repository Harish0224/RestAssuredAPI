package com.qa.api.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	
	
	public static Properties PropFileLoad(String path) throws IOException{
		
		File fi=new File(path);
		FileInputStream fip=new FileInputStream(fi);
		Properties prop=new Properties();
		prop.load(fip);
		return prop;
		}	
}
