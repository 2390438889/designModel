package strategy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
