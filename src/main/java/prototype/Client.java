package prototype;

import java.util.Arrays;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        Experise experise = new Experise("1287","公司");
        System.out.println(experise);
        Experise clone = (Experise) experise.clone();
        System.out.println(clone);
        experise.setThing("hello");
        System.out.println(experise);
        System.out.println(clone);

        Prototype prototype = new Prototype("张三", Arrays.asList("羽毛球","读书"),experise);
        Prototype prototypeClone = (Prototype) prototype.clone();
        System.out.println(prototype);
        System.out.println(prototypeClone);

        prototype.getLikes().set(0, "乒乓球");
        System.out.println(prototype);
        System.out.println(prototypeClone);

        prototype.getExperise().setThing("共公司");
        System.out.println(prototype);
        System.out.println(prototypeClone);
    }
}
