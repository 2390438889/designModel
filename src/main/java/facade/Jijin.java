package facade;

import java.util.List;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class Jijin{

    private final List<IGU> igus;

    public Jijin(List<IGU> igus) {
        this.igus = igus;
    }

    public void buy() {
        igus.forEach(IGU::buy);
    }

    public void sell() {
        igus.forEach(IGU::sell);
    }
}
