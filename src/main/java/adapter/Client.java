package adapter;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        //鸭子
        Duck duck = new Duck();

        //人类
        People people = new People();

        //鸭子叫

        duck.duck();

        //人类说话
        people.speak();

        Adapter adapter = new Adapter(duck);

        //人类学鸭叫
        adapter.speak();
    }
}
