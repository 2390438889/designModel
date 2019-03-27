package strategy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class CashRebate extends CashSuper {

    private double rebate  = 1;

    public CashRebate(double rebate) {
        this.rebate = rebate/10;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
