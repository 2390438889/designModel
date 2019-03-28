package observer;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        Weiguancha weiguancha = new Weiguancha();

        FrontDesk frontDesk = new FrontDesk();
        frontDesk.attach(zhangsan);
        frontDesk.attach(weiguancha);

        frontDesk.update();

        frontDesk.deatach(weiguancha);
        frontDesk.update();
    }
}
