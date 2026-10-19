package problem3;

public class Dictionary extends Document{
    private String language;


    public Dictionary(int numRec, String title, String language) {
        super( title);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "language='" + language + '\'' +
                ", NumRec=" + NumRec +
                ", title='" + title + '\'' +
                "} ";
    }
}
