package com.xy.client1.facrory.doman;

/**
 * FileName: Phone
 * Author: liusg
 * Date: 2018-12-29 16:51
 * Desc: 操作对象，简单工厂模式
 */

public interface Phone {

    void callNumber(String number);

    void sendMessage(String message);

    void palyGames(String name);

}
