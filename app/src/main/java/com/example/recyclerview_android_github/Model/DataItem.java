package com.example.recyclerview_android_github.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public class DataItem implements Parcelable {
    private String stickerId;
    private String stickerName;
    private double stickerPrice;
    private String stickerDescription;
    private String stickerImage;



    @Override
    public String toString() {
        return "DataItem{" +
                "stickerId='" + stickerId + '\'' +
                ", stickerName='" + stickerName + '\'' +
                ", stickerPrice=" + stickerPrice +
                ", stickerDescription='" + stickerDescription + '\'' +
                ", stickerImage='" + stickerImage + '\'' +
                '}';
    }

    public String getStickerId() {
        return stickerId;
    }

    public void setStickerId(String stickerId) {
        this.stickerId = stickerId;
    }

    public String getStickerName() {
        return stickerName;
    }

    public void setStickerName(String stickerName) {
        this.stickerName = stickerName;
    }

    public double getStickerPrice() {
        return stickerPrice;
    }

    public void setStickerPrice(double stickerPrice) {
        this.stickerPrice = stickerPrice;
    }

    public String getStickerDescription() {
        return stickerDescription;
    }

    public void setStickerDescription(String stickerDescription) {
        this.stickerDescription = stickerDescription;
    }

    public String getStickerImage() {
        return stickerImage;
    }

    public void setStickerImage(String stickerImage) {
        this.stickerImage = stickerImage;
    }

    public DataItem(String stickerId, String stickerName, double stickerPrice, String stickerDescription, String stickerImage) {

        if (stickerId == null) {
         stickerId = UUID.randomUUID().toString();
        }
        
        this.stickerId = stickerId;
        this.stickerName = stickerName;
        this.stickerPrice = stickerPrice;
        this.stickerDescription = stickerDescription;
        this.stickerImage = stickerImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.stickerId);
        dest.writeString(this.stickerName);
        dest.writeDouble(this.stickerPrice);
        dest.writeString(this.stickerDescription);
        dest.writeString(this.stickerImage);
    }

    protected DataItem(Parcel in) {
        this.stickerId = in.readString();
        this.stickerName = in.readString();
        this.stickerPrice = in.readDouble();
        this.stickerDescription = in.readString();
        this.stickerImage = in.readString();
    }

    public static final Parcelable.Creator<DataItem> CREATOR = new Parcelable.Creator<DataItem>() {
        @Override
        public DataItem createFromParcel(Parcel source) {
            return new DataItem(source);
        }

        @Override
        public DataItem[] newArray(int size) {
            return new DataItem[size];
        }
    };
}
