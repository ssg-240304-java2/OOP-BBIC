package com.bbic.UserStockDTO;

public class UserStockDTO {
    //int주식코드, 구매수량(보유 수량), 평균단가 ,int userid
    int StockCode; //주식코드
    int count; //구매수량
    int AveragePrice; //평균단가
    int UserId; //사용자 id

    public UserStockDTO() {
    }

    public UserStockDTO(int stockCode, int count, int averagePrice, int userId) {
        StockCode = stockCode;
        this.count = count;
        AveragePrice = averagePrice;
        UserId = userId;
    }


    public int getStockCode() {
        return StockCode;
    }

    public void setStockCode(int stockCode) {
        StockCode = stockCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(int averagePrice) {
        AveragePrice = averagePrice;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
