package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationSub;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class SubFactory implements IFactory {
    public Operation createOperation(double num1, double num2) {
        return new OperationSub(num1,num2);
    }
}
