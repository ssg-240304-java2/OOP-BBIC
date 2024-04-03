package com.bbic.view;

import com.bbic.controller.StockManager;
import com.bbic.model.dto.StockDTO;

import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu {

//    private User user;

    MenuView mv = new MenuView();
    StockManager sm = new StockManager();

    public MainMenu(/*User user*/) {    // 메인 메뉴 생성 시 해당 메뉴를 사용할 user 정보를 전달받아 저장
//        this.user = user;
    }

    public void mainMenu() {
        int selection;
        do {
            selection = selectMenu();   // 메뉴 출력 및 선택 메뉴값 return

            switch (selection) {
                case 1: // 주가 정보 조회 기능 호출
                    sm.printAllStocks();
                    System.out.println("주가 확인");
                    break;
                case 2: // 매수 / 매도 기능 호출
                    sm.selectTradingOption(/*user*/);
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
