package com.example.recyclerview_android_github.Model;

import java.util.UUID;

public class DataItem {
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
}
