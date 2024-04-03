package com.bbic.model;

import com.bbic.model.dto.StockDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Sell {

    StockDTO stockDTO = null;
    UserDTO user = null;
//    UserStockDTO userStock = null;
    Scanner sc = new Scanner(System.in);

    //1. 전체 종목(?) 보유 종목(?) 출력 메소드 호출 후, 사용자에게 입력받고 주식 코드를 저장

    public void selectStock() {
        System.out.println("매도할 주식 번호를 입력하세요 : ");
        int userSelectNum  = sc.nextInt();

        //전체 or 보유 종목에 따라 조건문이 다르다.
        selectStockInfo(stockCode);
    }

    //2. 선택 종목 정보 메소드 ( )
    public void selectStockInfo(int userStock) {

        System.out.println("=============선택 주식 종목 정보=============");
        //종목명(stock.getname)
        System.out.println(stockDTO.getStockName());
        //주가(stock.~)
        System.out.println(stockDTO.getPrice());
        //전일대비
        Double variance = (double) ((stockDTO.getPrice() - stockDTO.getPrevPrice())/stockDTO.getPrevPrice());
        System.out.println(variance + "%");
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
    public void selectCheckmsg(int quantity) {
        System.out.println("매도 수량은 " + quantity + "이며" + "금액은 " + quantity * stockDTO.getPrice() + " 입니다. \n 매도하시겠습니까? (Y/N) ");

        String select = sc.next().toUpperCase(Locale.ROOT);
        while (true) {
            if (select.equals('Y') || select.equals('N')) {
                quantityCheck(quantity);
                break;
            } else {
                System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요. ");
            }
        }
    }

    //매도 수량 비교 메소드 ( )
    public boolean quantityCheck(int quantity) {

        boolean check = false;

       /* if(get~ >= select) {
            check = true;
            UserChange();
            System.out.println("거래에 성공하셨습니다. ")


            return check;
        } else {
            System.out.println("보유 주식 종목이 매도하려는 수량보다 적습니다. 거래에 실패하였습니다. ")
            main();
        }
        */

    }

    //사용자 보유종목 수정 메소드 ()
    public void UserChange() {
//        현재 보유 수량 -= quantity; //set
//        현재 예수금 += StockDTO.price * quantity;  //set

    }

    //매도 종목 정보 메소드 ( )
    public void infoStock() {

        System.out.println("=============매도 종목 정보 확인=============");
        //종목명(stock.getname)
        System.out.println("종목명 : " );
        //주가(stock.~)

        //현재 보유 수량(stock.get~)

        //매도 수량

        //현재 잔여 예수금

        //날짜 및 시각 정보
        LocalDateTime Today = LocalDateTime.now();


        //AllStockInfo()

    }



}
