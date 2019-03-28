package observer;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public interface Subject {

    //添加观察者
    void attach(Observer observer);

    //注销观察者
    void deatach(Observer observer);

    //通知
    void update();
}
