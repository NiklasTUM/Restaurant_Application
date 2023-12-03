package model;


public class Comment {
    private int rating;
    private String text;

    public Comment(int rating, String text) {
        this.rating = rating;
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setText(String text) {
        this.text = text;
    }
}
