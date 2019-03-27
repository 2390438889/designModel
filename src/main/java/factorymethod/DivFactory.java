package factorymethod;

import jdk.nashorn.internal.ir.IfNode;
import simplefactory.Operation;
import simplefactory.OperationDiv;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class DivFactory implements IFactory {
    public Operation createOperation(double num1, double num2) {
        return new OperationDiv(num1,num2);
    }
}
