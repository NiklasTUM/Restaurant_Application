package model;

import javax.persistence.*;

@Entity
@Table(name="Restaurant")
public class Restaurant {

    @GeneratedValue
    @Id
    private int id;

    @Column(name="restaurantName")
    private String restaurantName;
    @Column(name="linkToWebsite")
    private String linkToWebsite;
    @Column(name="averageRating")
    private float averageRating;


    public boolean reserveTable(int tableId) {
        return true;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return restaurantName;
    }

    public String getLinkToWebsite() {
        return linkToWebsite;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setLinkToWebsite(String linkToWebsite) {
        this.linkToWebsite = linkToWebsite;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                " Website: " + getLinkToWebsite() +
                " Average Rating " + getAverageRating();
    }
}
