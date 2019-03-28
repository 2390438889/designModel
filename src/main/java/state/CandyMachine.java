package state;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class CandyMachine {

    private CandyMachineState candyMachineState;

    public CandyMachine() {
        candyMachineState = new CandyMachineStateStart(this);
    }

    public CandyMachineState getCandyMachineState() {
        return candyMachineState;
    }

    public void setCandyMachineState(CandyMachineState candyMachineState) {
        this.candyMachineState = candyMachineState;
    }

    public void execute(){
        if (null != candyMachineState)
            candyMachineState.handler();
    }
}
