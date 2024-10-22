package Memento;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions;

    public VersionControl() {
        this.versions = new ArrayList<>();
    }

    public void saveVersion(DocumentVersion version) {
        versions.add(version);
        System.out.println("Version saved.");
    }

    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public DocumentVersion getVersion(int versionNumber) {
        if (versionNumber <= versions.size() && versionNumber > 0) {
            return versions.get(versionNumber - 1);
        } else {
            System.out.println("Invalid version number.");
            return null;
        }
    }
}
