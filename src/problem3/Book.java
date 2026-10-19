package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    public Book(int numRec, String title, String author, int nbrPages) {
        super(numRec, title);
        this.author = author;
        this.nbrPages = nbrPages;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nbrPages=" + nbrPages +
                ", title='" + title + '\'' +
                ", NumRec=" + NumRec +
                "} " + super.toString();
    }
}
