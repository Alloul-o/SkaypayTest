package org.example.test2;

public class Room {
    private int number;
    private RoomType type;
    private int pricePerNight;

    public Room(int number, RoomType type, int pricePerNight) {
        this.number = number;
        this.type = type;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room{number=" + number + ", type=" + type + ", pricePerNight=" + pricePerNight + "}";
    }
}
