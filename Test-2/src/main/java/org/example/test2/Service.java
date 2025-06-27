package org.example.test2;

import java.util.*;

public class Service {
    private final List<User> users = new ArrayList<>();
    private final List<Room> rooms = new ArrayList<>();
    private final List<Booking> bookings = new ArrayList<>();

    public void setUser(int userId, int balance) {
        for (User u : users) {
            if (u.getId() == userId) return;
        }
        users.add(0, new User(userId, balance));
    }

    public void setRoom(int roomNumber, RoomType type, int pricePerNight) {
        for (Room r : rooms) {
            if (r.getNumber() == roomNumber) {
                r.setType(type);
                r.setPricePerNight(pricePerNight);
                return;
            }
        }
        rooms.add(0, new Room(roomNumber, type, pricePerNight));
    }

    public void bookRoom(int userId, int roomNumber, Date checkIn, Date checkOut) {
        if (!checkIn.before(checkOut)) {
            System.out.println("Invalid date range.");
            return;
        }

        User user = null;
        for (User u : users) {
            if (u.getId() == userId) user = u;
        }

        Room room = null;
        for (Room r : rooms) {
            if (r.getNumber() == roomNumber) room = r;
        }

        if (user == null || room == null) {
            System.out.println("User or room not found.");
            return;
        }

        for (Booking b : bookings) {
            if (b.getRoom().getNumber() == roomNumber &&
                    !(checkOut.compareTo(b.getCheckIn()) <= 0 || checkIn.compareTo(b.getCheckOut()) >= 0)) {
                System.out.println("Room is not available for that period.");
                return;
            }
        }

        int nights = (int)((checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
        int cost = nights * room.getPricePerNight();

        if (user.getBalance() < cost) {
            System.out.println("Insufficient balance.");
            return;
        }

        user.deductBalance(cost);
        bookings.add(0, new Booking(user, room, checkIn, checkOut));
        System.out.println("Booking successful.");
    }

    public void printAll() {
        System.out.println("All Rooms:");
        for (Room r : rooms) {
            System.out.println(r);
        }

        System.out.println("\n All Bookings:");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }

    public void printAllUsers() {
        System.out.println("All Users:");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
