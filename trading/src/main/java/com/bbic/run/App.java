package com.bbic.run;

import com.bbic.model.dto.User;
import com.bbic.view.MainMenu;

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

        MainMenu mainMenu = new MainMenu(new User(name, deposit));

        mainMenu.mainMenu();
    }
}
