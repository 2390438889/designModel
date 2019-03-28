package state;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class CandyMachineStateStop implements CandyMachineState {

    private CandyMachine candyMachine;

    public CandyMachineStateStop(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void handler() {
        System.out.println("糖果机关机了。。。");
        System.exit(0);
    }
}
