package org.yqj.boot.demo.adapter;

/**
 * Created by yaoqijun on 2017-06-09.
 */
public class App {

    public static void main(String[] args) {
        BattleShip battleShip = new BattleFishingBoat();
        battleShip.fire();
        battleShip.move();
    }

}
