package com.bbic.view;

public class MenuView {

    public void menuList() {
        System.out.println("""
                메뉴 선택
                1. 주가 정보 조회
                2. 매수 / 매도하기
                3. 사용자 정보 조회
                4. 계좌 입출금
                5. 프로그램 종료
                """);
    }

    public void askSelection() {
        System.out.print("""
                선택하실 메뉴 번호를 입력하세요.
                ========================
                메뉴 번호 :\s""");
    }
}
