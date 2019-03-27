package strategy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class CashReturn extends CashSuper{

    private double satisfy = 0;

    private double returns = 0;

    public CashReturn(double satisfy, double returns) {
        super();
        this.satisfy = satisfy;
        this.returns = returns;
    }

    @Override
    public double acceptCash(double money) {

        if (money >= satisfy){
            money -= returns;
        }
        return money;
    }
}
