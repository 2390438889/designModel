package state;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class CandyMachineStateStart implements CandyMachineState {

    private CandyMachine candyMachine;

    public CandyMachineStateStart(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void handler() {
        System.out.println("糖果机开机");
        candyMachine.setCandyMachineState(new CandyMachineStateStop(candyMachine));
    }
}
