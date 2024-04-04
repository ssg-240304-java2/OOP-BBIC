package com.bbic.controller;

import com.bbic.model.BuyStock;
import com.bbic.model.SellStock;
import com.bbic.model.dto.StockDTO;
import com.bbic.model.dto.User;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManager {

    // 주가 정보 저장을 위한 ArrayList 선언
    public static ArrayList<StockDTO> stocks = new ArrayList<>();

    public StockManager() {

        // (+) 주가 데이터 생성
        // 2024.04.03 09시 기준 데이터
        stocks.add(new StockDTO("삼성전자", 1, 84100, 85000));
        stocks.add(new StockDTO("SK하이닉스", 2, 181700, 186300));
        stocks.add(new StockDTO("유진테크", 3, 47500, 48000));
        stocks.add(new StockDTO("효성ITX", 4, 12550, 12550));
        stocks.add(new StockDTO("카카오", 5, 51500, 51200));
        stocks.add(new StockDTO("엔씨소프트", 6, 195700, 197400));
        stocks.add(new StockDTO("컴투스", 7, 40450, 40700));
        stocks.add(new StockDTO("한미반도체", 8, 144700, 145500));
        stocks.add(new StockDTO("에코프로", 9, 573000, 610000));
        stocks.add(new StockDTO("LG에너지솔루션", 10, 379000, 393000));
        // (-) 주가 데이터 생성
    }

    public void printAllStocks() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("====================================");
        System.out.println("종목명\t\t\t현재가\t\t전날대비");
        for (StockDTO s : stocks) {
            System.out.println("[" + s.getStockCode() + "]"
                    + s.getStockName()
                    + ((s.getStockName().length() < 4) ? "\t\t\t" : (s.getStockName().length() > 7) ? "\t" : "\t\t")    // 길이에따라 간격을 맞춤
                    + formatter.format(s.getPrevPrice()) + "\t\t"
                    + getComparePrevPrice(s) + "%");
        }
        System.out.println("====================================");
    }

    public String getComparePrevPrice(StockDTO stock) {
        double result = stock.getPrice() - stock.getPrevPrice();

        result = result / stock.getPrice();
        result = (Math.round(result * 100) / 100.0);

        return "" + ((result >= 0) ? "+" : "") + result;
    }

    // 매수 / 매도 기능 결정
    public void selectTradingOption(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                원하시는 거래를 선택하세요. 매수(1) / 매도(2)
                매수 / 매도 :\s""");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                // 매수 method 호출 <- User, Stocklist
                printAllStocks();
                BuyStock buyStock = new BuyStock();
                buyStock.buyApp(user);
                break;
            case 2:
                SellStock sellStock = new SellStock(user);
                sellStock.SellStock();

                break;
            default:
                System.out.println("잘못된 값을 입력하였습니다. 메인 메뉴로 돌아갑니다.");
        }
    }

}
