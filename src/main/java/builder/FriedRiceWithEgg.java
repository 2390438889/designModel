package builder;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public abstract class FriedRiceWithEgg extends FriedDish {

    public abstract void egg();

    public abstract void shallot();

    public abstract void rice();

    @Override
    public void salt() {
        System.out.println("放盐");
    }

    @Override
    public void oil() {
        System.out.println("放油");
    }
}
