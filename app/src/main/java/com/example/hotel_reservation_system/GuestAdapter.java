package com.example.hotel_reservation_system;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GuestAdapter extends RecyclerView.Adapter<GuestAdapter.ViewHolder> {
    private int guestNumber;
    private LayoutInflater layoutInflater;
    //MyClickListener listener;
    Button send;
    GuestAdapter(Context context,int guestNumber) {
        this.layoutInflater = LayoutInflater.from(context);
        this.guestNumber = guestNumber;
    }
    @NonNull
    @Override
    public GuestAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.guest_list_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GuestAdapter.ViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return guestNumber;
    }

    /*public void setClickListener(MyClickListener itemClickListener) {
        this.listener = itemClickListener;
    }*/
    public class ViewHolder extends RecyclerView.ViewHolder {//implements View.OnClickListener

        EditText guestName, gender;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            guestName = itemView.findViewById(R.id.guestName);
            gender = itemView.findViewById(R.id.gender);
            send=itemView.findViewById(R.id.send);

            //send.setOnClickListener(this);
        }
        /*
        @Override
        public void onClick(View view) {
            if (listener != null)
                listener.onClick(view);
        }*/
    }
    /*public interface MyClickListener {
        void onClick(View v);
    }*/
}