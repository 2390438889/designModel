package builder;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        Derector derector = new Derector(new FriedFiceWithEggA());
        derector.friedRiceWithEgg();
    }
}
