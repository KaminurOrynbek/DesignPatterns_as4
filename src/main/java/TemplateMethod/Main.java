package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        System.out.println("Generating PDF Report:");
        ReportGenerator pdfGenerator = new PDFReportGenerator();
        reportingSystem.generateReport(pdfGenerator);

        System.out.println("\nGenerating HTML Report:");
        ReportGenerator htmlGenerator = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlGenerator);

        System.out.println("\nGenerating Plain Text Report:");
        ReportGenerator plainTextGenerator = new PlainTextReportGenerator();
        reportingSystem.generateReport(plainTextGenerator);
    }
}
