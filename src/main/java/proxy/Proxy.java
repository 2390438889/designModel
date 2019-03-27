package proxy;

/**
 * @author Hearts
 * @date 2019/3/27
 * @desc 代理
 */
public class Proxy implements GiveGift{

    private Pursuit pursuit;

    public Proxy(Pursuit pursuit,SchoolGirl schoolGirl) {
        pursuit.setSchoolGirl(schoolGirl);
        this.pursuit = pursuit;
    }

    public void giveFollower() {
        pursuit.giveFollower();
    }

    public void giveDoll() {
        pursuit.giveDoll();
    }

    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
