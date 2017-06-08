package org.yqj.boot.demo.abstractfactory;

/**
 * Created by yaoqijun on 2017/6/8.
 */
public interface KingdomFactory {

    King createKing();

    Castle createCastle();

    Army createArmy();

}
