package com.example.myapplication;

public class List {
    private String name;
    private String grade;
    private String price;
    private int photo;

    public List(){
    }

    public List(String name, String grade, String price, int photo) {
        this.name = name;
        this.grade = grade;
        this.price = price;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
