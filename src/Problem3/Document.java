package Problem3;

public class Document {
    private static int counter = 1;
    private int numRec;
    private String title;
    private Library library;

    public Document(String title, Library library){
        numRec = counter ;
        counter ++ ;
        this.title = title;
        this.library = library;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public String getTitle() {
        return title;
    }

    public int getNumRec() {
        return numRec;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Document of id ").append(numRec)
                .append(" and of title: ").append(title);
        return s.toString();
    }
}
