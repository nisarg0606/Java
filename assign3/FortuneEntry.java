package assign3;

import java.io.Serializable;

public class FortuneEntry implements Serializable {
    private String quote;
    private String author;

    public FortuneEntry(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return quote + " - " + author;
    }
}
