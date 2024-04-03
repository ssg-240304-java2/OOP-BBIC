package com.bbic.controller;

import com.bbic.model.dto.User;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashDispenser {

    Scanner sc = new Scanner(System.in);

    public User CashIn(User user) {
        int cash;
        DecimalFormat formatter = new DecimalFormat("###,###");

        System.out.print("입금하실 금액을 입력해주세요 : ");
        cash = sc.nextInt();

        user.setDeposit(user.getDeposit() + cash);
        System.out.println("입금되었습니다. ( 현재잔고 : " + formatter.format(user.getDeposit()) + " )");
        return user;
    }

    public User CashOut(User user) {
        int cash;
        boolean isSuccess = true;
        DecimalFormat formatter = new DecimalFormat("###,###");

        System.out.print("출금하실 금액을 입력해주세요(최대 출금 가능금액 : " + formatter.format(user.getDeposit()) + " ) : ");
        cash = sc.nextInt();

        if (cash <= 0) {
            System.out.println("<<ERR>> 0보다 작거나 같은 금액은 출금하실 수 없습니다 !!");
            isSuccess = false;
        }

        if (cash > user.getDeposit()) {
            System.out.println("<<ERR>> 보유하신 금액보다 많은 금액을 출금하실 수 없습니다 !!");
            isSuccess = false;
        }

        if (isSuccess == false) {
            return null;
        }

        user.setDeposit(user.getDeposit() - cash);
        System.out.println("출금되었습니다. ( 현재잔고 : " + formatter.format(user.getDeposit()) + " )");
        return user;
    }
}
