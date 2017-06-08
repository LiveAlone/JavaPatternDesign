package org.yqj.boot.demo.abstractfactory;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public class MaKongdomFactory implements KingdomFactory{
    @Override
    public King createKing() {
        return () -> "this is ma king";
    }

    @Override
    public Castle createCastle() {
        return () -> "this is ma castle";
    }

    @Override
    public Army createArmy() {
        return () -> "this is ma army";
    }
}
