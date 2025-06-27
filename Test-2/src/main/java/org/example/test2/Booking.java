package org.example.test2;
import java.util.Date;

public class Booking {
    private User user;
    private Room room;
    private Date checkIn;
    private Date checkOut;
    private Date createdAt;

    public Booking(User user, Room room, Date checkIn, Date checkOut) {
        this.user = user;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.createdAt = new Date();
    }

    public Room getRoom() {
        return room;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "user=" + user +
                ", room=" + room +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", createdAt=" + createdAt +
                '}';
    }
}
