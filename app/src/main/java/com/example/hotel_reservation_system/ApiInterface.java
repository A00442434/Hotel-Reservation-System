package com.example.hotel_reservation_system;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.mime.TypedInput;

public interface ApiInterface {

    // API's endpoints
    @GET("/listHotels")
    public void getHotelsLists(Callback<HotelArray> callback);

    @POST("/reservationConfirmation")
    public void addGuestLists(@Body TypedInput body, Callback<ConfirmationNumber> callback);

}
