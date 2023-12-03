package model;

public class table {
    private int number;
    private int seats;

    public table(int number, int seats) {
        this.number = number;
        this.seats = seats;
    }

    public int getNumber() {
        return number;
    }

    public int getSeats() {
        return seats;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
