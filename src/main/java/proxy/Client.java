package proxy;

import strategy.Product;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Client {
    public static void main(String[] args) {

        Pursuit pursuit = new Pursuit("左嘉义");

        SchoolGirl mm = new SchoolGirl("李娇娇");

        Proxy proxy = new Proxy(pursuit,mm);

        proxy.giveChocolate();

        proxy.giveDoll();

        proxy.giveFollower();
    }
}
