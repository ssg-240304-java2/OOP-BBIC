package com.bbic.controller;

import com.bbic.model.dto.StockDTO;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class StockManager {

    public void printAllStocks(ArrayList<StockDTO> stocks) {
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

}
