package com.bbic.view;

import com.bbic.controller.StockManager;
import com.bbic.model.dto.User;

import java.util.Scanner;

public class MainMenu {

    private User user;

    MenuView mv = new MenuView();

    public MainMenu(User user) {
        this.user = user;
    }

    public void mainMenu() {
        int selection;
        do {
            selection = selectMenu();

            switch (selection) {
                case 1: // 주가 정보 조회
//                    StockManager.showStockPrice();
                    System.out.println("주가 확인");
                    break;
                case 2: // 매수 / 매도
//                    StockManager.Sell();
                    System.out.println("매수 매도");
                    break;
                case 3: // 사용자 정보 조회
//                    user.showData();
                    System.out.println("사용자 정보 조회");
                    break;
                case 4: // 계좌 입출금
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
        mv.menuList();
        mv.askSelection();
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
