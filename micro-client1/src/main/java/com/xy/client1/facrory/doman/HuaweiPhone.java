package com.xy.client1.facrory.doman;

/**
 * FileName: HuaweiPhone
 * Author: liusg
 * Date: 2018-12-29 16:56
 * Desc:
 */

public class HuaweiPhone implements Phone{

    @Override
    public void callNumber(String number) {
        System.out.println("---华为手机打电话---");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("---华为手机发信息---");
    }

    @Override
    public void palyGames(String name) {
        System.out.println("---华为手机玩游戏---");
    }
}
