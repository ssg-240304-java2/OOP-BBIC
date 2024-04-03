package com.bbic.run;

import com.bbic.model.dto.StockDTO;
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

        MainMenu mainMenu = new MainMenu(/*new User(name, deposit)*/);  // 메인 메뉴 기능을 수행할 user값 저장
        // TODO 승인님 : 추후 User가 완성되면 주석 해제처리 필요
        mainMenu.mainMenu();                                        // 메인 메뉴 수행 기능 호출
    }
}
