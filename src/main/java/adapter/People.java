package adapter;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class People implements Target{
    @Override
    public void speak() {
        System.out.println("人类说话");
    }
}
