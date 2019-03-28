package template;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc 试卷类
 */
public abstract class SuperPaper {

    public void question1(){
        System.out.println("问题1：");
        System.out.println("答案是："+answer1());
    }

    protected abstract String answer1();

    public void question2(){
        System.out.println("问题2：");
        System.out.println("答案是："+answer2());
    }

    protected abstract String answer2();

    public void question3(){
        System.out.println("问题3：");
        System.out.println("答案是："+answer3());
    }

    protected abstract String answer3();

    public void question4(){
        System.out.println("问题4：");
        System.out.println("答案是："+answer4());
    }

    protected abstract String answer4();
}
