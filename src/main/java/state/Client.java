package state;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine();
        while(true){
            candyMachine.execute();
        }
    }
}
