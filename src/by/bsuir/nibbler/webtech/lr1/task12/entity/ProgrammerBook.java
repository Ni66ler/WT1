package by.bsuir.nibbler.webtech.lr1.task12.entity;


public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook() {}

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        return level == programmerBook.level && language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode() + 31 * level;
    }

    @Override
    public String toString() {
       return super.toString() + " language:" + language + " level:" + level;
    }
}
