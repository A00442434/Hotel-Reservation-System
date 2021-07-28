package com.example.hotel_reservation_system;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.io.Serializable;

public class ConfirmationNumber {
    String confirmation_number;

    public ConfirmationNumber(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public String getconfirmation_number() {
        return confirmation_number;
    }

    public void setconfirmation_number(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }
}
