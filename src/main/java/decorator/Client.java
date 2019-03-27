package decorator;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(new Person("小明",new Clothes("白西装",
                new Clothes("黑皮鞋"
                ,new Clothes("花领带")))));
    }
}
