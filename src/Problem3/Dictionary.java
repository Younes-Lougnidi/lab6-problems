package Problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,Library lib , String language){
        super(title,lib);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
