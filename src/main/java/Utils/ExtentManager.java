package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports createInstance() {
		 ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(reporter);
	     return extent;
    }

}
