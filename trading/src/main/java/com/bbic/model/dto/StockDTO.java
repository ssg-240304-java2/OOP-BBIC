package com.bbic.model.dto;

public class StockDTO {

    private String stockName;   // 주식 이름
    private int stockCode;      // 주식코드
    private int price;          // 주식 가격
    private int prevPrice;      // 이전 영업일 마감가

    public StockDTO(String stockName, int stockCode, int price, int prevPrice) {
        this.stockName = stockName;
        this.stockCode = stockCode;
        this.price = price;
        this.prevPrice = prevPrice;
    }

    public StockDTO() {
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockCode() {
        return stockCode;
    }

    public void setStockCode(int stockCode) {
        this.stockCode = stockCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrevPrice() {
        return prevPrice;
    }

    public void setPrevPrice(int prevPrice) {
        this.prevPrice = prevPrice;
    }

}
