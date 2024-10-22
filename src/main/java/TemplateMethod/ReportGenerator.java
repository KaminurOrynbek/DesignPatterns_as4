package TemplateMethod;

public abstract class ReportGenerator {

    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generation completed.");
    }

    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}