package com.example.baitaplab7_2;

public class City {
    private int id;
    private String nameCity;
    private int image1;
    private int image2;

    public City(int id, String nameCity) {
        this.id = id;
        this.nameCity = nameCity;
    }

    public City(String nameCity) {
        this.nameCity = nameCity;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
