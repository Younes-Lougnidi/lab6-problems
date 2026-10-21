package Problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity = capacity;
        documents = new ArrayList<Document>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }
    void displayDocuments(){
        for(Document doc : documents){
            System.out.println(doc);
        }
    }
}
