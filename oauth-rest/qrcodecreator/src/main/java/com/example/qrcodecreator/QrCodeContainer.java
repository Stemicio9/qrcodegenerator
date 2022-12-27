package com.example.qrcodecreator;

public class QrCodeContainer {

    private String text;
    private int width;
    private int height;





    public String getText() {
        return text;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
