package com.pouyablack.myapplication;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

public class Items
{
    public static final int ID_SUN = 0;
    public static final int ID_MERCURY = 1;
    public static final int ID_VENUS = 2;
    public static final int ID_EARTH = 3;
    public static final int ID_MARS = 4;
    public static final int ID_JUPITER = 5;
    public static final int ID_SATURN = 6;
    public static final int ID_URANUS = 7;
    public static final int ID_NEPTUN = 8;

    private int contentId;
    private Drawable contentImage;
    private String text;
    @DrawableRes
    private int featureImage;
    private Class DestinationActivity;

    public int getFeatureImage() {
        return featureImage;
    }

    public void setFeatureImage(int featureImage) {
        this.featureImage = featureImage;
    }

    public Class getDestinationActivity() {
        return DestinationActivity;
    }

    public void setDestinationActivity(Class destinationActivity) {
        DestinationActivity = destinationActivity;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}