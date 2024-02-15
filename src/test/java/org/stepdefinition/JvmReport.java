package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	

	
	public static void generatejvmreport(String jsonPath) {
		
		File f=new File("C:\\Users\\welcome\\eclipse-workspace3\\Cucumber\\JVMreport");
		
		
		Configuration c=new Configuration(f,"Facebook");
		
		c.addClassifications("OS Name","Windows10");
		c.addClassifications("Browser Name", "ChromeBrowser");
		
		
		List<String> li=new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r=new ReportBuilder(li, c);
		
		r.generateReports();
		
	}

}
