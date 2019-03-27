package simplefactory;

/**
 * @author Hearts
 * @date 2019/3/26
 * @desc
 */
public class SimpleFacotry {

    private SimpleFacotry(){}

    public static Operation getOperation(double num1,double num2,String operat){
        Operation operation = null;
        if ("+".equals(operat)){
            operation = new OperationAdd(num1,num2);
        }else if ("-".equals(operat)){
            operation = new OperationSub(num1,num2);
        }else if ("*".equals(operat)){
            operation = new OperationMulti(num1,num2);
        }else if ("/".equals(operat)){
            operation = new OperationDiv(num1,num2);
        }
        return operation;
    }
}
