package com.bbic.view;

import com.bbic.controller.StockManager;
import com.bbic.model.dto.StockDTO;

import java.util.ArrayList;
import java.util.Scanner;



public class MainMenu {

//    private User user;

    MenuView mv = new MenuView();
    StockManager sm = new StockManager();

    // 주가 정보 저장을 위한 ArrayList 선언
    public static ArrayList<StockDTO> stocks = new ArrayList<>();

    public MainMenu(/*User user*/) {    // 메인 메뉴 생성 시 해당 메뉴를 사용할 user 정보를 전달받아 저장
//        this.user = user;
        // TODO 승인님 : 임시로 매개변수와 코드 주석처리 했습니다

        // (+) 주가 데이터 생성
        // 2024.04.03 09시 기준 데이터
        stocks.add(new StockDTO("삼성전자",1,84100,85000));
        stocks.add(new StockDTO("SK하이닉스",2,181700,186300));
        stocks.add(new StockDTO("유진테크",3,47500,48000));
        stocks.add(new StockDTO("효성ITX",4,12550,12550));
        stocks.add(new StockDTO("카카오",5,51500,51200));
        stocks.add(new StockDTO("엔씨소프트",6,195700,197400));
        stocks.add(new StockDTO("컴투스",7,40450,40700));
        stocks.add(new StockDTO("한미반도체",8,144700,145500));
        stocks.add(new StockDTO("에코프로",9,573000,610000));
        stocks.add(new StockDTO("LG에너지솔루션",10,379000,393000));
        // (-) 주가 데이터 생성
    }

    public void mainMenu() {
        int selection;
        do {
            selection = selectMenu();   // 메뉴 출력 및 선택 메뉴값 return

            switch (selection) {
                case 1: // 주가 정보 조회 기능 호출
                    sm.printAllStocks(stocks);
                    System.out.println("주가 확인");
                    break;
                case 2: // 매수 / 매도 기능 호출
//                    StockManager.sellOrBuy();
                    System.out.println("매수 매도");
                    break;
                case 3: // 사용자 정보 조회 기능 호출
//                    user.showData();
                    System.out.println("사용자 정보 조회");
                    break;
                case 4: // 계좌 입출금 기능 호출
//                    user.depositAndWithdrawal();
                    System.out.println("계좌 입출금");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 값입니다. 다시 입력해주세요.");
                    break;
            }
        } while (selection != 5);
    }


    public int selectMenu() {
        mv.menuList();      // 메뉴 출력
        mv.askSelection();  // 메뉴 선택 요청 메세지 출력
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
