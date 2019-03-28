package builder;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class FriedFiceWithEggA extends FriedRiceWithEgg {
    @Override
    public void egg() {
        System.out.println("放鸡蛋");
    }

    @Override
    public void shallot() {
        System.out.println("放入葱花");
    }

    @Override
    public void rice() {
        System.out.println("放入饭");
    }
}
