package adapter;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Duck implements Adaptee {
    @Override
    public void duck() {
        System.out.println("呱呱呱");
    }
}
