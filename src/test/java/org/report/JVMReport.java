package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateReport(String jsnPath) {
		//1.target folder to save report
	File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Report");
	
	//2. add details by configuration class
	Configuration c=new Configuration(f, "madhavan");
	c.addClassifications("platform name", "windows");
	c.addClassifications("platform version", "10");
	c.addClassifications("Browser name", "chrome");
	c.addClassifications("Browser version", "87.0");
	
	//3.add json pah to list<string>
	
	List<String> jFile=new LinkedList<String>();
	jFile.add(jsnPath);
	
	//4.reportbuilder class creation
	 ReportBuilder r=new ReportBuilder(jFile, c);
	 r.generateReports();
	
	
	
	
}
}
