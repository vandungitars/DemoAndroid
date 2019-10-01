package com.vandung.model;

public class Product {
    private String name;
    private Integer price;
    private Integer image;
    private String detail;

    public Product(){

    }

    public Product(String name, Integer price, Integer image){
        this.name = name;
        this.price = price;
        this.image = image;
        this.detail = name + "-" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
