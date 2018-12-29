package com.xy.client1.facrory.doman;

/**
 * FileName: ApplePhone
 * Author: liusg
 * Date: 2018-12-29 16:54
 * Desc:
 */

public class ApplePhone implements Phone{

    @Override
    public void callNumber(String number) {
        System.out.println("---苹果手机打电话---");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("---苹果手机发短信---");
    }

    @Override
    public void palyGames(String name) {
        System.out.println("---苹果手机玩游戏--");
    }
}
