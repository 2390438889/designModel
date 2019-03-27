package factorymethod;

import simplefactory.Operation;
import simplefactory.OperationAdd;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class AddFactory implements IFactory {
    public Operation createOperation(double num1,double num2) {
        return new OperationAdd(num1,num2);
    }
}
