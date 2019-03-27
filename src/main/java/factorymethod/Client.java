package factorymethod;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Client {

    public static void main(String[] args) {

        IFactory iFactory = new AddFactory();

        System.out.println(iFactory.createOperation(1,3).oprator());
    }
}
