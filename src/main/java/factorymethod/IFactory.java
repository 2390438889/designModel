package factorymethod;

import simplefactory.Operation;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public interface IFactory {

    Operation createOperation(double num1,double num2);

}
