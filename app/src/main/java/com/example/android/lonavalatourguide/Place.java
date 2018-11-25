package com.example.android.lonavalatourguide;

public class Place {
    //String to lonavala place information
    private String appPlaceDesc;
    //Image Source ID
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;


    public Place(String placeDesc, int imageId) {
        appPlaceDesc = placeDesc;
        mImageResourceId = imageId;
    }


    public String getAppPlaceDesc() {
        return appPlaceDesc;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
