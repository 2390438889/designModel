package facade;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Guming {

    private Jijin jijin;

    public Guming(Jijin jijin) {
        this.jijin = jijin;
    }

    public void save(){
        jijin.buy();
    }

    public void poll(){
        jijin.sell();
    }
}
