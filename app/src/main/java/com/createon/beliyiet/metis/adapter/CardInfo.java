package com.createon.beliyiet.metis.adapter;

/**
 * Created by BELIYIET on 2017/12/17.
 */

public class CardInfo {
    private int imageId;
    private String textId;

    public CardInfo(int imageId, String textId){
        this.imageId = imageId;
        this.textId = textId;
    }

    public int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }

    public String getName(){
        return textId;
    }

    public void setName(String textId){
        this.textId = textId;
    }
}
