package Memento;

public class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion saveVersion() {
        return new DocumentVersion(content);
    }

    public void restoreVersion(DocumentVersion version) {
        this.content = version.getContent();
    }

    @Override
    public String toString() {
        return "Document Content: " + content;
    }
}
