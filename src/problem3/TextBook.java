package problem3;

public class TextBook extends Book{
    public String level;


    public TextBook(int numRec, String title, String author, int nbrPages, String level) {
        super(numRec, title, author, nbrPages);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "level='" + level + '\'' +
                ", author='" + author + '\'' +
                ", nbrPages=" + nbrPages +
                ", NumRec=" + NumRec +
                ", title='" + title + '\'' +
                '}';
    }
}
