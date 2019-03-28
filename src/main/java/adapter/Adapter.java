package adapter;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void speak() {
        System.out.print("人类学鸭叫：");
        adaptee.duck();
    }
}
