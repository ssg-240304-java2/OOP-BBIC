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
    private int  UserId ; //구매 가격
    private int deposit; //예수금

    public User() {
    }

    public User(String name, int userId, int deposit) {
        this.name = name;
        UserId = userId;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
