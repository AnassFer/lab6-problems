package problem3;

import javax.print.Doc;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> docs;


    public Library(int capacity) {
        this.capacity = capacity;
        docs = new ArrayList<Document>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "capacity=" + capacity +
                '}';
    }
    public void displayDocuments(){
        for(Document doc : docs){
            System.out.println(doc.toString());
        }
    }

    public boolean add(Document doc){
        if(docs.size()==capacity) return false;
        docs.add(doc);
        return true;
    }

    public boolean delete(Document doc){
        int n = docs.size();
        for (int i = 0; i < n; i++) {
            if(docs.get(i).getTitle().equals(doc.getTitle())) docs.remove(i);
            return true;
        }
        return false;
    }

    public Document document(int numEnrg){
        for(Document doc : docs){
            if(doc.getNumRec() == numEnrg) return doc;
        }
        return null;
    }

    public void displayAuthors(){
        for(Document doc : docs){
            if(doc instanceof Book) System.out.println(((Book) doc).getAuthor());
        }
    }

}
