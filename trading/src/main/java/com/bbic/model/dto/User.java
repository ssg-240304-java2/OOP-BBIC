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
    private double deposit; //예수금
    //private  stock  -> arraylist로 받기; //경호님거인가?
    private double  UserId ; //구매 가격

    public User() {
    }

    public User(String name, double deposit, double price) {
        this.name = name;
        this.deposit = deposit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
