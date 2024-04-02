package com.bbic.model.dto;

public class User {
    //   1. 멤버
//    1. 멤버 데이터
//        - 이름
//        - 예수금
//        - 주식(List)
//            - 구매가격
//            - 수량
    private String name; //이름
    private double withholding; //예수금
    //private  stock  -> arraylist로 받기; //경호님거인가?
    private double amount; //수량
    private double price; //구매 가격


    public User() {
    }

    public User(String name, double withholding, double amount, double price) {
        this.name = name;
        this.withholding = withholding;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWithholding() {
        return withholding;
    }

    public void setWithholding(double withholding) {
        this.withholding = withholding;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
