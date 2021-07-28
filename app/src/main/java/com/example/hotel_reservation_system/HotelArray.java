package com.example.hotel_reservation_system;

import java.util.List;

public class HotelArray {
    public HotelArray(List<HotelListData> hotels_list) {
        this.hotels_list = hotels_list;
    }

    List<HotelListData> hotels_list;

    public List<HotelListData> getHotels_list() {
        return hotels_list;
    }

    public void setHotels_list(List<HotelListData> hotels_list) {
        this.hotels_list = hotels_list;
    }
}
