package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	
	public static void reports(String json) {

		File file= new File("C:\\Users\\babin\\eclipse\\AdactinCucumber\\target");
		Configuration c= new Configuration(file, "AdactinCucumber");
		c.addClassifications("sprint number","4");
		c.addClassifications("os name", "windows");
		c.addClassifications("os version", "11");
		c.addClassifications("browser name", "chrome");
		c.addClassifications("browser version", "101.0.4951.54");
		List<String>l= new ArrayList<>();
		l.add(json);
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
