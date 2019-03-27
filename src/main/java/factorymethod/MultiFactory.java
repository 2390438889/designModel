package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationMulti;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class MultiFactory implements IFactory {
    public Operation createOperation(double num1, double num2) {
        return new OperationMulti(num1,num2);
    }
}
