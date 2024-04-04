package com.bbic.model;

import com.bbic.controller.StockManager;
import com.bbic.model.dto.StockDTO;
import com.bbic.model.dto.User;
import com.bbic.model.dto.UserStockDTO;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class BuyStock {
    Scanner sc = new Scanner(System.in);
//    StockManager sm = new StockManager();
    StockDTO selectStockDTO = new StockDTO();
    UserStockDTO userStockDTO = new UserStockDTO(); // TODO** 유저 스톡리스트 없음
    User user = new User();
    int selectStockCode = 0;
    int userStockAmount = 0;
    int availableStockAmount = 0;
    int buyAmount = 0;



    /**
     * 매수 메인 메소드
     */
    public void buyApp(User user) {
        this.user = user;
        while (true) {

//            sm.printAllStocks();        // 종목 전체 출력
            System.out.println("0. 거래 취소하기");
            System.out.println("매수할 종목의 코드번호를 입력하세요 : ");
            selectStockCode = sc.nextInt(); // 선택 종목 코드 저장
            if (selectStockCode <= StockManager.stocks.size() && selectStockCode > 0) {
                buyStock(selectStockCode);  // (1) 구매가능정보 출력 메소드 -> (2) 구매확정 메소드로 이동
                break;
            }   else if ( selectStockCode == 0) { backToMainMenu(); break;}
            else { System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주세요."); }
        }
    }


    /**
     * 1. 구매 가능한 정보를 알려주는 메소드
     */
    public void buyStock(int selectStockCode) {
        // 선택 종목의 매수 정보 출력
        int index = (selectStockCode - 1);
        selectStockDTO = StockManager.stocks.get(index);        // 선택한 종목의 정보를 코드(인덱스)를 통해 찾아옴
        availableStockAmount = (user.getDeposit() / selectStockDTO.getPrice()); // 구매가능한 수량 계산


        System.out.println("=============선택 주식 매수 정보=============");
//    userStockAmount = userStockDTO.count; // TODO** 유저 스톡리스트 없음
        System.out.println("종목 보유 수량 : " + userStockAmount);
        System.out.println("구매 가능 수량 : " + availableStockAmount);
        System.out.println("현재 잔여 예수금 : " + user.getDeposit());
        System.out.print("매수할 수량을 작성해주세요.(취소 : 0) : ");


        while (true) { // 매수 거래 반복 거래 완료시 탈출
            buyAmount = sc.nextInt();

            if (buyAmount == 0) {
                backToMainMenu();
                break;
            } else if (buyAmount <= availableStockAmount) {    // 거래 가능 조건일 경우
                confirmBuyStock(buyAmount);  // 거래 확정 표시
                break;
            } else {
                System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }

    /**
     * 2. 구매 확정을 요청하는 메소드
     */
    private void confirmBuyStock(int buyAmount) {
        int userNewDeposit = (user.getDeposit() - selectStockDTO.getPrice() * buyAmount); // 구매 금액
        int userNewStockCount = (userStockDTO.getCount() + buyAmount);      // TODO** 유저 스톡리스트 없음
        System.out.println("매수 종목 : " + selectStockDTO.getStockName());
        System.out.println("매수 수량 : " + buyAmount);
        System.out.println("매수 후 보유 수량 : " + userNewStockCount);
        System.out.println("매수 후 잔여 예수금 : " + userNewDeposit);
        System.out.println("=========================================");
        System.out.println("매수하시겠습니까? (Y/N)");

        String select = sc.next().toUpperCase();
        while (true) {
            if (select.equals("Y") || select.equals("N")) {
                break;
            } else {
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요. ");
            }
        }

        /* 확정 정보 전달하는  setter() */
        userStockDTO.setCount(userNewStockCount);       // TODO** 유저 스톡리스트 없음
        user.setDeposit(userNewDeposit);


        System.out.println("매수가 완료되었습니다. 감사합니다.");
        System.out.println("=========================================");
        backToMainMenu();


    }

    /**
     * 0. 거래 취소, 메인 복귀하는 메소드
     */
    private void backToMainMenu() {
        System.out.println("거래를 종료하고 메인메뉴로 돌아갑니다.");
        System.out.println("=========================================");
    }


}