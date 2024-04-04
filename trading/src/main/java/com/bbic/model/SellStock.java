package com.bbic.model;

import com.bbic.model.dto.User;
import com.bbic.model.dto.UserStockDTO;

import java.util.Scanner;

public class SellStock {

    User user;
    UserStockDTO stock;

    public SellStock(User user) {
        this.user = user;
    }

    //1. 전체 종목(?) 보유 종목(?) 출력 메소드 호출 후, 사용자에게 입력받고 주식 코드를 저장

    public void SellStock() {  // 주식 매도 시작 메소드
        // 매도 가능한 주식을 표시
        System.out.println("보유 주식");
        user.showHoldingStocks();

        Scanner sc = new Scanner(System.in);
        System.out.println("매도할 주식 번호를 입력하세요 : ");
        if (holdingStock(sc.nextInt()) != null) {
            stockSellingAmount(sc.nextInt());
        } else {
            System.out.println("보유하지 않거나 존재하지 않은 종목입니다.");
        }
    }

    public UserStockDTO holdingStock(int selection) {  // 입력한 코드를 가진 주식을 보유하고 있는지 확인
        for (UserStockDTO stock : user.stocks) {
            if (stock.getStockCode() == selection) {    // 만일 보유하고 있다면 해당 주식 정보와 보유량 출력
                return stock;
            }
        }
        return null;
    }

    //2. 선택 종목 정보를 보여주는 메소드 ( )
    public void stockSellingAmount(int amount) {
        //현재 보유 수량(stock.get~)
        //거래 가능 수량(=현재 보유량)
        //현재 잔여 예수금
        //매도 수량 입력
        int quantity = sc.nextInt();
        selectCheckmsg(quantity);

        //거래 완료 메소드 호출()
        infoStock();
    }

    //매도 재확인 메세지 메소드( )
    public void sellCheck(int count) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("매도 수량은 " + count + "이며 총 매도 금액은 " + count * stock.getStockData().getPrice() + " 입니다. \n 매도하시겠습니까? (Y/N) : ");
            String select = sc.next().toUpperCase();
            if (select.equals("Y") || select.equals("N")) {
                decreaseHoldingStock(count);
                return;
            } else {
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
            }
        }
    }

    //매도 수량 비교 메소드 ( )
    public boolean amountCheck(int amount) {

        boolean check = false;

        if(stock.getCount() >= amount) {
            check = true;
            sellCheck(amount);

            return check;
        }
           return check;
    }

    //사용자 매도 수량, 보유 수량 수정 메소드 ( )
    public void decreaseHoldingStock(int count) {
        stock.setCount(stock.getCount() - count);
        user.setDeposit(user.getDeposit() + (stock.getStockData().getPrice() * count));
    }

    //매도 종목 정보 메소드 ( )
    public void infoStock() {

        System.out.println("=============매도 종목 정보 확인=============");
        //종목명(stock.getname)
        System.out.println("종목명 : ");
        //주가(stock.~)

        //현재 보유 수량(stock.get~)

        //매도 수량

        //현재 잔여 예수금


        //AllStockInfo()

    }


}
