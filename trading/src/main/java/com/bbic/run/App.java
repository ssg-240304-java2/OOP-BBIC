package com.bbic.run;

import com.bbic.model.dto.StockDTO;
import com.bbic.model.dto.User;
import com.bbic.view.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User 정보 입력
        System.out.println("사용자 정보를 입력하세요.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("예수금 : ");
        int deposit = sc.nextInt();

        // TODO 승인님 : 이거 추가했습니다 입맛대로 고쳐써주세요 Line:26 도 임시로 넣어놨습니다.
        System.out.print("아이디(숫자) : ");
        int userid = sc.nextInt();

        MainMenu mainMenu = new MainMenu(new User(name,userid,deposit));  // 메인 메뉴 기능을 수행할 user값 저장
        // TODO 승인님 : 추후 User가 완성되면 주석 해제처리 필요
        mainMenu.mainMenu();                                        // 메인 메뉴 수행 기능 호출
    }
}
