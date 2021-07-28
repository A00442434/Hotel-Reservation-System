package com.example.hotel_reservation_system;

public class HotelListData {

    String hotel_Name;
    String price;
    String availability;

    public HotelListData(String hotel_Name, String price, String availability) {
        this.hotel_Name = hotel_Name;
        this.price = price;
        this.availability = availability;
    }

    public String getHotel_name() {
        return hotel_Name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_Name = hotel_Name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
