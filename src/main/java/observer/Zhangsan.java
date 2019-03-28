package observer;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Zhangsan implements Observer {
    @Override
    public void update() {
        System.out.println("关手机，开电脑，停止讲话");
    }
}
