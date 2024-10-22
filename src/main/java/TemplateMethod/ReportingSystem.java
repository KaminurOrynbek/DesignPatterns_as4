package TemplateMethod;

public class ReportingSystem {

    public void generateReport(ReportGenerator generator) {
        System.out.println("Starting report generation...");
        generator.generateReport();
    }
}
