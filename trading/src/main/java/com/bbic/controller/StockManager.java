package com.bbic.controller;

import java.util.Scanner;

public class StockManager {

    // 주식 list

    // 매수 class

    // 매도 class


    public StockManager() {

    }

    public void sellOrBuy() {

        int stockId = selectStock();

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                원하시는 거래를 선택하세요. 매수(1) / 매도(2)
                매수 / 매도 :\s""");
        int stockOption = sc.nextInt();

        switch (stockOption) {
            case 1:
                // 매수 method <- (User, stockId, stockOption)
                break;
            case 2:
                // 매도 method <- (User, stockId, stockOption)
                break;
        }
    }

    public int selectStock() {
        Scanner sc = new Scanner(System.in);
        // 종목 출력
        this.showAllStockPrice();
        System.out.println("""
                종목을 선택하세요.
                ---------------------
                종목 코드 :\s""");
        return sc.nextInt();
    }


    public void showAllStockPrice() {

    }
}
