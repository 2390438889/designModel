package simplefactory;

/**
 * @author Hearts
 * @date 2019/3/26
 * @desc
 */
public class OperationMulti extends Operation {
    public OperationMulti(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double oprator() {
        return num1 * num2;
    }
}
