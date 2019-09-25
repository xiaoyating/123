package com.example.afinal;

public class Lesson {
    private String name;
    private int imageId;
    public Lesson(String name ,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name ;
    }
    public int getImageId(){
        return imageId;
    }
}
