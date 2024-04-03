package com.bbic.model.dto;


import java.util.ArrayList;

public class User {
    //   1. 멤버
//    1. 멤버 데이터
//        - 이름
//        - 예수금
//        - 주식(List)
//            - 구매가격
//            - 수량

    //    private ArrayList<UserStockDTO> stocks = null;
    public ArrayList<UserStockDTO> stocks = new ArrayList<>();
    private String name; //이름
    private int UserId; //구매 가격
    private int deposit; //예수금

    public User() {
    }

    public User(String name, int userId, int deposit) {
        this.name = name;
        UserId = userId;
        this.deposit = deposit;
    }

    public String showHoldingStocks() {
        String holdingStockList = "";
        for (UserStockDTO stock : stocks) {
            holdingStockList += holdingStockInformation(stock);
        }
        return holdingStockList;
    }

    public String holdingStockInformation(UserStockDTO stock) {
        String info = "";

        info += "종목 : %-8s".formatted(stock.getStockData().getStockName()); // 이름
        info += "수량 : %-5d".formatted(stock.getCount());                    // 보유 수량
        info += "수익 : %-9d".formatted((stock.getStockData().getPrice() - stock.AveragePrice) * stock.getCount());     // 주당 변동량

        return info + "\n";
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
