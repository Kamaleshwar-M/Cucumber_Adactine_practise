package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		File reportDirectory = new File("C:\\Users\\kamal\\eclipse-workspace\\Cucumber_adactine\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(reportDirectory,"Adactine Automation");
		configuration.addClassifications("Browser","Chrome Browser");
		configuration.addClassifications("OS","Windows 10");
		configuration.addClassifications("Testing","Regression");
		configuration.addClassifications("Sprint","17");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
		
	}

}
