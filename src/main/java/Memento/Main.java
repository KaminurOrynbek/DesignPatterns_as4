package Memento;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("First draft");
        versionControl.saveVersion(document.saveVersion());

        document.setContent("Second draft");
        versionControl.saveVersion(document.saveVersion());

        document.setContent("Final version");
        versionControl.saveVersion(document.saveVersion());

        System.out.println("\nList of saved versions:");
        versionControl.listVersions();

        System.out.println("\nRestoring to version 2...");
        DocumentVersion versionToRestore = versionControl.getVersion(2);
        if (versionToRestore != null) {
            document.restoreVersion(versionToRestore);
        }

        System.out.println(document);
    }
}
