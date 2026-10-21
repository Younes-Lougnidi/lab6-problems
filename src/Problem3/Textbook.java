package Problem3;

public class Textbook extends Book{
    private String level;
    public Textbook(String title, Library lib, String author , int nbrPages , String level){
        super(title,lib,author,nbrPages);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
