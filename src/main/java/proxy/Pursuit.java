package proxy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc 追求者
 */
public class Pursuit implements GiveGift{

    private String name;

    /**
     * 被追求者
     */
    private SchoolGirl schoolGirl;

    public Pursuit(String name, SchoolGirl schoolGirl) {
        this.name = name;
        this.schoolGirl = schoolGirl;
    }

    public Pursuit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SchoolGirl getSchoolGirl() {
        return schoolGirl;
    }

    public void setSchoolGirl(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void giveFollower() {
        System.out.println(name +"送鲜花给"+schoolGirl.getName());
    }

    public void giveDoll() {
        System.out.println(name +"送娃娃给"+schoolGirl.getName());
    }

    public void giveChocolate() {
        System.out.println(name +"送巧克力给"+schoolGirl.getName());
    }
}
