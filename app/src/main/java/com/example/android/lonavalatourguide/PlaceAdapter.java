package com.example.android.lonavalatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter <Place>{
    //set background color
    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
        super(context,0, places);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);

        TextView placeDesc = (TextView) listItemView.findViewById(R.id.place_desc);
        placeDesc.setText(currentPlace.getAppPlaceDesc());

        ImageView imageIcon = (ImageView) listItemView.findViewById(R.id.img_lonavala);
        if (currentPlace.hasImage())
        {
            imageIcon.setImageResource(currentPlace.getmImageResourceId());
            imageIcon.setVisibility(View.VISIBLE);
        }
        else
        {
            imageIcon.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
