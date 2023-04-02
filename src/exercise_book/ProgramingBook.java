package exercise_book;

import java.util.List;

public class ProgramingBook extends Book{
    private String language;
    private int framework;

    public ProgramingBook() {

    }

    public ProgramingBook(String language,int framework) {
        this.framework = framework;
        this.language = language;
    }

    public ProgramingBook(int bookCode, String name, Double price, String author,String language, int framework) {
        super(bookCode, name, price, author);
        this.framework = framework;
        this.language = language;
    }

    public int getFramework() {
        return framework;
    }

    public void setFramework(int framework) {
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20s %6d \n", language, framework);
    }
}
