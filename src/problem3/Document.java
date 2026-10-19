package problem3;

public class Document {
    protected int NumRec;
    protected String title;

    static int NumRecGlobal = 0;

    public Document(String title) {
        NumRec = ++NumRecGlobal;
        this.title = title;
    }

    public int getNumRec() {
        return NumRec;
    }

    public void setNumRec(int numRec) {
        NumRec = numRec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "NumRec=" + NumRec +
                ", title='" + title + '\'' +
                '}';
    }
}
