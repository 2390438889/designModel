package template;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Client {
    public static void main(String[] args) {
        SuperPaper superPaperA = new StudentA();

        SuperPaper superPaperB = new StudentB();

        superPaperA.question1();

        superPaperB.question1();
    }
}
