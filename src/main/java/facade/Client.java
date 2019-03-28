package facade;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        Guming guming = new Guming(new Jijin(Arrays.asList(new Gu1(),new Gu2())));
        guming.save();
        guming.poll();
    }
}
