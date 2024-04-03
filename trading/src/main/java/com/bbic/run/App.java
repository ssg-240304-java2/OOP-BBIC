package com.bbic.run;

import com.bbic.model.dto.StockDTO;
import com.bbic.view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<StockDTO> stocks = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User 정보 입력
        System.out.println("사용자 정보를 입력하세요.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("예수금 : ");
        int deposit = sc.nextInt();

        // (+) 주가 데이터 생성
        // 2024.04.03 09시 기준 데이터
        stocks.add(new StockDTO("삼성전자",1,84100,85000));
        stocks.add(new StockDTO("SK하이닉스",2,181700,186300));
        stocks.add(new StockDTO("유진테크",3,47500,48000));
        stocks.add(new StockDTO("효성ITX",4,12550,12550));
        stocks.add(new StockDTO("카카오",5,51500,51200));
        stocks.add(new StockDTO("엔씨소프트",6,195700,197400));
        stocks.add(new StockDTO("컴투스",7,40450,40700));
        // (-) 주가 데이터 생성

        MainMenu mainMenu = new MainMenu(/*new User(name, deposit)*/);  // 메인 메뉴 기능을 수행할 user값 저장

        mainMenu.mainMenu();                                        // 메인 메뉴 수행 기능 호출
    }
}
